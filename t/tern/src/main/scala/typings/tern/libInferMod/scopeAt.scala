package typings.tern.libInferMod

import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "scopeAt")
@js.native
object scopeAt extends js.Object {
  def apply(ast: Program, pos: Double): Scope = js.native
  def apply(ast: Program, pos: Double, scope: Scope): Scope = js.native
}

