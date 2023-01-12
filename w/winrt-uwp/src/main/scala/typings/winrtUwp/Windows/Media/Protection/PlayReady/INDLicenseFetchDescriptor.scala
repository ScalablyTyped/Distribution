package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
trait INDLicenseFetchDescriptor extends StObject {
  
  /** Gets the content identifier used for fetching a license. */
  var contentID: Double
  
  /** Gets the type of the content identifier used for fetching a license. */
  var contentIDType: NDContentIDType
  
  /** Gets or sets custom data for a license fetch challenge. */
  var licenseFetchChallengeCustomData: INDCustomData
}
object INDLicenseFetchDescriptor {
  
  inline def apply(contentID: Double, contentIDType: NDContentIDType, licenseFetchChallengeCustomData: INDCustomData): INDLicenseFetchDescriptor = {
    val __obj = js.Dynamic.literal(contentID = contentID.asInstanceOf[js.Any], contentIDType = contentIDType.asInstanceOf[js.Any], licenseFetchChallengeCustomData = licenseFetchChallengeCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDLicenseFetchDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INDLicenseFetchDescriptor] (val x: Self) extends AnyVal {
    
    inline def setContentID(value: Double): Self = StObject.set(x, "contentID", value.asInstanceOf[js.Any])
    
    inline def setContentIDType(value: NDContentIDType): Self = StObject.set(x, "contentIDType", value.asInstanceOf[js.Any])
    
    inline def setLicenseFetchChallengeCustomData(value: INDCustomData): Self = StObject.set(x, "licenseFetchChallengeCustomData", value.asInstanceOf[js.Any])
  }
}
