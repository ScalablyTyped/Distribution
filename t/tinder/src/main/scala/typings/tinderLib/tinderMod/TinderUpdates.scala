package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderUpdates extends js.Object {
  var blocks: js.Array[_]
  var deleted_lists: js.Array[_]
  var last_activity_date: java.lang.String
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
    last_activity_date: java.lang.String,
    liked_messages: js.Array[TinderMessage],
    lists: js.Array[_],
    matches: js.Array[_],
    matchmaker: js.Array[_],
    squads: js.Array[_]
  ): TinderUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blocks")(blocks)
    __obj.updateDynamic("deleted_lists")(deleted_lists)
    __obj.updateDynamic("last_activity_date")(last_activity_date)
    __obj.updateDynamic("liked_messages")(liked_messages)
    __obj.updateDynamic("lists")(lists)
    __obj.updateDynamic("matches")(matches)
    __obj.updateDynamic("matchmaker")(matchmaker)
    __obj.updateDynamic("squads")(squads)
    __obj.asInstanceOf[TinderUpdates]
  }
}

