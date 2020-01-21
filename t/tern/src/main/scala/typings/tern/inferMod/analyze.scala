package typings.tern.inferMod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "analyze")
@js.native
object analyze extends js.Object {
  def apply(ast: Program, name: String): Unit = js.native
  def apply(ast: Program, name: String, scope: Scope): Unit = js.native
}

