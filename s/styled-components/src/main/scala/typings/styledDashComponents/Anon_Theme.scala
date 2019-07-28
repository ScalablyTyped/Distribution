package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Theme[T /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object Anon_Theme {
  @scala.inline
  def apply[T /* <: js.Object */](theme: T = null): Anon_Theme[T] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Theme[T]]
  }
}

