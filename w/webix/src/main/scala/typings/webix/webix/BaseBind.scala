package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBind extends js.Object {
  
  def bind(target: js.Any): Unit = js.native
  def bind(target: js.Any, rule: js.UndefOr[scala.Nothing], format: String): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def unbind(): Unit = js.native
}
