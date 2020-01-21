package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderLikedMessage extends js.Object {
  var is_liked: Boolean
  var liker_id: String
  var match_id: String
  var message_id: String
  var updated_at: String
}

object TinderLikedMessage {
  @scala.inline
  def apply(is_liked: Boolean, liker_id: String, match_id: String, message_id: String, updated_at: String): TinderLikedMessage = {
    val __obj = js.Dynamic.literal(is_liked = is_liked.asInstanceOf[js.Any], liker_id = liker_id.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TinderLikedMessage]
  }
}

