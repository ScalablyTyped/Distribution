package typings.xss

import typings.xss.anon.OnIgnoreTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(html: String, options: IFilterXSSOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("xss", "FilterXSS")
  @js.native
  class FilterXSS_ () extends StObject {
    def this(options: IFilterXSSOptions) = this()
    
    def process(html: String): String = js.native
  }
  
  inline def StripTagBody(tags: js.Array[String], next: js.Function0[Unit]): OnIgnoreTag = (^.asInstanceOf[js.Dynamic].applyDynamic("StripTagBody")(tags.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[OnIgnoreTag]
  
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
  
  inline def filterXSS(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterXSS")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def filterXSS(html: String, options: IFilterXSSOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filterXSS")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("xss", "friendlyAttrValue")
  @js.native
  val friendlyAttrValue: EscapeHandler = js.native
  
  inline def getDefaultCSSWhiteList(): ICSSFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCSSWhiteList")().asInstanceOf[ICSSFilter]
  
  inline def getDefaultWhiteList(): IWhiteList = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultWhiteList")().asInstanceOf[IWhiteList]
  
  object global {
    
    inline def filterXSS(html: String): String = js.Dynamic.global.applyDynamic("filterXSS")(html.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def filterXSS(html: String, options: IFilterXSSOptions): String = (js.Dynamic.global.applyDynamic("filterXSS")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    object XSS {
      
      type EscapeHandler = js.Function1[/* str */ String, String]
      
      trait ICSSFilter extends StObject {
        
        def process(value: String): String
      }
      object ICSSFilter {
        
        inline def apply(process: String => String): typings.xss.mod.global.XSS.ICSSFilter = {
          val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
          __obj.asInstanceOf[typings.xss.mod.global.XSS.ICSSFilter]
        }
        
        extension [Self <: typings.xss.mod.global.XSS.ICSSFilter](x: Self) {
          
          inline def setProcess(value: String => String): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
        }
      }
      
      trait IFilterXSSOptions extends StObject {
        
        var allowCommentTag: js.UndefOr[Boolean] = js.undefined
        
        var css: js.UndefOr[js.Object | Boolean] = js.undefined
        
        var escapeHtml: js.UndefOr[typings.xss.mod.global.XSS.EscapeHandler] = js.undefined
        
        var onIgnoreTag: js.UndefOr[typings.xss.mod.global.XSS.OnTagHandler] = js.undefined
        
        var onIgnoreTagAttr: js.UndefOr[typings.xss.mod.global.XSS.OnTagAttrHandler] = js.undefined
        
        var onTag: js.UndefOr[typings.xss.mod.global.XSS.OnTagHandler] = js.undefined
        
        var onTagAttr: js.UndefOr[typings.xss.mod.global.XSS.OnTagAttrHandler] = js.undefined
        
        var safeAttrValue: js.UndefOr[typings.xss.mod.global.XSS.SafeAttrValueHandler] = js.undefined
        
        var stripBlankChar: js.UndefOr[Boolean] = js.undefined
        
        var stripIgnoreTag: js.UndefOr[Boolean] = js.undefined
        
        var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.undefined
        
        var whiteList: js.UndefOr[typings.xss.mod.global.XSS.IWhiteList] = js.undefined
      }
      object IFilterXSSOptions {
        
        inline def apply(): typings.xss.mod.global.XSS.IFilterXSSOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.xss.mod.global.XSS.IFilterXSSOptions]
        }
        
        extension [Self <: typings.xss.mod.global.XSS.IFilterXSSOptions](x: Self) {
          
          inline def setAllowCommentTag(value: Boolean): Self = StObject.set(x, "allowCommentTag", value.asInstanceOf[js.Any])
          
          inline def setAllowCommentTagUndefined: Self = StObject.set(x, "allowCommentTag", js.undefined)
          
          inline def setCss(value: js.Object | Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
          
          inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
          
          inline def setEscapeHtml(value: /* str */ String => String): Self = StObject.set(x, "escapeHtml", js.Any.fromFunction1(value))
          
          inline def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
          
          inline def setOnIgnoreTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = StObject.set(x, "onIgnoreTag", js.Any.fromFunction3(value))
          
          inline def setOnIgnoreTagAttr(
            value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
          ): Self = StObject.set(x, "onIgnoreTagAttr", js.Any.fromFunction4(value))
          
          inline def setOnIgnoreTagAttrUndefined: Self = StObject.set(x, "onIgnoreTagAttr", js.undefined)
          
          inline def setOnIgnoreTagUndefined: Self = StObject.set(x, "onIgnoreTag", js.undefined)
          
          inline def setOnTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = StObject.set(x, "onTag", js.Any.fromFunction3(value))
          
          inline def setOnTagAttr(
            value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
          ): Self = StObject.set(x, "onTagAttr", js.Any.fromFunction4(value))
          
          inline def setOnTagAttrUndefined: Self = StObject.set(x, "onTagAttr", js.undefined)
          
          inline def setOnTagUndefined: Self = StObject.set(x, "onTag", js.undefined)
          
          inline def setSafeAttrValue(
            value: (/* tag */ String, /* name */ String, /* value */ String, /* cssFilter */ typings.xss.mod.global.XSS.ICSSFilter) => String
          ): Self = StObject.set(x, "safeAttrValue", js.Any.fromFunction4(value))
          
          inline def setSafeAttrValueUndefined: Self = StObject.set(x, "safeAttrValue", js.undefined)
          
          inline def setStripBlankChar(value: Boolean): Self = StObject.set(x, "stripBlankChar", value.asInstanceOf[js.Any])
          
          inline def setStripBlankCharUndefined: Self = StObject.set(x, "stripBlankChar", js.undefined)
          
          inline def setStripIgnoreTag(value: Boolean): Self = StObject.set(x, "stripIgnoreTag", value.asInstanceOf[js.Any])
          
          inline def setStripIgnoreTagBody(value: Boolean | js.Array[String]): Self = StObject.set(x, "stripIgnoreTagBody", value.asInstanceOf[js.Any])
          
          inline def setStripIgnoreTagBodyUndefined: Self = StObject.set(x, "stripIgnoreTagBody", js.undefined)
          
          inline def setStripIgnoreTagBodyVarargs(value: String*): Self = StObject.set(x, "stripIgnoreTagBody", js.Array(value :_*))
          
          inline def setStripIgnoreTagUndefined: Self = StObject.set(x, "stripIgnoreTag", js.undefined)
          
          inline def setWhiteList(value: typings.xss.mod.global.XSS.IWhiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          inline def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
        }
      }
      
      trait IWhiteList extends StObject {
        
        var a: js.UndefOr[js.Array[String]] = js.undefined
        
        var abbr: js.UndefOr[js.Array[String]] = js.undefined
        
        var address: js.UndefOr[js.Array[String]] = js.undefined
        
        var area: js.UndefOr[js.Array[String]] = js.undefined
        
        var article: js.UndefOr[js.Array[String]] = js.undefined
        
        var aside: js.UndefOr[js.Array[String]] = js.undefined
        
        var audio: js.UndefOr[js.Array[String]] = js.undefined
        
        var b: js.UndefOr[js.Array[String]] = js.undefined
        
        var bdi: js.UndefOr[js.Array[String]] = js.undefined
        
        var bdo: js.UndefOr[js.Array[String]] = js.undefined
        
        var big: js.UndefOr[js.Array[String]] = js.undefined
        
        var blockquote: js.UndefOr[js.Array[String]] = js.undefined
        
        var br: js.UndefOr[js.Array[String]] = js.undefined
        
        var caption: js.UndefOr[js.Array[String]] = js.undefined
        
        var center: js.UndefOr[js.Array[String]] = js.undefined
        
        var cite: js.UndefOr[js.Array[String]] = js.undefined
        
        var code: js.UndefOr[js.Array[String]] = js.undefined
        
        var col: js.UndefOr[js.Array[String]] = js.undefined
        
        var colgroup: js.UndefOr[js.Array[String]] = js.undefined
        
        var dd: js.UndefOr[js.Array[String]] = js.undefined
        
        var del: js.UndefOr[js.Array[String]] = js.undefined
        
        var details: js.UndefOr[js.Array[String]] = js.undefined
        
        var div: js.UndefOr[js.Array[String]] = js.undefined
        
        var dl: js.UndefOr[js.Array[String]] = js.undefined
        
        var dt: js.UndefOr[js.Array[String]] = js.undefined
        
        var em: js.UndefOr[js.Array[String]] = js.undefined
        
        var font: js.UndefOr[js.Array[String]] = js.undefined
        
        var footer: js.UndefOr[js.Array[String]] = js.undefined
        
        var h1: js.UndefOr[js.Array[String]] = js.undefined
        
        var h2: js.UndefOr[js.Array[String]] = js.undefined
        
        var h3: js.UndefOr[js.Array[String]] = js.undefined
        
        var h4: js.UndefOr[js.Array[String]] = js.undefined
        
        var h5: js.UndefOr[js.Array[String]] = js.undefined
        
        var h6: js.UndefOr[js.Array[String]] = js.undefined
        
        var header: js.UndefOr[js.Array[String]] = js.undefined
        
        var hr: js.UndefOr[js.Array[String]] = js.undefined
        
        var i: js.UndefOr[js.Array[String]] = js.undefined
        
        var img: js.UndefOr[js.Array[String]] = js.undefined
        
        var ins: js.UndefOr[js.Array[String]] = js.undefined
        
        var li: js.UndefOr[js.Array[String]] = js.undefined
        
        var mark: js.UndefOr[js.Array[String]] = js.undefined
        
        var nav: js.UndefOr[js.Array[String]] = js.undefined
        
        var ol: js.UndefOr[js.Array[String]] = js.undefined
        
        var p: js.UndefOr[js.Array[String]] = js.undefined
        
        var pre: js.UndefOr[js.Array[String]] = js.undefined
        
        var s: js.UndefOr[js.Array[String]] = js.undefined
        
        var section: js.UndefOr[js.Array[String]] = js.undefined
        
        var small: js.UndefOr[js.Array[String]] = js.undefined
        
        var span: js.UndefOr[js.Array[String]] = js.undefined
        
        var strong: js.UndefOr[js.Array[String]] = js.undefined
        
        var sub: js.UndefOr[js.Array[String]] = js.undefined
        
        var sup: js.UndefOr[js.Array[String]] = js.undefined
        
        var table: js.UndefOr[js.Array[String]] = js.undefined
        
        var tbody: js.UndefOr[js.Array[String]] = js.undefined
        
        var td: js.UndefOr[js.Array[String]] = js.undefined
        
        var tfoot: js.UndefOr[js.Array[String]] = js.undefined
        
        var th: js.UndefOr[js.Array[String]] = js.undefined
        
        var thead: js.UndefOr[js.Array[String]] = js.undefined
        
        var tr: js.UndefOr[js.Array[String]] = js.undefined
        
        var tt: js.UndefOr[js.Array[String]] = js.undefined
        
        var u: js.UndefOr[js.Array[String]] = js.undefined
        
        var ul: js.UndefOr[js.Array[String]] = js.undefined
        
        var video: js.UndefOr[js.Array[String]] = js.undefined
      }
      object IWhiteList {
        
        inline def apply(): typings.xss.mod.global.XSS.IWhiteList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.xss.mod.global.XSS.IWhiteList]
        }
        
        extension [Self <: typings.xss.mod.global.XSS.IWhiteList](x: Self) {
          
          inline def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
          
          inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
          
          inline def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value :_*))
          
          inline def setAbbr(value: js.Array[String]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
          
          inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
          
          inline def setAbbrVarargs(value: String*): Self = StObject.set(x, "abbr", js.Array(value :_*))
          
          inline def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
          
          inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
          
          inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
          
          inline def setArea(value: js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
          
          inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
          
          inline def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value :_*))
          
          inline def setArticle(value: js.Array[String]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
          
          inline def setArticleUndefined: Self = StObject.set(x, "article", js.undefined)
          
          inline def setArticleVarargs(value: String*): Self = StObject.set(x, "article", js.Array(value :_*))
          
          inline def setAside(value: js.Array[String]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
          
          inline def setAsideUndefined: Self = StObject.set(x, "aside", js.undefined)
          
          inline def setAsideVarargs(value: String*): Self = StObject.set(x, "aside", js.Array(value :_*))
          
          inline def setAudio(value: js.Array[String]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
          
          inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
          
          inline def setAudioVarargs(value: String*): Self = StObject.set(x, "audio", js.Array(value :_*))
          
          inline def setB(value: js.Array[String]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
          
          inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
          
          inline def setBVarargs(value: String*): Self = StObject.set(x, "b", js.Array(value :_*))
          
          inline def setBdi(value: js.Array[String]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
          
          inline def setBdiUndefined: Self = StObject.set(x, "bdi", js.undefined)
          
          inline def setBdiVarargs(value: String*): Self = StObject.set(x, "bdi", js.Array(value :_*))
          
          inline def setBdo(value: js.Array[String]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
          
          inline def setBdoUndefined: Self = StObject.set(x, "bdo", js.undefined)
          
          inline def setBdoVarargs(value: String*): Self = StObject.set(x, "bdo", js.Array(value :_*))
          
          inline def setBig(value: js.Array[String]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
          
          inline def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
          
          inline def setBigVarargs(value: String*): Self = StObject.set(x, "big", js.Array(value :_*))
          
          inline def setBlockquote(value: js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
          
          inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
          
          inline def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
          
          inline def setBr(value: js.Array[String]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
          
          inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
          
          inline def setBrVarargs(value: String*): Self = StObject.set(x, "br", js.Array(value :_*))
          
          inline def setCaption(value: js.Array[String]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
          
          inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
          
          inline def setCaptionVarargs(value: String*): Self = StObject.set(x, "caption", js.Array(value :_*))
          
          inline def setCenter(value: js.Array[String]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
          
          inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
          
          inline def setCenterVarargs(value: String*): Self = StObject.set(x, "center", js.Array(value :_*))
          
          inline def setCite(value: js.Array[String]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
          
          inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
          
          inline def setCiteVarargs(value: String*): Self = StObject.set(x, "cite", js.Array(value :_*))
          
          inline def setCode(value: js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          inline def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value :_*))
          
          inline def setCol(value: js.Array[String]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
          
          inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
          
          inline def setColVarargs(value: String*): Self = StObject.set(x, "col", js.Array(value :_*))
          
          inline def setColgroup(value: js.Array[String]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
          
          inline def setColgroupUndefined: Self = StObject.set(x, "colgroup", js.undefined)
          
          inline def setColgroupVarargs(value: String*): Self = StObject.set(x, "colgroup", js.Array(value :_*))
          
          inline def setDd(value: js.Array[String]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
          
          inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
          
          inline def setDdVarargs(value: String*): Self = StObject.set(x, "dd", js.Array(value :_*))
          
          inline def setDel(value: js.Array[String]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
          
          inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
          
          inline def setDelVarargs(value: String*): Self = StObject.set(x, "del", js.Array(value :_*))
          
          inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
          
          inline def setDiv(value: js.Array[String]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
          
          inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
          
          inline def setDivVarargs(value: String*): Self = StObject.set(x, "div", js.Array(value :_*))
          
          inline def setDl(value: js.Array[String]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
          
          inline def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
          
          inline def setDlVarargs(value: String*): Self = StObject.set(x, "dl", js.Array(value :_*))
          
          inline def setDt(value: js.Array[String]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
          
          inline def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
          
          inline def setDtVarargs(value: String*): Self = StObject.set(x, "dt", js.Array(value :_*))
          
          inline def setEm(value: js.Array[String]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
          
          inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
          
          inline def setEmVarargs(value: String*): Self = StObject.set(x, "em", js.Array(value :_*))
          
          inline def setFont(value: js.Array[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
          
          inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
          
          inline def setFontVarargs(value: String*): Self = StObject.set(x, "font", js.Array(value :_*))
          
          inline def setFooter(value: js.Array[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
          
          inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
          
          inline def setFooterVarargs(value: String*): Self = StObject.set(x, "footer", js.Array(value :_*))
          
          inline def setH1(value: js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
          
          inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
          
          inline def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
          
          inline def setH2(value: js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
          
          inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
          
          inline def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
          
          inline def setH3(value: js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
          
          inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
          
          inline def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
          
          inline def setH4(value: js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
          
          inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
          
          inline def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
          
          inline def setH5(value: js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
          
          inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
          
          inline def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
          
          inline def setH6(value: js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
          
          inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
          
          inline def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
          
          inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
          
          inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
          
          inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
          
          inline def setHr(value: js.Array[String]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
          
          inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
          
          inline def setHrVarargs(value: String*): Self = StObject.set(x, "hr", js.Array(value :_*))
          
          inline def setI(value: js.Array[String]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
          
          inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
          
          inline def setIVarargs(value: String*): Self = StObject.set(x, "i", js.Array(value :_*))
          
          inline def setImg(value: js.Array[String]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
          
          inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
          
          inline def setImgVarargs(value: String*): Self = StObject.set(x, "img", js.Array(value :_*))
          
          inline def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
          
          inline def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
          
          inline def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value :_*))
          
          inline def setLi(value: js.Array[String]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
          
          inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
          
          inline def setLiVarargs(value: String*): Self = StObject.set(x, "li", js.Array(value :_*))
          
          inline def setMark(value: js.Array[String]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
          
          inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
          
          inline def setMarkVarargs(value: String*): Self = StObject.set(x, "mark", js.Array(value :_*))
          
          inline def setNav(value: js.Array[String]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
          
          inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
          
          inline def setNavVarargs(value: String*): Self = StObject.set(x, "nav", js.Array(value :_*))
          
          inline def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
          
          inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
          
          inline def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
          
          inline def setP(value: js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
          
          inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
          
          inline def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
          
          inline def setPre(value: js.Array[String]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
          
          inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
          
          inline def setPreVarargs(value: String*): Self = StObject.set(x, "pre", js.Array(value :_*))
          
          inline def setS(value: js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
          
          inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
          
          inline def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
          
          inline def setSection(value: js.Array[String]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
          
          inline def setSectionVarargs(value: String*): Self = StObject.set(x, "section", js.Array(value :_*))
          
          inline def setSmall(value: js.Array[String]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
          
          inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
          
          inline def setSmallVarargs(value: String*): Self = StObject.set(x, "small", js.Array(value :_*))
          
          inline def setSpan(value: js.Array[String]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
          
          inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
          
          inline def setSpanVarargs(value: String*): Self = StObject.set(x, "span", js.Array(value :_*))
          
          inline def setStrong(value: js.Array[String]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
          
          inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
          
          inline def setStrongVarargs(value: String*): Self = StObject.set(x, "strong", js.Array(value :_*))
          
          inline def setSub(value: js.Array[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
          
          inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
          
          inline def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value :_*))
          
          inline def setSup(value: js.Array[String]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
          
          inline def setSupUndefined: Self = StObject.set(x, "sup", js.undefined)
          
          inline def setSupVarargs(value: String*): Self = StObject.set(x, "sup", js.Array(value :_*))
          
          inline def setTable(value: js.Array[String]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
          
          inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
          
          inline def setTableVarargs(value: String*): Self = StObject.set(x, "table", js.Array(value :_*))
          
          inline def setTbody(value: js.Array[String]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
          
          inline def setTbodyUndefined: Self = StObject.set(x, "tbody", js.undefined)
          
          inline def setTbodyVarargs(value: String*): Self = StObject.set(x, "tbody", js.Array(value :_*))
          
          inline def setTd(value: js.Array[String]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
          
          inline def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
          
          inline def setTdVarargs(value: String*): Self = StObject.set(x, "td", js.Array(value :_*))
          
          inline def setTfoot(value: js.Array[String]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
          
          inline def setTfootUndefined: Self = StObject.set(x, "tfoot", js.undefined)
          
          inline def setTfootVarargs(value: String*): Self = StObject.set(x, "tfoot", js.Array(value :_*))
          
          inline def setTh(value: js.Array[String]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
          
          inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
          
          inline def setThVarargs(value: String*): Self = StObject.set(x, "th", js.Array(value :_*))
          
          inline def setThead(value: js.Array[String]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
          
          inline def setTheadUndefined: Self = StObject.set(x, "thead", js.undefined)
          
          inline def setTheadVarargs(value: String*): Self = StObject.set(x, "thead", js.Array(value :_*))
          
          inline def setTr(value: js.Array[String]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
          
          inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
          
          inline def setTrVarargs(value: String*): Self = StObject.set(x, "tr", js.Array(value :_*))
          
          inline def setTt(value: js.Array[String]): Self = StObject.set(x, "tt", value.asInstanceOf[js.Any])
          
          inline def setTtUndefined: Self = StObject.set(x, "tt", js.undefined)
          
          inline def setTtVarargs(value: String*): Self = StObject.set(x, "tt", js.Array(value :_*))
          
          inline def setU(value: js.Array[String]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
          
          inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
          
          inline def setUVarargs(value: String*): Self = StObject.set(x, "u", js.Array(value :_*))
          
          inline def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
          
          inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
          
          inline def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
          
          inline def setVideo(value: js.Array[String]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
          
          inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
          
          inline def setVideoVarargs(value: String*): Self = StObject.set(x, "video", js.Array(value :_*))
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
  
  inline def onIgnoreTagStripAll(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("onIgnoreTagStripAll")().asInstanceOf[String]
  
  @JSImport("xss", "onTag")
  @js.native
  val onTag: OnTagHandler = js.native
  
  @JSImport("xss", "onTagAttr")
  @js.native
  val onTagAttr: OnTagAttrHandler = js.native
  
  inline def parseAttr(html: String, onAttr: js.Function2[/* name */ String, /* value */ String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAttr")(html.asInstanceOf[js.Any], onAttr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseTag(
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
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTag")(html.asInstanceOf[js.Any], onTag.asInstanceOf[js.Any], escapeHtml.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
