package typings
package trustedDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrustedTypePolicyFactory")
@js.native
class TrustedTypePolicyFactory () extends js.Object {
  def createPolicy(name: java.lang.String, policy: TrustedTypeInnerPolicy): TrustedTypePolicy = js.native
  def createPolicy(name: java.lang.String, policy: TrustedTypeInnerPolicy, expose: scala.Boolean): TrustedTypePolicy = js.native
  def getExposedPolicy(name: java.lang.String): TrustedTypePolicy = js.native
  def getPolicyNames(): js.Array[java.lang.String] = js.native
}

