package typings.tern.mod

import typings.estree.mod.Node
import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typings.tern.inferMod.Scope,
    objType: typings.tern.inferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
}

