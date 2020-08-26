package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides capabilities information for the magnetic stripe reader. */
@js.native
trait MagneticStripeReaderCapabilities extends js.Object {
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
  implicit class MagneticStripeReaderCapabilitiesOps[Self <: MagneticStripeReaderCapabilities] (val x: Self) extends AnyVal {
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
    def setAuthenticationLevel(value: MagneticStripeReaderAuthenticationLevel): Self = this.set("authenticationLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardAuthentication(value: String): Self = this.set("cardAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIsoSupported(value: Boolean): Self = this.set("isIsoSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsJisOneSupported(value: Boolean): Self = this.set("isJisOneSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsJisTwoSupported(value: Boolean): Self = this.set("isJisTwoSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStatisticsReportingSupported(value: Boolean): Self = this.set("isStatisticsReportingSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStatisticsUpdatingSupported(value: Boolean): Self = this.set("isStatisticsUpdatingSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTrackDataMaskingSupported(value: Boolean): Self = this.set("isTrackDataMaskingSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTransmitSentinelsSupported(value: Boolean): Self = this.set("isTransmitSentinelsSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerReportingType(value: UnifiedPosPowerReportingType): Self = this.set("powerReportingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedEncryptionAlgorithms(value: Double): Self = this.set("supportedEncryptionAlgorithms", value.asInstanceOf[js.Any])
  }
  
}

