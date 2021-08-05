package typings.uirouterCore

import typings.uirouterCore.commonCommonMod.Predicate
import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.pathNodeMod.GetParamsFn
import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.stateMod.StateRegistry
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.targetStateMod.TargetState
import typings.uirouterCore.transitionInterfaceMod.TreeChanges
import typings.uirouterCore.viewViewMod.ViewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathUtilsMod {
  
  @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils")
  @js.native
  class PathUtils () extends StObject
  /* static members */
  object PathUtils {
    
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates ViewConfig objects and adds to nodes.
      *
      * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
      */
    inline def applyViewConfigs($view: ViewService, path: js.Array[PathNode], states: js.Array[StateObject]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyViewConfigs")($view.asInstanceOf[js.Any], path.asInstanceOf[js.Any], states.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def buildPath(targetState: TargetState): js.Array[PathNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(targetState.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathNode]]
    
    /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
    inline def buildToPath(fromPath: js.Array[PathNode], targetState: TargetState): js.Array[PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildToPath")(fromPath.asInstanceOf[js.Any], targetState.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathNode]]
    
    /**
      * Returns true if two paths are identical.
      *
      * @param pathA
      * @param pathB
      * @param paramsFn a function which returns the parameters to consider when comparing
      * @returns true if the the states and parameter values for both paths are identical
      */
    inline def equals(pathA: js.Array[PathNode], pathB: js.Array[PathNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(pathA: js.Array[PathNode], pathB: js.Array[PathNode], paramsFn: GetParamsFn): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], paramsFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    inline def inheritParams(fromPath: js.Array[PathNode], toPath: js.Array[PathNode]): js.Array[PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritParams")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathNode]]
    inline def inheritParams(fromPath: js.Array[PathNode], toPath: js.Array[PathNode], toKeys: js.Array[String]): js.Array[PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritParams")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any], toKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathNode]]
    
    /** Given a PathNode[], create an TargetState */
    inline def makeTargetState(registry: StateRegistry, path: js.Array[PathNode]): TargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTargetState")(registry.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TargetState]
    
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
    inline def matching(pathA: js.Array[PathNode], pathB: js.Array[PathNode]): js.Array[PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("matching")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathNode]]
    inline def matching(pathA: js.Array[PathNode], pathB: js.Array[PathNode], paramsFn: GetParamsFn): js.Array[PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("matching")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], paramsFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathNode]]
    
    inline def nonDynamicParams(node: PathNode): js.Array[Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonDynamicParams")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Param]]
    
    /** Gets the raw parameter values from a path */
    inline def paramValues(path: js.Array[PathNode]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("paramValues")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    inline def subPath(path: js.Array[PathNode], predicate: Predicate[PathNode]): js.Array[PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("subPath")(path.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathNode]]
    
    /**
      * Computes the tree changes (entering, exiting) between a fromPath and toPath.
      */
    inline def treeChanges(fromPath: js.Array[PathNode], toPath: js.Array[PathNode], reloadState: StateObject): TreeChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("treeChanges")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any], reloadState.asInstanceOf[js.Any])).asInstanceOf[TreeChanges]
  }
}
