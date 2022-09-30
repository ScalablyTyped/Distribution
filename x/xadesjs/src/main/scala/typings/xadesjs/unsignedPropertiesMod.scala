package typings.xadesjs

import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsignedPropertiesMod {
  
  @JSImport("xadesjs/build/types/src/xml/unsigned_properties", "UnsignedProperties")
  @js.native
  open class UnsignedProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var UnsignedDataObjectProperties: typings.xadesjs.unsignedDataObjectPropertyMod.UnsignedDataObjectProperties = js.native
    
    var UnsignedSignatureProperties: typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperties = js.native
  }
}
