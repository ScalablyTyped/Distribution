package typings.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlOptions extends js.Object {
  
  var compressed: js.UndefOr[Boolean] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  
  var trimmed: js.UndefOr[Boolean] = js.native
}
object XmlOptions {
  
  @scala.inline
  def apply(): XmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlOptions]
  }
  
  @scala.inline
  implicit class XmlOptionsOps[Self <: XmlOptions] (val x: Self) extends AnyVal {
    
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
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressed: Self = this.set("compressed", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    
    @scala.inline
    def setTrimmed(value: Boolean): Self = this.set("trimmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimmed: Self = this.set("trimmed", js.undefined)
  }
}
