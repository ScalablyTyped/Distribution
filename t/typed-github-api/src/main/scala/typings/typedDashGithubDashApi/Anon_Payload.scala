package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: String
  var reason: valid
  var signature: String
  var verified: Boolean
}

object Anon_Payload {
  @scala.inline
  def apply(payload: String, reason: valid, signature: String, verified: Boolean): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Payload]
  }
}

