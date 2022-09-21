package typings.themeUiMdx

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.themeUiMdx.anon.Css
import typings.themeUiMdx.themeUiMdxStrings.a
import typings.themeUiMdx.themeUiMdxStrings.b
import typings.themeUiMdx.themeUiMdxStrings.blockquote
import typings.themeUiMdx.themeUiMdxStrings.code
import typings.themeUiMdx.themeUiMdxStrings.del
import typings.themeUiMdx.themeUiMdxStrings.div
import typings.themeUiMdx.themeUiMdxStrings.em
import typings.themeUiMdx.themeUiMdxStrings.h1
import typings.themeUiMdx.themeUiMdxStrings.h2
import typings.themeUiMdx.themeUiMdxStrings.h3
import typings.themeUiMdx.themeUiMdxStrings.h4
import typings.themeUiMdx.themeUiMdxStrings.h5
import typings.themeUiMdx.themeUiMdxStrings.h6
import typings.themeUiMdx.themeUiMdxStrings.hr
import typings.themeUiMdx.themeUiMdxStrings.i
import typings.themeUiMdx.themeUiMdxStrings.img
import typings.themeUiMdx.themeUiMdxStrings.inlineCode
import typings.themeUiMdx.themeUiMdxStrings.li
import typings.themeUiMdx.themeUiMdxStrings.ol
import typings.themeUiMdx.themeUiMdxStrings.p
import typings.themeUiMdx.themeUiMdxStrings.pre
import typings.themeUiMdx.themeUiMdxStrings.root
import typings.themeUiMdx.themeUiMdxStrings.strong
import typings.themeUiMdx.themeUiMdxStrings.table
import typings.themeUiMdx.themeUiMdxStrings.td
import typings.themeUiMdx.themeUiMdxStrings.th
import typings.themeUiMdx.themeUiMdxStrings.thematicBreak
import typings.themeUiMdx.themeUiMdxStrings.tr
import typings.themeUiMdx.themeUiMdxStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", "MDXProvider")
  @js.native
  val MDXProvider: FC[MdxProviderProps] = js.native
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", "Themed")
  @js.native
  val Themed_ : ThemedDiv & ThemedComponentsDict = js.native
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", "components")
  @js.native
  val components: ThemedComponentsDict = js.native
  
  inline def themed(key: String): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themed")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ]]
  inline def themed(key: ThemedComponentName): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themed")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ]]
  
  trait Aliases extends StObject {
    
    val inlineCode: code
    
    val root: div
    
    val thematicBreak: hr
  }
  object Aliases {
    
    inline def apply(): Aliases = {
      val __obj = js.Dynamic.literal(inlineCode = "code", root = "div", thematicBreak = "hr")
      __obj.asInstanceOf[Aliases]
    }
    
    extension [Self <: Aliases](x: Self) {
      
      inline def setInlineCode(value: code): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: div): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setThematicBreak(value: hr): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDXProviderComponents
    extends StObject
       with MDXProviderComponentsKnownKeys
       with /* key */ StringDictionary[js.UndefOr[ComponentType[Any] | String]]
  object MDXProviderComponents {
    
    inline def apply(): MDXProviderComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDXProviderComponents]
    }
  }
  
  /* Inlined {[ key in keyof @theme-ui/core.@theme-ui/core.IntrinsicSxElements ]:? react.react.ComponentType<any> | string} */
  trait MDXProviderComponentsKnownKeys extends StObject {
    
    var a: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var b: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var blockquote: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var code: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var del: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var div: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var em: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var h1: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var h2: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var h3: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var h4: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var h5: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var h6: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var hr: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var i: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var img: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var inlineCode: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var li: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var ol: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var p: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var pre: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var root: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var strong: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var table: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var td: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var th: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var thematicBreak: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var tr: js.UndefOr[ComponentType[Any] | String] = js.undefined
    
    var ul: js.UndefOr[ComponentType[Any] | String] = js.undefined
  }
  object MDXProviderComponentsKnownKeys {
    
    inline def apply(): MDXProviderComponentsKnownKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDXProviderComponentsKnownKeys]
    }
    
    extension [Self <: MDXProviderComponentsKnownKeys](x: Self) {
      
      inline def setA(value: ComponentType[Any] | String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: ComponentType[Any] | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setBlockquote(value: ComponentType[Any] | String): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setCode(value: ComponentType[Any] | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDel(value: ComponentType[Any] | String): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      inline def setDiv(value: ComponentType[Any] | String): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      inline def setEm(value: ComponentType[Any] | String): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      inline def setH1(value: ComponentType[Any] | String): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH2(value: ComponentType[Any] | String): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH3(value: ComponentType[Any] | String): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH4(value: ComponentType[Any] | String): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      inline def setH5(value: ComponentType[Any] | String): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      inline def setH6(value: ComponentType[Any] | String): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      inline def setHr(value: ComponentType[Any] | String): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setI(value: ComponentType[Any] | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setImg(value: ComponentType[Any] | String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setInlineCode(value: ComponentType[Any] | String): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
      
      inline def setLi(value: ComponentType[Any] | String): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
      
      inline def setOl(value: ComponentType[Any] | String): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      inline def setP(value: ComponentType[Any] | String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPre(value: ComponentType[Any] | String): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setRoot(value: ComponentType[Any] | String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setStrong(value: ComponentType[Any] | String): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTable(value: ComponentType[Any] | String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTd(value: ComponentType[Any] | String): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
      
      inline def setTh(value: ComponentType[Any] | String): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      inline def setThematicBreak(value: ComponentType[Any] | String): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      inline def setThematicBreakUndefined: Self = StObject.set(x, "thematicBreak", js.undefined)
      
      inline def setTr(value: ComponentType[Any] | String): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setUl(value: ComponentType[Any] | String): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    }
  }
  
  /* Inlined {[ key in keyof @theme-ui/core.@theme-ui/core.IntrinsicSxElements ]: keyof react.react.<global>.JSX.IntrinsicElements} */
  trait MdxAliases extends StObject {
    
    var a: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var b: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var blockquote: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var code: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var del: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var div: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var em: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var h1: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var h2: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var h3: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var h4: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var h5: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var h6: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var hr: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var i: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var img: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var inlineCode: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var li: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var ol: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var p: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var pre: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var root: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var strong: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var table: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var td: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var th: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var thematicBreak: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var tr: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    
    var ul: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
  }
  object MdxAliases {
    
    inline def apply(
      a: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      b: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      blockquote: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      code: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      del: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      div: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      em: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      h1: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      h2: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      h3: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      h4: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      h5: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      h6: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      hr: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      i: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      img: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      inlineCode: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      li: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      ol: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      p: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      pre: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      root: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      strong: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      table: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      td: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      th: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      thematicBreak: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      tr: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any,
      ul: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any
    ): MdxAliases = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], inlineCode = inlineCode.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thematicBreak = thematicBreak.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
      __obj.asInstanceOf[MdxAliases]
    }
    
    extension [Self <: MdxAliases](x: Self) {
      
      inline def setA(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBlockquote(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setCode(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDel(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setEm(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setH1(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setHr(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setI(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setImg(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setInlineCode(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setLi(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setOl(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setP(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPre(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setTable(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTd(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTh(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThematicBreak(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      inline def setTr(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setUl(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ Any): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.themeUiMdx.themeUiMdxStrings.inlineCode
    - typings.themeUiMdx.themeUiMdxStrings.thematicBreak
    - typings.themeUiMdx.themeUiMdxStrings.root
  */
  trait MdxAliasesKeys extends StObject
  object MdxAliasesKeys {
    
    inline def inlineCode: typings.themeUiMdx.themeUiMdxStrings.inlineCode = "inlineCode".asInstanceOf[typings.themeUiMdx.themeUiMdxStrings.inlineCode]
    
    inline def root: typings.themeUiMdx.themeUiMdxStrings.root = "root".asInstanceOf[typings.themeUiMdx.themeUiMdxStrings.root]
    
    inline def thematicBreak: typings.themeUiMdx.themeUiMdxStrings.thematicBreak = "thematicBreak".asInstanceOf[typings.themeUiMdx.themeUiMdxStrings.thematicBreak]
  }
  
  trait MdxProviderProps extends StObject {
    
    var children: ReactNode
    
    var components: js.UndefOr[MDXProviderComponents] = js.undefined
  }
  object MdxProviderProps {
    
    inline def apply(): MdxProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MdxProviderProps]
    }
    
    extension [Self <: MdxProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponents(value: MDXProviderComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  @js.native
  trait ThemedComponent[Name /* <: String */] extends StObject {
    
    def apply(props: (js.Object | ComponentProps[Name]) & Css): Element = js.native
    
    var displayName: String = js.native
  }
  
  /* keyof @theme-ui/core.@theme-ui/core/dist/declarations/src/types.IntrinsicSxElements */ /* Rewritten from type alias, can be one of: 
    - typings.themeUiMdx.themeUiMdxStrings.p
    - typings.themeUiMdx.themeUiMdxStrings.b
    - typings.themeUiMdx.themeUiMdxStrings.i
    - typings.themeUiMdx.themeUiMdxStrings.a
    - typings.themeUiMdx.themeUiMdxStrings.h1
    - typings.themeUiMdx.themeUiMdxStrings.h2
    - typings.themeUiMdx.themeUiMdxStrings.h3
    - typings.themeUiMdx.themeUiMdxStrings.h4
    - typings.themeUiMdx.themeUiMdxStrings.h5
    - typings.themeUiMdx.themeUiMdxStrings.h6
    - typings.themeUiMdx.themeUiMdxStrings.img
    - typings.themeUiMdx.themeUiMdxStrings.pre
    - typings.themeUiMdx.themeUiMdxStrings.code
    - typings.themeUiMdx.themeUiMdxStrings.ol
    - typings.themeUiMdx.themeUiMdxStrings.ul
    - typings.themeUiMdx.themeUiMdxStrings.li
    - typings.themeUiMdx.themeUiMdxStrings.blockquote
    - typings.themeUiMdx.themeUiMdxStrings.hr
    - typings.themeUiMdx.themeUiMdxStrings.table
    - typings.themeUiMdx.themeUiMdxStrings.tr
    - typings.themeUiMdx.themeUiMdxStrings.th
    - typings.themeUiMdx.themeUiMdxStrings.td
    - typings.themeUiMdx.themeUiMdxStrings.em
    - typings.themeUiMdx.themeUiMdxStrings.strong
    - typings.themeUiMdx.themeUiMdxStrings.div
    - typings.themeUiMdx.themeUiMdxStrings.del
    - typings.themeUiMdx.themeUiMdxStrings.inlineCode
    - typings.themeUiMdx.themeUiMdxStrings.thematicBreak
    - typings.themeUiMdx.themeUiMdxStrings.root
  */
  trait ThemedComponentName extends StObject
  
  /* Inlined {[ K in keyof @theme-ui/core.@theme-ui/core.IntrinsicSxElements ]: K extends keyof @theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.Aliases? @theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.ThemedComponent<@theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.Aliases[K]> : K extends keyof react.react.<global>.JSX.IntrinsicElements? @theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.ThemedComponent<K> : never} */
  trait ThemedComponentsDict extends StObject {
    
    var a: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.a | Any]]
    
    var b: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.b | Any]]
    
    var blockquote: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.blockquote | Any]]
    
    var code: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.code | Any]]
    
    var del: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.del | Any]]
    
    var div: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.div | Any]]
    
    var em: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.em | Any]]
    
    var h1: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.h1 | Any]]
    
    var h2: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.h2 | Any]]
    
    var h3: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.h3 | Any]]
    
    var h4: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.h4 | Any]]
    
    var h5: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.h5 | Any]]
    
    var h6: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.h6 | Any]]
    
    var hr: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.hr | Any]]
    
    var i: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.i | Any]]
    
    var img: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.img | Any]]
    
    var inlineCode: ThemedComponent[typings.themeUiMdx.themeUiMdxStrings.inlineCode | code]
    
    var li: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.li | Any]]
    
    var ol: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.ol | Any]]
    
    var p: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.p | Any]]
    
    var pre: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.pre | Any]]
    
    var root: ThemedComponent[typings.themeUiMdx.themeUiMdxStrings.root | div]
    
    var strong: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.strong | Any]]
    
    var table: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.table | Any]]
    
    var td: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.td | Any]]
    
    var th: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.th | Any]]
    
    var thematicBreak: ThemedComponent[typings.themeUiMdx.themeUiMdxStrings.thematicBreak | hr]
    
    var tr: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.tr | Any]]
    
    var ul: ThemedComponent[js.UndefOr[typings.themeUiMdx.themeUiMdxStrings.ul | Any]]
  }
  object ThemedComponentsDict {
    
    inline def apply(
      a: ThemedComponent[js.UndefOr[a | Any]],
      b: ThemedComponent[js.UndefOr[b | Any]],
      blockquote: ThemedComponent[js.UndefOr[blockquote | Any]],
      code: ThemedComponent[js.UndefOr[code | Any]],
      del: ThemedComponent[js.UndefOr[del | Any]],
      div: ThemedComponent[js.UndefOr[div | Any]],
      em: ThemedComponent[js.UndefOr[em | Any]],
      h1: ThemedComponent[js.UndefOr[h1 | Any]],
      h2: ThemedComponent[js.UndefOr[h2 | Any]],
      h3: ThemedComponent[js.UndefOr[h3 | Any]],
      h4: ThemedComponent[js.UndefOr[h4 | Any]],
      h5: ThemedComponent[js.UndefOr[h5 | Any]],
      h6: ThemedComponent[js.UndefOr[h6 | Any]],
      hr: ThemedComponent[js.UndefOr[hr | Any]],
      i: ThemedComponent[js.UndefOr[i | Any]],
      img: ThemedComponent[js.UndefOr[img | Any]],
      inlineCode: ThemedComponent[inlineCode | code],
      li: ThemedComponent[js.UndefOr[li | Any]],
      ol: ThemedComponent[js.UndefOr[ol | Any]],
      p: ThemedComponent[js.UndefOr[p | Any]],
      pre: ThemedComponent[js.UndefOr[pre | Any]],
      root: ThemedComponent[root | div],
      strong: ThemedComponent[js.UndefOr[strong | Any]],
      table: ThemedComponent[js.UndefOr[table | Any]],
      td: ThemedComponent[js.UndefOr[td | Any]],
      th: ThemedComponent[js.UndefOr[th | Any]],
      thematicBreak: ThemedComponent[thematicBreak | hr],
      tr: ThemedComponent[js.UndefOr[tr | Any]],
      ul: ThemedComponent[js.UndefOr[ul | Any]]
    ): ThemedComponentsDict = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], inlineCode = inlineCode.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thematicBreak = thematicBreak.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemedComponentsDict]
    }
    
    extension [Self <: ThemedComponentsDict](x: Self) {
      
      inline def setA(value: ThemedComponent[js.UndefOr[a | Any]]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: ThemedComponent[js.UndefOr[b | Any]]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBlockquote(value: ThemedComponent[js.UndefOr[blockquote | Any]]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setCode(value: ThemedComponent[js.UndefOr[code | Any]]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDel(value: ThemedComponent[js.UndefOr[del | Any]]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: ThemedComponent[js.UndefOr[div | Any]]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setEm(value: ThemedComponent[js.UndefOr[em | Any]]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setH1(value: ThemedComponent[js.UndefOr[h1 | Any]]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH2(value: ThemedComponent[js.UndefOr[h2 | Any]]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH3(value: ThemedComponent[js.UndefOr[h3 | Any]]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH4(value: ThemedComponent[js.UndefOr[h4 | Any]]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH5(value: ThemedComponent[js.UndefOr[h5 | Any]]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH6(value: ThemedComponent[js.UndefOr[h6 | Any]]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setHr(value: ThemedComponent[js.UndefOr[hr | Any]]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setI(value: ThemedComponent[js.UndefOr[i | Any]]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setImg(value: ThemedComponent[js.UndefOr[img | Any]]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setInlineCode(value: ThemedComponent[inlineCode | code]): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setLi(value: ThemedComponent[js.UndefOr[li | Any]]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setOl(value: ThemedComponent[js.UndefOr[ol | Any]]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setP(value: ThemedComponent[js.UndefOr[p | Any]]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPre(value: ThemedComponent[js.UndefOr[pre | Any]]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ThemedComponent[root | div]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: ThemedComponent[js.UndefOr[strong | Any]]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setTable(value: ThemedComponent[js.UndefOr[table | Any]]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTd(value: ThemedComponent[js.UndefOr[td | Any]]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTh(value: ThemedComponent[js.UndefOr[th | Any]]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThematicBreak(value: ThemedComponent[thematicBreak | hr]): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      inline def setTr(value: ThemedComponent[js.UndefOr[tr | Any]]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setUl(value: ThemedComponent[js.UndefOr[ul | Any]]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    }
  }
  
  type ThemedDiv = js.Function1[/* props */ ThemedDivProps, Element]
  
  type ThemedDivProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
  
  trait ThemedProps extends StObject {
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
  }
  object ThemedProps {
    
    inline def apply(
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): ThemedProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemedProps]
    }
    
    extension [Self <: ThemedProps](x: Self) {
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
