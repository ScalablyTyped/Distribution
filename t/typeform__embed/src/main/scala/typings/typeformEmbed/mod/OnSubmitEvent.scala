package typings.typeformEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubmitEvent extends js.Object {
  /** ID of the response */
  var response_id: String
}

object OnSubmitEvent {
  @scala.inline
  def apply(response_id: String): OnSubmitEvent = {
    val __obj = js.Dynamic.literal(response_id = response_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSubmitEvent]
  }
}

