package typings.tern.inferMod

import typings.estree.mod.Program
import typings.tern.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findExpressionAround")
@js.native
object findExpressionAround extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: Scope): Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: Scope): Node | Null = js.native
}

