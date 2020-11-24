package typings.xadesjs

import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/signed_properties", JSImport.Namespace)
@js.native
object signedPropertiesMod extends js.Object {
  
  @js.native
  class SignedProperties () extends XmlObject {
    
    var Id: String = js.native
    
    var SignedDataObjectProperties: typings.xadesjs.signedDataObjectPropertiesMod.SignedDataObjectProperties = js.native
    
    var SignedSignatureProperties: typings.xadesjs.signedSignaturePropertiesMod.SignedSignatureProperties = js.native
  }
}
