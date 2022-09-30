package typings.xadesjs

import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlSignedPropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_properties", "SignedProperties")
  @js.native
  open class SignedProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignedDataObjectProperties: typings.xadesjs.xmlSignedDataObjectPropertiesMod.SignedDataObjectProperties = js.native
    
    var SignedSignatureProperties: typings.xadesjs.xmlSignedSignaturePropertiesMod.SignedSignatureProperties = js.native
  }
}
