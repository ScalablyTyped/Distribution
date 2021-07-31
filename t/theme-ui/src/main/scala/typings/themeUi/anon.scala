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
    
    @scala.inline
    def apply(): As = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
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
    
    @scala.inline
    def apply(
      background: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any,
      text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): ColorModemodeskstringColo = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorModemodeskstringColo]
    }
    
    @scala.inline
    implicit class ColorModemodeskstringColoMutableBuilder[Self <: ColorModemodeskstringColo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
      
      @scala.inline
      def setBackground(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setModes(value: StringDictionary[ColorMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
      
      @scala.inline
      def setMuted(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setPrimary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setSecondary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
      ): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      @scala.inline
      def setText(
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
    
    @scala.inline
    def apply(): PinStyledTagsSystemStyleO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinStyledTagsSystemStyleO]
    }
    
    @scala.inline
    implicit class PinStyledTagsSystemStyleOMutableBuilder[Self <: PinStyledTagsSystemStyleO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: SystemStyleObject): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setANull: Self = StObject.set(x, "a", null)
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setB(value: SystemStyleObject): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBNull: Self = StObject.set(x, "b", null)
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setBlockquote(value: SystemStyleObject): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockquoteNull: Self = StObject.set(x, "blockquote", null)
      
      @scala.inline
      def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      @scala.inline
      def setCode(value: SystemStyleObject): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeNull: Self = StObject.set(x, "code", null)
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDelete(value: SystemStyleObject): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteNull: Self = StObject.set(x, "delete", null)
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDiv(value: SystemStyleObject): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivNull: Self = StObject.set(x, "div", null)
      
      @scala.inline
      def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      @scala.inline
      def setEm(value: SystemStyleObject): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmNull: Self = StObject.set(x, "em", null)
      
      @scala.inline
      def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      @scala.inline
      def setH1(value: SystemStyleObject): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Null: Self = StObject.set(x, "h1", null)
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH2(value: SystemStyleObject): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Null: Self = StObject.set(x, "h2", null)
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH3(value: SystemStyleObject): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Null: Self = StObject.set(x, "h3", null)
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH4(value: SystemStyleObject): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Null: Self = StObject.set(x, "h4", null)
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH5(value: SystemStyleObject): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Null: Self = StObject.set(x, "h5", null)
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH6(value: SystemStyleObject): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Null: Self = StObject.set(x, "h6", null)
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setHr(value: SystemStyleObject): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrNull: Self = StObject.set(x, "hr", null)
      
      @scala.inline
      def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      @scala.inline
      def setI(value: SystemStyleObject): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINull: Self = StObject.set(x, "i", null)
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setImg(value: SystemStyleObject): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgNull: Self = StObject.set(x, "img", null)
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setInlineCode(value: SystemStyleObject): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineCodeNull: Self = StObject.set(x, "inlineCode", null)
      
      @scala.inline
      def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
      
      @scala.inline
      def setLi(value: SystemStyleObject): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiNull: Self = StObject.set(x, "li", null)
      
      @scala.inline
      def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
      
      @scala.inline
      def setOl(value: SystemStyleObject): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlNull: Self = StObject.set(x, "ol", null)
      
      @scala.inline
      def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      @scala.inline
      def setP(value: SystemStyleObject): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNull: Self = StObject.set(x, "p", null)
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPre(value: SystemStyleObject): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreNull: Self = StObject.set(x, "pre", null)
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setRoot(value: SystemStyleObject): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrong(value: SystemStyleObject): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongNull: Self = StObject.set(x, "strong", null)
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setTable(value: SystemStyleObject): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNull: Self = StObject.set(x, "table", null)
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTd(value: SystemStyleObject): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTdNull: Self = StObject.set(x, "td", null)
      
      @scala.inline
      def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
      
      @scala.inline
      def setTh(value: SystemStyleObject): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThNull: Self = StObject.set(x, "th", null)
      
      @scala.inline
      def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      @scala.inline
      def setThematicBreak(value: SystemStyleObject): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThematicBreakNull: Self = StObject.set(x, "thematicBreak", null)
      
      @scala.inline
      def setThematicBreakUndefined: Self = StObject.set(x, "thematicBreak", js.undefined)
      
      @scala.inline
      def setTr(value: SystemStyleObject): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrNull: Self = StObject.set(x, "tr", null)
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      @scala.inline
      def setUl(value: SystemStyleObject): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlNull: Self = StObject.set(x, "ul", null)
      
      @scala.inline
      def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    }
  }
}
