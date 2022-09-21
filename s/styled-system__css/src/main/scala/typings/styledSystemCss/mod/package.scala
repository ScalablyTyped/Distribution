package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.PropertiesFallback
import typings.std.Exclude
import typings.std.Pick
import typings.styledSystemCss.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CssFunctionReturnType]
inline def default(input: SystemStyleObject): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[CssFunctionReturnType]

inline def css(): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[CssFunctionReturnType]
inline def css(input: SystemStyleObject): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(input.asInstanceOf[js.Any]).asInstanceOf[CssFunctionReturnType]

inline def get(`object`: js.Object, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def get(`object`: js.Object, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def get(`object`: js.Object, key: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def get(`object`: js.Object, key: js.Array[String], defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def responsive(styles: js.Object): js.Function1[/* theme */ js.Object, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("responsive")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* theme */ js.Object, js.Array[Any]]]

type CSSInterpolation = js.UndefOr[Double | String | CSSObject]

type CSSOthersObjectForCSSObject = StringDictionary[CSSInterpolation]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type ResponsiveStyleValue[T] = T | (js.Array[T | Null])

type StandardCSSProperties = PropertiesFallback[Double | String, String]

/* Rewritten from type alias, can be one of: 
  - typings.styledSystemCss.mod.SystemCssProperties
  - typings.styledSystemCss.mod.CSSPseudoSelectorProps
  - typings.styledSystemCss.mod.CSSSelectorObject
  - typings.styledSystemCss.mod.VariantProperty
  - typings.styledSystemCss.mod.UseThemeFunction
  - typings.styledSystemCss.mod.EmotionLabel
  - scala.Null
*/
type SystemStyleObject = _SystemStyleObject | Null

/* Rewritten from type alias, can be one of: 
  - typings.styledSystemCss.anon.KinkeyofStandardCSSProper
  - typings.styledSystemCss.anon.PartialScaleThemeProperti
  - typings.styledSystemCss.mod.ThemeBreakPoints
  - org.scalablytyped.runtime.StringDictionary[scala.Any]
*/
type Theme = _Theme | StringDictionary[Any]

type ThemeValue[T] = js.Array[T] | (StringDictionary[T | Any])
