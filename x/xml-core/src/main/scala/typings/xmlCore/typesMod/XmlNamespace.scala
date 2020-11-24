package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlNamespace extends js.Object {
  
  /**
    * Namespace URI
    *
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var namespace: String | Null = js.native
  
  /**
    * Prefix
    *
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var prefix: String | Null = js.native
}
object XmlNamespace {
  
  @scala.inline
  def apply(): XmlNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlNamespace]
  }
  
  @scala.inline
  implicit class XmlNamespaceOps[Self <: XmlNamespace] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceNull: Self = this.set("namespace", null)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
  }
}
