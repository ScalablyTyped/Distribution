package typings.styledSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typings.styledSystemCss.mod.CSSObject]
  /**
    * Omit exists in TypeScript >= v3.5, we're putting this here so typings can be
    * used with earlier versions of TypeScript.
    */
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type ResponsiveStyleValue[T] = T | (js.Array[T | scala.Null])
  type StandardCSSProperties = typings.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typings.styledSystemCss.KinkeyofStandardCSSProper
    - typings.styledSystemCss.PartialScaleThemeProperti
    - typings.styledSystemCss.mod.ThemeBreakPoints
    - org.scalablytyped.runtime.StringDictionary[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme * / js.Object]
  */
  type Theme = typings.styledSystemCss.mod._Theme | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object
  ])
  type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
}
