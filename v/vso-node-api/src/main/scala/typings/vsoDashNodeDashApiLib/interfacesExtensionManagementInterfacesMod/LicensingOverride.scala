package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  var id: java.lang.String
}

object LicensingOverride {
  @scala.inline
  def apply(behavior: ContributionLicensingBehaviorType, id: java.lang.String): LicensingOverride = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("behavior")(behavior)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[LicensingOverride]
  }
}

