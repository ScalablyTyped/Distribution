package typings.tinder.tinderMod

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
    val __obj = js.Dynamic.literal(is_liked = is_liked, liker_id = liker_id, match_id = match_id, message_id = message_id, updated_at = updated_at)
  
    __obj.asInstanceOf[TinderLikedMessage]
  }
}

