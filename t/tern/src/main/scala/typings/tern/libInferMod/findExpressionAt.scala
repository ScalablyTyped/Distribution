package typings.tern.libInferMod

import typings.estree.estreeMod.Program
import typings.tern.Anon_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findExpressionAt")
@js.native
object findExpressionAt extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: Scope): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: Scope): Anon_Node | Null = js.native
}

