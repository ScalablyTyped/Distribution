package typings.xmldsigjs.xmldsigjsMod

import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "SignedInfo")
@js.native
class SignedInfo () extends XmlObject {
  /**
    * Gets or sets the canonicalization algorithm that is used before signing
    * for the current SignedInfo object.
    */
  var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
  /**
    * Gets or sets the ID of the current SignedInfo object.
    *
    * @type {string}
    * @memberOf SignedInfo
    */
  var Id: String = js.native
  var References: typings.xmldsigjs.xmldsigjsMod.References = js.native
  /**
    * Gets or sets the name of the algorithm used for signature generation
    * and validation for the current SignedInfo object.
    */
  var SignatureMethod: typings.xmldsigjs.xmldsigjsMod.SignatureMethod = js.native
}

