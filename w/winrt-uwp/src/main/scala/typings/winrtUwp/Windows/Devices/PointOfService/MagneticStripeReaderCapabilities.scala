package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides capabilities information for the magnetic stripe reader. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCapabilities")
@js.native
abstract class MagneticStripeReaderCapabilities () extends js.Object {
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

