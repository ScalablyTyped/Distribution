package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderMessage extends js.Object {
  var _id: java.lang.String
  var created_date: java.lang.String
  var from: java.lang.String
  var match_id: java.lang.String
  var message: java.lang.String
  var sent_date: java.lang.String
  var timestamp: scala.Double
  var to: java.lang.String
}

object TinderMessage {
  @scala.inline
  def apply(
    _id: java.lang.String,
    created_date: java.lang.String,
    from: java.lang.String,
    match_id: java.lang.String,
    message: java.lang.String,
    sent_date: java.lang.String,
    timestamp: scala.Double,
    to: java.lang.String
  ): TinderMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("created_date")(created_date)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("match_id")(match_id)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("sent_date")(sent_date)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[TinderMessage]
  }
}

