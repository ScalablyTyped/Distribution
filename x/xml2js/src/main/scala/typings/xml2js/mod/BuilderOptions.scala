package typings.xml2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuilderOptions extends js.Object {
  
  var allowSurrogateChars: js.UndefOr[Boolean] = js.native
  
  var attrkey: js.UndefOr[String] = js.native
  
  var cdata: js.UndefOr[Boolean] = js.native
  
  var charkey: js.UndefOr[String] = js.native
  
  var doctype: js.UndefOr[js.Any] = js.native
  
  var headless: js.UndefOr[Boolean] = js.native
  
  var renderOpts: js.UndefOr[RenderOptions] = js.native
  
  var rootName: js.UndefOr[String] = js.native
  
  var xmldec: js.UndefOr[XmlDeclarationAttributes] = js.native
}
object BuilderOptions {
  
  @scala.inline
  def apply(): BuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderOptions]
  }
  
  @scala.inline
  implicit class BuilderOptionsOps[Self <: BuilderOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowSurrogateChars(value: Boolean): Self = this.set("allowSurrogateChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSurrogateChars: Self = this.set("allowSurrogateChars", js.undefined)
    
    @scala.inline
    def setAttrkey(value: String): Self = this.set("attrkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrkey: Self = this.set("attrkey", js.undefined)
    
    @scala.inline
    def setCdata(value: Boolean): Self = this.set("cdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    
    @scala.inline
    def setCharkey(value: String): Self = this.set("charkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharkey: Self = this.set("charkey", js.undefined)
    
    @scala.inline
    def setDoctype(value: js.Any): Self = this.set("doctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    
    @scala.inline
    def setRenderOpts(value: RenderOptions): Self = this.set("renderOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderOpts: Self = this.set("renderOpts", js.undefined)
    
    @scala.inline
    def setRootName(value: String): Self = this.set("rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootName: Self = this.set("rootName", js.undefined)
    
    @scala.inline
    def setXmldec(value: XmlDeclarationAttributes): Self = this.set("xmldec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmldec: Self = this.set("xmldec", js.undefined)
  }
}
