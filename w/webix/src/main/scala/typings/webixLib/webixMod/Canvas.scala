package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  def clearCanvas(): scala.Unit
  def getCanvas(context: java.lang.String): js.Any
  def hideCanvas(): scala.Unit
  def renderText(x: scala.Double, y: scala.Double, text: java.lang.String, css: java.lang.String, w: scala.Double): scala.Unit
  def renderTextAt(
    valign: java.lang.String,
    align: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    t: java.lang.String,
    c: java.lang.String,
    w: scala.Double
  ): scala.Unit
  def showCanvas(): scala.Unit
  def toggleCanvas(): scala.Unit
}

object Canvas {
  @scala.inline
  def apply(
    clearCanvas: js.Function0[scala.Unit],
    getCanvas: js.Function1[java.lang.String, js.Any],
    hideCanvas: js.Function0[scala.Unit],
    renderText: js.Function5[scala.Double, scala.Double, java.lang.String, java.lang.String, scala.Double, scala.Unit],
    renderTextAt: js.Function7[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      scala.Unit
    ],
    showCanvas: js.Function0[scala.Unit],
    toggleCanvas: js.Function0[scala.Unit]
  ): Canvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearCanvas")(clearCanvas)
    __obj.updateDynamic("getCanvas")(getCanvas)
    __obj.updateDynamic("hideCanvas")(hideCanvas)
    __obj.updateDynamic("renderText")(renderText)
    __obj.updateDynamic("renderTextAt")(renderTextAt)
    __obj.updateDynamic("showCanvas")(showCanvas)
    __obj.updateDynamic("toggleCanvas")(toggleCanvas)
    __obj.asInstanceOf[Canvas]
  }
}

