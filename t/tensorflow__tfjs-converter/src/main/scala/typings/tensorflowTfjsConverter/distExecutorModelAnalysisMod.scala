package typings.tensorflowTfjsConverter

import typings.std.Set
import typings.tensorflowTfjsConverter.distDataTypesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.distOperationsTypesMod.Graph
import typings.tensorflowTfjsConverter.distOperationsTypesMod.Node
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExecutorModelAnalysisMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/model_analysis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExecutionSubgraph(inputs: NamedTensorMap, outputs: js.Array[Node], weightMap: NamedTensorsMap): ExecutionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getExecutionSubgraph")(inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], weightMap.asInstanceOf[js.Any])).asInstanceOf[ExecutionInfo]
  inline def getExecutionSubgraph(
    inputs: NamedTensorMap,
    outputs: js.Array[Node],
    weightMap: NamedTensorsMap,
    initNodes: js.Array[Node]
  ): ExecutionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getExecutionSubgraph")(inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], weightMap.asInstanceOf[js.Any], initNodes.asInstanceOf[js.Any])).asInstanceOf[ExecutionInfo]
  
  inline def getNodesInTopologicalOrder(graph: Graph, weightMap: NamedTensorsMap, executionInfo: ExecutionInfo): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodesInTopologicalOrder")(graph.asInstanceOf[js.Any], weightMap.asInstanceOf[js.Any], executionInfo.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def isControlFlow(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isControlFlow")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDynamicShape(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicShape")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHashTable(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHashTable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ExecutionInfo extends StObject {
    
    var dynamicNode: Node
    
    var inputs: NamedTensorMap
    
    var missingInputs: js.Array[String]
    
    var outputs: js.Array[Node]
    
    var syncInputs: js.Array[String]
    
    var usedNodes: Set[String]
  }
  object ExecutionInfo {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ExecutionInfo] (val x: Self) extends AnyVal {
      
      inline def setDynamicNode(value: Node): Self = StObject.set(x, "dynamicNode", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: NamedTensorMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setMissingInputs(value: js.Array[String]): Self = StObject.set(x, "missingInputs", value.asInstanceOf[js.Any])
      
      inline def setMissingInputsVarargs(value: String*): Self = StObject.set(x, "missingInputs", js.Array(value*))
      
      inline def setOutputs(value: js.Array[Node]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: Node*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setSyncInputs(value: js.Array[String]): Self = StObject.set(x, "syncInputs", value.asInstanceOf[js.Any])
      
      inline def setSyncInputsVarargs(value: String*): Self = StObject.set(x, "syncInputs", js.Array(value*))
      
      inline def setUsedNodes(value: Set[String]): Self = StObject.set(x, "usedNodes", value.asInstanceOf[js.Any])
    }
  }
}
