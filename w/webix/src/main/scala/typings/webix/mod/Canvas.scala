package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  def clearCanvas(): Unit = js.native
  def getCanvas(context: String): js.Any = js.native
  def hideCanvas(): Unit = js.native
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit = js.native
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit = js.native
  def showCanvas(): Unit = js.native
  def toggleCanvas(): Unit = js.native
}

@JSImport("webix", "Canvas")
@js.native
object Canvas extends TopLevel[Canvas]

