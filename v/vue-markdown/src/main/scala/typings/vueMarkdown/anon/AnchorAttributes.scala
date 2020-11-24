package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorAttributes extends js.Object {
  
  var anchorAttributes: Default = js.native
  
  var breaks: Type = js.native
  
  var emoji: Type = js.native
  
  var highlight: Type = js.native
  
  var html: Type = js.native
  
  var langPrefix: DefaultType = js.native
  
  var linkify: Type = js.native
  
  var postrender: Default = js.native
  
  var prerender: Default = js.native
  
  var quotes: DefaultType = js.native
  
  var show: Type = js.native
  
  var source: DefaultType = js.native
  
  var tableClass: DefaultType = js.native
  
  var taskLists: Type = js.native
  
  var toc: Type = js.native
  
  var tocAnchorClass: DefaultType = js.native
  
  var tocAnchorLink: Type = js.native
  
  var tocAnchorLinkClass: DefaultType = js.native
  
  var tocAnchorLinkSpace: Type = js.native
  
  var tocAnchorLinkSymbol: DefaultType = js.native
  
  var tocClass: DefaultType = js.native
  
  var tocFirstLevel: DefaultNumber = js.native
  
  var tocId: TypeAny = js.native
  
  var tocLastLevel: TypeAny = js.native
  
  var typographer: Type = js.native
  
  var watches: Default = js.native
  
  var xhtmlOut: Type = js.native
}
object AnchorAttributes {
  
  @scala.inline
  def apply(
    anchorAttributes: Default,
    breaks: Type,
    emoji: Type,
    highlight: Type,
    html: Type,
    langPrefix: DefaultType,
    linkify: Type,
    postrender: Default,
    prerender: Default,
    quotes: DefaultType,
    show: Type,
    source: DefaultType,
    tableClass: DefaultType,
    taskLists: Type,
    toc: Type,
    tocAnchorClass: DefaultType,
    tocAnchorLink: Type,
    tocAnchorLinkClass: DefaultType,
    tocAnchorLinkSpace: Type,
    tocAnchorLinkSymbol: DefaultType,
    tocClass: DefaultType,
    tocFirstLevel: DefaultNumber,
    tocId: TypeAny,
    tocLastLevel: TypeAny,
    typographer: Type,
    watches: Default,
    xhtmlOut: Type
  ): AnchorAttributes = {
    val __obj = js.Dynamic.literal(anchorAttributes = anchorAttributes.asInstanceOf[js.Any], breaks = breaks.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], langPrefix = langPrefix.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], postrender = postrender.asInstanceOf[js.Any], prerender = prerender.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tableClass = tableClass.asInstanceOf[js.Any], taskLists = taskLists.asInstanceOf[js.Any], toc = toc.asInstanceOf[js.Any], tocAnchorClass = tocAnchorClass.asInstanceOf[js.Any], tocAnchorLink = tocAnchorLink.asInstanceOf[js.Any], tocAnchorLinkClass = tocAnchorLinkClass.asInstanceOf[js.Any], tocAnchorLinkSpace = tocAnchorLinkSpace.asInstanceOf[js.Any], tocAnchorLinkSymbol = tocAnchorLinkSymbol.asInstanceOf[js.Any], tocClass = tocClass.asInstanceOf[js.Any], tocFirstLevel = tocFirstLevel.asInstanceOf[js.Any], tocId = tocId.asInstanceOf[js.Any], tocLastLevel = tocLastLevel.asInstanceOf[js.Any], typographer = typographer.asInstanceOf[js.Any], watches = watches.asInstanceOf[js.Any], xhtmlOut = xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorAttributes]
  }
  
  @scala.inline
  implicit class AnchorAttributesOps[Self <: AnchorAttributes] (val x: Self) extends AnyVal {
    
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
    def setAnchorAttributes(value: Default): Self = this.set("anchorAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaks(value: Type): Self = this.set("breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmoji(value: Type): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Type): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: Type): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangPrefix(value: DefaultType): Self = this.set("langPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkify(value: Type): Self = this.set("linkify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostrender(value: Default): Self = this.set("postrender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerender(value: Default): Self = this.set("prerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotes(value: DefaultType): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Type): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: DefaultType): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableClass(value: DefaultType): Self = this.set("tableClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskLists(value: Type): Self = this.set("taskLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToc(value: Type): Self = this.set("toc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocAnchorClass(value: DefaultType): Self = this.set("tocAnchorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocAnchorLink(value: Type): Self = this.set("tocAnchorLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocAnchorLinkClass(value: DefaultType): Self = this.set("tocAnchorLinkClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocAnchorLinkSpace(value: Type): Self = this.set("tocAnchorLinkSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocAnchorLinkSymbol(value: DefaultType): Self = this.set("tocAnchorLinkSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocClass(value: DefaultType): Self = this.set("tocClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocFirstLevel(value: DefaultNumber): Self = this.set("tocFirstLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocId(value: TypeAny): Self = this.set("tocId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocLastLevel(value: TypeAny): Self = this.set("tocLastLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypographer(value: Type): Self = this.set("typographer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatches(value: Default): Self = this.set("watches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhtmlOut(value: Type): Self = this.set("xhtmlOut", value.asInstanceOf[js.Any])
  }
}
