package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides capabilities information for the magnetic stripe reader. */
trait MagneticStripeReaderCapabilities extends js.Object {
  /** Gets the authentication level supported by the device. */
  var authenticationLevel: MagneticStripeReaderAuthenticationLevel
  /** Gets the type of card authentication data that is supported by the device. */
  var cardAuthentication: String
  /** Indicates whether the device supports ISO cards. */
  var isIsoSupported: Boolean
  /** Indicates whether device supports JIS Type-I cards. */
  var isJisOneSupported: Boolean
  /** Indicates whether the device supports JIS Type-II cards. */
  var isJisTwoSupported: Boolean
  /** Indicates whether the device supports reporting of usage statistics. */
  var isStatisticsReportingSupported: Boolean
  /** Indicates whether the device supports updating of usage statistics. */
  var isStatisticsUpdatingSupported: Boolean
  /** Indicates whether the device is capable of masking track data. */
  var isTrackDataMaskingSupported: Boolean
  /** Indicates whether the devices is able to transmit start and end sentinels. */
  var isTransmitSentinelsSupported: Boolean
  /** Gets the power reporting capabilities of the device. */
  var powerReportingType: UnifiedPosPowerReportingType
  /** Gets the supported encryption algorithm. */
  var supportedEncryptionAlgorithms: Double
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
}

