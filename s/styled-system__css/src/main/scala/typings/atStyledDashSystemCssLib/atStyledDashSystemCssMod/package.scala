package typings
package atStyledDashSystemCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStyledDashSystemCssMod {
  type BorderProps = ResponsiveStyleProps[atStyledDashSystemCssLib.Anon_Border]
  type CSSPseudoSelectorProps[Properties] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ Key in csstype.csstype.SimplePseudos ]:? @styled-system/css.@styled-system/css.ResponsiveStyleProps<Properties>}
    */ atStyledDashSystemCssLib.atStyledDashSystemCssLibStrings.CSSPseudoSelectorProps with js.Any
  type ColorProps = ResponsiveStyleProps[atStyledDashSystemCssLib.Anon_BackgroundColor]
  type LayoutProps = ResponsiveStyleProps[atStyledDashSystemCssLib.Anon_Height]
  type ResponsiveStyleProps[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? @styled-system/css.@styled-system/css.ResponsiveStyleValue<T[P]>}
    */ atStyledDashSystemCssLib.atStyledDashSystemCssLibStrings.ResponsiveStyleProps with T
  type ResponsiveStyleValue[T] = T | js.Array[T]
  type ShadowProps = ResponsiveStyleProps[atStyledDashSystemCssLib.Anon_BoxShadow]
  type SpaceProps = ResponsiveStyleProps[atStyledDashSystemCssLib.Anon_M]
  type StyleObject = (ResponsiveStyleProps[
    atStyledDashSystemCssLib.Omit[
      CSSProperties, 
      atStyledDashSystemCssLib.atStyledDashSystemCssLibStrings.boxShadow | atStyledDashSystemCssLib.atStyledDashSystemCssLibStrings.fontWeight
    ]
  ]) with StyleProps
  type StyleProps = ColorProps with SpaceProps with TypographyProps with BorderProps with ShadowProps with LayoutProps
  type SystemStyleObject = StyleObject with CSSPseudoSelectorProps[StyleObject]
  type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
  type TypographyProps = ResponsiveStyleProps[atStyledDashSystemCssLib.Anon_FontFamily]
}
