package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderMatch extends js.Object {
  var _id: java.lang.String
  var closed: scala.Boolean
  var common_friend_count: scala.Double
  var common_like_count: scala.Double
  var created_date: java.lang.String
  var dead: scala.Boolean
  var following: scala.Boolean
  var following_moments: scala.Boolean
  var id: java.lang.String
  var is_super_like: scala.Boolean
  var last_activity_date: java.lang.String
  var message_count: scala.Double
  var messages: js.Array[TinderMessage]
  var muted: scala.Boolean
  var participants: js.Array[java.lang.String]
  var pending: scala.Boolean
  var person: TinderPerson
}

object TinderMatch {
  @scala.inline
  def apply(
    _id: java.lang.String,
    closed: scala.Boolean,
    common_friend_count: scala.Double,
    common_like_count: scala.Double,
    created_date: java.lang.String,
    dead: scala.Boolean,
    following: scala.Boolean,
    following_moments: scala.Boolean,
    id: java.lang.String,
    is_super_like: scala.Boolean,
    last_activity_date: java.lang.String,
    message_count: scala.Double,
    messages: js.Array[TinderMessage],
    muted: scala.Boolean,
    participants: js.Array[java.lang.String],
    pending: scala.Boolean,
    person: TinderPerson
  ): TinderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("common_friend_count")(common_friend_count)
    __obj.updateDynamic("common_like_count")(common_like_count)
    __obj.updateDynamic("created_date")(created_date)
    __obj.updateDynamic("dead")(dead)
    __obj.updateDynamic("following")(following)
    __obj.updateDynamic("following_moments")(following_moments)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("is_super_like")(is_super_like)
    __obj.updateDynamic("last_activity_date")(last_activity_date)
    __obj.updateDynamic("message_count")(message_count)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("muted")(muted)
    __obj.updateDynamic("participants")(participants)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("person")(person)
    __obj.asInstanceOf[TinderMatch]
  }
}

