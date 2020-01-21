package typings.xadesjs

import typings.xadesjs.xmlBaseMod.XadesObject
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/any", JSImport.Namespace)
@js.native
object anyMod extends js.Object {
  @js.native
  class Any () extends XmlObject {
    var Value: String = js.native
  }
  
  @js.native
  class AnyCollection () extends XmlCollection[XadesObject]
  
}

