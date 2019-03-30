package typings
package trustedDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrustedTypePolicyFactory")
@js.native
class TrustedTypePolicyFactory () extends js.Object {
  def createPolicy[Keys /* <: java.lang.String */](name: java.lang.String, policyOptions: stdLib.Pick[TrustedTypePolicyOptions, Keys]): stdLib.Pick[TrustedTypePolicy, trustedDashTypesLib.trustedDashTypesLibStrings.name | Keys] = js.native
  def createPolicy[Keys /* <: java.lang.String */](
    name: java.lang.String,
    policyOptions: stdLib.Pick[TrustedTypePolicyOptions, Keys],
    expose: scala.Boolean
  ): stdLib.Pick[TrustedTypePolicy, trustedDashTypesLib.trustedDashTypesLibStrings.name | Keys] = js.native
  def getExposedPolicy(name: java.lang.String): TrustedTypePolicy | scala.Null = js.native
  def getPolicyNames(): js.Array[java.lang.String] = js.native
  def isHTML(value: js.Any): /* is trusted-types.TrustedHTML */ scala.Boolean = js.native
  def isScript(value: js.Any): /* is trusted-types.TrustedScript */ scala.Boolean = js.native
  def isScriptURL(value: js.Any): /* is trusted-types.TrustedScriptURL */ scala.Boolean = js.native
  def isURL(value: js.Any): /* is trusted-types.TrustedURL */ scala.Boolean = js.native
}

