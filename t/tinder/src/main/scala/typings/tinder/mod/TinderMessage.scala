package typings.tinder.mod

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
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sent_date = sent_date.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderMessage]
  }
}

