package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
@js.native
trait INDLicenseFetchDescriptor extends js.Object {
  
  /** Gets the content identifier used for fetching a license. */
  var contentID: Double = js.native
  
  /** Gets the type of the content identifier used for fetching a license. */
  var contentIDType: NDContentIDType = js.native
  
  /** Gets or sets custom data for a license fetch challenge. */
  var licenseFetchChallengeCustomData: INDCustomData = js.native
}
object INDLicenseFetchDescriptor {
  
  @scala.inline
  def apply(contentID: Double, contentIDType: NDContentIDType, licenseFetchChallengeCustomData: INDCustomData): INDLicenseFetchDescriptor = {
    val __obj = js.Dynamic.literal(contentID = contentID.asInstanceOf[js.Any], contentIDType = contentIDType.asInstanceOf[js.Any], licenseFetchChallengeCustomData = licenseFetchChallengeCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDLicenseFetchDescriptor]
  }
  
  @scala.inline
  implicit class INDLicenseFetchDescriptorOps[Self <: INDLicenseFetchDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentID(value: Double): Self = this.set("contentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIDType(value: NDContentIDType): Self = this.set("contentIDType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseFetchChallengeCustomData(value: INDCustomData): Self = this.set("licenseFetchChallengeCustomData", value.asInstanceOf[js.Any])
  }
}
