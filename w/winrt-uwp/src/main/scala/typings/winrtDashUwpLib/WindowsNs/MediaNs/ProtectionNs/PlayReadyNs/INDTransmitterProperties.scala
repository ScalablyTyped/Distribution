package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the property values for a PlayReady-ND transmitter certificate. */
trait INDTransmitterProperties extends js.Object {
  /** Gets the certificate type for the transmitter. */
  var certificateType: NDCertificateType
  /** Gets the client identifier from the transmitter certificate. */
  var clientID: scala.Double
  /** Gets the expiration date and time from the transmitter certificate. */
  var expirationDate: stdLib.Date
  /** Gets the model digest from a transmitter certificate. */
  var modelDigest: scala.Double
  /** Gets the model manufacturer name from a transmitter certificate. */
  var modelManufacturerName: java.lang.String
  /** Gets the model name from a transmitter certificate. */
  var modelName: java.lang.String
  /** Gets the model number from a transmitter certificate. */
  var modelNumber: java.lang.String
  /** Gets the platform identifier from a transmitter certificate. */
  var platformIdentifier: NDCertificatePlatformID
  /** Gets the security level from a transmitter certificate. */
  var securityLevel: scala.Double
  /** Gets the security version from a transmitter certificate. */
  var securityVersion: scala.Double
  /** Gets the list of supported features from the transmitter certificate. */
  var supportedFeatures: NDCertificateFeature
}

object INDTransmitterProperties {
  @scala.inline
  def apply(
    certificateType: NDCertificateType,
    clientID: scala.Double,
    expirationDate: stdLib.Date,
    modelDigest: scala.Double,
    modelManufacturerName: java.lang.String,
    modelName: java.lang.String,
    modelNumber: java.lang.String,
    platformIdentifier: NDCertificatePlatformID,
    securityLevel: scala.Double,
    securityVersion: scala.Double,
    supportedFeatures: NDCertificateFeature
  ): INDTransmitterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificateType")(certificateType)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("expirationDate")(expirationDate)
    __obj.updateDynamic("modelDigest")(modelDigest)
    __obj.updateDynamic("modelManufacturerName")(modelManufacturerName)
    __obj.updateDynamic("modelName")(modelName)
    __obj.updateDynamic("modelNumber")(modelNumber)
    __obj.updateDynamic("platformIdentifier")(platformIdentifier)
    __obj.updateDynamic("securityLevel")(securityLevel)
    __obj.updateDynamic("securityVersion")(securityVersion)
    __obj.updateDynamic("supportedFeatures")(supportedFeatures)
    __obj.asInstanceOf[INDTransmitterProperties]
  }
}

