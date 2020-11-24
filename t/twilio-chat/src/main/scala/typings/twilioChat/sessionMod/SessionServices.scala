package typings.twilioChat.sessionMod

import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionServices extends js.Object {
  
  var syncClient: SyncClient = js.native
}
object SessionServices {
  
  @scala.inline
  def apply(syncClient: SyncClient): SessionServices = {
    val __obj = js.Dynamic.literal(syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionServices]
  }
  
  @scala.inline
  implicit class SessionServicesOps[Self <: SessionServices] (val x: Self) extends AnyVal {
    
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
    def setSyncClient(value: SyncClient): Self = this.set("syncClient", value.asInstanceOf[js.Any])
  }
}
