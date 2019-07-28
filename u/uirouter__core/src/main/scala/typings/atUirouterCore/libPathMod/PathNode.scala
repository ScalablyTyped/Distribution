package typings.atUirouterCore.libPathMod

import typings.atUirouterCore.libStateStateObjectMod.StateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/path", "PathNode")
@js.native
class PathNode protected ()
  extends typings.atUirouterCore.libPathPathNodeMod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typings.atUirouterCore.libPathPathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: StateObject) = this()
}

/* static members */
@JSImport("@uirouter/core/lib/path", "PathNode")
@js.native
object PathNode extends js.Object {
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  def clone(node: typings.atUirouterCore.libPathPathNodeMod.PathNode): typings.atUirouterCore.libPathPathNodeMod.PathNode = js.native
}

