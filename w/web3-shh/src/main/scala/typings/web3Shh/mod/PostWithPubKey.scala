package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostWithPubKey extends PostBase {
  var pubKey: String = js.native
}

object PostWithPubKey {
  @scala.inline
  def apply(payload: String, pubKey: String, topic: String, ttl: Double): PostWithPubKey = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pubKey = pubKey.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWithPubKey]
  }
  @scala.inline
  implicit class PostWithPubKeyOps[Self <: PostWithPubKey] (val x: Self) extends AnyVal {
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
    def setPubKey(value: String): Self = this.set("pubKey", value.asInstanceOf[js.Any])
  }
  
}

