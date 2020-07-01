package typings.styledTheming

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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
  def variants[TProp /* <: String */, TVariant /* <: String */](name: String, prop: TProp, values: VariantMap[TVariant]): VariantSet[TProp, TVariant] = js.native
  type ThemeMap = StringDictionary[ThemeValue]
  type ThemeSet = js.Function1[/* props */ js.Object, String]
  type ThemeValue = ThemeValueFn | ThemeValueResult
  type ThemeValueFn = js.Function1[/* props */ js.Object, ThemeValueResult]
  type ThemeValueResult = String | (FlattenInterpolation[ThemeProps[js.Any] | (ThemedStyledProps[js.Any, js.Any])])
  type VariantMap[TVariant /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in TVariant ]: styled-theming.styled-theming.ThemeMap}
    */ typings.styledTheming.styledThemingStrings.VariantMap with TopLevel[js.Any]
  type VariantSet[TProp /* <: String */, TVariant /* <: String */] = js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in TProp ]:? TVariant}
    */ /* props */ typings.styledTheming.styledThemingStrings.VariantSet with TopLevel[js.Any], 
    String
  ]
}

