package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostWithSymKey extends PostBase {
  var symKeyID: String = js.native
}

object PostWithSymKey {
  @scala.inline
  def apply(payload: String, symKeyID: String, topic: String, ttl: Double): PostWithSymKey = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], symKeyID = symKeyID.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWithSymKey]
  }
  @scala.inline
  implicit class PostWithSymKeyOps[Self <: PostWithSymKey] (val x: Self) extends AnyVal {
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
    def setSymKeyID(value: String): Self = this.set("symKeyID", value.asInstanceOf[js.Any])
  }
  
}

