package typings.stylefire.customStyleHandlersMod

import typings.stylefire.typesMod.ResolvedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStyleHandler extends js.Object {
  
  var get: js.UndefOr[String] = js.native
  
  def set(output: ResolvedState, value: js.Any): Unit = js.native
}
object CustomStyleHandler {
  
  @scala.inline
  def apply(set: (ResolvedState, js.Any) => Unit): CustomStyleHandler = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CustomStyleHandler]
  }
  
  @scala.inline
  implicit class CustomStyleHandlerOps[Self <: CustomStyleHandler] (val x: Self) extends AnyVal {
    
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
    def setSet(value: (ResolvedState, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: String): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
  }
}
