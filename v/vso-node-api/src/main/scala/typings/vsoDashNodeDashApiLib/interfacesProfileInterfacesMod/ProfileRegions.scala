package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileRegions extends js.Object {
  /**
    * List of country/region code with contact consent requirement type of notice
    */
  var noticeContactConsentRequirementRegions: js.Array[java.lang.String]
  /**
    * List of country/region code with contact consent requirement type of opt-out
    */
  var optOutContactConsentRequirementRegions: js.Array[java.lang.String]
  /**
    * List of country/regions
    */
  var regions: js.Array[ProfileRegion]
}

object ProfileRegions {
  @scala.inline
  def apply(
    noticeContactConsentRequirementRegions: js.Array[java.lang.String],
    optOutContactConsentRequirementRegions: js.Array[java.lang.String],
    regions: js.Array[ProfileRegion]
  ): ProfileRegions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("noticeContactConsentRequirementRegions")(noticeContactConsentRequirementRegions)
    __obj.updateDynamic("optOutContactConsentRequirementRegions")(optOutContactConsentRequirementRegions)
    __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[ProfileRegions]
  }
}

