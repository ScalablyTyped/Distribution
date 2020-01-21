package typings.typedGithubApi

import typings.typedGithubApi.typedGithubApiStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: String
  var reason: valid
  var signature: String
  var verified: Boolean
}

object AnonPayload {
  @scala.inline
  def apply(payload: String, reason: valid, signature: String, verified: Boolean): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPayload]
  }
}

