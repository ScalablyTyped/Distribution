package typings.tinder.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderMessage extends js.Object {
  var _id: String
  var created_date: String
  var from: String
  var match_id: String
  var message: String
  var sent_date: String
  var timestamp: Double
  var to: String
}

object TinderMessage {
  @scala.inline
  def apply(
    _id: String,
    created_date: String,
    from: String,
    match_id: String,
    message: String,
    sent_date: String,
    timestamp: Double,
    to: String
  ): TinderMessage = {
    val __obj = js.Dynamic.literal(_id = _id, created_date = created_date, from = from, match_id = match_id, message = message, sent_date = sent_date, timestamp = timestamp, to = to)
  
    __obj.asInstanceOf[TinderMessage]
  }
}

