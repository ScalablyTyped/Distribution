package typings.theming

import typings.theming.themingMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Theme extends js.Object {
  var theme: Theme
}

object Anon_Theme {
  @scala.inline
  def apply(theme: Theme): Anon_Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Theme]
  }
}

