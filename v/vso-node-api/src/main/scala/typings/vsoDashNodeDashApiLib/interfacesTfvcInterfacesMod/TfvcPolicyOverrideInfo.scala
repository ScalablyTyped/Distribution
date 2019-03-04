package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcPolicyOverrideInfo extends js.Object {
  var comment: java.lang.String
  var policyFailures: js.Array[TfvcPolicyFailureInfo]
}

object TfvcPolicyOverrideInfo {
  @scala.inline
  def apply(comment: java.lang.String, policyFailures: js.Array[TfvcPolicyFailureInfo]): TfvcPolicyOverrideInfo = {
    val __obj = js.Dynamic.literal(comment = comment, policyFailures = policyFailures)
  
    __obj.asInstanceOf[TfvcPolicyOverrideInfo]
  }
}

