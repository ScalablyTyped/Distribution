package typings.workboxCore.workboxPluginMod

import typings.std.Event
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheDidUpdateCallbackParam extends js.Object {
  
  var cacheName: String = js.native
  
  var event: js.UndefOr[Event] = js.native
  
  var newResponse: Response = js.native
  
  var oldResponse: js.UndefOr[Response | Null] = js.native
  
  var request: Request = js.native
}
object CacheDidUpdateCallbackParam {
  
  @scala.inline
  def apply(cacheName: String, newResponse: Response, request: Request): CacheDidUpdateCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDidUpdateCallbackParam]
  }
  
  @scala.inline
  implicit class CacheDidUpdateCallbackParamOps[Self <: CacheDidUpdateCallbackParam] (val x: Self) extends AnyVal {
    
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
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewResponse(value: Response): Self = this.set("newResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setOldResponse(value: Response): Self = this.set("oldResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldResponse: Self = this.set("oldResponse", js.undefined)
    
    @scala.inline
    def setOldResponseNull: Self = this.set("oldResponse", null)
  }
}
