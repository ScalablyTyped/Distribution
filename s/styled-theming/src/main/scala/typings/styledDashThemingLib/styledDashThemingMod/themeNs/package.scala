package typings
package styledDashThemingLib.styledDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themeNs {
  type ThemeSet = js.Function1[/* props */ js.Object, java.lang.String]
  type ThemeValue = java.lang.String | ThemeValueFn
  type ThemeValueFn = js.Function1[/* props */ js.Object, java.lang.String]
  type VariantSet = js.Function1[/* props */ js.Object, java.lang.String]
}
