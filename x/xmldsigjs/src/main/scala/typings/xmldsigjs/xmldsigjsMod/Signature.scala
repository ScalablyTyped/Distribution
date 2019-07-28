package typings.xmldsigjs.xmldsigjsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Signature")
@js.native
class Signature () extends XmlSignatureObject {
  /**
    * Gets or sets the ID of the current Signature.
    */
  var Id: String = js.native
  /**
    * Gets or sets the KeyInfo of the current Signature.
    */
  var KeyInfo: typings.xmldsigjs.xmldsigjsMod.KeyInfo = js.native
  var ObjectList: DataObjects = js.native
  /**
    * Gets or sets the value of the digital signature.
    */
  var SignatureValue: Uint8Array | Null = js.native
  /**
    * Gets or sets the SignedInfo of the current Signature.
    */
  var SignedInfo: typings.xmldsigjs.xmldsigjsMod.SignedInfo = js.native
}

