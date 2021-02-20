package typings.xadesjs

import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod {
  
  @JSImport("xadesjs/build/types/xml/any", "Any")
  @js.native
  class Any () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/any", "AnyCollection")
  @js.native
  class AnyCollection () extends XadesCollection[XadesObject] {
    def this(properties: js.Object) = this()
  }
}
