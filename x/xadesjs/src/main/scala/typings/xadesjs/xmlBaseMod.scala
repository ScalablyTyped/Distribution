package typings.xadesjs

import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/xml_base", JSImport.Namespace)
@js.native
object xmlBaseMod extends js.Object {
  @js.native
  abstract class XadesCollection[I /* <: XadesObject */] () extends XmlCollection[I]
  
  @js.native
  abstract class XadesObject () extends XmlObject
  
}

