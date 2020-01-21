package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the property values for a PlayReady-ND transmitter certificate. */
trait INDTransmitterProperties extends js.Object {
  /** Gets the certificate type for the transmitter. */
  var certificateType: NDCertificateType
  /** Gets the client identifier from the transmitter certificate. */
  var clientID: Double
  /** Gets the expiration date and time from the transmitter certificate. */
  var expirationDate: Date
  /** Gets the model digest from a transmitter certificate. */
  var modelDigest: Double
  /** Gets the model manufacturer name from a transmitter certificate. */
  var modelManufacturerName: String
  /** Gets the model name from a transmitter certificate. */
  var modelName: String
  /** Gets the model number from a transmitter certificate. */
  var modelNumber: String
  /** Gets the platform identifier from a transmitter certificate. */
  var platformIdentifier: NDCertificatePlatformID
  /** Gets the security level from a transmitter certificate. */
  var securityLevel: Double
  /** Gets the security version from a transmitter certificate. */
  var securityVersion: Double
  /** Gets the list of supported features from the transmitter certificate. */
  var supportedFeatures: NDCertificateFeature
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
}

