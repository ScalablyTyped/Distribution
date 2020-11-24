package typings.stylableCore.customValuesMod

import typings.stylableCore.stylableCoreStrings.CustomValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSValueExtension[Value] extends js.Object {
  
  var _kind: CustomValue = js.native
  
  def register(localTypeSymbol: String): CustomValueExtension[Value] = js.native
}
object JSValueExtension {
  
  @scala.inline
  def apply[Value](_kind: CustomValue, register: String => CustomValueExtension[Value]): JSValueExtension[Value] = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[JSValueExtension[Value]]
  }
  
  @scala.inline
  implicit class JSValueExtensionOps[Self <: JSValueExtension[_], Value] (val x: Self with JSValueExtension[Value]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_kind(value: CustomValue): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: String => CustomValueExtension[Value]): Self = this.set("register", js.Any.fromFunction1(value))
  }
}
