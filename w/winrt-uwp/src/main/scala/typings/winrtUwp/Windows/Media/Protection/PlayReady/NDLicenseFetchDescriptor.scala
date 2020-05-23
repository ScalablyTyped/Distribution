package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
trait NDLicenseFetchDescriptor extends js.Object {
  /** Gets the content identifer. */
  var contentID: Double
  /** Gets the type of the content identifier. */
  var contentIDType: NDContentIDType
  /** Gets or sets custom data for a license fetch challenge. */
  var licenseFetchChallengeCustomData: INDCustomData
}

object NDLicenseFetchDescriptor {
  @scala.inline
  def apply(contentID: Double, contentIDType: NDContentIDType, licenseFetchChallengeCustomData: INDCustomData): NDLicenseFetchDescriptor = {
    val __obj = js.Dynamic.literal(contentID = contentID.asInstanceOf[js.Any], contentIDType = contentIDType.asInstanceOf[js.Any], licenseFetchChallengeCustomData = licenseFetchChallengeCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDLicenseFetchDescriptor]
  }
}

