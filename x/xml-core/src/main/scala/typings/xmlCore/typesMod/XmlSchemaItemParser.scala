package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlSchemaItemParser extends js.Object {
  
  /**
    * Xml parser for item
    *
    * @type {*}
    * @memberOf XmlSchemaItemParser
    */
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.native
}
object XmlSchemaItemParser {
  
  @scala.inline
  def apply(): XmlSchemaItemParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchemaItemParser]
  }
  
  @scala.inline
  implicit class XmlSchemaItemParserOps[Self <: XmlSchemaItemParser] (val x: Self) extends AnyVal {
    
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
    def setParser(value: IXmlSerializableConstructor): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
  }
}
