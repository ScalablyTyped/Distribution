package typings
package themingLib.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theming", JSImport.Namespace)
@js.native
object themingModMembers extends js.Object {
  val channel: themingLib.themingLibStrings.`__THEMING__` = js.native
  val themeListener: ThemeListener[themingLib.themingLibStrings.`__THEMING__`] = js.native
  def createTheming[C /* <: java.lang.String */](): Theming[C] = js.native
  def createTheming[C /* <: java.lang.String */](customChannel: C): Theming[C] = js.native
  def withTheme[P](component: reactLib.reactMod.ReactNs.ComponentType[P with themingLib.Anon_Theme]): reactLib.reactMod.ReactNs.ComponentType[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, themingLib.themingLibStrings.theme]]
  ] = js.native
}

