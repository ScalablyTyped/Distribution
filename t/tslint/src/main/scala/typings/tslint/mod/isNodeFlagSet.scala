package typings.tslint.mod

import typings.typescript.mod.Node
import typings.typescript.mod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "isNodeFlagSet")
@js.native
object isNodeFlagSet extends js.Object {
  
  def apply(node: Node, flagToCheck: NodeFlags): Boolean = js.native
}
