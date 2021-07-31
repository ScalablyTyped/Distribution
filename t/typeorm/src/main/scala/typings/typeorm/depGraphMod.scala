package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depGraphMod {
  
  @JSImport("typeorm/browser/util/DepGraph", "DepGraph")
  @js.native
  class DepGraph () extends StObject {
    
    /**
      * Add a dependency between two nodes. If either of the nodes does not exist,
      * an Error will be thrown.
      */
    def addDependency(from: js.Any, to: js.Any): Boolean = js.native
    
    /**
      * Add a node to the dependency graph. If a node already exists, this method will do nothing.
      */
    def addNode(node: js.Any): Unit = js.native
    def addNode(node: js.Any, data: js.Any): Unit = js.native
    
    /**
      * get an array containing the nodes that depend on the specified node (transitively).
      *
      * Throws an Error if the graph has a cycle, or the specified node does not exist.
      *
      * If `leavesOnly` is true, only nodes that do not have any dependants will be returned in the array.
      */
    def dependantsOf(node: js.Any, leavesOnly: js.Any): js.Array[js.Any] = js.native
    
    /**
      * Get an array containing the nodes that the specified node depends on (transitively).
      *
      * Throws an Error if the graph has a cycle, or the specified node does not exist.
      *
      * If `leavesOnly` is true, only nodes that do not depend on any other nodes will be returned
      * in the array.
      */
    def dependenciesOf(node: js.Any, leavesOnly: js.Any): js.Array[js.Any] = js.native
    
    /**
      * Get the data associated with a node name
      */
    def getNodeData(node: js.Any): js.Any = js.native
    
    /**
      * Check if a node exists in the graph
      */
    def hasNode(node: js.Any): js.Any = js.native
    
    var incomingEdges: js.Any = js.native
    
    var nodes: js.Any = js.native
    
    var outgoingEdges: js.Any = js.native
    
    /**
      * Construct the overall processing order for the dependency graph.
      *
      * Throws an Error if the graph has a cycle.
      *
      * If `leavesOnly` is true, only nodes that do not depend on any other nodes will be returned.
      */
    def overallOrder(): js.Array[js.Any] = js.native
    def overallOrder(leavesOnly: js.Any): js.Array[js.Any] = js.native
    
    /**
      * Remove a dependency between two nodes.
      */
    def removeDependency(from: js.Any, to: js.Any): Unit = js.native
    
    /**
      * Remove a node from the dependency graph. If a node does not exist, this method will do nothing.
      */
    def removeNode(node: js.Any): Unit = js.native
    
    /**
      * Set the associated data for a given node name. If the node does not exist, this method will throw an error
      */
    def setNodeData(node: js.Any, data: js.Any): Unit = js.native
  }
}
