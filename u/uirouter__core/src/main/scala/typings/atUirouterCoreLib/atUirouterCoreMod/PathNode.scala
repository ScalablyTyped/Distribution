package typings
package atUirouterCoreLib.atUirouterCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "PathNode")
@js.native
class PathNode protected ()
  extends atUirouterCoreLib.libPathMod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: atUirouterCoreLib.libPathPathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: atUirouterCoreLib.libStateStateObjectMod.StateObject) = this()
}

@JSImport("@uirouter/core", "PathNode")
@js.native
object PathNode extends js.Object {
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  def clone(node: atUirouterCoreLib.libPathPathNodeMod.PathNode): atUirouterCoreLib.libPathPathNodeMod.PathNode = js.native
}

