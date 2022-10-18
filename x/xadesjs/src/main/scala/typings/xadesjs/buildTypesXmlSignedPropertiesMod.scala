package typings.xadesjs

import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlSignedPropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_properties", "SignedProperties")
  @js.native
  open class SignedProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignedDataObjectProperties: typings.xadesjs.buildTypesXmlSignedDataObjectPropertiesMod.SignedDataObjectProperties = js.native
    
    var SignedSignatureProperties: typings.xadesjs.buildTypesXmlSignedSignaturePropertiesMod.SignedSignatureProperties = js.native
  }
}
