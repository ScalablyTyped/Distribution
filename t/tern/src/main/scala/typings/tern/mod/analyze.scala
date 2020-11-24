package typings.tern.mod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "analyze")
@js.native
object analyze extends js.Object {
  
  def apply(ast: Program, name: String): Unit = js.native
  def apply(ast: Program, name: String, scope: typings.tern.inferMod.Scope): Unit = js.native
}
