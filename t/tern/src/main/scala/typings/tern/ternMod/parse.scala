package typings.tern.ternMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "parse")
@js.native
object parse extends js.Object {
  def apply(text: String): Program = js.native
  def apply(text: String, options: js.Object): Program = js.native
}

