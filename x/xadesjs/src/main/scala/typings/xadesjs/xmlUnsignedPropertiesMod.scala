package typings.xadesjs

import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlUnsignedPropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/unsigned_properties", "UnsignedProperties")
  @js.native
  open class UnsignedProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var UnsignedDataObjectProperties: typings.xadesjs.xmlUnsignedDataObjectPropertyMod.UnsignedDataObjectProperties = js.native
    
    var UnsignedSignatureProperties: typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperties = js.native
  }
}
