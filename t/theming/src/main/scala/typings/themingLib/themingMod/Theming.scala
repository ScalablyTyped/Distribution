package typings
package themingLib.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theming[C /* <: java.lang.String */] extends js.Object {
  var ThemeProvider: ThemeProvider = js.native
  var channel: C = js.native
  var themeListener: ThemeListener[C] = js.native
  @JSName("withTheme")
  var withTheme_Original: themingLib.Anon_Component = js.native
  def withTheme[P](component: reactLib.reactMod.ReactNs.ComponentType[P with themingLib.Anon_Theme]): reactLib.reactMod.ReactNs.ComponentType[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, themingLib.themingLibStrings.theme]]
  ] = js.native
}

