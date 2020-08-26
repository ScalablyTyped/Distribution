package typings.twilioChat.messagesMod

import typings.twilioChat.sessionMod.Session
import typings.twilioMcsClient.mod.McsClient
import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagesServices extends js.Object {
  var mcsClient: McsClient = js.native
  var session: Session = js.native
  var syncClient: SyncClient = js.native
}

object MessagesServices {
  @scala.inline
  def apply(mcsClient: McsClient, session: Session, syncClient: SyncClient): MessagesServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesServices]
  }
  @scala.inline
  implicit class MessagesServicesOps[Self <: MessagesServices] (val x: Self) extends AnyVal {
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
    def setMcsClient(value: McsClient): Self = this.set("mcsClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncClient(value: SyncClient): Self = this.set("syncClient", value.asInstanceOf[js.Any])
  }
  
}

