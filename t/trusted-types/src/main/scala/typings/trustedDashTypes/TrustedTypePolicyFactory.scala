package typings.trustedDashTypes

import typings.std.Pick
import typings.trustedDashTypes.trustedDashTypesStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrustedTypePolicyFactory")
@js.native
class TrustedTypePolicyFactory () extends js.Object {
  def createPolicy[Keys /* <: String */](name: String, policyOptions: Pick[TrustedTypePolicyOptions, Keys]): Pick[TrustedTypePolicy, name | Keys] = js.native
  def createPolicy[Keys /* <: String */](name: String, policyOptions: Pick[TrustedTypePolicyOptions, Keys], expose: Boolean): Pick[TrustedTypePolicy, name | Keys] = js.native
  def getExposedPolicy(name: String): TrustedTypePolicy | Null = js.native
  def getPolicyNames(): js.Array[String] = js.native
  def isHTML(value: js.Any): /* is trusted-types.TrustedHTML */ Boolean = js.native
  def isScript(value: js.Any): /* is trusted-types.TrustedScript */ Boolean = js.native
  def isScriptURL(value: js.Any): /* is trusted-types.TrustedScriptURL */ Boolean = js.native
  def isURL(value: js.Any): /* is trusted-types.TrustedURL */ Boolean = js.native
}

