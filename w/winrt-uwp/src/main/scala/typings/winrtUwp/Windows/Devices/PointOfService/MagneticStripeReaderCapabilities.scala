package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides capabilities information for the magnetic stripe reader. */
@js.native
trait MagneticStripeReaderCapabilities extends StObject {
  
  /** Gets the authentication level supported by the device. */
  var authenticationLevel: MagneticStripeReaderAuthenticationLevel = js.native
  
  /** Gets the type of card authentication data that is supported by the device. */
  var cardAuthentication: String = js.native
  
  /** Indicates whether the device supports ISO cards. */
  var isIsoSupported: Boolean = js.native
  
  /** Indicates whether device supports JIS Type-I cards. */
  var isJisOneSupported: Boolean = js.native
  
  /** Indicates whether the device supports JIS Type-II cards. */
  var isJisTwoSupported: Boolean = js.native
  
  /** Indicates whether the device supports reporting of usage statistics. */
  var isStatisticsReportingSupported: Boolean = js.native
  
  /** Indicates whether the device supports updating of usage statistics. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  
  /** Indicates whether the device is capable of masking track data. */
  var isTrackDataMaskingSupported: Boolean = js.native
  
  /** Indicates whether the devices is able to transmit start and end sentinels. */
  var isTransmitSentinelsSupported: Boolean = js.native
  
  /** Gets the power reporting capabilities of the device. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
  
  /** Gets the supported encryption algorithm. */
  var supportedEncryptionAlgorithms: Double = js.native
}
object MagneticStripeReaderCapabilities {
  
  @scala.inline
  def apply(
    authenticationLevel: MagneticStripeReaderAuthenticationLevel,
    cardAuthentication: String,
    isIsoSupported: Boolean,
    isJisOneSupported: Boolean,
    isJisTwoSupported: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    isTrackDataMaskingSupported: Boolean,
    isTransmitSentinelsSupported: Boolean,
    powerReportingType: UnifiedPosPowerReportingType,
    supportedEncryptionAlgorithms: Double
  ): MagneticStripeReaderCapabilities = {
    val __obj = js.Dynamic.literal(authenticationLevel = authenticationLevel.asInstanceOf[js.Any], cardAuthentication = cardAuthentication.asInstanceOf[js.Any], isIsoSupported = isIsoSupported.asInstanceOf[js.Any], isJisOneSupported = isJisOneSupported.asInstanceOf[js.Any], isJisTwoSupported = isJisTwoSupported.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], isTrackDataMaskingSupported = isTrackDataMaskingSupported.asInstanceOf[js.Any], isTransmitSentinelsSupported = isTransmitSentinelsSupported.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any], supportedEncryptionAlgorithms = supportedEncryptionAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderCapabilities]
  }
  
  @scala.inline
  implicit class MagneticStripeReaderCapabilitiesMutableBuilder[Self <: MagneticStripeReaderCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationLevel(value: MagneticStripeReaderAuthenticationLevel): Self = StObject.set(x, "authenticationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardAuthentication(value: String): Self = StObject.set(x, "cardAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIsoSupported(value: Boolean): Self = StObject.set(x, "isIsoSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsJisOneSupported(value: Boolean): Self = StObject.set(x, "isJisOneSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsJisTwoSupported(value: Boolean): Self = StObject.set(x, "isJisTwoSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsReportingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsReportingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsUpdatingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsUpdatingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrackDataMaskingSupported(value: Boolean): Self = StObject.set(x, "isTrackDataMaskingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransmitSentinelsSupported(value: Boolean): Self = StObject.set(x, "isTransmitSentinelsSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerReportingType(value: UnifiedPosPowerReportingType): Self = StObject.set(x, "powerReportingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEncryptionAlgorithms(value: Double): Self = StObject.set(x, "supportedEncryptionAlgorithms", value.asInstanceOf[js.Any])
  }
}
