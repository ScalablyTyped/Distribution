package typings
package atUirouterCoreLib.libPathPathNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/path/pathNode", "PathNode")
@js.native
class PathNode protected () extends js.Object {
  /** Creates a copy of a PathNode */
  def this(node: PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: atUirouterCoreLib.libStateStateObjectMod.StateObject) = this()
  /** The parameters declared on the state */
  var paramSchema: js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
  /** The parameter values that belong to the state */
  var paramValues: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /** The individual (stateful) resolvable objects that belong to the state */
  var resolvables: js.Array[atUirouterCoreLib.libResolveResolvableMod.Resolvable] = js.native
  /** The state being entered, exited, or retained */
  var state: atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  /** The state's declared view configuration objects */
  var views: js.Array[atUirouterCoreLib.libViewInterfaceMod.ViewConfig] = js.native
  /** Sets [[paramValues]] for the node, from the values of an object hash */
  def applyRawParams(params: atUirouterCoreLib.libParamsInterfaceMod.RawParams): PathNode = js.native
  /**
       * Finds Params with different parameter values on another PathNode.
       *
       * Given another node (of the same state), finds the parameter values which differ.
       * Returns the [[Param]] (schema objects) whose parameter values differ.
       *
       * Given another node for a different state, returns `false`
       *
       * @param node The node to compare to
       * @param paramsFn A function that returns which parameters should be compared.
       * @returns The [[Param]]s which differ, or null if the two nodes are for different states
       */
  def diff(node: PathNode): js.Array[atUirouterCoreLib.libParamsParamMod.Param] | atUirouterCoreLib.atUirouterCoreLibNumbers.`false` = js.native
  /**
       * Finds Params with different parameter values on another PathNode.
       *
       * Given another node (of the same state), finds the parameter values which differ.
       * Returns the [[Param]] (schema objects) whose parameter values differ.
       *
       * Given another node for a different state, returns `false`
       *
       * @param node The node to compare to
       * @param paramsFn A function that returns which parameters should be compared.
       * @returns The [[Param]]s which differ, or null if the two nodes are for different states
       */
  def diff(node: PathNode, paramsFn: GetParamsFn): js.Array[atUirouterCoreLib.libParamsParamMod.Param] | atUirouterCoreLib.atUirouterCoreLibNumbers.`false` = js.native
  /**
       * @returns true if the state and parameter values for another PathNode are
       * equal to the state and param values for this PathNode
       */
  def equals(node: PathNode): scala.Boolean = js.native
  /**
       * @returns true if the state and parameter values for another PathNode are
       * equal to the state and param values for this PathNode
       */
  def equals(node: PathNode, paramsFn: GetParamsFn): scala.Boolean = js.native
  /** Gets a specific [[Param]] metadata that belongs to the node */
  def parameter(name: java.lang.String): atUirouterCoreLib.libParamsParamMod.Param = js.native
}

@JSImport("@uirouter/core/lib/path/pathNode", "PathNode")
@js.native
object PathNode extends js.Object {
  /**
       * Returns a clone of the PathNode
       * @deprecated use instance method `node.clone()`
       */
  def clone(node: atUirouterCoreLib.libPathPathNodeMod.PathNode): atUirouterCoreLib.libPathPathNodeMod.PathNode = js.native
}

