package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import typings.tensorflowTfjsConverter.executorTypesMod.FunctionExecutor
import typings.tensorflowTfjsConverter.operationsTypesMod.Graph
import typings.tensorflowTfjsConverter.resourceManagerMod.ResourceManager
import typings.tensorflowTfjsConverter.typesMod.TensorInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/executor/graph_executor", JSImport.Namespace)
@js.native
object graphExecutorMod extends js.Object {
  
  @js.native
  class GraphExecutor protected () extends FunctionExecutor {
    /**
      *
      * @param graph Graph the model or function graph to be executed.
      * @param parent When building function exector you need to set the parent
      * executor. Since the weights and function executor maps are set at parant
      * level, that function executor can access the function maps and weight maps
      * through the parent.
      */
    def this(graph: Graph) = this()
    def this(graph: Graph, parent: GraphExecutor) = this()
    
    var SEPERATOR: js.Any = js.native
    
    /**
      * Executes the inference for given input tensors in Async fashion.
      * @param inputs Tensor map for the model inputs, keyed by the input node
      * names.
      * @param outputs Optional. output node name from the Tensorflow model,
      * if no outputs are specified, the default outputs of the model would be
      * used. You can inspect intermediate nodes of the model by adding them to the
      * outputs array.
      * @param isFunctionExecution Optional. Flag for executing a function.
      * @param tensorArrayMap Optional, global TensorArray map by id. Used for
      * function execution.
      * @param tensorArrayMap Optinal global TensorList map by id. Used for
      * function execution.
      */
    var _executeAsync: js.Any = js.native
    
    var _functionExecutorMap: js.Any = js.native
    
    var _functions: js.Any = js.native
    
    var _initNodes: js.Any = js.native
    
    var _inputs: js.Any = js.native
    
    var _outputs: js.Any = js.native
    
    var _resourceManager: js.Any = js.native
    
    var _signature: js.Any = js.native
    
    var _weightIds: js.Any = js.native
    
    var _weightMap: js.Any = js.native
    
    var checkInputShapeAndType: js.Any = js.native
    
    var checkInputs: js.Any = js.native
    
    var checkOutputs: js.Any = js.native
    
    var checkTensorForDisposal: js.Any = js.native
    
    /**
      * Compiles the inference graph and returns the minimal set of nodes that are
      * required for execution, in the correct execution order.
      */
    var compile: js.Any = js.native
    
    var compiledMap: js.Any = js.native
    
    /**
      * Releases the memory used by the weight tensors.
      */
    def dispose(): Unit = js.native
    
    /**
      * Executes the inference for given input tensors.
      * @param inputs Tensor map for the model inputs, keyed by the input node
      * names.
      * @param outputs Optional. output node name from the Tensorflow model, if
      * no outputs are specified, the default outputs of the model would be used.
      * You can inspect intermediate nodes of the model by adding them to the
      * outputs array.
      */
    def execute(inputs: NamedTensorMap): js.Array[Tensor[Rank]] = js.native
    def execute(inputs: NamedTensorMap, outputs: js.Array[String]): js.Array[Tensor[Rank]] = js.native
    
    /**
      * Executes the inference for given input tensors in Async fashion.
      * @param inputs Tensor map for the model inputs, keyed by the input node
      * names.
      * @param outputs output node name from the Tensorflow model, if no outputs
      * are specified, the default outputs of the model would be used. You can
      * inspect intermediate nodes of the model by adding them to the outputs
      * array.
      */
    def executeAsync(inputs: NamedTensorMap): js.Promise[js.Array[Tensor[Rank]]] = js.native
    def executeAsync(inputs: NamedTensorMap, outputs: js.Array[String]): js.Promise[js.Array[Tensor[Rank]]] = js.native
    
    /**
      * When there are control flow nodes in the graph, the graph execution use
      * ExecutionContext to keep track of the frames and loop iterators.
      * @param inputs placeholder tensors for the graph.
      * @param context the execution context object for current execution.
      * @param outputNames Optional. output node name from the Tensorflow model,
      * if no outputs are specified, the default outputs of the model would be
      * used. You can inspect intermediate nodes of the model by adding them to the
      * outputs array.
      * @param isFunctionExecution Flag for executing a function.
      */
    var executeWithControlFlow: js.Any = js.native
    
    val functionExecutorMap: StringDictionary[FunctionExecutor] = js.native
    
    val functions: StringDictionary[ISignatureDef] = js.native
    
    var getCompilationKey: js.Any = js.native
    
    var getFrozenTensorIds: js.Any = js.native
    
    var graph: js.Any = js.native
    
    val inputNodes: js.Array[String] = js.native
    
    val inputs: js.Array[TensorInfo] = js.native
    
    var mapInputs: js.Any = js.native
    
    var mapOutputs: js.Any = js.native
    
    val outputNodes: js.Array[String] = js.native
    
    val outputs: js.Array[TensorInfo] = js.native
    
    var parent: js.Any = js.native
    
    var processChildNodes: js.Any = js.native
    
    var processStack: js.Any = js.native
    
    /**
      * Set `ResourceManager` shared by executors of a model.
      * @param resourceManager: `ResourceManager` of the `GraphModel`.
      */
    var resourceManager: ResourceManager = js.native
    
    val weightIds: js.Array[Double] = js.native
  }
}
