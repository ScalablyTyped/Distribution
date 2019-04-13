package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "SignedInfo")
@js.native
class SignedInfo () extends XmlSignatureObject {
  /**
    * Gets or sets the canonicalization algorithm that is used before signing
    * for the current SignedInfo object.
    */
  var CanonicalizationMethod: xmldsigjsLib.xmldsigjsMod.CanonicalizationMethod = js.native
  /**
    * Gets or sets the ID of the current SignedInfo object.
    *
    * @type {string}
    * @memberOf SignedInfo
    */
  var Id: java.lang.String = js.native
  var References: xmldsigjsLib.xmldsigjsMod.References = js.native
  /**
    * Gets or sets the name of the algorithm used for signature generation
    * and validation for the current SignedInfo object.
    */
  var SignatureMethod: xmldsigjsLib.xmldsigjsMod.SignatureMethod = js.native
}

