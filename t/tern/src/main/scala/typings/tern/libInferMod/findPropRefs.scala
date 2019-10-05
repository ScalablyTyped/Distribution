package typings.tern.libInferMod

import typings.estree.estreeMod.Node
import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(ast: Program, scope: Scope, objType: Obj, propName: String, f: js.Function1[/* Node */ Node, Unit]): Unit = js.native
}

