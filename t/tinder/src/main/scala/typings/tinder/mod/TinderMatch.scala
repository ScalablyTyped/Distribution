package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderMatch extends js.Object {
  var _id: String
  var closed: Boolean
  var common_friend_count: Double
  var common_like_count: Double
  var created_date: String
  var dead: Boolean
  var following: Boolean
  var following_moments: Boolean
  var id: String
  var is_super_like: Boolean
  var last_activity_date: String
  var message_count: Double
  var messages: js.Array[TinderMessage]
  var muted: Boolean
  var participants: js.Array[String]
  var pending: Boolean
  var person: TinderPerson
}

object TinderMatch {
  @scala.inline
  def apply(
    _id: String,
    closed: Boolean,
    common_friend_count: Double,
    common_like_count: Double,
    created_date: String,
    dead: Boolean,
    following: Boolean,
    following_moments: Boolean,
    id: String,
    is_super_like: Boolean,
    last_activity_date: String,
    message_count: Double,
    messages: js.Array[TinderMessage],
    muted: Boolean,
    participants: js.Array[String],
    pending: Boolean,
    person: TinderPerson
  ): TinderMatch = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], common_friend_count = common_friend_count.asInstanceOf[js.Any], common_like_count = common_like_count.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_moments = following_moments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_super_like = is_super_like.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TinderMatch]
  }
}

