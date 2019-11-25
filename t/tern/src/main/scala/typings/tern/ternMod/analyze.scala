package typings.tern.ternMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "analyze")
@js.native
object analyze extends js.Object {
  def apply(ast: Program, name: String): Unit = js.native
  def apply(ast: Program, name: String, scope: typings.tern.libInferMod.Scope): Unit = js.native
}

