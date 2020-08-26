package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the property values for a PlayReady-ND transmitter certificate. */
@js.native
trait INDTransmitterProperties extends js.Object {
  /** Gets the certificate type for the transmitter. */
  var certificateType: NDCertificateType = js.native
  /** Gets the client identifier from the transmitter certificate. */
  var clientID: Double = js.native
  /** Gets the expiration date and time from the transmitter certificate. */
  var expirationDate: Date = js.native
  /** Gets the model digest from a transmitter certificate. */
  var modelDigest: Double = js.native
  /** Gets the model manufacturer name from a transmitter certificate. */
  var modelManufacturerName: String = js.native
  /** Gets the model name from a transmitter certificate. */
  var modelName: String = js.native
  /** Gets the model number from a transmitter certificate. */
  var modelNumber: String = js.native
  /** Gets the platform identifier from a transmitter certificate. */
  var platformIdentifier: NDCertificatePlatformID = js.native
  /** Gets the security level from a transmitter certificate. */
  var securityLevel: Double = js.native
  /** Gets the security version from a transmitter certificate. */
  var securityVersion: Double = js.native
  /** Gets the list of supported features from the transmitter certificate. */
  var supportedFeatures: NDCertificateFeature = js.native
}

object INDTransmitterProperties {
  @scala.inline
  def apply(
    certificateType: NDCertificateType,
    clientID: Double,
    expirationDate: Date,
    modelDigest: Double,
    modelManufacturerName: String,
    modelName: String,
    modelNumber: String,
    platformIdentifier: NDCertificatePlatformID,
    securityLevel: Double,
    securityVersion: Double,
    supportedFeatures: NDCertificateFeature
  ): INDTransmitterProperties = {
    val __obj = js.Dynamic.literal(certificateType = certificateType.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], modelDigest = modelDigest.asInstanceOf[js.Any], modelManufacturerName = modelManufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], platformIdentifier = platformIdentifier.asInstanceOf[js.Any], securityLevel = securityLevel.asInstanceOf[js.Any], securityVersion = securityVersion.asInstanceOf[js.Any], supportedFeatures = supportedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDTransmitterProperties]
  }
  @scala.inline
  implicit class INDTransmitterPropertiesOps[Self <: INDTransmitterProperties] (val x: Self) extends AnyVal {
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
    def setCertificateType(value: NDCertificateType): Self = this.set("certificateType", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientID(value: Double): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: Date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelDigest(value: Double): Self = this.set("modelDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelManufacturerName(value: String): Self = this.set("modelManufacturerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelNumber(value: String): Self = this.set("modelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformIdentifier(value: NDCertificatePlatformID): Self = this.set("platformIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityLevel(value: Double): Self = this.set("securityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityVersion(value: Double): Self = this.set("securityVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedFeatures(value: NDCertificateFeature): Self = this.set("supportedFeatures", value.asInstanceOf[js.Any])
  }
  
}

