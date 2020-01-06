package typings.atStyledDashSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStyledDashSystemCssMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.csstype.csstypeMod.PropertiesFallback
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type CSSInterpolation = js.UndefOr[Double | String | CSSObject]
  type CSSPropertiesWithMultiValues = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @styled-system/css.@styled-system/css.CSSProperties ]: @styled-system/css.@styled-system/css.CSSProperties[K]}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.CSSPropertiesWithMultiValues with CSSProperties
  type CSSPseudoSelectorProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.CSSPseudoSelectorProps with js.Any
  type CSSPseudosForCSSObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @styled-system/css.@styled-system/css.CSSObject}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.CSSPseudosForCSSObject with js.Any
  /**
    * Omit exists in TypeScript >= v3.5, we're putting this here so typings can be
    * used with earlier versions of TypeScript.
    */
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type ResponsiveStyleValue[T] = T | (js.Array[T | Null])
  type StandardCSSProperties = PropertiesFallback[Double | String]
  type SystemCssProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @styled-system/css.@styled-system/css.AllSystemCSSProperties ]: @styled-system/css.@styled-system/css.ResponsiveStyleValue<@styled-system/css.@styled-system/css.AllSystemCSSProperties[K]> | (theme : any): @styled-system/css.@styled-system/css.ResponsiveStyleValue<@styled-system/css.@styled-system/css.AllSystemCSSProperties[K]> | @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.SystemCssProperties with js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemCssProperties
    - typings.atStyledDashSystemCss.atStyledDashSystemCssMod.CSSPseudoSelectorProps
    - typings.atStyledDashSystemCss.atStyledDashSystemCssMod.CSSSelectorObject
    - typings.atStyledDashSystemCss.atStyledDashSystemCssMod.VariantProperty
    - typings.atStyledDashSystemCss.atStyledDashSystemCssMod.UseThemeFunction
  */
  type SystemStyleObject = _SystemStyleObject | SystemCssProperties | CSSPseudoSelectorProps
  type Theme = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @styled-system/css.@styled-system/css.StandardCSSProperties ]: @styled-system/css.@styled-system/css.ThemeValue<@styled-system/css.@styled-system/css.StandardCSSProperties[K]>}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.Theme with StandardCSSProperties) | Partial[ScaleThemeProperties] | ThemeBreakPoints | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object
  ])
  type ThemeValue[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
}
