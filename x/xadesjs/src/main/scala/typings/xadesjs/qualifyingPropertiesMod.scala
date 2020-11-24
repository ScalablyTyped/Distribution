package typings.xadesjs

import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/qualifying_properties", JSImport.Namespace)
@js.native
object qualifyingPropertiesMod extends js.Object {
  
  @js.native
  class QualifyingProperties () extends XmlObject {
    
    var Id: String = js.native
    
    var SignedProperties: typings.xadesjs.signedPropertiesMod.SignedProperties = js.native
    
    var Target: String = js.native
    
    var UnsignedProperties: typings.xadesjs.unsignedPropertiesMod.UnsignedProperties = js.native
  }
}
