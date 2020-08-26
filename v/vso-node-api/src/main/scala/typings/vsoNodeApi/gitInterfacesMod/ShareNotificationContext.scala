package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareNotificationContext extends js.Object {
  /**
    * Optional user note or message.
    */
  var message: String = js.native
  /**
    * Identities of users who will receive a share notification.
    */
  var receivers: js.Array[IdentityRef] = js.native
}

object ShareNotificationContext {
  @scala.inline
  def apply(message: String, receivers: js.Array[IdentityRef]): ShareNotificationContext = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], receivers = receivers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareNotificationContext]
  }
  @scala.inline
  implicit class ShareNotificationContextOps[Self <: ShareNotificationContext] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceiversVarargs(value: IdentityRef*): Self = this.set("receivers", js.Array(value :_*))
    @scala.inline
    def setReceivers(value: js.Array[IdentityRef]): Self = this.set("receivers", value.asInstanceOf[js.Any])
  }
  
}

