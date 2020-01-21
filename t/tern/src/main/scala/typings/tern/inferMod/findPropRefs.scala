package typings.tern.inferMod

import typings.estree.mod.Node
import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(ast: Program, scope: Scope, objType: Obj, propName: String, f: js.Function1[/* Node */ Node, Unit]): Unit = js.native
}

