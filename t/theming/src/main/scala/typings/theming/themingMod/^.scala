package typings.theming.themingMod

import typings.react.reactMod.ComponentType
import typings.std.Exclude
import typings.std.Pick
import typings.theming.Anon_Theme
import typings.theming.themingStrings.__THEMING__
import typings.theming.themingStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theming", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val channel: __THEMING__ = js.native
  val themeListener: ThemeListener[__THEMING__] = js.native
  def createTheming[C /* <: String */](): Theming[C] = js.native
  def createTheming[C /* <: String */](customChannel: C): Theming[C] = js.native
  def withTheme[P](component: ComponentType[P with Anon_Theme]): ComponentType[Pick[P, Exclude[String, theme]]] = js.native
}

