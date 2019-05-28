package typings
package themingLib.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming[C /* <: java.lang.String */] extends js.Object {
  var ThemeProvider: themingLib.themingMod.ThemeProvider
  var channel: C
  var themeListener: ThemeListener[C]
  var withTheme: themingLib.Fn_Component
}

object Theming {
  @scala.inline
  def apply[C /* <: java.lang.String */](
    ThemeProvider: ThemeProvider,
    channel: C,
    themeListener: ThemeListener[C],
    withTheme: themingLib.Fn_Component
  ): Theming[C] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider, channel = channel.asInstanceOf[js.Any], themeListener = themeListener, withTheme = withTheme)
  
    __obj.asInstanceOf[Theming[C]]
  }
}

