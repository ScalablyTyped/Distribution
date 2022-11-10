package typings.webix.mod

import typings.webix.anon.Css
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fullscreen extends StObject {
  
  def exit(): Unit = js.native
  
  def set(view: Any): Unit = js.native
  def set(view: Any, config: Css): Unit = js.native
}
object fullscreen {
  
  inline def apply: typings.webix.webix.fullscreen = ^.asInstanceOf[js.Dynamic].selectDynamic("fullscreen").asInstanceOf[typings.webix.webix.fullscreen]
}
