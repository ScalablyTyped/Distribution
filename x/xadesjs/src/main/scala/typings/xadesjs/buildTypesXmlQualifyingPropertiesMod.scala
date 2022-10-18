package typings.xadesjs

import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlQualifyingPropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/qualifying_properties", "QualifyingProperties")
  @js.native
  open class QualifyingProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignedProperties: typings.xadesjs.buildTypesXmlSignedPropertiesMod.SignedProperties = js.native
    
    var Target: String = js.native
    
    var UnsignedProperties: typings.xadesjs.buildTypesXmlUnsignedPropertiesMod.UnsignedProperties = js.native
  }
}
