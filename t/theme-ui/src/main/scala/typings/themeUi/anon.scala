package typings.themeUi

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.styledSystemCss.mod.SystemStyleObject
import typings.themeUi.mod.ColorMode
import typings.themeUi.mod.ObjectOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As extends StObject {
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object As {
    
    inline def apply(): As = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As]
    }
    
    extension [Self <: As](x: Self) {
      
      inline def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  /* Inlined theme-ui.theme-ui.ColorMode & {  modes :{[k: string] : theme-ui.theme-ui.ColorMode} | undefined} */
  trait ColorModemodeskstringColo
    extends StObject
       with /* k */ StringDictionary[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any) | (ObjectOrArray[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
          ])
        ] {
    
    /**
      * A contrast color for emphasizing UI
      */
    var accent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ] = js.undefined
    
    /**
      * Body background color
      */
    var background: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    
    /**
      * A background color for highlighting text
      */
    var highlight: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ] = js.undefined
    
    /**
      * Nested color modes can provide overrides when used in conjunction with
      * `Theme.initialColorModeName and `useColorMode()`
      */
    var modes: js.UndefOr[StringDictionary[ColorMode]] = js.undefined
    
    /**
      * A faint color for backgrounds, borders, and accents that do not require
      * high contrast with the background color
      */
    var muted: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ] = js.undefined
    
    /**
      * Primary brand color for links, buttons, etc.
      */
    var primary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ] = js.undefined
    
    /**
      * A secondary brand color for alternative styling
      */
    var secondary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ] = js.undefined
    
    /**
      * Body foreground color
      */
    var text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  }
  object ColorModemodeskstringColo {
    
    inline def apply(
      background: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any,
      text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): ColorModemodeskstringColo = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorModemodeskstringColo]
    }
    
    extension [Self <: ColorModemodeskstringColo](x: Self) {
      
      inline def setAccent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
      
      inline def setBackground(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setHighlight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setModes(value: StringDictionary[ColorMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
      
      inline def setMuted(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPrimary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSecondary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setText(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ P in theme-ui.theme-ui.StyledTags ]:? @styled-system/css.@styled-system/css.SystemStyleObject} */
  trait PinStyledTagsSystemStyleO extends StObject {
    
    var a: js.UndefOr[SystemStyleObject] = js.undefined
    
    var b: js.UndefOr[SystemStyleObject] = js.undefined
    
    var blockquote: js.UndefOr[SystemStyleObject] = js.undefined
    
    var code: js.UndefOr[SystemStyleObject] = js.undefined
    
    var delete: js.UndefOr[SystemStyleObject] = js.undefined
    
    var div: js.UndefOr[SystemStyleObject] = js.undefined
    
    var em: js.UndefOr[SystemStyleObject] = js.undefined
    
    var h1: js.UndefOr[SystemStyleObject] = js.undefined
    
    var h2: js.UndefOr[SystemStyleObject] = js.undefined
    
    var h3: js.UndefOr[SystemStyleObject] = js.undefined
    
    var h4: js.UndefOr[SystemStyleObject] = js.undefined
    
    var h5: js.UndefOr[SystemStyleObject] = js.undefined
    
    var h6: js.UndefOr[SystemStyleObject] = js.undefined
    
    var hr: js.UndefOr[SystemStyleObject] = js.undefined
    
    var i: js.UndefOr[SystemStyleObject] = js.undefined
    
    var img: js.UndefOr[SystemStyleObject] = js.undefined
    
    var inlineCode: js.UndefOr[SystemStyleObject] = js.undefined
    
    var li: js.UndefOr[SystemStyleObject] = js.undefined
    
    var ol: js.UndefOr[SystemStyleObject] = js.undefined
    
    var p: js.UndefOr[SystemStyleObject] = js.undefined
    
    var pre: js.UndefOr[SystemStyleObject] = js.undefined
    
    var root: js.UndefOr[SystemStyleObject] = js.undefined
    
    var strong: js.UndefOr[SystemStyleObject] = js.undefined
    
    var table: js.UndefOr[SystemStyleObject] = js.undefined
    
    var td: js.UndefOr[SystemStyleObject] = js.undefined
    
    var th: js.UndefOr[SystemStyleObject] = js.undefined
    
    var thematicBreak: js.UndefOr[SystemStyleObject] = js.undefined
    
    var tr: js.UndefOr[SystemStyleObject] = js.undefined
    
    var ul: js.UndefOr[SystemStyleObject] = js.undefined
  }
  object PinStyledTagsSystemStyleO {
    
    inline def apply(): PinStyledTagsSystemStyleO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinStyledTagsSystemStyleO]
    }
    
    extension [Self <: PinStyledTagsSystemStyleO](x: Self) {
      
      inline def setA(value: SystemStyleObject): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setANull: Self = StObject.set(x, "a", null)
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: SystemStyleObject): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBNull: Self = StObject.set(x, "b", null)
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setBlockquote(value: SystemStyleObject): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteNull: Self = StObject.set(x, "blockquote", null)
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setCode(value: SystemStyleObject): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDelete(value: SystemStyleObject): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteNull: Self = StObject.set(x, "delete", null)
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDiv(value: SystemStyleObject): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivNull: Self = StObject.set(x, "div", null)
      
      inline def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      inline def setEm(value: SystemStyleObject): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmNull: Self = StObject.set(x, "em", null)
      
      inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      inline def setH1(value: SystemStyleObject): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Null: Self = StObject.set(x, "h1", null)
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH2(value: SystemStyleObject): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Null: Self = StObject.set(x, "h2", null)
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH3(value: SystemStyleObject): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Null: Self = StObject.set(x, "h3", null)
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH4(value: SystemStyleObject): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Null: Self = StObject.set(x, "h4", null)
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      inline def setH5(value: SystemStyleObject): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Null: Self = StObject.set(x, "h5", null)
      
      inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      inline def setH6(value: SystemStyleObject): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Null: Self = StObject.set(x, "h6", null)
      
      inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      inline def setHr(value: SystemStyleObject): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrNull: Self = StObject.set(x, "hr", null)
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setI(value: SystemStyleObject): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setINull: Self = StObject.set(x, "i", null)
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setImg(value: SystemStyleObject): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgNull: Self = StObject.set(x, "img", null)
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setInlineCode(value: SystemStyleObject): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setInlineCodeNull: Self = StObject.set(x, "inlineCode", null)
      
      inline def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
      
      inline def setLi(value: SystemStyleObject): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLiNull: Self = StObject.set(x, "li", null)
      
      inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
      
      inline def setOl(value: SystemStyleObject): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlNull: Self = StObject.set(x, "ol", null)
      
      inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      inline def setP(value: SystemStyleObject): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPNull: Self = StObject.set(x, "p", null)
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPre(value: SystemStyleObject): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreNull: Self = StObject.set(x, "pre", null)
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setRoot(value: SystemStyleObject): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setStrong(value: SystemStyleObject): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongNull: Self = StObject.set(x, "strong", null)
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTable(value: SystemStyleObject): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableNull: Self = StObject.set(x, "table", null)
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTd(value: SystemStyleObject): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTdNull: Self = StObject.set(x, "td", null)
      
      inline def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
      
      inline def setTh(value: SystemStyleObject): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThNull: Self = StObject.set(x, "th", null)
      
      inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      inline def setThematicBreak(value: SystemStyleObject): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      inline def setThematicBreakNull: Self = StObject.set(x, "thematicBreak", null)
      
      inline def setThematicBreakUndefined: Self = StObject.set(x, "thematicBreak", js.undefined)
      
      inline def setTr(value: SystemStyleObject): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrNull: Self = StObject.set(x, "tr", null)
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setUl(value: SystemStyleObject): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlNull: Self = StObject.set(x, "ul", null)
      
      inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    }
  }
}
