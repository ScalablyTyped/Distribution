package typings.tern.inferMod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern/lib/infer", "scopeAt")
@js.native
object scopeAt extends js.Object {
  
  def apply(ast: Program, pos: Double): Scope = js.native
  def apply(ast: Program, pos: Double, scope: Scope): Scope = js.native
}
