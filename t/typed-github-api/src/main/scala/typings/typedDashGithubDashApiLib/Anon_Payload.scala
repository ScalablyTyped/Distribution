package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: java.lang.String
  var reason: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.valid
  var signature: java.lang.String
  var verified: scala.Boolean
}

object Anon_Payload {
  @scala.inline
  def apply(
    payload: java.lang.String,
    reason: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.valid,
    signature: java.lang.String,
    verified: scala.Boolean
  ): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload, reason = reason, signature = signature, verified = verified)
  
    __obj.asInstanceOf[Anon_Payload]
  }
}

