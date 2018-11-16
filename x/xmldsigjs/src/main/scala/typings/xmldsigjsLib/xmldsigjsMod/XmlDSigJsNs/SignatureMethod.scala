package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureMethod
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  var Algorithm: java.lang.String = js.native
  var Any: SignatureMethodOther = js.native
  /**
           * Parameters for the XML Signature HMAC Algorithm.
           * The parameters include an optional output length which specifies the MAC truncation length in bits.
           *
           * @type {number}
           * @memberOf SignatureMethod
           */
  var HMACOutputLength: scala.Double = js.native
}

