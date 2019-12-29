package typings.xadesjs

import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/xml_base", JSImport.Namespace)
@js.native
object buildTypesXmlXmlUnderscoreBaseMod extends js.Object {
  @js.native
  abstract class XadesCollection[I /* <: XadesObject */] () extends XmlCollection[I]
  
  @js.native
  abstract class XadesObject () extends XmlObject
  
}

