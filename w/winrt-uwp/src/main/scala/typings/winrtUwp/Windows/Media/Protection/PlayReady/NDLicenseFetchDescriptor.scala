package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
trait NDLicenseFetchDescriptor extends StObject {
  
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
  
  @scala.inline
  implicit class NDLicenseFetchDescriptorMutableBuilder[Self <: NDLicenseFetchDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentID(value: Double): Self = StObject.set(x, "contentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIDType(value: NDContentIDType): Self = StObject.set(x, "contentIDType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseFetchChallengeCustomData(value: INDCustomData): Self = StObject.set(x, "licenseFetchChallengeCustomData", value.asInstanceOf[js.Any])
  }
}
