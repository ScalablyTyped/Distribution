package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderLikedMessage extends js.Object {
  var is_liked: scala.Boolean
  var liker_id: java.lang.String
  var match_id: java.lang.String
  var message_id: java.lang.String
  var updated_at: java.lang.String
}

object TinderLikedMessage {
  @scala.inline
  def apply(
    is_liked: scala.Boolean,
    liker_id: java.lang.String,
    match_id: java.lang.String,
    message_id: java.lang.String,
    updated_at: java.lang.String
  ): TinderLikedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_liked")(is_liked)
    __obj.updateDynamic("liker_id")(liker_id)
    __obj.updateDynamic("match_id")(match_id)
    __obj.updateDynamic("message_id")(message_id)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[TinderLikedMessage]
  }
}

