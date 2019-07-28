package typings.theming.themingMod

import typings.theming.Fn_Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming[C /* <: String */] extends js.Object {
  var ThemeProvider: typings.theming.themingMod.ThemeProvider
  var channel: C
  var themeListener: ThemeListener[C]
  var withTheme: Fn_Component
}

object Theming {
  @scala.inline
  def apply[C /* <: String */](ThemeProvider: ThemeProvider, channel: C, themeListener: ThemeListener[C], withTheme: Fn_Component): Theming[C] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider, channel = channel.asInstanceOf[js.Any], themeListener = themeListener, withTheme = withTheme)
  
    __obj.asInstanceOf[Theming[C]]
  }
}

