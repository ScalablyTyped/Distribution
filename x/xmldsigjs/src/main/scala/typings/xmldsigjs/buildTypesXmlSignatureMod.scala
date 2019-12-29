package typings.xmldsigjs

import typings.std.Uint8Array
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import typings.xmldsigjs.buildTypesXmlDataUnderscoreObjectMod.DataObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/signature", JSImport.Namespace)
@js.native
object buildTypesXmlSignatureMod extends js.Object {
  @js.native
  class Signature () extends XmlObject {
    /**
      * Gets or sets the ID of the current Signature.
      */
    var Id: String = js.native
    /**
      * Gets or sets the KeyInfo of the current Signature.
      */
    var KeyInfo: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfoMod.KeyInfo = js.native
    var ObjectList: DataObjects = js.native
    /**
      * Gets or sets the value of the digital signature.
      */
    var SignatureValue: Uint8Array | Null = js.native
    /**
      * Gets or sets the SignedInfo of the current Signature.
      */
    var SignedInfo: typings.xmldsigjs.buildTypesXmlSignedUnderscoreInfoMod.SignedInfo = js.native
  }
  
}

