package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined styled-components.styled-components.WithOptionalTheme<react.react.ComponentPropsWithRef<C>, T> */
trait WithOptionalThemeComponentPropsWithRefCT[T /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object WithOptionalThemeComponentPropsWithRefCT {
  @scala.inline
  def apply[T /* <: js.Object */](theme: T = null): WithOptionalThemeComponentPropsWithRefCT[T] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithOptionalThemeComponentPropsWithRefCT[T]]
  }
}

