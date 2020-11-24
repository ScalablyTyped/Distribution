package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.GetAccessor
import typings.typescriptServices.TypeScript.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Getter extends js.Object {
  
  var getter: GetAccessor = js.native
  
  var setter: SetAccessor = js.native
}
object Getter {
  
  @scala.inline
  def apply(getter: GetAccessor, setter: SetAccessor): Getter = {
    val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Getter]
  }
  
  @scala.inline
  implicit class GetterOps[Self <: Getter] (val x: Self) extends AnyVal {
    
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
    def setGetter(value: GetAccessor): Self = this.set("getter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetter(value: SetAccessor): Self = this.set("setter", value.asInstanceOf[js.Any])
  }
}
