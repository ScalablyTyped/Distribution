package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedInfo
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  /**
           * Gets or sets the canonicalization algorithm that is used before signing
           * for the current SignedInfo object.
           */
  var CanonicalizationMethod: CanonicalizationMethod = js.native
  /**
           * Gets or sets the ID of the current SignedInfo object.
           *
           * @type {string}
           * @memberOf SignedInfo
           */
  var Id: java.lang.String = js.native
  var References: References = js.native
  /**
           * Gets or sets the name of the algorithm used for signature generation
           * and validation for the current SignedInfo object.
           */
  var SignatureMethod: SignatureMethod = js.native
}

