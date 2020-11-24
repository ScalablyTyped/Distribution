package typings.xmldsigjs

import typings.std.Uint8Array
import typings.xmlCore.mod.XmlObject
import typings.xmldsigjs.dataObjectMod.DataObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/signature", JSImport.Namespace)
@js.native
object signatureMod extends js.Object {
  
  @js.native
  class Signature () extends XmlObject {
    
    /**
      * Gets or sets the ID of the current Signature.
      */
    var Id: String = js.native
    
    /**
      * Gets or sets the KeyInfo of the current Signature.
      */
    var KeyInfo: typings.xmldsigjs.keyInfoMod.KeyInfo = js.native
    
    var ObjectList: DataObjects = js.native
    
    /**
      * Gets or sets the value of the digital signature.
      */
    var SignatureValue: Uint8Array | Null = js.native
    
    /**
      * Gets or sets the SignedInfo of the current Signature.
      */
    var SignedInfo: typings.xmldsigjs.signedInfoMod.SignedInfo = js.native
  }
}
