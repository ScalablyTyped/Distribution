package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcPolicyFailureInfo extends js.Object {
  var message: String
  var policyName: String
}

object TfvcPolicyFailureInfo {
  @scala.inline
  def apply(message: String, policyName: String): TfvcPolicyFailureInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyFailureInfo]
  }
}

