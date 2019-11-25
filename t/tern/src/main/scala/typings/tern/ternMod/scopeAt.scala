package typings.tern.ternMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "scopeAt")
@js.native
object scopeAt extends js.Object {
  def apply(ast: Program, pos: Double): typings.tern.libInferMod.Scope = js.native
  def apply(ast: Program, pos: Double, scope: typings.tern.libInferMod.Scope): typings.tern.libInferMod.Scope = js.native
}

