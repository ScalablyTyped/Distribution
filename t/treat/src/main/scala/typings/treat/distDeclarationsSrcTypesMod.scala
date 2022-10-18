package typings.treat

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.std.Record
import typings.treat.themeMod.ThemeOrAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesMod {
  
  @js.native
  trait Adapter extends StObject {
    
    def addLocalCss(css: js.Object): Unit = js.native
    
    def addTheme(theme: TreatTheme[ThemeOrAny]): Unit = js.native
    
    def addThemedCss(themeRef: ThemeRef, css: js.Object): Unit = js.native
    
    def getIdentName(local: String, scopeId: Double): String = js.native
    def getIdentName(local: String, scopeId: Double, theme: ThemeOrAny): String = js.native
    
    def getThemes(): js.Array[TreatTheme[ThemeOrAny]] = js.native
  }
  
  type BasicCSSProperties = Properties[String | Double, String]
  
  type CSSKeyframes = StringDictionary[BasicCSSProperties]
  
  trait CSSProperties
    extends StObject
       with Properties[String | Double, String] {
    
    var `@keyframes`: js.UndefOr[CSSKeyframes | String] = js.undefined
  }
  object CSSProperties {
    
    inline def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
    
    extension [Self <: CSSProperties](x: Self) {
      
      inline def `set@keyframes`(value: CSSKeyframes | String): Self = StObject.set(x, "@keyframes", value.asInstanceOf[js.Any])
      
      inline def `set@keyframesUndefined`: Self = StObject.set(x, "@keyframes", js.undefined)
    }
  }
  
  type CSSPropertiesAndPseudos = CSSProperties & PseudoProperties
  
  type ClassRef = String
  
  trait FeatureQueries[StyleType] extends StObject {
    
    var `@supports`: js.UndefOr[StringDictionary[StyleType]] = js.undefined
  }
  object FeatureQueries {
    
    inline def apply[StyleType](): FeatureQueries[StyleType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureQueries[StyleType]]
    }
    
    extension [Self <: FeatureQueries[?], StyleType](x: Self & FeatureQueries[StyleType]) {
      
      inline def `set@supports`(value: StringDictionary[StyleType]): Self = StObject.set(x, "@supports", value.asInstanceOf[js.Any])
      
      inline def `set@supportsUndefined`: Self = StObject.set(x, "@supports", js.undefined)
    }
  }
  
  type GlobalStyle = CSSProperties & MediaQueries[CSSProperties] & FeatureQueries[CSSProperties]
  
  trait MediaQueries[StyleType] extends StObject {
    
    var `@media`: js.UndefOr[StringDictionary[StyleType]] = js.undefined
  }
  object MediaQueries {
    
    inline def apply[StyleType](): MediaQueries[StyleType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueries[StyleType]]
    }
    
    extension [Self <: MediaQueries[?], StyleType](x: Self & MediaQueries[StyleType]) {
      
      inline def `set@media`(value: StringDictionary[StyleType]): Self = StObject.set(x, "@media", value.asInstanceOf[js.Any])
      
      inline def `set@mediaUndefined`: Self = StObject.set(x, "@media", js.undefined)
    }
  }
  
  type PostCSS = js.Object
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in treat.treat/dist/declarations/src/transformCSS.SimplePseudos[number] ]:? treat.treat/dist/declarations/src/types.CSSProperties}
    }}}
    */
  @js.native
  trait PseudoProperties extends StObject
  
  type SelectorMap = StringDictionary[CSSProperties]
  
  trait Style
    extends StObject
       with StyleWithSelectors
       with MediaQueries[StyleWithSelectors]
       with FeatureQueries[StyleWithSelectors]
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
  }
  
  type StyleMap[StyleName /* <: String | Double */, StyleType] = Record[StyleName, StyleType]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in treat.treat/dist/declarations/src/transformCSS.SimplePseudos[number] ]:? treat.treat/dist/declarations/src/types.CSSProperties} */ trait StyleWithSelectors
    extends StObject
       with CSSProperties {
    
    var selectors: js.UndefOr[SelectorMap] = js.undefined
  }
  object StyleWithSelectors {
    
    inline def apply(): StyleWithSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleWithSelectors]
    }
    
    extension [Self <: StyleWithSelectors](x: Self) {
      
      inline def setSelectors(value: SelectorMap): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
  
  type StylesMap[StyleName /* <: String | Double */] = Record[StyleName, ClassRef]
  
  type ThemeRef = String
  
  type ThemedStyle[StyleType, Theme] = (js.Function1[/* theme */ Theme, StyleType]) | StyleType
  
  type TreatModule = TreatModuleObject | TreatModuleArray
  
  type TreatModuleArray = js.Array[TreatModuleValue]
  
  trait TreatModuleObject
    extends StObject
       with /* index */ NumberDictionary[TreatModuleValue]
       with /* index */ StringDictionary[TreatModuleValue]
  object TreatModuleObject {
    
    inline def apply(): TreatModuleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreatModuleObject]
    }
  }
  
  type TreatModuleValue = js.UndefOr[String | Double | Boolean | Null | TreatModuleObject | Any]
  
  trait TreatTheme[Tokens] extends StObject {
    
    var themeRef: ThemeRef
    
    var tokens: Tokens
  }
  object TreatTheme {
    
    inline def apply[Tokens](themeRef: ThemeRef, tokens: Tokens): TreatTheme[Tokens] = {
      val __obj = js.Dynamic.literal(themeRef = themeRef.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreatTheme[Tokens]]
    }
    
    extension [Self <: TreatTheme[?], Tokens](x: Self & TreatTheme[Tokens]) {
      
      inline def setThemeRef(value: ThemeRef): Self = StObject.set(x, "themeRef", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: Tokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
