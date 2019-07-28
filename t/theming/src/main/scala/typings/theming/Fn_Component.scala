package typings.theming

import typings.react.reactMod.ComponentType
import typings.std.Exclude
import typings.std.Pick
import typings.theming.themingStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Component extends js.Object {
  def apply[P](component: ComponentType[P with Anon_Theme]): ComponentType[Pick[P, Exclude[String, theme]]] = js.native
}

