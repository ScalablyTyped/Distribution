package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "PathNode")
@js.native
open class PathNode protected ()
  extends typings.uirouterCore.mod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typings.uirouterCore.libPathPathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typings.uirouterCore.libStateStateObjectMod.StateObject) = this()
}
/* static members */
object PathNode {
  
  @JSImport("@uirouter/angularjs", "PathNode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  inline def clone(node: typings.uirouterCore.libPathPathNodeMod.PathNode): typings.uirouterCore.libPathPathNodeMod.PathNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libPathPathNodeMod.PathNode]
}
