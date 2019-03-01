package typings
package themingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Theme extends js.Object {
  var theme: themingLib.themingMod.Theme
}

object Anon_Theme {
  @scala.inline
  def apply(theme: themingLib.themingMod.Theme): Anon_Theme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Theme]
  }
}

