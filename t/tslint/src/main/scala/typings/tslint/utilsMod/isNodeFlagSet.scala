package typings.tslint.utilsMod

import typings.typescript.mod.Node
import typings.typescript.mod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isNodeFlagSet")
@js.native
object isNodeFlagSet extends js.Object {
  def apply(node: Node, flagToCheck: NodeFlags): Boolean = js.native
}

