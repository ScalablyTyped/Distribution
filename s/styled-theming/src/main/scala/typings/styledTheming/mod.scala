package typings.styledTheming

import org.scalablytyped.runtime.StringDictionary
import typings.styledComponents.styledComponentsMod.FlattenInterpolation
import typings.styledComponents.styledComponentsMod.ThemeProps
import typings.styledComponents.styledComponentsMod.ThemedStyledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-theming", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(name: String, values: ThemeMap): ThemeSet = js.native
  def variants(name: String, prop: String, values: VariantMap): VariantSet = js.native
  type ThemeMap = StringDictionary[ThemeValue]
  type ThemeSet = js.Function1[/* props */ js.Object, String]
  type ThemeValue = ThemeValueFn | ThemeValueResult
  type ThemeValueFn = js.Function1[/* props */ js.Object, ThemeValueResult]
  type ThemeValueResult = String | (FlattenInterpolation[ThemeProps[js.Any] | (ThemedStyledProps[js.Any, js.Any])])
  type VariantMap = StringDictionary[ThemeMap]
  type VariantSet = js.Function1[/* props */ js.Object, String]
}

