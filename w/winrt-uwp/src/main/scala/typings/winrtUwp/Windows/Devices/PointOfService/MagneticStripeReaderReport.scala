package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data from the recently swiped card. */
trait MagneticStripeReaderReport extends StObject {
  
  /** Gets the additional security or encryption information for the recently swiped card. */
  var additionalSecurityInformation: IBuffer
  
  /** Gets the card authentication information for the recently swiped card. */
  var cardAuthenticationData: IBuffer
  
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  var cardAuthenticationDataLength: Double
  
  /** Gets the card type identifier for the recently swiped card. */
  var cardType: Double
  
  /** Gets a dictionary of properties for the recently swiped card. */
  var properties: IMapView[String, String]
  
  /** Gets the track data for Track 1. */
  var track1: MagneticStripeReaderTrackData
  
  /** Gets the track data for Track 2. */
  var track2: MagneticStripeReaderTrackData
  
  /** Gets the track data for Track 3. */
  var track3: MagneticStripeReaderTrackData
  
  /** Gets the track data for Track 4. */
  var track4: MagneticStripeReaderTrackData
}
object MagneticStripeReaderReport {
  
  inline def apply(
    additionalSecurityInformation: IBuffer,
    cardAuthenticationData: IBuffer,
    cardAuthenticationDataLength: Double,
    cardType: Double,
    properties: IMapView[String, String],
    track1: MagneticStripeReaderTrackData,
    track2: MagneticStripeReaderTrackData,
    track3: MagneticStripeReaderTrackData,
    track4: MagneticStripeReaderTrackData
  ): MagneticStripeReaderReport = {
    val __obj = js.Dynamic.literal(additionalSecurityInformation = additionalSecurityInformation.asInstanceOf[js.Any], cardAuthenticationData = cardAuthenticationData.asInstanceOf[js.Any], cardAuthenticationDataLength = cardAuthenticationDataLength.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], track1 = track1.asInstanceOf[js.Any], track2 = track2.asInstanceOf[js.Any], track3 = track3.asInstanceOf[js.Any], track4 = track4.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderReport]
  }
  
  extension [Self <: MagneticStripeReaderReport](x: Self) {
    
    inline def setAdditionalSecurityInformation(value: IBuffer): Self = StObject.set(x, "additionalSecurityInformation", value.asInstanceOf[js.Any])
    
    inline def setCardAuthenticationData(value: IBuffer): Self = StObject.set(x, "cardAuthenticationData", value.asInstanceOf[js.Any])
    
    inline def setCardAuthenticationDataLength(value: Double): Self = StObject.set(x, "cardAuthenticationDataLength", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: Double): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setTrack1(value: MagneticStripeReaderTrackData): Self = StObject.set(x, "track1", value.asInstanceOf[js.Any])
    
    inline def setTrack2(value: MagneticStripeReaderTrackData): Self = StObject.set(x, "track2", value.asInstanceOf[js.Any])
    
    inline def setTrack3(value: MagneticStripeReaderTrackData): Self = StObject.set(x, "track3", value.asInstanceOf[js.Any])
    
    inline def setTrack4(value: MagneticStripeReaderTrackData): Self = StObject.set(x, "track4", value.asInstanceOf[js.Any])
  }
}
