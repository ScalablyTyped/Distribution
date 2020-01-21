package typings.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme[T /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object AnonTheme {
  @scala.inline
  def apply[T /* <: js.Object */](theme: T = null): AnonTheme[T] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheme[T]]
  }
}

