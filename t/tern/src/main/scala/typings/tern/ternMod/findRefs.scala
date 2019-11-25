package typings.tern.ternMod

import typings.estree.estreeMod.Node
import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findRefs")
@js.native
object findRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typings.tern.libInferMod.Scope,
    name: String,
    refScope: typings.tern.libInferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typings.tern.libInferMod.Scope, Unit]
  ): Unit = js.native
}

