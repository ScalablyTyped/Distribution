package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensingOverride extends js.Object {
  /**
    * How the inclusion of this contribution should change based on licensing
    */
  var behavior: ContributionLicensingBehaviorType
  /**
    * Fully qualified contribution id which we want to define licensing behavior for
    */
  var id: String
}

object LicensingOverride {
  @scala.inline
  def apply(behavior: ContributionLicensingBehaviorType, id: String): LicensingOverride = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LicensingOverride]
  }
}

