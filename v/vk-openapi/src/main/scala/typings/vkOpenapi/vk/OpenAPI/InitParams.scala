package typings.vkOpenapi.vk.OpenAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitParams extends js.Object {
  
  var apiId: Double = js.native
  
  var onlyWidgets: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
}
object InitParams {
  
  @scala.inline
  def apply(apiId: Double): InitParams = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  
  @scala.inline
  implicit class InitParamsOps[Self <: InitParams] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Double): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyWidgets(value: Boolean): Self = this.set("onlyWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyWidgets: Self = this.set("onlyWidgets", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
