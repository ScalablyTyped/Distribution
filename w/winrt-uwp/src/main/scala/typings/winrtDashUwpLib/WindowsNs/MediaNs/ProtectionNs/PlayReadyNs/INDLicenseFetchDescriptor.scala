package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
trait INDLicenseFetchDescriptor extends js.Object {
  /** Gets the content identifier used for fetching a license. */
  var contentID: scala.Double
  /** Gets the type of the content identifier used for fetching a license. */
  var contentIDType: NDContentIDType
  /** Gets or sets custom data for a license fetch challenge. */
  var licenseFetchChallengeCustomData: INDCustomData
}

