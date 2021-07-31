package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBind extends StObject {
  
  def bind(target: js.Any): Unit = js.native
  def bind(target: js.Any, rule: Unit, format: String): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def unbind(): Unit = js.native
}
object BaseBind {
  
  @scala.inline
  def apply: BaseBind = ^.asInstanceOf[js.Dynamic].selectDynamic("BaseBind").asInstanceOf[BaseBind]
}
