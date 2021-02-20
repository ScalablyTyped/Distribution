package typings.vegaLite

import typings.std.Set
import typings.vegaLite.srcDataMod.DataSourceType
import typings.vegaLite.utilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataflowMod {
  
  @JSImport("vega-lite/build/src/compile/data/dataflow", "DataFlowNode")
  @js.native
  abstract class DataFlowNode protected () extends StObject {
    def this(parent: DataFlowNode) = this()
    def this(parent: DataFlowNode, debugName: String) = this()
    
    var _children: js.Any = js.native
    
    var _hash: String | Double = js.native
    
    var _parent: js.Any = js.native
    
    def addChild(child: DataFlowNode): Unit = js.native
    def addChild(child: DataFlowNode, loc: Double): Unit = js.native
    
    def children: js.Array[DataFlowNode] = js.native
    
    val debugName: js.UndefOr[String] = js.native
    
    /**
      * Set of fields that this node depends on.
      */
    def dependentFields(): Set[String] = js.native
    
    /**
      * Return a hash of the node.
      */
    def hash(): String | Double = js.native
    
    /**
      * Insert another node as a parent of this node.
      */
    def insertAsParentOf(other: DataFlowNode): Unit = js.native
    
    def numChildren(): Double = js.native
    
    def parent: DataFlowNode = js.native
    /**
      * Set the parent of the node and also add this node to the parent's children.
      */
    def parent_=(parent: DataFlowNode): Unit = js.native
    
    /**
      * Set of fields that are being created by this node.
      */
    def producedFields(): Set[String] = js.native
    
    /**
      * Remove node from the dataflow.
      */
    def remove(): Unit = js.native
    
    def removeChild(oldChild: DataFlowNode): Double = js.native
    
    def swapWithParent(): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/dataflow", "OutputNode")
  @js.native
  class OutputNode protected () extends DataFlowNode {
    /**
      * @param source The name of the source. Will change in assemble.
      * @param type The type of the output node.
      * @param refCounts A global ref counter map.
      */
    def this(parent: DataFlowNode, source: String, `type`: DataSourceType, refCounts: Dict[Double]) = this()
    
    var _name: js.Any = js.native
    
    var _source: js.Any = js.native
    
    /**
      * Request the datasource name and increase the ref counter.
      *
      * During the parsing phase, this will return the simple name such as 'main' or 'raw'.
      * It is crucial to request the name from an output node to mark it as a required node.
      * If nobody ever requests the name, this datasource will not be instantiated in the assemble phase.
      *
      * In the assemble phase, this will return the correct name.
      */
    def getSource(): String = js.native
    
    def isRequired(): Boolean = js.native
    
    val refCounts: js.Any = js.native
    
    def setSource(source: String): Unit = js.native
    
    val `type`: DataSourceType = js.native
  }
}
