package typings.theming.themingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theming", "createTheming")
@js.native
object createTheming extends js.Object {
  def apply[C /* <: String */](): Theming[C] = js.native
  def apply[C /* <: String */](customChannel: C): Theming[C] = js.native
}

