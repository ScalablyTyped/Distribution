package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRect extends js.Object {
  def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit
  def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit
  def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit
}

object CanvasRect {
  @scala.inline
  def apply(
    clearRect: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    fillRect: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    strokeRect: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit]
  ): CanvasRect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearRect")(clearRect)
    __obj.updateDynamic("fillRect")(fillRect)
    __obj.updateDynamic("strokeRect")(strokeRect)
    __obj.asInstanceOf[CanvasRect]
  }
}

