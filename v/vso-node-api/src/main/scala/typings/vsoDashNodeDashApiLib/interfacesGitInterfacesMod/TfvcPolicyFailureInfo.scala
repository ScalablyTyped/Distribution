package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcPolicyFailureInfo extends js.Object {
  var message: java.lang.String
  var policyName: java.lang.String
}

object TfvcPolicyFailureInfo {
  @scala.inline
  def apply(message: java.lang.String, policyName: java.lang.String): TfvcPolicyFailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("policyName")(policyName)
    __obj.asInstanceOf[TfvcPolicyFailureInfo]
  }
}

