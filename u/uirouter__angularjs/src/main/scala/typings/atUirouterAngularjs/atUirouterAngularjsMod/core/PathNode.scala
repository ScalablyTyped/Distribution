package typings.atUirouterAngularjs.atUirouterAngularjsMod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.PathNode")
@js.native
class PathNode protected ()
  extends typings.atUirouterCore.atUirouterCoreMod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typings.atUirouterCore.libPathPathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typings.atUirouterCore.libStateStateObjectMod.StateObject) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "core.PathNode")
@js.native
object PathNode extends js.Object {
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  def clone(node: typings.atUirouterCore.libPathPathNodeMod.PathNode): typings.atUirouterCore.libPathPathNodeMod.PathNode = js.native
}

