package typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionedPolicyConfigurationRef extends PolicyConfigurationRef {
  /**
    * The policy configuration revision ID.
    */
  var revision: Double
}

object VersionedPolicyConfigurationRef {
  @scala.inline
  def apply(id: Double, revision: Double, `type`: PolicyTypeRef, url: String): VersionedPolicyConfigurationRef = {
    val __obj = js.Dynamic.literal(id = id, revision = revision, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VersionedPolicyConfigurationRef]
  }
}

