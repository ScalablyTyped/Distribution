package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
trait INDLicenseFetchDescriptor extends js.Object {
  /** Gets the content identifier used for fetching a license. */
  var contentID: Double
  /** Gets the type of the content identifier used for fetching a license. */
  var contentIDType: NDContentIDType
  /** Gets or sets custom data for a license fetch challenge. */
  var licenseFetchChallengeCustomData: INDCustomData
}

object INDLicenseFetchDescriptor {
  @scala.inline
  def apply(contentID: Double, contentIDType: NDContentIDType, licenseFetchChallengeCustomData: INDCustomData): INDLicenseFetchDescriptor = {
    val __obj = js.Dynamic.literal(contentID = contentID, contentIDType = contentIDType, licenseFetchChallengeCustomData = licenseFetchChallengeCustomData)
  
    __obj.asInstanceOf[INDLicenseFetchDescriptor]
  }
}

