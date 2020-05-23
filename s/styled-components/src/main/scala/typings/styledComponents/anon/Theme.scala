package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme[T /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object Theme {
  @scala.inline
  def apply[T](theme: T = null): Theme[T] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[T]]
  }
}

