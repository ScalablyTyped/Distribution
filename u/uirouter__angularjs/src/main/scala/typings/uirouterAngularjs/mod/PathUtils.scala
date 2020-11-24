package typings.uirouterAngularjs.mod

import typings.uirouterCore.commonCommonMod.Predicate
import typings.uirouterCore.pathNodeMod.GetParamsFn
import typings.uirouterCore.transitionInterfaceMod.TreeChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "PathUtils")
@js.native
class PathUtils ()
  extends typings.uirouterCore.mod.PathUtils
/* static members */
@JSImport("@uirouter/angularjs", "PathUtils")
@js.native
object PathUtils extends js.Object {
  
  /**
    * Creates ViewConfig objects and adds to nodes.
    *
    * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
    */
  def applyViewConfigs(
    $view: typings.uirouterCore.viewViewMod.ViewService,
    path: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    states: js.Array[typings.uirouterCore.stateObjectMod.StateObject]
  ): Unit = js.native
  
  def buildPath(targetState: typings.uirouterCore.targetStateMod.TargetState): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  
  /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
  def buildToPath(
    fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    targetState: typings.uirouterCore.targetStateMod.TargetState
  ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  
  /**
    * Returns true if two paths are identical.
    *
    * @param pathA
    * @param pathB
    * @param paramsFn a function which returns the parameters to consider when comparing
    * @returns true if the the states and parameter values for both paths are identical
    */
  def equals(
    pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
  ): Boolean = js.native
  def equals(
    pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    paramsFn: GetParamsFn
  ): Boolean = js.native
  
  /**
    * Given a fromPath and a toPath, returns a new to path which inherits parameters from the fromPath
    *
    * For a parameter in a node to be inherited from the from path:
    * - The toPath's node must have a matching node in the fromPath (by state).
    * - The parameter name must not be found in the toKeys parameter array.
    *
    * Note: the keys provided in toKeys are intended to be those param keys explicitly specified by some
    * caller, for instance, $state.transitionTo(..., toParams).  If a key was found in toParams,
    * it is not inherited from the fromPath.
    */
  def inheritParams(
    fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    toPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
  ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  def inheritParams(
    fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    toPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    toKeys: js.Array[String]
  ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  
  /** Given a PathNode[], create an TargetState */
  def makeTargetState(
    registry: typings.uirouterCore.stateMod.StateRegistry,
    path: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
  ): typings.uirouterCore.targetStateMod.TargetState = js.native
  
  /**
    * Returns a new path which is: the subpath of the first path which matches the second path.
    *
    * The new path starts from root and contains any nodes that match the nodes in the second path.
    * It stops before the first non-matching node.
    *
    * Nodes are compared using their state property and their parameter values.
    * If a `paramsFn` is provided, only the [[Param]] returned by the function will be considered when comparing nodes.
    *
    * @param pathA the first path
    * @param pathB the second path
    * @param paramsFn a function which returns the parameters to consider when comparing
    *
    * @returns an array of PathNodes from the first path which match the nodes in the second path
    */
  def matching(
    pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
  ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  def matching(
    pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    paramsFn: GetParamsFn
  ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  
  def nonDynamicParams(node: typings.uirouterCore.pathNodeMod.PathNode): js.Array[typings.uirouterCore.paramMod.Param] = js.native
  
  /** Gets the raw parameter values from a path */
  def paramValues(path: js.Array[typings.uirouterCore.pathNodeMod.PathNode]): js.Any = js.native
  
  /**
    * Return a subpath of a path, which stops at the first matching node
    *
    * Given an array of nodes, returns a subset of the array starting from the first node,
    * stopping when the first node matches the predicate.
    *
    * @param path a path of [[PathNode]]s
    * @param predicate a [[Predicate]] fn that matches [[PathNode]]s
    * @returns a subpath up to the matching node, or undefined if no match is found
    */
  def subPath(
    path: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    predicate: Predicate[typings.uirouterCore.pathNodeMod.PathNode]
  ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = js.native
  
  /**
    * Computes the tree changes (entering, exiting) between a fromPath and toPath.
    */
  def treeChanges(
    fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    toPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    reloadState: typings.uirouterCore.stateObjectMod.StateObject
  ): TreeChanges = js.native
}
