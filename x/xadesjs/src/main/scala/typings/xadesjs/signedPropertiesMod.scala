package typings.xadesjs

import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedPropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_properties", "SignedProperties")
  @js.native
  class SignedProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignedDataObjectProperties: typings.xadesjs.signedDataObjectPropertiesMod.SignedDataObjectProperties = js.native
    
    var SignedSignatureProperties: typings.xadesjs.signedSignaturePropertiesMod.SignedSignatureProperties = js.native
  }
}
