package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ThemeT[T] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object Anon_ThemeT {
  @scala.inline
  def apply[T](theme: T = null): Anon_ThemeT[T] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ThemeT[T]]
  }
}

