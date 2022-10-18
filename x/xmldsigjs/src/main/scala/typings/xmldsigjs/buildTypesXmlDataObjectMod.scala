package typings.xmldsigjs

import typings.xmldsigjs.buildTypesXmlXmlObjectMod.XmlSignatureCollection
import typings.xmldsigjs.buildTypesXmlXmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlDataObjectMod {
  
  @JSImport("xmldsigjs/build/types/xml/data_object", "DataObject")
  @js.native
  open class DataObject () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var Encoding: String = js.native
    
    var Id: String = js.native
    
    var MimeType: String = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/data_object", "DataObjects")
  @js.native
  open class DataObjects () extends XmlSignatureCollection[DataObject] {
    def this(properties: js.Object) = this()
  }
}
