package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor")
@js.native
class NDLicenseFetchDescriptor protected () extends js.Object {
  /**
    * Creates a new instance of the NDLicenseFetchDescriptor class.
    * @param contentIDType The type of the content identifier.
    * @param contentIDBytes The content identifier.
    * @param licenseFetchChallengeCustomData The license fetch challenge custom data.
    */
  def this(contentIDType: NDContentIDType, contentIDBytes: js.Array[scala.Double], licenseFetchChallengeCustomData: INDCustomData) = this()
  /** Gets the content identifer. */
  var contentID: scala.Double = js.native
  /** Gets the type of the content identifier. */
  var contentIDType: NDContentIDType = js.native
  /** Gets or sets custom data for a license fetch challenge. */
  var licenseFetchChallengeCustomData: INDCustomData = js.native
}

