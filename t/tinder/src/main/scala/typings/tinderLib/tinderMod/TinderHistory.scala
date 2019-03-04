package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderHistory extends js.Object {
  var blocks: js.Array[java.lang.String]
   // todo
  var deleted_lists: js.Array[_]
   // todo
  var last_activity_date: java.lang.String
   // todo
  var liked_messages: js.Array[TinderLikedMessage]
  var lists: js.Array[_]
  var matches: js.Array[TinderMatch]
  var squads: js.Array[_]
}

object TinderHistory {
  @scala.inline
  def apply(
    blocks: js.Array[java.lang.String],
    deleted_lists: js.Array[_],
    last_activity_date: java.lang.String,
    liked_messages: js.Array[TinderLikedMessage],
    lists: js.Array[_],
    matches: js.Array[TinderMatch],
    squads: js.Array[_]
  ): TinderHistory = {
    val __obj = js.Dynamic.literal(blocks = blocks, deleted_lists = deleted_lists, last_activity_date = last_activity_date, liked_messages = liked_messages, lists = lists, matches = matches, squads = squads)
  
    __obj.asInstanceOf[TinderHistory]
  }
}

