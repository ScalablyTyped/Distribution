package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.xmlBaseMod.XadesCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsignedDataObjectPropertyMod {
  
  @JSImport("xadesjs/build/types/xml/unsigned_data_object_property", "UnsignedDataObjectProperties")
  @js.native
  class UnsignedDataObjectProperties () extends XadesCollection[UnsignedDataObjectProperty] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_data_object_property", "UnsignedDataObjectProperty")
  @js.native
  class UnsignedDataObjectProperty () extends Any {
    def this(properties: js.Object) = this()
  }
}
