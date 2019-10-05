package typings.tern.ternMod

import typings.estree.estreeMod.Node
import typings.estree.estreeMod.Program
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findRefs")
@js.native
object findRefs extends js.Object {
  def apply(
    ast: Program,
    scope: Scope,
    name: String,
    refScope: Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ Scope, Unit]
  ): Unit = js.native
}

