package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBind extends StObject {
  
  def bind(target: obj): Unit = js.native
  def bind(target: obj, rule: Unit, format: String): Unit = js.native
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def unbind(): Unit = js.native
}
object BaseBind {
  
  inline def apply: BaseBind = ^.asInstanceOf[js.Dynamic].selectDynamic("BaseBind").asInstanceOf[BaseBind]
}
