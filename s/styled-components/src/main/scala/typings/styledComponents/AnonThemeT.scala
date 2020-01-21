package typings.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeT[T] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object AnonThemeT {
  @scala.inline
  def apply[T](theme: T = null): AnonThemeT[T] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeT[T]]
  }
}

