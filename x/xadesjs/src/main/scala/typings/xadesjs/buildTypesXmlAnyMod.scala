package typings.xadesjs

import typings.xadesjs.buildTypesXmlXmlUnderscoreBaseMod.XadesObject
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/any", JSImport.Namespace)
@js.native
object buildTypesXmlAnyMod extends js.Object {
  @js.native
  class Any () extends XmlObject {
    var Value: String = js.native
  }
  
  @js.native
  class AnyCollection () extends XmlCollection[XadesObject]
  
}

