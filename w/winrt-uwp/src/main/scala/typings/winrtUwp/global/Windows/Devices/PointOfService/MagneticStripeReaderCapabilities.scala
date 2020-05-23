package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides capabilities information for the magnetic stripe reader. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCapabilities")
@js.native
abstract class MagneticStripeReaderCapabilities ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderCapabilities {
  /** Gets the authentication level supported by the device. */
  /* CompleteClass */
  override var authenticationLevel: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel = js.native
  /** Gets the type of card authentication data that is supported by the device. */
  /* CompleteClass */
  override var cardAuthentication: String = js.native
  /** Indicates whether the device supports ISO cards. */
  /* CompleteClass */
  override var isIsoSupported: Boolean = js.native
  /** Indicates whether device supports JIS Type-I cards. */
  /* CompleteClass */
  override var isJisOneSupported: Boolean = js.native
  /** Indicates whether the device supports JIS Type-II cards. */
  /* CompleteClass */
  override var isJisTwoSupported: Boolean = js.native
  /** Indicates whether the device supports reporting of usage statistics. */
  /* CompleteClass */
  override var isStatisticsReportingSupported: Boolean = js.native
  /** Indicates whether the device supports updating of usage statistics. */
  /* CompleteClass */
  override var isStatisticsUpdatingSupported: Boolean = js.native
  /** Indicates whether the device is capable of masking track data. */
  /* CompleteClass */
  override var isTrackDataMaskingSupported: Boolean = js.native
  /** Indicates whether the devices is able to transmit start and end sentinels. */
  /* CompleteClass */
  override var isTransmitSentinelsSupported: Boolean = js.native
  /** Gets the power reporting capabilities of the device. */
  /* CompleteClass */
  override var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
  /** Gets the supported encryption algorithm. */
  /* CompleteClass */
  override var supportedEncryptionAlgorithms: Double = js.native
}

