package typings.vuex.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationPayload extends Payload {
  var payload: js.Any
}

object MutationPayload {
  @scala.inline
  def apply(payload: js.Any, `type`: String): MutationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationPayload]
  }
}

