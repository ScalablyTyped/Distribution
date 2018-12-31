package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the information in a PlayReady content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentHeader")
@js.native
class PlayReadyContentHeader protected () extends js.Object {
  /**
    * Initializes a new instance of the PlayReadyContentHeader class.
    * @param headerBytes Raw data bytes representing a PlayReady content header.
    */
  def this(headerBytes: js.Array[scala.Double]) = this()
  /**
    * Initializes a new instance of the PlayReadyContentHeader class.
    * @param headerBytes Raw data bytes representing a legacy WMDRM header.
    * @param licenseAcquisitionUrl The URL for the silent (no user interaction) license acquisition Web service.
    * @param licenseAcquisitionUserInterfaceUrl The URL for a non-silent license acquisition Web page.
    * @param customAttributes Contains custom data used by the content provider. The content author can add arbitrary XML inside this element. Microsoft code does not act on any data contained inside this element.
    * @param domainServiceId Service identifier for the domain service.
    */
  def this(headerBytes: js.Array[scala.Double], licenseAcquisitionUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, licenseAcquisitionUserInterfaceUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, customAttributes: java.lang.String, domainServiceId: java.lang.String) = this()
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
  def this(contentKeyId: java.lang.String, contentKeyIdString: java.lang.String, contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm, licenseAcquisitionUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, licenseAcquisitionUserInterfaceUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, customAttributes: java.lang.String, domainServiceId: java.lang.String) = this()
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
  def this(dwFlags: scala.Double, contentKeyIds: js.Array[java.lang.String], contentKeyIdStrings: js.Array[java.lang.String], contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm, licenseAcquisitionUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, licenseAcquisitionUserInterfaceUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, customAttributes: java.lang.String, domainServiceId: java.lang.String) = this()
  /** Gets the custom data used by the content provider. */
  var customAttributes: java.lang.String = js.native
  /** Gets the decryptor setup value in the header if it is set. */
  var decryptorSetup: PlayReadyDecryptorSetup = js.native
  /** Gets the domain service identifier in the header if it is set. */
  var domainServiceId: java.lang.String = js.native
  /** Gets the content encryption type in the header if it is set. */
  var encryptionType: PlayReadyEncryptionAlgorithm = js.native
  /** Gets a new content header that contains any embedded license updates that were available. */
  var headerWithEmbeddedUpdates: PlayReadyContentHeader = js.native
  /** Gets the content key identifier value if it is set. */
  var keyId: java.lang.String = js.native
  /** Gets the content key identifier string value if it is set. */
  var keyIdString: java.lang.String = js.native
  /** Gets the content key identifier string values if they are set. */
  var keyIdStrings: java.lang.String = js.native
  /** Gets the content key identifier values if they are set. */
  var keyIds: java.lang.String = js.native
  /** Gets the license acquisition URL in the header if it is set. */
  var licenseAcquisitionUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the license acquisition user interface URL in the header if it is set. */
  var licenseAcquisitionUserInterfaceUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Retrieves the full PlayReady object as a byte array.
    * @return The header containing the full PlayReady object.
    */
  def getSerializedHeader(): js.Array[scala.Double] = js.native
}

