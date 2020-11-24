package typings.xmltojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var attrKey: js.UndefOr[String] = js.native
  
  var attrsAsObject: js.UndefOr[Boolean] = js.native
  
  var cdataKey: js.UndefOr[String] = js.native
  
  var childrenAsArray: js.UndefOr[Boolean] = js.native
  
  var grokAttr: js.UndefOr[Boolean] = js.native
  
  var grokText: js.UndefOr[Boolean] = js.native
  
  var mergeCDATA: js.UndefOr[Boolean] = js.native
  
  var namespaceKey: js.UndefOr[String] = js.native
  
  var normalize: js.UndefOr[Boolean] = js.native
  
  var stripAttrPrefix: js.UndefOr[Boolean] = js.native
  
  var stripElemPrefix: js.UndefOr[Boolean] = js.native
  
  var textKey: js.UndefOr[String] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
  
  var xmlns: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAttrKey(value: String): Self = this.set("attrKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrKey: Self = this.set("attrKey", js.undefined)
    
    @scala.inline
    def setAttrsAsObject(value: Boolean): Self = this.set("attrsAsObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrsAsObject: Self = this.set("attrsAsObject", js.undefined)
    
    @scala.inline
    def setCdataKey(value: String): Self = this.set("cdataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdataKey: Self = this.set("cdataKey", js.undefined)
    
    @scala.inline
    def setChildrenAsArray(value: Boolean): Self = this.set("childrenAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenAsArray: Self = this.set("childrenAsArray", js.undefined)
    
    @scala.inline
    def setGrokAttr(value: Boolean): Self = this.set("grokAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrokAttr: Self = this.set("grokAttr", js.undefined)
    
    @scala.inline
    def setGrokText(value: Boolean): Self = this.set("grokText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrokText: Self = this.set("grokText", js.undefined)
    
    @scala.inline
    def setMergeCDATA(value: Boolean): Self = this.set("mergeCDATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeCDATA: Self = this.set("mergeCDATA", js.undefined)
    
    @scala.inline
    def setNamespaceKey(value: String): Self = this.set("namespaceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceKey: Self = this.set("namespaceKey", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setStripAttrPrefix(value: Boolean): Self = this.set("stripAttrPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripAttrPrefix: Self = this.set("stripAttrPrefix", js.undefined)
    
    @scala.inline
    def setStripElemPrefix(value: Boolean): Self = this.set("stripElemPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripElemPrefix: Self = this.set("stripElemPrefix", js.undefined)
    
    @scala.inline
    def setTextKey(value: String): Self = this.set("textKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextKey: Self = this.set("textKey", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    
    @scala.inline
    def setXmlns(value: Boolean): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
}
