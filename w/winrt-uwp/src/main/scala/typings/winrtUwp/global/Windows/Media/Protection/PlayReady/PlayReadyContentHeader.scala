package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the information in a PlayReady content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentHeader")
@js.native
class PlayReadyContentHeader protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader {
  /**
    * Initializes a new instance of the PlayReadyContentHeader class.
    * @param headerBytes Raw data bytes representing a PlayReady content header.
    */
  def this(headerBytes: js.Array[Double]) = this()
  /**
    * Initializes a new instance of the PlayReadyContentHeader class.
    * @param headerBytes Raw data bytes representing a legacy WMDRM header.
    * @param licenseAcquisitionUrl The URL for the silent (no user interaction) license acquisition Web service.
    * @param licenseAcquisitionUserInterfaceUrl The URL for a non-silent license acquisition Web page.
    * @param customAttributes Contains custom data used by the content provider. The content author can add arbitrary XML inside this element. Microsoft code does not act on any data contained inside this element.
    * @param domainServiceId Service identifier for the domain service.
    */
  def this(
    headerBytes: js.Array[Double],
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri,
    customAttributes: String,
    domainServiceId: String
  ) = this()
  /**
    * Initializes a new instance of the PlayReadyContentHeader class.
    * @param contentKeyId Identifier of the content encryption key.
    * @param contentKeyIdString String representation of the content key. If the contentKeyId parameter is specified, then this parameter is ignored.
    * @param contentEncryptionAlgorithm Encryption algorithm type used to encrypt the content.
    * @param licenseAcquisitionUrl The URL for the silent (no user interaction) license acquisition Web service.
    * @param licenseAcquisitionUserInterfaceUrl The URL for a non-silent license acquisition Web page.
    * @param customAttributes Contains custom data used by the content provider. The content author can add arbitrary XML inside this element. Microsoft code does not act on any data contained inside this element.
    * @param domainServiceId Service identifier for the domain service.
    */
  def this(
    contentKeyId: String,
    contentKeyIdString: String,
    contentEncryptionAlgorithm: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm,
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri,
    customAttributes: String,
    domainServiceId: String
  ) = this()
  /**
    * Initializes a new instance of the PlayReadyContentHeader class.
    * @param dwFlags Reserved. Set to 0.
    * @param contentKeyIds Identifiers of the content encryption keys.
    * @param contentKeyIdStrings String representations of the content keys. Each string must be a Base-64 encoded 16 byte value.
    * @param contentEncryptionAlgorithm Encryption algorithm type used to encrypt the content.
    * @param licenseAcquisitionUrl The URL for the silent (no user interaction) license acquisition Web service.
    * @param licenseAcquisitionUserInterfaceUrl The URL for a non-silent license acquisition Web page.
    * @param customAttributes Contains custom data used by the content provider. The content author can add arbitrary XML inside this element. Microsoft code does not act on any data contained inside this element.
    * @param domainServiceId Service identifier for the domain service.
    */
  def this(
    dwFlags: Double,
    contentKeyIds: js.Array[String],
    contentKeyIdStrings: js.Array[String],
    contentEncryptionAlgorithm: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm,
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri,
    customAttributes: String,
    domainServiceId: String
  ) = this()
  
  /** Gets the custom data used by the content provider. */
  /* CompleteClass */
  var customAttributes: String = js.native
  
  /** Gets the decryptor setup value in the header if it is set. */
  /* CompleteClass */
  var decryptorSetup: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyDecryptorSetup = js.native
  
  /** Gets the domain service identifier in the header if it is set. */
  /* CompleteClass */
  var domainServiceId: String = js.native
  
  /** Gets the content encryption type in the header if it is set. */
  /* CompleteClass */
  var encryptionType: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm = js.native
  
  /**
    * Retrieves the full PlayReady object as a byte array.
    * @return The header containing the full PlayReady object.
    */
  /* CompleteClass */
  override def getSerializedHeader(): js.Array[Double] = js.native
  
  /** Gets a new content header that contains any embedded license updates that were available. */
  /* CompleteClass */
  var headerWithEmbeddedUpdates: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader = js.native
  
  /** Gets the content key identifier value if it is set. */
  /* CompleteClass */
  var keyId: String = js.native
  
  /** Gets the content key identifier string value if it is set. */
  /* CompleteClass */
  var keyIdString: String = js.native
  
  /** Gets the content key identifier string values if they are set. */
  /* CompleteClass */
  var keyIdStrings: String = js.native
  
  /** Gets the content key identifier values if they are set. */
  /* CompleteClass */
  var keyIds: String = js.native
  
  /** Gets the license acquisition URL in the header if it is set. */
  /* CompleteClass */
  var licenseAcquisitionUrl: Uri = js.native
  
  /** Gets the license acquisition user interface URL in the header if it is set. */
  /* CompleteClass */
  var licenseAcquisitionUserInterfaceUrl: Uri = js.native
}
