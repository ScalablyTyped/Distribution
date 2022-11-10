package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends StObject {
  
  def clearCanvas(): Unit = js.native
  
  def getCanvas(): obj = js.native
  def getCanvas(context: String): obj = js.native
  
  def hideCanvas(): Unit = js.native
  
  def renderText(x: Double, y: Double, text: String, css: String, w: Double): Unit = js.native
  
  def renderTextAt(valign: String, align: String, x: Double, y: Double, t: String, c: String, w: Double): Unit = js.native
  
  def showCanvas(): Unit = js.native
  
  def toggleCanvas(): Unit = js.native
}
object Canvas {
  
  inline def apply: Canvas = ^.asInstanceOf[js.Dynamic].selectDynamic("Canvas").asInstanceOf[Canvas]
}
