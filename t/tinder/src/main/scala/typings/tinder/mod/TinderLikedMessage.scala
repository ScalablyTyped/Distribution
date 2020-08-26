package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderLikedMessage extends js.Object {
  var is_liked: Boolean = js.native
  var liker_id: String = js.native
  var match_id: String = js.native
  var message_id: String = js.native
  var updated_at: String = js.native
}

object TinderLikedMessage {
  @scala.inline
  def apply(is_liked: Boolean, liker_id: String, match_id: String, message_id: String, updated_at: String): TinderLikedMessage = {
    val __obj = js.Dynamic.literal(is_liked = is_liked.asInstanceOf[js.Any], liker_id = liker_id.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderLikedMessage]
  }
  @scala.inline
  implicit class TinderLikedMessageOps[Self <: TinderLikedMessage] (val x: Self) extends AnyVal {
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
    def setIs_liked(value: Boolean): Self = this.set("is_liked", value.asInstanceOf[js.Any])
    @scala.inline
    def setLiker_id(value: String): Self = this.set("liker_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch_id(value: String): Self = this.set("match_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
  
}

