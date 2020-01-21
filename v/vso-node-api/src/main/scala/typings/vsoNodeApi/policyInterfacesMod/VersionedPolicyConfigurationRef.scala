package typings.vsoNodeApi.policyInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionedPolicyConfigurationRef]
  }
}

