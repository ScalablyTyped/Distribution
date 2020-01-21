package typings.tslint.mod

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "someAncestor")
@js.native
object someAncestor extends js.Object {
  def apply(node: Node, predicate: js.Function1[/* n */ Node, Boolean]): Boolean = js.native
}

