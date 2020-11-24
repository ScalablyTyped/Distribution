package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlElementType
  extends XmlSchemaItemBase
     with XmlSchemaItemParser {
  
  /**
    * Local name for Xml element
    *
    * @type {string}
    * @memberOf XmlElementType
    */
  @JSName("localName")
  var localName_XmlElementType: String = js.native
}
object XmlElementType {
  
  @scala.inline
  def apply(localName: String): XmlElementType = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlElementType]
  }
  
  @scala.inline
  implicit class XmlElementTypeOps[Self <: XmlElementType] (val x: Self) extends AnyVal {
    
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
  }
}
