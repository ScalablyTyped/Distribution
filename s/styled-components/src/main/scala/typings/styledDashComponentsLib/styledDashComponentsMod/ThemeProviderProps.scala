package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactChild] = js.undefined
   // only one child is allowed, goes through React.Children.only
  var theme: T | (js.Function1[/* theme */ U, T])
}

object ThemeProviderProps {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](theme: T | (js.Function1[/* theme */ U, T]), children: reactLib.reactMod.ReactNs.ReactChild = null): ThemeProviderProps[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T, U]]
  }
}

