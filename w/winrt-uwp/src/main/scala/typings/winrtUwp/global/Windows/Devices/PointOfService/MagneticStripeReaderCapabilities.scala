package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides capabilities information for the magnetic stripe reader. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCapabilities")
@js.native
open class MagneticStripeReaderCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderCapabilities {
  
  /** Gets the authentication level supported by the device. */
  /* CompleteClass */
  var authenticationLevel: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel = js.native
  
  /** Gets the type of card authentication data that is supported by the device. */
  /* CompleteClass */
  var cardAuthentication: String = js.native
  
  /** Indicates whether the device supports ISO cards. */
  /* CompleteClass */
  var isIsoSupported: Boolean = js.native
  
  /** Indicates whether device supports JIS Type-I cards. */
  /* CompleteClass */
  var isJisOneSupported: Boolean = js.native
  
  /** Indicates whether the device supports JIS Type-II cards. */
  /* CompleteClass */
  var isJisTwoSupported: Boolean = js.native
  
  /** Indicates whether the device supports reporting of usage statistics. */
  /* CompleteClass */
  var isStatisticsReportingSupported: Boolean = js.native
  
  /** Indicates whether the device supports updating of usage statistics. */
  /* CompleteClass */
  var isStatisticsUpdatingSupported: Boolean = js.native
  
  /** Indicates whether the device is capable of masking track data. */
  /* CompleteClass */
  var isTrackDataMaskingSupported: Boolean = js.native
  
  /** Indicates whether the devices is able to transmit start and end sentinels. */
  /* CompleteClass */
  var isTransmitSentinelsSupported: Boolean = js.native
  
  /** Gets the power reporting capabilities of the device. */
  /* CompleteClass */
  var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
  
  /** Gets the supported encryption algorithm. */
  /* CompleteClass */
  var supportedEncryptionAlgorithms: Double = js.native
}
