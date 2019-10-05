package typings.tern.ternMod

import typings.estree.estreeMod.Node
import typings.estree.estreeMod.Program
import typings.tern.libInferMod.Obj
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(ast: Program, scope: Scope, objType: Obj, propName: String, f: js.Function1[/* Node */ Node, Unit]): Unit = js.native
}

