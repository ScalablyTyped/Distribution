package typings.tern.ternMod

import typings.estree.estreeMod.Program
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "scopeAt")
@js.native
object scopeAt extends js.Object {
  def apply(ast: Program, pos: Double): Scope = js.native
  def apply(ast: Program, pos: Double, scope: Scope): Scope = js.native
}

