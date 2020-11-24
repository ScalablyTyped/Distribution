package typings.xmldsigjs

import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/data_object", JSImport.Namespace)
@js.native
object dataObjectMod extends js.Object {
  
  @js.native
  class DataObject () extends XmlObject {
    
    var Encoding: String = js.native
    
    var Id: String = js.native
    
    var MimeType: String = js.native
  }
  
  @js.native
  class DataObjects () extends XmlCollection[DataObject]
}
