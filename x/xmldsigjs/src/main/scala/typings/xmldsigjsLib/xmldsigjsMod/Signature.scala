package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Signature")
@js.native
class Signature () extends XmlSignatureObject {
  /**
    * Gets or sets the ID of the current Signature.
    */
  var Id: java.lang.String = js.native
  /**
    * Gets or sets the KeyInfo of the current Signature.
    */
  var KeyInfo: xmldsigjsLib.xmldsigjsMod.KeyInfo = js.native
  var ObjectList: DataObjects = js.native
  /**
    * Gets or sets the value of the digital signature.
    */
  var SignatureValue: stdLib.Uint8Array | scala.Null = js.native
  /**
    * Gets or sets the SignedInfo of the current Signature.
    */
  var SignedInfo: xmldsigjsLib.xmldsigjsMod.SignedInfo = js.native
}

