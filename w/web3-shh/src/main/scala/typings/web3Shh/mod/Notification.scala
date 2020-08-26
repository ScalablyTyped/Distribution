package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var hash: String = js.native
  var padding: Double = js.native
  var payload: String = js.native
  var pow: Double = js.native
  var recipientPublicKey: js.UndefOr[String] = js.native
  var sig: js.UndefOr[String] = js.native
  var timestamp: String = js.native
  var topic: String = js.native
  var ttl: Double = js.native
}

object Notification {
  @scala.inline
  def apply(
    hash: String,
    padding: Double,
    payload: String,
    pow: Double,
    timestamp: String,
    topic: String,
    ttl: Double
  ): Notification = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], pow = pow.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPow(value: Double): Self = this.set("pow", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientPublicKey(value: String): Self = this.set("recipientPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientPublicKey: Self = this.set("recipientPublicKey", js.undefined)
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSig: Self = this.set("sig", js.undefined)
  }
  
}

