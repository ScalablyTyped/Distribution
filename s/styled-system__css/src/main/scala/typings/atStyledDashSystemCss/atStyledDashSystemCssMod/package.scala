package typings.atStyledDashSystemCss

import org.scalablytyped.runtime.StringDictionary
import typings.atStyledDashSystemCss.Anon_BackgroundColor
import typings.atStyledDashSystemCss.Anon_Border
import typings.atStyledDashSystemCss.Anon_Bottom
import typings.atStyledDashSystemCss.Anon_BoxShadow
import typings.atStyledDashSystemCss.Anon_ColumnGap
import typings.atStyledDashSystemCss.Anon_FontFamily
import typings.atStyledDashSystemCss.Anon_Height
import typings.atStyledDashSystemCss.Anon_M
import typings.atStyledDashSystemCss.Omit
import typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.boxShadow
import typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.fontWeight
import typings.csstype.csstypeMod.PropertiesFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStyledDashSystemCssMod {
  type BorderProps = ResponsiveStyleProps[Anon_Border]
  type CSSObject = (PropertiesFallback[Double | String]) with typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.CSSObject with js.Any
  type CSSPseudoSelectorProps[Properties] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ Key in csstype.csstype.SimplePseudos ]:? @styled-system/css.@styled-system/css.ResponsiveStyleProps<Properties>}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.CSSPseudoSelectorProps with js.Any
  type ColorProps = ResponsiveStyleProps[Anon_BackgroundColor]
  type GridProps = ResponsiveStyleProps[Anon_ColumnGap]
  type LayoutProps = ResponsiveStyleProps[Anon_Height]
  type PositionProps = ResponsiveStyleProps[Anon_Bottom]
  type ResponsiveStyleProps[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? @styled-system/css.@styled-system/css.ResponsiveStyleValue<T[P]>}
    */ typings.atStyledDashSystemCss.atStyledDashSystemCssStrings.ResponsiveStyleProps with T
  type ResponsiveStyleValue[T] = T | js.Array[T]
  type ShadowProps = ResponsiveStyleProps[Anon_BoxShadow]
  type SpaceProps = ResponsiveStyleProps[Anon_M]
  type StyleObject = (ResponsiveStyleProps[Omit[CSSProperties, boxShadow | fontWeight]]) with StyleProps
  type StyleProps = ColorProps with SpaceProps with TypographyProps with BorderProps with ShadowProps with LayoutProps with PositionProps with GridProps
  type SystemStyleObject = StyleObject with CSSPseudoSelectorProps[StyleObject]
  type ThemeValue[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
  type TypographyProps = ResponsiveStyleProps[Anon_FontFamily]
}
