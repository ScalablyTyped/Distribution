package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the information in a PlayReady content header. */
@js.native
trait PlayReadyContentHeader extends js.Object {
  
  /** Gets the custom data used by the content provider. */
  var customAttributes: String = js.native
  
  /** Gets the decryptor setup value in the header if it is set. */
  var decryptorSetup: PlayReadyDecryptorSetup = js.native
  
  /** Gets the domain service identifier in the header if it is set. */
  var domainServiceId: String = js.native
  
  /** Gets the content encryption type in the header if it is set. */
  var encryptionType: PlayReadyEncryptionAlgorithm = js.native
  
  /**
    * Retrieves the full PlayReady object as a byte array.
    * @return The header containing the full PlayReady object.
    */
  def getSerializedHeader(): js.Array[Double] = js.native
  
  /** Gets a new content header that contains any embedded license updates that were available. */
  var headerWithEmbeddedUpdates: PlayReadyContentHeader = js.native
  
  /** Gets the content key identifier value if it is set. */
  var keyId: String = js.native
  
  /** Gets the content key identifier string value if it is set. */
  var keyIdString: String = js.native
  
  /** Gets the content key identifier string values if they are set. */
  var keyIdStrings: String = js.native
  
  /** Gets the content key identifier values if they are set. */
  var keyIds: String = js.native
  
  /** Gets the license acquisition URL in the header if it is set. */
  var licenseAcquisitionUrl: Uri = js.native
  
  /** Gets the license acquisition user interface URL in the header if it is set. */
  var licenseAcquisitionUserInterfaceUrl: Uri = js.native
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
  
  @scala.inline
  implicit class PlayReadyContentHeaderOps[Self <: PlayReadyContentHeader] (val x: Self) extends AnyVal {
    
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
    def setCustomAttributes(value: String): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptorSetup(value: PlayReadyDecryptorSetup): Self = this.set("decryptorSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainServiceId(value: String): Self = this.set("domainServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionType(value: PlayReadyEncryptionAlgorithm): Self = this.set("encryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSerializedHeader(value: () => js.Array[Double]): Self = this.set("getSerializedHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaderWithEmbeddedUpdates(value: PlayReadyContentHeader): Self = this.set("headerWithEmbeddedUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdString(value: String): Self = this.set("keyIdString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdStrings(value: String): Self = this.set("keyIdStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIds(value: String): Self = this.set("keyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAcquisitionUrl(value: Uri): Self = this.set("licenseAcquisitionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAcquisitionUserInterfaceUrl(value: Uri): Self = this.set("licenseAcquisitionUserInterfaceUrl", value.asInstanceOf[js.Any])
  }
}
