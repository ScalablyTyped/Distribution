package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcPolicyOverrideInfo extends js.Object {
  var comment: String
  var policyFailures: js.Array[TfvcPolicyFailureInfo]
}

object TfvcPolicyOverrideInfo {
  @scala.inline
  def apply(comment: String, policyFailures: js.Array[TfvcPolicyFailureInfo]): TfvcPolicyOverrideInfo = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], policyFailures = policyFailures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcPolicyOverrideInfo]
  }
}

