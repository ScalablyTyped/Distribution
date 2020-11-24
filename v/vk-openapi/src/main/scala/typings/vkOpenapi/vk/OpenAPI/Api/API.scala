package typings.vkOpenapi.vk.OpenAPI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API extends js.Object {
  
  def call(method: String, params: ApiParams, cb: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}
object API {
  
  @scala.inline
  def apply(call: (String, ApiParams, js.Function1[/* response */ js.Any, Unit]) => Unit): API = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction3(call))
    __obj.asInstanceOf[API]
  }
  
  @scala.inline
  implicit class APIOps[Self <: API] (val x: Self) extends AnyVal {
    
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
    def setCall(value: (String, ApiParams, js.Function1[/* response */ js.Any, Unit]) => Unit): Self = this.set("call", js.Any.fromFunction3(value))
  }
}
