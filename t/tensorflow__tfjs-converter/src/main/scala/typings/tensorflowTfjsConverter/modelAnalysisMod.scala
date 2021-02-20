package typings.tensorflowTfjsConverter

import typings.std.Set
import typings.tensorflowTfjsConverter.operationsTypesMod.Graph
import typings.tensorflowTfjsConverter.operationsTypesMod.Node
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelAnalysisMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "getExecutionSubgraph")
  @js.native
  def getExecutionSubgraph(inputs: NamedTensorMap, outputs: js.Array[Node], weightMap: NamedTensorsMap): ExecutionInfo = js.native
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "getExecutionSubgraph")
  @js.native
  def getExecutionSubgraph(
    inputs: NamedTensorMap,
    outputs: js.Array[Node],
    weightMap: NamedTensorsMap,
    initNodes: js.Array[Node]
  ): ExecutionInfo = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "getNodesInTopologicalOrder")
  @js.native
  def getNodesInTopologicalOrder(graph: Graph, weightMap: NamedTensorsMap, executionInfo: ExecutionInfo): js.Array[Node] = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "isControlFlow")
  @js.native
  def isControlFlow(node: Node): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "isDynamicShape")
  @js.native
  def isDynamicShape(node: Node): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", "isHashTable")
  @js.native
  def isHashTable(node: Node): Boolean = js.native
  
  @js.native
  trait ExecutionInfo extends StObject {
    
    var dynamicNode: Node = js.native
    
    var inputs: NamedTensorMap = js.native
    
    var missingInputs: js.Array[String] = js.native
    
    var outputs: js.Array[Node] = js.native
    
    var syncInputs: js.Array[String] = js.native
    
    var usedNodes: Set[String] = js.native
  }
  object ExecutionInfo {
    
    @scala.inline
    def apply(
      dynamicNode: Node,
      inputs: NamedTensorMap,
      missingInputs: js.Array[String],
      outputs: js.Array[Node],
      syncInputs: js.Array[String],
      usedNodes: Set[String]
    ): ExecutionInfo = {
      val __obj = js.Dynamic.literal(dynamicNode = dynamicNode.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], missingInputs = missingInputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], syncInputs = syncInputs.asInstanceOf[js.Any], usedNodes = usedNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionInfo]
    }
    
    @scala.inline
    implicit class ExecutionInfoMutableBuilder[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicNode(value: Node): Self = StObject.set(x, "dynamicNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: NamedTensorMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingInputs(value: js.Array[String]): Self = StObject.set(x, "missingInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingInputsVarargs(value: String*): Self = StObject.set(x, "missingInputs", js.Array(value :_*))
      
      @scala.inline
      def setOutputs(value: js.Array[Node]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsVarargs(value: Node*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setSyncInputs(value: js.Array[String]): Self = StObject.set(x, "syncInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncInputsVarargs(value: String*): Self = StObject.set(x, "syncInputs", js.Array(value :_*))
      
      @scala.inline
      def setUsedNodes(value: Set[String]): Self = StObject.set(x, "usedNodes", value.asInstanceOf[js.Any])
    }
  }
}
