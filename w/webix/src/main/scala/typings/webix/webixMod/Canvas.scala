package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  def clearCanvas(): Unit
  def getCanvas(context: String): js.Any
  def hideCanvas(): Unit
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit
  def showCanvas(): Unit
  def toggleCanvas(): Unit
}

@JSImport("webix", "Canvas")
@js.native
object Canvas extends TopLevel[Canvas]

