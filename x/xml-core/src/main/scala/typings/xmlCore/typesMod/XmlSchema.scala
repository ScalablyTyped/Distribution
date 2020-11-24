package typings.xmlCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.xmlCore.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlSchema extends js.Object {
  
  var items: js.UndefOr[StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Type]] = js.native
  
  var localName: js.UndefOr[String] = js.native
  
  var namespaceURI: js.UndefOr[String | Null] = js.native
  
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.native
  
  var prefix: js.UndefOr[String | Null] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
}
object XmlSchema {
  
  @scala.inline
  def apply(): XmlSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchema]
  }
  
  @scala.inline
  implicit class XmlSchemaOps[Self <: XmlSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItems(value: StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Type]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalName: Self = this.set("localName", js.undefined)
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceURI: Self = this.set("namespaceURI", js.undefined)
    
    @scala.inline
    def setNamespaceURINull: Self = this.set("namespaceURI", null)
    
    @scala.inline
    def setParser(value: IXmlSerializableConstructor): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
