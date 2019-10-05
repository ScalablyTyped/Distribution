package typings.styledDashTheming

import org.scalablytyped.runtime.StringDictionary
import typings.styledDashComponents.styledDashComponentsMod.FlattenInterpolation
import typings.styledDashComponents.styledDashComponentsMod.ThemeProps
import typings.styledDashComponents.styledDashComponentsMod.ThemedStyledProps
import typings.styledDashTheming.styledDashThemingMod.ThemeMap
import typings.styledDashTheming.styledDashThemingMod.ThemeSet
import typings.styledDashTheming.styledDashThemingMod.ThemeValue
import typings.styledDashTheming.styledDashThemingMod.ThemeValueFn
import typings.styledDashTheming.styledDashThemingMod.ThemeValueResult
import typings.styledDashTheming.styledDashThemingMod.VariantMap
import typings.styledDashTheming.styledDashThemingMod.VariantSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-theming", JSImport.Namespace)
@js.native
object styledDashThemingMod extends js.Object {
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

