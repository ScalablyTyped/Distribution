package typings.tern.ternMod

import typings.estree.estreeMod.Program
import typings.tern.Anon_Node
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findExpressionAround")
@js.native
object findExpressionAround extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: Scope): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: Scope): Anon_Node | Null = js.native
}

