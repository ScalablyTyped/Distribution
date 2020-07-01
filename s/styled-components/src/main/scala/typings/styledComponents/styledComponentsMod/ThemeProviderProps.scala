package typings.styledComponents.styledComponentsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var theme: T | (js.Function1[/* theme */ U, T])
}

object ThemeProviderProps {
  @scala.inline
  def apply[/* <: js.Object */ T, /* <: js.Object */ U](theme: T | (js.Function1[/* theme */ U, T]), children: ReactNode = null): ThemeProviderProps[T, U] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T, U]]
  }
}

