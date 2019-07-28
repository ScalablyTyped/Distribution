package typings.xmldsigjs.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "SignatureMethod")
@js.native
class SignatureMethod () extends XmlSignatureObject {
  var Algorithm: String = js.native
  var Any: SignatureMethodOther = js.native
  /**
    * Parameters for the XML Signature HMAC Algorithm.
    * The parameters include an optional output length which specifies the MAC truncation length in bits.
    *
    * @type {number}
    * @memberOf SignatureMethod
    */
  var HMACOutputLength: Double = js.native
}

