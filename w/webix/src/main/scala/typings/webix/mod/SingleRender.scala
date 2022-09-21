package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleRender extends StObject {
  
  def customize(obj: Any): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def sync(source: Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var `type`: StringDictionary[Any] = js.native
}
object SingleRender {
  
  inline def apply: SingleRender = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleRender").asInstanceOf[SingleRender]
}
