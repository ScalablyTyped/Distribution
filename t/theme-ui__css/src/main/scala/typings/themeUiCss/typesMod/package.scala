package typings.themeUiCss.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typings.themeUiCss.typesMod.CSSObject]

type ResponsiveStyleValue[T] = T | (js.Array[js.UndefOr[T | scala.Null]])

type Scale[T] = js.Array[T] | ((org.scalablytyped.runtime.StringDictionary[
T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @theme-ui/css.@theme-ui/css/dist/types.Scale<T> */ js.Object)]) & org.scalablytyped.runtime.NumberDictionary[T])

type StandardCSSProperties = typings.csstype.mod.Properties[scala.Double | java.lang.String]

type StylePropertyValue[T] = (typings.themeUiCss.typesMod.ResponsiveStyleValue[typings.std.Exclude[T, scala.Unit]]) | (js.Function1[
/* theme */ typings.themeUiCss.typesMod.Theme, 
js.UndefOr[
  typings.themeUiCss.typesMod.ResponsiveStyleValue[typings.std.Exclude[T, scala.Unit]]
]]) | typings.themeUiCss.typesMod.ThemeUIStyleObject

type TLengthStyledSystem = java.lang.String | typings.themeUiCss.themeUiCssNumbers.`0` | scala.Double

type ThemeDerivedStyles = js.Function1[
/* theme */ typings.themeUiCss.typesMod.Theme, 
typings.themeUiCss.typesMod.ThemeUICSSObject]

type ThemeUIStyleObject = typings.themeUiCss.typesMod.ThemeUICSSObject | typings.themeUiCss.typesMod.ThemeDerivedStyles

type ThemeUITheme = typings.themeUiCss.typesMod.Theme
