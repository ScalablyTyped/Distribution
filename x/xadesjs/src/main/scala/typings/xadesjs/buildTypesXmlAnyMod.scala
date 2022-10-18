package typings.xadesjs

import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesCollection
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlAnyMod {
  
  @JSImport("xadesjs/build/types/xml/any", "Any")
  @js.native
  open class Any () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/any", "AnyCollection")
  @js.native
  open class AnyCollection () extends XadesCollection[XadesObject] {
    def this(properties: js.Object) = this()
  }
}
