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

