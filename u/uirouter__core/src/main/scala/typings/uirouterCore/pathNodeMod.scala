package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.resolvableMod.Resolvable
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.uirouterCoreBooleans.`false`
import typings.uirouterCore.viewInterfaceMod.ViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathNodeMod {
  
  @JSImport("@uirouter/core/lib/path/pathNode", "PathNode")
  @js.native
  class PathNode protected () extends StObject {
    /** Creates a copy of a PathNode */
    def this(node: PathNode) = this()
    /** Creates a new (empty) PathNode for a State */
    def this(state: StateObject) = this()
    
    /** Sets [[paramValues]] for the node, from the values of an object hash */
    def applyRawParams(params: RawParams): PathNode = js.native
    
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
    def diff(node: PathNode): js.Array[Param] | `false` = js.native
    def diff(node: PathNode, paramsFn: GetParamsFn): js.Array[Param] | `false` = js.native
    
    /**
      * @returns true if the state and parameter values for another PathNode are
      * equal to the state and param values for this PathNode
      */
    def equals(node: PathNode): Boolean = js.native
    def equals(node: PathNode, paramsFn: GetParamsFn): Boolean = js.native
    
    /** The parameters declared on the state */
    var paramSchema: js.Array[Param] = js.native
    
    /** The parameter values that belong to the state */
    var paramValues: StringDictionary[js.Any] = js.native
    
    /** Gets a specific [[Param]] metadata that belongs to the node */
    def parameter(name: String): Param = js.native
    
    /** The individual (stateful) resolvable objects that belong to the state */
    var resolvables: js.Array[Resolvable] = js.native
    
    /** The state being entered, exited, or retained */
    var state: StateObject = js.native
    
    /** The state's declared view configuration objects */
    var views: js.Array[ViewConfig] = js.native
  }
  /* static members */
  object PathNode {
    
    @JSImport("@uirouter/core/lib/path/pathNode", "PathNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a clone of the PathNode
      * @deprecated use instance method `node.clone()`
      */
    @scala.inline
    def clone(node: PathNode): PathNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[PathNode]
  }
  
  type GetParamsFn = js.Function1[/* pathNode */ PathNode, js.Array[Param]]
}
