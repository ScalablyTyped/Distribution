package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderStack extends StObject {
  
  def customize(obj: js.Any): Unit = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def locate(e: Event): String | Double = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  
  var `type`: StringDictionary[js.Any] = js.native
  
  var types: StringDictionary[js.Any] = js.native
}
