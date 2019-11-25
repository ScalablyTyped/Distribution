package typings.tinder.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderHistory extends js.Object {
  var blocks: js.Array[String]
   // todo
  var deleted_lists: js.Array[_]
   // todo
  var last_activity_date: String
   // todo
  var liked_messages: js.Array[TinderLikedMessage]
  var lists: js.Array[_]
  var matches: js.Array[TinderMatch]
  var squads: js.Array[_]
}

object TinderHistory {
  @scala.inline
  def apply(
    blocks: js.Array[String],
    deleted_lists: js.Array[_],
    last_activity_date: String,
    liked_messages: js.Array[TinderLikedMessage],
    lists: js.Array[_],
    matches: js.Array[TinderMatch],
    squads: js.Array[_]
  ): TinderHistory = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], deleted_lists = deleted_lists.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], liked_messages = liked_messages.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], squads = squads.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TinderHistory]
  }
}

