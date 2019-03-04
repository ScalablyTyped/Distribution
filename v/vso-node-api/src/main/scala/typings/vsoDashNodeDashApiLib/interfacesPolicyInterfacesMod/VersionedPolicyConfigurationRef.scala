package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionedPolicyConfigurationRef extends PolicyConfigurationRef {
  /**
    * The policy configuration revision ID.
    */
  var revision: scala.Double
}

object VersionedPolicyConfigurationRef {
  @scala.inline
  def apply(id: scala.Double, revision: scala.Double, `type`: PolicyTypeRef, url: java.lang.String): VersionedPolicyConfigurationRef = {
    val __obj = js.Dynamic.literal(id = id, revision = revision, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VersionedPolicyConfigurationRef]
  }
}

