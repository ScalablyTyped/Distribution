package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payloaduuidv4 extends js.Object {
  var payload_uuidv4: String
  var reference_call_uuidv4: String
  var return_url: Web
  var signed: Boolean
  var user_token: Boolean
}

object Payloaduuidv4 {
  @scala.inline
  def apply(
    payload_uuidv4: String,
    reference_call_uuidv4: String,
    return_url: Web,
    signed: Boolean,
    user_token: Boolean
  ): Payloaduuidv4 = {
    val __obj = js.Dynamic.literal(payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], reference_call_uuidv4 = reference_call_uuidv4.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payloaduuidv4]
  }
}

