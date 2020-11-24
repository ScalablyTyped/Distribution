package typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate

import typings.std.Event
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyIfUpdatedOptions extends js.Object {
  
  var cacheName: String = js.native
  
  var event: js.UndefOr[Event] = js.native
  
  var newResponse: Response = js.native
  
  var oldResponse: js.UndefOr[Response] = js.native
  
  var url: String = js.native
}
object NotifyIfUpdatedOptions {
  
  @scala.inline
  def apply(cacheName: String, newResponse: Response, url: String): NotifyIfUpdatedOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyIfUpdatedOptions]
  }
  
  @scala.inline
  implicit class NotifyIfUpdatedOptionsOps[Self <: NotifyIfUpdatedOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setOldResponse(value: Response): Self = this.set("oldResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldResponse: Self = this.set("oldResponse", js.undefined)
  }
}
