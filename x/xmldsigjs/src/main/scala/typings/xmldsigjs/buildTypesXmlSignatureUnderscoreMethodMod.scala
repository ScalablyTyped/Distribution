package typings.xmldsigjs

import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/signature_method", JSImport.Namespace)
@js.native
object buildTypesXmlSignatureUnderscoreMethodMod extends js.Object {
  @js.native
  class SignatureMethod () extends XmlObject {
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
  
  @js.native
  class SignatureMethodOther () extends XmlCollection[XmlObject]
  
}

