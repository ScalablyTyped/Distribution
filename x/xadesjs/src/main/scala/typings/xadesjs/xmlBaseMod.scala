package typings.xadesjs

import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlBaseMod {
  
  @JSImport("xadesjs/build/types/src/xml/xml_base", "XadesCollection")
  @js.native
  abstract class XadesCollection[I /* <: XadesObject */] () extends XmlCollection[I] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/xml_base", "XadesObject")
  @js.native
  abstract class XadesObject () extends XmlObject {
    def this(properties: js.Object) = this()
  }
}
