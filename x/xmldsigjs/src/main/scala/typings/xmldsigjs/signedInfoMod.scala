package typings.xmldsigjs

import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/signed_info", JSImport.Namespace)
@js.native
object signedInfoMod extends js.Object {
  
  @js.native
  class SignedInfo () extends XmlObject {
    
    /**
      * Gets or sets the canonicalization algorithm that is used before signing
      * for the current SignedInfo object.
      */
    var CanonicalizationMethod: typings.xmldsigjs.canonicalizationMethodMod.CanonicalizationMethod = js.native
    
    /**
      * Gets or sets the ID of the current SignedInfo object.
      *
      * @type {string}
      * @memberOf SignedInfo
      */
    var Id: String = js.native
    
    var References: typings.xmldsigjs.referenceMod.References = js.native
    
    /**
      * Gets or sets the name of the algorithm used for signature generation
      * and validation for the current SignedInfo object.
      */
    var SignatureMethod: typings.xmldsigjs.signatureMethodMod.SignatureMethod = js.native
  }
}
