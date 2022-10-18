package typings.xadesjs

import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlXmlBaseMod {
  
  /* note: abstract class */ @JSImport("xadesjs/build/types/xml/xml_base", "XadesCollection")
  @js.native
  open class XadesCollection[I /* <: XadesObject */] () extends XmlCollection[I] {
    def this(properties: js.Object) = this()
  }
  
  /* note: abstract class */ @JSImport("xadesjs/build/types/xml/xml_base", "XadesObject")
  @js.native
  open class XadesObject () extends XmlObject {
    def this(properties: js.Object) = this()
  }
}
