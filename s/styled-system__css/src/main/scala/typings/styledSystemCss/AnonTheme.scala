package typings.styledSystemCss

import typings.styledSystemCss.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme extends js.Object {
  var theme: Theme
}

object AnonTheme {
  @scala.inline
  def apply(theme: Theme): AnonTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheme]
  }
}

