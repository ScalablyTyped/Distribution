package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps[T] extends js.Object {
  var theme: T
}

object ThemeProps {
  @scala.inline
  def apply[T](theme: T): ThemeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProps[T]]
  }
}

