package typings.tinder.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderUpdates extends js.Object {
  var blocks: js.Array[_]
  var deleted_lists: js.Array[_]
  var last_activity_date: String
  var liked_messages: js.Array[TinderMessage]
  var lists: js.Array[_]
  var matches: js.Array[_]
  var matchmaker: js.Array[_]
  var squads: js.Array[_]
}

object TinderUpdates {
  @scala.inline
  def apply(
    blocks: js.Array[_],
    deleted_lists: js.Array[_],
    last_activity_date: String,
    liked_messages: js.Array[TinderMessage],
    lists: js.Array[_],
    matches: js.Array[_],
    matchmaker: js.Array[_],
    squads: js.Array[_]
  ): TinderUpdates = {
    val __obj = js.Dynamic.literal(blocks = blocks, deleted_lists = deleted_lists, last_activity_date = last_activity_date, liked_messages = liked_messages, lists = lists, matches = matches, matchmaker = matchmaker, squads = squads)
  
    __obj.asInstanceOf[TinderUpdates]
  }
}

