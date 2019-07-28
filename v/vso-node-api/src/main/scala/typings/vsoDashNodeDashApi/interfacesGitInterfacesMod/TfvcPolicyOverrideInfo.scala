package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(comment = comment, policyFailures = policyFailures)
  
    __obj.asInstanceOf[TfvcPolicyOverrideInfo]
  }
}

