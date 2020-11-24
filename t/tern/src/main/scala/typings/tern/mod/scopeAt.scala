package typings.tern.mod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "scopeAt")
@js.native
object scopeAt extends js.Object {
  
  def apply(ast: Program, pos: Double): typings.tern.inferMod.Scope = js.native
  def apply(ast: Program, pos: Double, scope: typings.tern.inferMod.Scope): typings.tern.inferMod.Scope = js.native
}
