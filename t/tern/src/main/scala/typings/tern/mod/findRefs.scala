package typings.tern.mod

import typings.estree.mod.Node
import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "findRefs")
@js.native
object findRefs extends js.Object {
  
  def apply(
    ast: Program,
    scope: typings.tern.inferMod.Scope,
    name: String,
    refScope: typings.tern.inferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typings.tern.inferMod.Scope, Unit]
  ): Unit = js.native
}
