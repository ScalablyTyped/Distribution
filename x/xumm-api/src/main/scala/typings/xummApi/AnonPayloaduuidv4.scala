package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayloaduuidv4 extends js.Object {
  var payload_uuidv4: String
  var reference_call_uuidv4: String
  var return_url: AnonWeb
  var signed: Boolean
  var user_token: Boolean
}

object AnonPayloaduuidv4 {
  @scala.inline
  def apply(
    payload_uuidv4: String,
    reference_call_uuidv4: String,
    return_url: AnonWeb,
    signed: Boolean,
    user_token: Boolean
  ): AnonPayloaduuidv4 = {
    val __obj = js.Dynamic.literal(payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], reference_call_uuidv4 = reference_call_uuidv4.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPayloaduuidv4]
  }
}

