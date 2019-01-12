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

