package typings
package styledDashThemingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashThemingMod {
  type ThemeMap = org.scalablytyped.runtime.StringDictionary[ThemeValue]
  type ThemeSet = js.Function1[/* props */ js.Object, java.lang.String]
  type ThemeValue = java.lang.String | ThemeValueFn | styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[styledDashComponentsLib.styledDashComponentsMod.ThemeProps[js.Any]] | (styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Any, js.Any]
  ])
  type ThemeValueFn = js.Function1[/* props */ js.Object, java.lang.String]
  type VariantMap = org.scalablytyped.runtime.StringDictionary[ThemeMap]
  type VariantSet = js.Function1[/* props */ js.Object, java.lang.String]
}
