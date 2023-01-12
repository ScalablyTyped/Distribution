package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the information in a PlayReady content header. */
trait PlayReadyContentHeader extends StObject {
  
  /** Gets the custom data used by the content provider. */
  var customAttributes: String
  
  /** Gets the decryptor setup value in the header if it is set. */
  var decryptorSetup: PlayReadyDecryptorSetup
  
  /** Gets the domain service identifier in the header if it is set. */
  var domainServiceId: String
  
  /** Gets the content encryption type in the header if it is set. */
  var encryptionType: PlayReadyEncryptionAlgorithm
  
  /**
    * Retrieves the full PlayReady object as a byte array.
    * @return The header containing the full PlayReady object.
    */
  def getSerializedHeader(): js.Array[Double]
  
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
}
object PlayReadyContentHeader {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PlayReadyContentHeader] (val x: Self) extends AnyVal {
    
    inline def setCustomAttributes(value: String): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setDecryptorSetup(value: PlayReadyDecryptorSetup): Self = StObject.set(x, "decryptorSetup", value.asInstanceOf[js.Any])
    
    inline def setDomainServiceId(value: String): Self = StObject.set(x, "domainServiceId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionType(value: PlayReadyEncryptionAlgorithm): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setGetSerializedHeader(value: () => js.Array[Double]): Self = StObject.set(x, "getSerializedHeader", js.Any.fromFunction0(value))
    
    inline def setHeaderWithEmbeddedUpdates(value: PlayReadyContentHeader): Self = StObject.set(x, "headerWithEmbeddedUpdates", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdString(value: String): Self = StObject.set(x, "keyIdString", value.asInstanceOf[js.Any])
    
    inline def setKeyIdStrings(value: String): Self = StObject.set(x, "keyIdStrings", value.asInstanceOf[js.Any])
    
    inline def setKeyIds(value: String): Self = StObject.set(x, "keyIds", value.asInstanceOf[js.Any])
    
    inline def setLicenseAcquisitionUrl(value: Uri): Self = StObject.set(x, "licenseAcquisitionUrl", value.asInstanceOf[js.Any])
    
    inline def setLicenseAcquisitionUserInterfaceUrl(value: Uri): Self = StObject.set(x, "licenseAcquisitionUserInterfaceUrl", value.asInstanceOf[js.Any])
  }
}
