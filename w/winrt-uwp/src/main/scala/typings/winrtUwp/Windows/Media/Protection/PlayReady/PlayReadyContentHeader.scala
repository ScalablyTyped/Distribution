package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the information in a PlayReady content header. */
trait PlayReadyContentHeader extends js.Object {
  /** Gets the custom data used by the content provider. */
  var customAttributes: String
  /** Gets the decryptor setup value in the header if it is set. */
  var decryptorSetup: PlayReadyDecryptorSetup
  /** Gets the domain service identifier in the header if it is set. */
  var domainServiceId: String
  /** Gets the content encryption type in the header if it is set. */
  var encryptionType: PlayReadyEncryptionAlgorithm
  /** Gets a new content header that contains any embedded license updates that were available. */
  var headerWithEmbeddedUpdates: PlayReadyContentHeader
  /** Gets the content key identifier value if it is set. */
  var keyId: String
  /** Gets the content key identifier string value if it is set. */
  var keyIdString: String
  /** Gets the content key identifier string values if they are set. */
  var keyIdStrings: String
  /** Gets the content key identifier values if they are set. */
  var keyIds: String
  /** Gets the license acquisition URL in the header if it is set. */
  var licenseAcquisitionUrl: Uri
  /** Gets the license acquisition user interface URL in the header if it is set. */
  var licenseAcquisitionUserInterfaceUrl: Uri
  /**
    * Retrieves the full PlayReady object as a byte array.
    * @return The header containing the full PlayReady object.
    */
  def getSerializedHeader(): js.Array[Double]
}

object PlayReadyContentHeader {
  @scala.inline
  def apply(
    customAttributes: String,
    decryptorSetup: PlayReadyDecryptorSetup,
    domainServiceId: String,
    encryptionType: PlayReadyEncryptionAlgorithm,
    getSerializedHeader: () => js.Array[Double],
    headerWithEmbeddedUpdates: PlayReadyContentHeader,
    keyId: String,
    keyIdString: String,
    keyIdStrings: String,
    keyIds: String,
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri
  ): PlayReadyContentHeader = {
    val __obj = js.Dynamic.literal(customAttributes = customAttributes.asInstanceOf[js.Any], decryptorSetup = decryptorSetup.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], encryptionType = encryptionType.asInstanceOf[js.Any], getSerializedHeader = js.Any.fromFunction0(getSerializedHeader), headerWithEmbeddedUpdates = headerWithEmbeddedUpdates.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], keyIdString = keyIdString.asInstanceOf[js.Any], keyIdStrings = keyIdStrings.asInstanceOf[js.Any], keyIds = keyIds.asInstanceOf[js.Any], licenseAcquisitionUrl = licenseAcquisitionUrl.asInstanceOf[js.Any], licenseAcquisitionUserInterfaceUrl = licenseAcquisitionUserInterfaceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyContentHeader]
  }
}

