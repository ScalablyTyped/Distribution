package typings.xadesjs

import typings.xadesjs.xmlAnyMod.Any
import typings.xadesjs.xmlXmlBaseMod.XadesCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlUnsignedDataObjectPropertyMod {
  
  @JSImport("xadesjs/build/types/xml/unsigned_data_object_property", "UnsignedDataObjectProperties")
  @js.native
  open class UnsignedDataObjectProperties () extends XadesCollection[UnsignedDataObjectProperty] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_data_object_property", "UnsignedDataObjectProperty")
  @js.native
  open class UnsignedDataObjectProperty () extends Any {
    def this(properties: js.Object) = this()
  }
}
