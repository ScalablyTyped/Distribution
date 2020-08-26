package typings.webPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKey extends js.Object {
  var privateKey: String = js.native
  var publicKey: String = js.native
  // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
  var subject: String = js.native
}

object PrivateKey {
  @scala.inline
  def apply(privateKey: String, publicKey: String, subject: String): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  @scala.inline
  implicit class PrivateKeyOps[Self <: PrivateKey] (val x: Self) extends AnyVal {
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
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

