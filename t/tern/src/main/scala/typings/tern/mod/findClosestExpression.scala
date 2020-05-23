package typings.tern.mod

import typings.estree.mod.Program
import typings.tern.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findClosestExpression")
@js.native
object findClosestExpression extends js.Object {
  def apply(ast: Program, start: js.UndefOr[Double], end: Double): Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[Double], end: Double, scope: typings.tern.inferMod.Scope): Node | Null = js.native
}

