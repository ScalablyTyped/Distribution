package typings.styledSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typings.styledSystemCss.mod.CSSObject]
  type CSSPropertiesWithMultiValues = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @styled-system/css.@styled-system/css.CSSProperties ]: @styled-system/css.@styled-system/css.CSSProperties[K]}
    */ typings.styledSystemCss.styledSystemCssStrings.CSSPropertiesWithMultiValues with typings.styledSystemCss.mod.CSSProperties
  type CSSPseudoSelectorProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.styledSystemCss.styledSystemCssStrings.CSSPseudoSelectorProps with js.Any
  type CSSPseudosForCSSObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @styled-system/css.@styled-system/css.CSSObject}
    */ typings.styledSystemCss.styledSystemCssStrings.CSSPseudosForCSSObject with js.Any
  /**
    * Omit exists in TypeScript >= v3.5, we're putting this here so typings can be
    * used with earlier versions of TypeScript.
    */
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type ResponsiveStyleValue[T] = T | (js.Array[T | scala.Null])
  type StandardCSSProperties = typings.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  type SystemCssProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @styled-system/css.@styled-system/css.AllSystemCSSProperties ]: @styled-system/css.@styled-system/css.ResponsiveStyleValue<@styled-system/css.@styled-system/css.AllSystemCSSProperties[K]> | (theme : any): @styled-system/css.@styled-system/css.ResponsiveStyleValue<@styled-system/css.@styled-system/css.AllSystemCSSProperties[K]> | @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.styledSystemCss.styledSystemCssStrings.SystemCssProperties with js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.styledSystemCss.mod.SystemCssProperties
    - typings.styledSystemCss.mod.CSSPseudoSelectorProps
    - typings.styledSystemCss.mod.CSSSelectorObject
    - typings.styledSystemCss.mod.VariantProperty
    - typings.styledSystemCss.mod.UseThemeFunction
  */
  type SystemStyleObject = typings.styledSystemCss.mod._SystemStyleObject | typings.styledSystemCss.mod.SystemCssProperties | typings.styledSystemCss.mod.CSSPseudoSelectorProps
  type Theme = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @styled-system/css.@styled-system/css.StandardCSSProperties ]: @styled-system/css.@styled-system/css.ThemeValue<@styled-system/css.@styled-system/css.StandardCSSProperties[K]>}
    */ typings.styledSystemCss.styledSystemCssStrings.Theme with typings.styledSystemCss.mod.StandardCSSProperties) | typings.std.Partial[typings.styledSystemCss.mod.ScaleThemeProperties] | typings.styledSystemCss.mod.ThemeBreakPoints | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object
  ])
  type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
}
