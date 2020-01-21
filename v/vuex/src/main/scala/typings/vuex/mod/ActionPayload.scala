package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionPayload extends Payload {
  var payload: js.Any
}

object ActionPayload {
  @scala.inline
  def apply(payload: js.Any, `type`: String): ActionPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionPayload]
  }
}

