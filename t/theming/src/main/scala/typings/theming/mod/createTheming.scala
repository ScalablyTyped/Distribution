package typings.theming.mod

import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theming", "createTheming")
@js.native
object createTheming extends js.Object {
  def apply[Theme](context: Context[Theme]): Theming[Theme] = js.native
}

