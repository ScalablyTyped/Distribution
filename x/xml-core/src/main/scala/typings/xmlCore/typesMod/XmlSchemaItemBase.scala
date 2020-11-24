package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlSchemaItemBase extends js.Object {
  
  /**
    * Local name of item
    *
    * @type {string}
    * @memberOf XmlSchemaItemBase
    */
  var localName: js.UndefOr[String] = js.native
  
  /**
    * Namespace URI of attribute
    *
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var namespaceURI: js.UndefOr[String | Null] = js.native
  
  /**
    * Default prefix for Xml element
    *
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var prefix: js.UndefOr[String | Null] = js.native
}
object XmlSchemaItemBase {
  
  @scala.inline
  def apply(): XmlSchemaItemBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchemaItemBase]
  }
  
  @scala.inline
  implicit class XmlSchemaItemBaseOps[Self <: XmlSchemaItemBase] (val x: Self) extends AnyVal {
    
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
  }
}
