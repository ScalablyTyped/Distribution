package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(): typings.styledSystemCss.mod.CssFunctionReturnType = typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.styledSystemCss.mod.CssFunctionReturnType]
inline def default(input: typings.styledSystemCss.mod.SystemStyleObject): typings.styledSystemCss.mod.CssFunctionReturnType = typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[typings.styledSystemCss.mod.CssFunctionReturnType]

inline def css(): typings.styledSystemCss.mod.CssFunctionReturnType = typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[typings.styledSystemCss.mod.CssFunctionReturnType]
inline def css(input: typings.styledSystemCss.mod.SystemStyleObject): typings.styledSystemCss.mod.CssFunctionReturnType = typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("css")(input.asInstanceOf[js.Any]).asInstanceOf[typings.styledSystemCss.mod.CssFunctionReturnType]

inline def get(`object`: js.Object, key: java.lang.String): js.Any = (typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def get(`object`: js.Object, key: java.lang.String, defaultValue: js.Any): js.Any = (typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def get(`object`: js.Object, key: js.Array[java.lang.String]): js.Any = (typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def get(`object`: js.Object, key: js.Array[java.lang.String], defaultValue: js.Any): js.Any = (typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def responsive(styles: js.Object): js.Function1[/* theme */ js.Object, js.Array[js.Any]] = typings.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("responsive")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* theme */ js.Object, js.Array[js.Any]]]

type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typings.styledSystemCss.mod.CSSObject]

type CssFunctionReturnType = js.Function1[
/* props */ js.UndefOr[typings.styledSystemCss.mod.Theme | typings.styledSystemCss.anon.Theme], 
typings.styledSystemCss.mod.CSSObject]

type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]

type ResponsiveStyleValue[T] = T | (js.Array[T | scala.Null])

type StandardCSSProperties = typings.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]

/* Rewritten from type alias, can be one of: 
  - typings.styledSystemCss.mod.SystemCssProperties
  - typings.styledSystemCss.mod.CSSPseudoSelectorProps
  - typings.styledSystemCss.mod.CSSSelectorObject
  - typings.styledSystemCss.mod.VariantProperty
  - typings.styledSystemCss.mod.UseThemeFunction
  - typings.styledSystemCss.mod.EmotionLabel
  - scala.Null
*/
type SystemStyleObject = typings.styledSystemCss.mod._SystemStyleObject | scala.Null

/* Rewritten from type alias, can be one of: 
  - typings.styledSystemCss.anon.KinkeyofStandardCSSProper
  - typings.styledSystemCss.anon.PartialScaleThemeProperti
  - typings.styledSystemCss.mod.ThemeBreakPoints
  - org.scalablytyped.runtime.StringDictionary[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme * / js.Object]
*/
type Theme = typings.styledSystemCss.mod._Theme | (org.scalablytyped.runtime.StringDictionary[
/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object])

type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)])
