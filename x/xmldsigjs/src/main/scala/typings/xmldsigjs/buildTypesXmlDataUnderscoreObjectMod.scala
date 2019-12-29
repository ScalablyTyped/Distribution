package typings.xmldsigjs

import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/data_object", JSImport.Namespace)
@js.native
object buildTypesXmlDataUnderscoreObjectMod extends js.Object {
  @js.native
  class DataObject () extends XmlObject {
    var Encoding: String = js.native
    var Id: String = js.native
    var MimeType: String = js.native
  }
  
  @js.native
  class DataObjects () extends XmlCollection[DataObject]
  
}

