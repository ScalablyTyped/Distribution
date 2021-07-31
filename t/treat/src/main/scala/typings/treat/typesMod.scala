package typings.treat

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.csstype.mod.Properties
import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type BasicCSSProperties = Properties[String | Double]
  
  type CSSKeyframes = StringDictionary[BasicCSSProperties]
  
  trait CSSProperties
    extends StObject
       with Properties[String | Double] {
    
    var `@keyframes`: js.UndefOr[CSSKeyframes | String] = js.undefined
  }
  object CSSProperties {
    
    @scala.inline
    def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
    
    @scala.inline
    implicit class CSSPropertiesMutableBuilder[Self <: CSSProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@keyframes`(value: CSSKeyframes | String): Self = StObject.set(x, "@keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@keyframesUndefined`: Self = StObject.set(x, "@keyframes", js.undefined)
    }
  }
  
  type CSSPropertiesAndPseudos = CSSProperties & PseudoProperties
  
  type ClassRef = String
  
  trait FeatureQueries[StyleType] extends StObject {
    
    var `@supports`: js.UndefOr[StringDictionary[StyleType]] = js.undefined
  }
  object FeatureQueries {
    
    @scala.inline
    def apply[StyleType](): FeatureQueries[StyleType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureQueries[StyleType]]
    }
    
    @scala.inline
    implicit class FeatureQueriesMutableBuilder[Self <: FeatureQueries[?], StyleType] (val x: Self & FeatureQueries[StyleType]) extends AnyVal {
      
      @scala.inline
      def `set@supports`(value: StringDictionary[StyleType]): Self = StObject.set(x, "@supports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@supportsUndefined`: Self = StObject.set(x, "@supports", js.undefined)
    }
  }
  
  type GlobalStyle = CSSProperties & MediaQueries[CSSProperties] & FeatureQueries[CSSProperties]
  
  trait MediaQueries[StyleType] extends StObject {
    
    var `@media`: js.UndefOr[StringDictionary[StyleType]] = js.undefined
  }
  object MediaQueries {
    
    @scala.inline
    def apply[StyleType](): MediaQueries[StyleType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueries[StyleType]]
    }
    
    @scala.inline
    implicit class MediaQueriesMutableBuilder[Self <: MediaQueries[?], StyleType] (val x: Self & MediaQueries[StyleType]) extends AnyVal {
      
      @scala.inline
      def `set@media`(value: StringDictionary[StyleType]): Self = StObject.set(x, "@media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@mediaUndefined`: Self = StObject.set(x, "@media", js.undefined)
    }
  }
  
  type PostCSS = js.Object
  
  type PseudoProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in treat.treat/lib/types/transformCSS.SimplePseudos[number] ]:? treat.treat/lib/types/types.CSSProperties}
    */ typings.treat.treatStrings.PseudoProperties & TopLevel[js.Any]
  
  type SelectorMap = StringDictionary[CSSProperties]
  
  trait Style
    extends StObject
       with StyleWithSelectors
       with MediaQueries[StyleWithSelectors]
       with FeatureQueries[StyleWithSelectors]
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
  }
  
  type StyleMap[StyleName /* <: String | Double */, StyleType] = Record[StyleName, StyleType]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in treat.treat/lib/types/transformCSS.SimplePseudos[number] ]:? treat.treat/lib/types/types.CSSProperties} */ trait StyleWithSelectors
    extends StObject
       with CSSProperties {
    
    var selectors: js.UndefOr[SelectorMap] = js.undefined
  }
  object StyleWithSelectors {
    
    @scala.inline
    def apply(): StyleWithSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleWithSelectors]
    }
    
    @scala.inline
    implicit class StyleWithSelectorsMutableBuilder[Self <: StyleWithSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectors(value: SelectorMap): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
  
  type StylesMap[StyleName /* <: String | Double */] = Record[StyleName, ClassRef]
  
  type ThemeRef = String
  
  type ThemedStyle[StyleType, Theme] = (js.Function1[/* theme */ Theme, StyleType]) | StyleType
  
  /* Rewritten from type alias, can be one of: 
    - typings.treat.typesMod.TreatModuleObject
    - typings.treat.typesMod.TreatModuleArray
  */
  trait TreatModule extends StObject
  
  @js.native
  trait TreatModuleArray
    extends StObject
       with Array[TreatModuleValue]
       with TreatModule
       with _TreatModuleValue
  
  trait TreatModuleObject
    extends StObject
       with /* index */ NumberDictionary[TreatModuleValue]
       with /* index */ StringDictionary[TreatModuleValue]
       with TreatModule
       with _TreatModuleValue
  object TreatModuleObject {
    
    @scala.inline
    def apply(): TreatModuleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreatModuleObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - scala.Unit
    - typings.treat.typesMod.TreatModuleObject
    - typings.treat.typesMod.TreatModuleArray
  */
  type TreatModuleValue = js.UndefOr[_TreatModuleValue | String | Double | Boolean | Null]
  
  trait TreatTheme[Tokens] extends StObject {
    
    var themeRef: ThemeRef
    
    var tokens: Tokens
  }
  object TreatTheme {
    
    @scala.inline
    def apply[Tokens](themeRef: ThemeRef, tokens: Tokens): TreatTheme[Tokens] = {
      val __obj = js.Dynamic.literal(themeRef = themeRef.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreatTheme[Tokens]]
    }
    
    @scala.inline
    implicit class TreatThemeMutableBuilder[Self <: TreatTheme[?], Tokens] (val x: Self & TreatTheme[Tokens]) extends AnyVal {
      
      @scala.inline
      def setThemeRef(value: ThemeRef): Self = StObject.set(x, "themeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: Tokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebpackTreat extends StObject {
    
    def addLocalCss(css: js.Object): Unit = js.native
    
    def addTheme(
      theme: TreatTheme[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
        ]
    ): Unit = js.native
    
    def addThemedCss(themeRef: ThemeRef, css: js.Object): Unit = js.native
    
    def getIdentName(local: String, scopeId: Double): String = js.native
    def getIdentName(
      local: String,
      scopeId: Double,
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ): String = js.native
    
    def getThemes(): js.Array[
        TreatTheme[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
        ]
      ] = js.native
  }
  
  trait _TreatModuleValue extends StObject
}
