package typings.xadesjs

import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/data_object_format", JSImport.Namespace)
@js.native
object dataObjectFormatMod extends js.Object {
  @js.native
  class DataObjectFormat () extends XmlObject {
    var Description: String = js.native
    var Encoding: String = js.native
    var MimeType: String = js.native
    var ObjectIdentifier: typings.xadesjs.objectIdentifierMod.ObjectIdentifier = js.native
    var ObjectReference: String = js.native
  }
  
}

