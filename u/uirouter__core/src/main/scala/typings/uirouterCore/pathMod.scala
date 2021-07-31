package typings.uirouterCore

import typings.uirouterCore.commonCommonMod.Predicate
import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.pathNodeMod.GetParamsFn
import typings.uirouterCore.stateMod.StateRegistry
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.targetStateMod.TargetState
import typings.uirouterCore.transitionInterfaceMod.TreeChanges
import typings.uirouterCore.viewViewMod.ViewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@uirouter/core/lib/path", "PathNode")
  @js.native
  class PathNode protected ()
    extends typings.uirouterCore.pathNodeMod.PathNode {
    /** Creates a copy of a PathNode */
    def this(node: typings.uirouterCore.pathNodeMod.PathNode) = this()
    /** Creates a new (empty) PathNode for a State */
    def this(state: StateObject) = this()
  }
  /* static members */
  object PathNode {
    
    @JSImport("@uirouter/core/lib/path", "PathNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a clone of the PathNode
      * @deprecated use instance method `node.clone()`
      */
    @scala.inline
    def clone(node: typings.uirouterCore.pathNodeMod.PathNode): typings.uirouterCore.pathNodeMod.PathNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.pathNodeMod.PathNode]
  }
  
  @JSImport("@uirouter/core/lib/path", "PathUtils")
  @js.native
  class PathUtils ()
    extends typings.uirouterCore.pathUtilsMod.PathUtils
  /* static members */
  object PathUtils {
    
    @JSImport("@uirouter/core/lib/path", "PathUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates ViewConfig objects and adds to nodes.
      *
      * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
      */
    @scala.inline
    def applyViewConfigs(
      $view: ViewService,
      path: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      states: js.Array[StateObject]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyViewConfigs")($view.asInstanceOf[js.Any], path.asInstanceOf[js.Any], states.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def buildPath(targetState: TargetState): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(targetState.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    
    /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
    @scala.inline
    def buildToPath(fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode], targetState: TargetState): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildToPath")(fromPath.asInstanceOf[js.Any], targetState.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    
    /**
      * Returns true if two paths are identical.
      *
      * @param pathA
      * @param pathB
      * @param paramsFn a function which returns the parameters to consider when comparing
      * @returns true if the the states and parameter values for both paths are identical
      */
    @scala.inline
    def equals(
      pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def equals(
      pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      paramsFn: GetParamsFn
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], paramsFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    @scala.inline
    def inheritParams(
      fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      toPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
    ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritParams")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    @scala.inline
    def inheritParams(
      fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      toPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      toKeys: js.Array[String]
    ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritParams")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any], toKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    
    /** Given a PathNode[], create an TargetState */
    @scala.inline
    def makeTargetState(registry: StateRegistry, path: js.Array[typings.uirouterCore.pathNodeMod.PathNode]): TargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTargetState")(registry.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TargetState]
    
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
    @scala.inline
    def matching(
      pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode]
    ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("matching")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    @scala.inline
    def matching(
      pathA: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      paramsFn: GetParamsFn
    ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("matching")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], paramsFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    
    @scala.inline
    def nonDynamicParams(node: typings.uirouterCore.pathNodeMod.PathNode): js.Array[Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonDynamicParams")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Param]]
    
    /** Gets the raw parameter values from a path */
    @scala.inline
    def paramValues(path: js.Array[typings.uirouterCore.pathNodeMod.PathNode]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("paramValues")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    @scala.inline
    def subPath(
      path: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      predicate: Predicate[typings.uirouterCore.pathNodeMod.PathNode]
    ): js.Array[typings.uirouterCore.pathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("subPath")(path.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.pathNodeMod.PathNode]]
    
    /**
      * Computes the tree changes (entering, exiting) between a fromPath and toPath.
      */
    @scala.inline
    def treeChanges(
      fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      toPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
      reloadState: StateObject
    ): TreeChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("treeChanges")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any], reloadState.asInstanceOf[js.Any])).asInstanceOf[TreeChanges]
  }
}
