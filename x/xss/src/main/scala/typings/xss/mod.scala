package typings.xss

import typings.xss.anon.OnIgnoreTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xss", JSImport.Default)
  @js.native
  def default(html: String): String = js.native
  @JSImport("xss", JSImport.Default)
  @js.native
  def default(html: String, options: IFilterXSSOptions): String = js.native
  
  @JSImport("xss", "FilterXSS")
  @js.native
  class FilterXSS_ () extends StObject {
    def this(options: IFilterXSSOptions) = this()
    
    def process(html: String): String = js.native
  }
  
  @JSImport("xss", "StripTagBody")
  @js.native
  def StripTagBody(tags: js.Array[String], next: js.Function0[Unit]): OnIgnoreTag = js.native
  
  @JSImport("xss", "clearNonPrintableCharacter")
  @js.native
  val clearNonPrintableCharacter: EscapeHandler = js.native
  
  @JSImport("xss", "cssFilter")
  @js.native
  val cssFilter: ICSSFilter = js.native
  
  @JSImport("xss", "escapeAttrValue")
  @js.native
  val escapeAttrValue: EscapeHandler = js.native
  
  @JSImport("xss", "escapeDangerHtml5Entities")
  @js.native
  val escapeDangerHtml5Entities: EscapeHandler = js.native
  
  @JSImport("xss", "escapeHtml")
  @js.native
  val escapeHtml: EscapeHandler = js.native
  
  @JSImport("xss", "escapeHtmlEntities")
  @js.native
  val escapeHtmlEntities: EscapeHandler = js.native
  
  @JSImport("xss", "escapeQuote")
  @js.native
  val escapeQuote: EscapeHandler = js.native
  
  @JSImport("xss", "filterXSS")
  @js.native
  def filterXSS(html: String): String = js.native
  @JSImport("xss", "filterXSS")
  @js.native
  def filterXSS(html: String, options: IFilterXSSOptions): String = js.native
  
  @JSImport("xss", "friendlyAttrValue")
  @js.native
  val friendlyAttrValue: EscapeHandler = js.native
  
  @JSImport("xss", "getDefaultCSSWhiteList")
  @js.native
  def getDefaultCSSWhiteList(): ICSSFilter = js.native
  
  @JSImport("xss", "getDefaultWhiteList")
  @js.native
  def getDefaultWhiteList(): IWhiteList = js.native
  
  object global {
    
    @JSGlobal("filterXSS")
    @js.native
    def filterXSS(html: String): String = js.native
    @JSGlobal("filterXSS")
    @js.native
    def filterXSS(html: String, options: IFilterXSSOptions): String = js.native
    
    object XSS {
      
      type EscapeHandler = js.Function1[/* str */ String, String]
      
      @js.native
      trait ICSSFilter extends StObject {
        
        def process(value: String): String = js.native
      }
      object ICSSFilter {
        
        @scala.inline
        def apply(process: String => String): typings.xss.mod.global.XSS.ICSSFilter = {
          val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
          __obj.asInstanceOf[typings.xss.mod.global.XSS.ICSSFilter]
        }
        
        @scala.inline
        implicit class ICSSFilterMutableBuilder[Self <: typings.xss.mod.global.XSS.ICSSFilter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setProcess(value: String => String): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait IFilterXSSOptions extends StObject {
        
        var allowCommentTag: js.UndefOr[Boolean] = js.native
        
        var css: js.UndefOr[js.Object | Boolean] = js.native
        
        var escapeHtml: js.UndefOr[typings.xss.mod.global.XSS.EscapeHandler] = js.native
        
        var onIgnoreTag: js.UndefOr[typings.xss.mod.global.XSS.OnTagHandler] = js.native
        
        var onIgnoreTagAttr: js.UndefOr[typings.xss.mod.global.XSS.OnTagAttrHandler] = js.native
        
        var onTag: js.UndefOr[typings.xss.mod.global.XSS.OnTagHandler] = js.native
        
        var onTagAttr: js.UndefOr[typings.xss.mod.global.XSS.OnTagAttrHandler] = js.native
        
        var safeAttrValue: js.UndefOr[typings.xss.mod.global.XSS.SafeAttrValueHandler] = js.native
        
        var stripBlankChar: js.UndefOr[Boolean] = js.native
        
        var stripIgnoreTag: js.UndefOr[Boolean] = js.native
        
        var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.native
        
        var whiteList: js.UndefOr[typings.xss.mod.global.XSS.IWhiteList] = js.native
      }
      object IFilterXSSOptions {
        
        @scala.inline
        def apply(): typings.xss.mod.global.XSS.IFilterXSSOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.xss.mod.global.XSS.IFilterXSSOptions]
        }
        
        @scala.inline
        implicit class IFilterXSSOptionsMutableBuilder[Self <: typings.xss.mod.global.XSS.IFilterXSSOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAllowCommentTag(value: Boolean): Self = StObject.set(x, "allowCommentTag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowCommentTagUndefined: Self = StObject.set(x, "allowCommentTag", js.undefined)
          
          @scala.inline
          def setCss(value: js.Object | Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
          
          @scala.inline
          def setEscapeHtml(value: /* str */ String => String): Self = StObject.set(x, "escapeHtml", js.Any.fromFunction1(value))
          
          @scala.inline
          def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
          
          @scala.inline
          def setOnIgnoreTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = StObject.set(x, "onIgnoreTag", js.Any.fromFunction3(value))
          
          @scala.inline
          def setOnIgnoreTagAttr(
            value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
          ): Self = StObject.set(x, "onIgnoreTagAttr", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnIgnoreTagAttrUndefined: Self = StObject.set(x, "onIgnoreTagAttr", js.undefined)
          
          @scala.inline
          def setOnIgnoreTagUndefined: Self = StObject.set(x, "onIgnoreTag", js.undefined)
          
          @scala.inline
          def setOnTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = StObject.set(x, "onTag", js.Any.fromFunction3(value))
          
          @scala.inline
          def setOnTagAttr(
            value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
          ): Self = StObject.set(x, "onTagAttr", js.Any.fromFunction4(value))
          
          @scala.inline
          def setOnTagAttrUndefined: Self = StObject.set(x, "onTagAttr", js.undefined)
          
          @scala.inline
          def setOnTagUndefined: Self = StObject.set(x, "onTag", js.undefined)
          
          @scala.inline
          def setSafeAttrValue(
            value: (/* tag */ String, /* name */ String, /* value */ String, /* cssFilter */ typings.xss.mod.global.XSS.ICSSFilter) => String
          ): Self = StObject.set(x, "safeAttrValue", js.Any.fromFunction4(value))
          
          @scala.inline
          def setSafeAttrValueUndefined: Self = StObject.set(x, "safeAttrValue", js.undefined)
          
          @scala.inline
          def setStripBlankChar(value: Boolean): Self = StObject.set(x, "stripBlankChar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStripBlankCharUndefined: Self = StObject.set(x, "stripBlankChar", js.undefined)
          
          @scala.inline
          def setStripIgnoreTag(value: Boolean): Self = StObject.set(x, "stripIgnoreTag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStripIgnoreTagBody(value: Boolean | js.Array[String]): Self = StObject.set(x, "stripIgnoreTagBody", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStripIgnoreTagBodyUndefined: Self = StObject.set(x, "stripIgnoreTagBody", js.undefined)
          
          @scala.inline
          def setStripIgnoreTagBodyVarargs(value: String*): Self = StObject.set(x, "stripIgnoreTagBody", js.Array(value :_*))
          
          @scala.inline
          def setStripIgnoreTagUndefined: Self = StObject.set(x, "stripIgnoreTag", js.undefined)
          
          @scala.inline
          def setWhiteList(value: typings.xss.mod.global.XSS.IWhiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
        }
      }
      
      @js.native
      trait IWhiteList extends StObject {
        
        var a: js.UndefOr[js.Array[String]] = js.native
        
        var abbr: js.UndefOr[js.Array[String]] = js.native
        
        var address: js.UndefOr[js.Array[String]] = js.native
        
        var area: js.UndefOr[js.Array[String]] = js.native
        
        var article: js.UndefOr[js.Array[String]] = js.native
        
        var aside: js.UndefOr[js.Array[String]] = js.native
        
        var audio: js.UndefOr[js.Array[String]] = js.native
        
        var b: js.UndefOr[js.Array[String]] = js.native
        
        var bdi: js.UndefOr[js.Array[String]] = js.native
        
        var bdo: js.UndefOr[js.Array[String]] = js.native
        
        var big: js.UndefOr[js.Array[String]] = js.native
        
        var blockquote: js.UndefOr[js.Array[String]] = js.native
        
        var br: js.UndefOr[js.Array[String]] = js.native
        
        var caption: js.UndefOr[js.Array[String]] = js.native
        
        var center: js.UndefOr[js.Array[String]] = js.native
        
        var cite: js.UndefOr[js.Array[String]] = js.native
        
        var code: js.UndefOr[js.Array[String]] = js.native
        
        var col: js.UndefOr[js.Array[String]] = js.native
        
        var colgroup: js.UndefOr[js.Array[String]] = js.native
        
        var dd: js.UndefOr[js.Array[String]] = js.native
        
        var del: js.UndefOr[js.Array[String]] = js.native
        
        var details: js.UndefOr[js.Array[String]] = js.native
        
        var div: js.UndefOr[js.Array[String]] = js.native
        
        var dl: js.UndefOr[js.Array[String]] = js.native
        
        var dt: js.UndefOr[js.Array[String]] = js.native
        
        var em: js.UndefOr[js.Array[String]] = js.native
        
        var font: js.UndefOr[js.Array[String]] = js.native
        
        var footer: js.UndefOr[js.Array[String]] = js.native
        
        var h1: js.UndefOr[js.Array[String]] = js.native
        
        var h2: js.UndefOr[js.Array[String]] = js.native
        
        var h3: js.UndefOr[js.Array[String]] = js.native
        
        var h4: js.UndefOr[js.Array[String]] = js.native
        
        var h5: js.UndefOr[js.Array[String]] = js.native
        
        var h6: js.UndefOr[js.Array[String]] = js.native
        
        var header: js.UndefOr[js.Array[String]] = js.native
        
        var hr: js.UndefOr[js.Array[String]] = js.native
        
        var i: js.UndefOr[js.Array[String]] = js.native
        
        var img: js.UndefOr[js.Array[String]] = js.native
        
        var ins: js.UndefOr[js.Array[String]] = js.native
        
        var li: js.UndefOr[js.Array[String]] = js.native
        
        var mark: js.UndefOr[js.Array[String]] = js.native
        
        var nav: js.UndefOr[js.Array[String]] = js.native
        
        var ol: js.UndefOr[js.Array[String]] = js.native
        
        var p: js.UndefOr[js.Array[String]] = js.native
        
        var pre: js.UndefOr[js.Array[String]] = js.native
        
        var s: js.UndefOr[js.Array[String]] = js.native
        
        var section: js.UndefOr[js.Array[String]] = js.native
        
        var small: js.UndefOr[js.Array[String]] = js.native
        
        var span: js.UndefOr[js.Array[String]] = js.native
        
        var strong: js.UndefOr[js.Array[String]] = js.native
        
        var sub: js.UndefOr[js.Array[String]] = js.native
        
        var sup: js.UndefOr[js.Array[String]] = js.native
        
        var table: js.UndefOr[js.Array[String]] = js.native
        
        var tbody: js.UndefOr[js.Array[String]] = js.native
        
        var td: js.UndefOr[js.Array[String]] = js.native
        
        var tfoot: js.UndefOr[js.Array[String]] = js.native
        
        var th: js.UndefOr[js.Array[String]] = js.native
        
        var thead: js.UndefOr[js.Array[String]] = js.native
        
        var tr: js.UndefOr[js.Array[String]] = js.native
        
        var tt: js.UndefOr[js.Array[String]] = js.native
        
        var u: js.UndefOr[js.Array[String]] = js.native
        
        var ul: js.UndefOr[js.Array[String]] = js.native
        
        var video: js.UndefOr[js.Array[String]] = js.native
      }
      object IWhiteList {
        
        @scala.inline
        def apply(): typings.xss.mod.global.XSS.IWhiteList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.xss.mod.global.XSS.IWhiteList]
        }
        
        @scala.inline
        implicit class IWhiteListMutableBuilder[Self <: typings.xss.mod.global.XSS.IWhiteList] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAUndefined: Self = StObject.set(x, "a", js.undefined)
          
          @scala.inline
          def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value :_*))
          
          @scala.inline
          def setAbbr(value: js.Array[String]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
          
          @scala.inline
          def setAbbrVarargs(value: String*): Self = StObject.set(x, "abbr", js.Array(value :_*))
          
          @scala.inline
          def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
          
          @scala.inline
          def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
          
          @scala.inline
          def setArea(value: js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
          
          @scala.inline
          def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value :_*))
          
          @scala.inline
          def setArticle(value: js.Array[String]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArticleUndefined: Self = StObject.set(x, "article", js.undefined)
          
          @scala.inline
          def setArticleVarargs(value: String*): Self = StObject.set(x, "article", js.Array(value :_*))
          
          @scala.inline
          def setAside(value: js.Array[String]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAsideUndefined: Self = StObject.set(x, "aside", js.undefined)
          
          @scala.inline
          def setAsideVarargs(value: String*): Self = StObject.set(x, "aside", js.Array(value :_*))
          
          @scala.inline
          def setAudio(value: js.Array[String]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
          
          @scala.inline
          def setAudioVarargs(value: String*): Self = StObject.set(x, "audio", js.Array(value :_*))
          
          @scala.inline
          def setB(value: js.Array[String]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBUndefined: Self = StObject.set(x, "b", js.undefined)
          
          @scala.inline
          def setBVarargs(value: String*): Self = StObject.set(x, "b", js.Array(value :_*))
          
          @scala.inline
          def setBdi(value: js.Array[String]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBdiUndefined: Self = StObject.set(x, "bdi", js.undefined)
          
          @scala.inline
          def setBdiVarargs(value: String*): Self = StObject.set(x, "bdi", js.Array(value :_*))
          
          @scala.inline
          def setBdo(value: js.Array[String]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBdoUndefined: Self = StObject.set(x, "bdo", js.undefined)
          
          @scala.inline
          def setBdoVarargs(value: String*): Self = StObject.set(x, "bdo", js.Array(value :_*))
          
          @scala.inline
          def setBig(value: js.Array[String]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
          
          @scala.inline
          def setBigVarargs(value: String*): Self = StObject.set(x, "big", js.Array(value :_*))
          
          @scala.inline
          def setBlockquote(value: js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
          
          @scala.inline
          def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
          
          @scala.inline
          def setBr(value: js.Array[String]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
          
          @scala.inline
          def setBrVarargs(value: String*): Self = StObject.set(x, "br", js.Array(value :_*))
          
          @scala.inline
          def setCaption(value: js.Array[String]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
          
          @scala.inline
          def setCaptionVarargs(value: String*): Self = StObject.set(x, "caption", js.Array(value :_*))
          
          @scala.inline
          def setCenter(value: js.Array[String]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
          
          @scala.inline
          def setCenterVarargs(value: String*): Self = StObject.set(x, "center", js.Array(value :_*))
          
          @scala.inline
          def setCite(value: js.Array[String]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
          
          @scala.inline
          def setCiteVarargs(value: String*): Self = StObject.set(x, "cite", js.Array(value :_*))
          
          @scala.inline
          def setCode(value: js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          @scala.inline
          def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value :_*))
          
          @scala.inline
          def setCol(value: js.Array[String]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColUndefined: Self = StObject.set(x, "col", js.undefined)
          
          @scala.inline
          def setColVarargs(value: String*): Self = StObject.set(x, "col", js.Array(value :_*))
          
          @scala.inline
          def setColgroup(value: js.Array[String]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColgroupUndefined: Self = StObject.set(x, "colgroup", js.undefined)
          
          @scala.inline
          def setColgroupVarargs(value: String*): Self = StObject.set(x, "colgroup", js.Array(value :_*))
          
          @scala.inline
          def setDd(value: js.Array[String]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
          
          @scala.inline
          def setDdVarargs(value: String*): Self = StObject.set(x, "dd", js.Array(value :_*))
          
          @scala.inline
          def setDel(value: js.Array[String]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
          
          @scala.inline
          def setDelVarargs(value: String*): Self = StObject.set(x, "del", js.Array(value :_*))
          
          @scala.inline
          def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          @scala.inline
          def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
          
          @scala.inline
          def setDiv(value: js.Array[String]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
          
          @scala.inline
          def setDivVarargs(value: String*): Self = StObject.set(x, "div", js.Array(value :_*))
          
          @scala.inline
          def setDl(value: js.Array[String]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
          
          @scala.inline
          def setDlVarargs(value: String*): Self = StObject.set(x, "dl", js.Array(value :_*))
          
          @scala.inline
          def setDt(value: js.Array[String]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
          
          @scala.inline
          def setDtVarargs(value: String*): Self = StObject.set(x, "dt", js.Array(value :_*))
          
          @scala.inline
          def setEm(value: js.Array[String]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
          
          @scala.inline
          def setEmVarargs(value: String*): Self = StObject.set(x, "em", js.Array(value :_*))
          
          @scala.inline
          def setFont(value: js.Array[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
          
          @scala.inline
          def setFontVarargs(value: String*): Self = StObject.set(x, "font", js.Array(value :_*))
          
          @scala.inline
          def setFooter(value: js.Array[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
          
          @scala.inline
          def setFooterVarargs(value: String*): Self = StObject.set(x, "footer", js.Array(value :_*))
          
          @scala.inline
          def setH1(value: js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
          
          @scala.inline
          def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
          
          @scala.inline
          def setH2(value: js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
          
          @scala.inline
          def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
          
          @scala.inline
          def setH3(value: js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
          
          @scala.inline
          def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
          
          @scala.inline
          def setH4(value: js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
          
          @scala.inline
          def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
          
          @scala.inline
          def setH5(value: js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
          
          @scala.inline
          def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
          
          @scala.inline
          def setH6(value: js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
          
          @scala.inline
          def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
          
          @scala.inline
          def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
          
          @scala.inline
          def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
          
          @scala.inline
          def setHr(value: js.Array[String]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
          
          @scala.inline
          def setHrVarargs(value: String*): Self = StObject.set(x, "hr", js.Array(value :_*))
          
          @scala.inline
          def setI(value: js.Array[String]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIUndefined: Self = StObject.set(x, "i", js.undefined)
          
          @scala.inline
          def setIVarargs(value: String*): Self = StObject.set(x, "i", js.Array(value :_*))
          
          @scala.inline
          def setImg(value: js.Array[String]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
          
          @scala.inline
          def setImgVarargs(value: String*): Self = StObject.set(x, "img", js.Array(value :_*))
          
          @scala.inline
          def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
          
          @scala.inline
          def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value :_*))
          
          @scala.inline
          def setLi(value: js.Array[String]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
          
          @scala.inline
          def setLiVarargs(value: String*): Self = StObject.set(x, "li", js.Array(value :_*))
          
          @scala.inline
          def setMark(value: js.Array[String]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
          
          @scala.inline
          def setMarkVarargs(value: String*): Self = StObject.set(x, "mark", js.Array(value :_*))
          
          @scala.inline
          def setNav(value: js.Array[String]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
          
          @scala.inline
          def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value :_*))
          
          @scala.inline
          def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
          
          @scala.inline
          def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
          
          @scala.inline
          def setP(value: js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPUndefined: Self = StObject.set(x, "p", js.undefined)
          
          @scala.inline
          def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
          
          @scala.inline
          def setPre(value: js.Array[String]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
          
          @scala.inline
          def setPreVarargs(value: String*): Self = StObject.set(x, "pre", js.Array(value :_*))
          
          @scala.inline
          def setS(value: js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSUndefined: Self = StObject.set(x, "s", js.undefined)
          
          @scala.inline
          def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
          
          @scala.inline
          def setSection(value: js.Array[String]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
          
          @scala.inline
          def setSectionVarargs(value: String*): Self = StObject.set(x, "section", js.Array(value :_*))
          
          @scala.inline
          def setSmall(value: js.Array[String]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
          
          @scala.inline
          def setSmallVarargs(value: String*): Self = StObject.set(x, "small", js.Array(value :_*))
          
          @scala.inline
          def setSpan(value: js.Array[String]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
          
          @scala.inline
          def setSpanVarargs(value: String*): Self = StObject.set(x, "span", js.Array(value :_*))
          
          @scala.inline
          def setStrong(value: js.Array[String]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
          
          @scala.inline
          def setStrongVarargs(value: String*): Self = StObject.set(x, "strong", js.Array(value :_*))
          
          @scala.inline
          def setSub(value: js.Array[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
          
          @scala.inline
          def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value :_*))
          
          @scala.inline
          def setSup(value: js.Array[String]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSupUndefined: Self = StObject.set(x, "sup", js.undefined)
          
          @scala.inline
          def setSupVarargs(value: String*): Self = StObject.set(x, "sup", js.Array(value :_*))
          
          @scala.inline
          def setTable(value: js.Array[String]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
          
          @scala.inline
          def setTableVarargs(value: String*): Self = StObject.set(x, "table", js.Array(value :_*))
          
          @scala.inline
          def setTbody(value: js.Array[String]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTbodyUndefined: Self = StObject.set(x, "tbody", js.undefined)
          
          @scala.inline
          def setTbodyVarargs(value: String*): Self = StObject.set(x, "tbody", js.Array(value :_*))
          
          @scala.inline
          def setTd(value: js.Array[String]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
          
          @scala.inline
          def setTdVarargs(value: String*): Self = StObject.set(x, "td", js.Array(value :_*))
          
          @scala.inline
          def setTfoot(value: js.Array[String]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTfootUndefined: Self = StObject.set(x, "tfoot", js.undefined)
          
          @scala.inline
          def setTfootVarargs(value: String*): Self = StObject.set(x, "tfoot", js.Array(value :_*))
          
          @scala.inline
          def setTh(value: js.Array[String]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setThUndefined: Self = StObject.set(x, "th", js.undefined)
          
          @scala.inline
          def setThVarargs(value: String*): Self = StObject.set(x, "th", js.Array(value :_*))
          
          @scala.inline
          def setThead(value: js.Array[String]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTheadUndefined: Self = StObject.set(x, "thead", js.undefined)
          
          @scala.inline
          def setTheadVarargs(value: String*): Self = StObject.set(x, "thead", js.Array(value :_*))
          
          @scala.inline
          def setTr(value: js.Array[String]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
          
          @scala.inline
          def setTrVarargs(value: String*): Self = StObject.set(x, "tr", js.Array(value :_*))
          
          @scala.inline
          def setTt(value: js.Array[String]): Self = StObject.set(x, "tt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTtUndefined: Self = StObject.set(x, "tt", js.undefined)
          
          @scala.inline
          def setTtVarargs(value: String*): Self = StObject.set(x, "tt", js.Array(value :_*))
          
          @scala.inline
          def setU(value: js.Array[String]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUUndefined: Self = StObject.set(x, "u", js.undefined)
          
          @scala.inline
          def setUVarargs(value: String*): Self = StObject.set(x, "u", js.Array(value :_*))
          
          @scala.inline
          def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
          
          @scala.inline
          def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
          
          @scala.inline
          def setVideo(value: js.Array[String]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
          
          @scala.inline
          def setVideoVarargs(value: String*): Self = StObject.set(x, "video", js.Array(value :_*))
        }
      }
      
      type OnTagAttrHandler = js.Function4[
            /* tag */ String, 
            /* name */ String, 
            /* value */ String, 
            /* isWhiteAttr */ Boolean, 
            String | Unit
          ]
      
      type OnTagHandler = js.Function3[/* tag */ String, /* html */ String, /* options */ js.Object, String | Unit]
      
      type SafeAttrValueHandler = js.Function4[
            /* tag */ String, 
            /* name */ String, 
            /* value */ String, 
            /* cssFilter */ typings.xss.mod.global.XSS.ICSSFilter, 
            String
          ]
    }
  }
  
  @JSImport("xss", "onIgnoreTag")
  @js.native
  val onIgnoreTag: OnTagHandler = js.native
  
  @JSImport("xss", "onIgnoreTagAttr")
  @js.native
  val onIgnoreTagAttr: OnTagAttrHandler = js.native
  
  @JSImport("xss", "onIgnoreTagStripAll")
  @js.native
  def onIgnoreTagStripAll(): String = js.native
  
  @JSImport("xss", "onTag")
  @js.native
  val onTag: OnTagHandler = js.native
  
  @JSImport("xss", "onTagAttr")
  @js.native
  val onTagAttr: OnTagAttrHandler = js.native
  
  @JSImport("xss", "parseAttr")
  @js.native
  def parseAttr(html: String, onAttr: js.Function2[/* name */ String, /* value */ String, String]): String = js.native
  
  @JSImport("xss", "parseTag")
  @js.native
  def parseTag(
    html: String,
    onTag: js.Function5[
      /* sourcePosition */ Double, 
      /* position */ Double, 
      /* tag */ String, 
      /* html */ String, 
      /* isClosing */ Boolean, 
      String
    ],
    escapeHtml: EscapeHandler
  ): String = js.native
  
  @JSImport("xss", "safeAttrValue")
  @js.native
  val safeAttrValue: SafeAttrValueHandler = js.native
  
  @JSImport("xss", "stripBlankChar")
  @js.native
  val stripBlankChar: EscapeHandler = js.native
  
  @JSImport("xss", "stripCommentTag")
  @js.native
  val stripCommentTag: EscapeHandler = js.native
  
  @JSImport("xss", "unescapeQuote")
  @js.native
  val unescapeQuote: EscapeHandler = js.native
  
  @JSImport("xss", "whiteList")
  @js.native
  val whiteList: IWhiteList = js.native
  
  type EscapeHandler = typings.xss.mod.global.XSS.EscapeHandler
  
  type ICSSFilter = typings.xss.mod.global.XSS.ICSSFilter
  
  type IFilterXSSOptions = typings.xss.mod.global.XSS.IFilterXSSOptions
  
  type IWhiteList = typings.xss.mod.global.XSS.IWhiteList
  
  type OnTagAttrHandler = typings.xss.mod.global.XSS.OnTagAttrHandler
  
  type OnTagHandler = typings.xss.mod.global.XSS.OnTagHandler
  
  type SafeAttrValueHandler = typings.xss.mod.global.XSS.SafeAttrValueHandler
}
