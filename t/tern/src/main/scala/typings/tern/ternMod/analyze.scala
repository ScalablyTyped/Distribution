package typings.tern.ternMod

import typings.estree.estreeMod.Program
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "analyze")
@js.native
object analyze extends js.Object {
  def apply(ast: Program, name: String): Unit = js.native
  def apply(ast: Program, name: String, scope: Scope): Unit = js.native
}

