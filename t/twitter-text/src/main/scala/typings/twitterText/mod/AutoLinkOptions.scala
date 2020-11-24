package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLinkOptions extends js.Object {
  
  var cashtagClass: js.UndefOr[String] = js.native
  
  var cashtagUrlBase: js.UndefOr[String] = js.native
  
  var hashtagClass: js.UndefOr[String] = js.native
  
  var hashtagUrlBase: js.UndefOr[String] = js.native
  
  var htmlAttrs: js.UndefOr[Attributes] = js.native
  
  var htmlEscapeNonEntities: js.UndefOr[Boolean] = js.native
  
  var invisibleTagAttrs: js.UndefOr[String] = js.native
  
  var linkAttributeBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* attributes */ Attributes, Unit]] = js.native
  
  var linkTextBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* text */ String, Unit]] = js.native
  
  var listClass: js.UndefOr[String] = js.native
  
  var listUrlBase: js.UndefOr[String] = js.native
  
  var suppressNoFollow: js.UndefOr[Boolean] = js.native
  
  var symbolTag: js.UndefOr[String] = js.native
  
  var targetBlank: js.UndefOr[Boolean] = js.native
  
  var textWithSymbolTag: js.UndefOr[String] = js.native
  
  var urlEntities: js.UndefOr[js.Array[UrlEntity]] = js.native
  
  var usernameClass: js.UndefOr[String] = js.native
  
  var usernameIncludeSymbol: js.UndefOr[Boolean] = js.native
  
  var usernameUrlBase: js.UndefOr[String] = js.native
}
object AutoLinkOptions {
  
  @scala.inline
  def apply(): AutoLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLinkOptions]
  }
  
  @scala.inline
  implicit class AutoLinkOptionsOps[Self <: AutoLinkOptions] (val x: Self) extends AnyVal {
    
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
    def setCashtagClass(value: String): Self = this.set("cashtagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCashtagClass: Self = this.set("cashtagClass", js.undefined)
    
    @scala.inline
    def setCashtagUrlBase(value: String): Self = this.set("cashtagUrlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCashtagUrlBase: Self = this.set("cashtagUrlBase", js.undefined)
    
    @scala.inline
    def setHashtagClass(value: String): Self = this.set("hashtagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtagClass: Self = this.set("hashtagClass", js.undefined)
    
    @scala.inline
    def setHashtagUrlBase(value: String): Self = this.set("hashtagUrlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtagUrlBase: Self = this.set("hashtagUrlBase", js.undefined)
    
    @scala.inline
    def setHtmlAttrs(value: Attributes): Self = this.set("htmlAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttrs: Self = this.set("htmlAttrs", js.undefined)
    
    @scala.inline
    def setHtmlEscapeNonEntities(value: Boolean): Self = this.set("htmlEscapeNonEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlEscapeNonEntities: Self = this.set("htmlEscapeNonEntities", js.undefined)
    
    @scala.inline
    def setInvisibleTagAttrs(value: String): Self = this.set("invisibleTagAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisibleTagAttrs: Self = this.set("invisibleTagAttrs", js.undefined)
    
    @scala.inline
    def setLinkAttributeBlock(value: (/* entity */ EntityWithIndices, /* attributes */ Attributes) => Unit): Self = this.set("linkAttributeBlock", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLinkAttributeBlock: Self = this.set("linkAttributeBlock", js.undefined)
    
    @scala.inline
    def setLinkTextBlock(value: (/* entity */ EntityWithIndices, /* text */ String) => Unit): Self = this.set("linkTextBlock", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLinkTextBlock: Self = this.set("linkTextBlock", js.undefined)
    
    @scala.inline
    def setListClass(value: String): Self = this.set("listClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListClass: Self = this.set("listClass", js.undefined)
    
    @scala.inline
    def setListUrlBase(value: String): Self = this.set("listUrlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListUrlBase: Self = this.set("listUrlBase", js.undefined)
    
    @scala.inline
    def setSuppressNoFollow(value: Boolean): Self = this.set("suppressNoFollow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressNoFollow: Self = this.set("suppressNoFollow", js.undefined)
    
    @scala.inline
    def setSymbolTag(value: String): Self = this.set("symbolTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolTag: Self = this.set("symbolTag", js.undefined)
    
    @scala.inline
    def setTargetBlank(value: Boolean): Self = this.set("targetBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetBlank: Self = this.set("targetBlank", js.undefined)
    
    @scala.inline
    def setTextWithSymbolTag(value: String): Self = this.set("textWithSymbolTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWithSymbolTag: Self = this.set("textWithSymbolTag", js.undefined)
    
    @scala.inline
    def setUrlEntitiesVarargs(value: UrlEntity*): Self = this.set("urlEntities", js.Array(value :_*))
    
    @scala.inline
    def setUrlEntities(value: js.Array[UrlEntity]): Self = this.set("urlEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlEntities: Self = this.set("urlEntities", js.undefined)
    
    @scala.inline
    def setUsernameClass(value: String): Self = this.set("usernameClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameClass: Self = this.set("usernameClass", js.undefined)
    
    @scala.inline
    def setUsernameIncludeSymbol(value: Boolean): Self = this.set("usernameIncludeSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameIncludeSymbol: Self = this.set("usernameIncludeSymbol", js.undefined)
    
    @scala.inline
    def setUsernameUrlBase(value: String): Self = this.set("usernameUrlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameUrlBase: Self = this.set("usernameUrlBase", js.undefined)
  }
}
