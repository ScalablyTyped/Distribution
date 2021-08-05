package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides arguments for the PlayReady-ND RegistrationCompleted event. */
trait INDRegistrationCompletedEventArgs extends StObject {
  
  /** Gets custom data from a registration response. */
  var responseCustomData: INDCustomData
  
  /** Gets or sets whether to accept or reject a transmitter's certificate. */
  var transmitterCertificateAccepted: Boolean
  
  /** Gets transmitter properties from the transmitter's certificate to verify the transmitter. */
  var transmitterProperties: INDTransmitterProperties
}
object INDRegistrationCompletedEventArgs {
  
  inline def apply(
    responseCustomData: INDCustomData,
    transmitterCertificateAccepted: Boolean,
    transmitterProperties: INDTransmitterProperties
  ): INDRegistrationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any], transmitterCertificateAccepted = transmitterCertificateAccepted.asInstanceOf[js.Any], transmitterProperties = transmitterProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDRegistrationCompletedEventArgs]
  }
  
  extension [Self <: INDRegistrationCompletedEventArgs](x: Self) {
    
    inline def setResponseCustomData(value: INDCustomData): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    inline def setTransmitterCertificateAccepted(value: Boolean): Self = StObject.set(x, "transmitterCertificateAccepted", value.asInstanceOf[js.Any])
    
    inline def setTransmitterProperties(value: INDTransmitterProperties): Self = StObject.set(x, "transmitterProperties", value.asInstanceOf[js.Any])
  }
}
