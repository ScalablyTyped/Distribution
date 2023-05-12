package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.ISignatureDef
import typings.tensorflowTfjsConverter.distDataTypesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.distDataTypesMod.TensorArrayMap
import typings.tensorflowTfjsConverter.distDataTypesMod.TensorInfo
import typings.tensorflowTfjsConverter.distDataTypesMod.TensorListMap
import typings.tensorflowTfjsConverter.distExecutorResourceManagerMod.ResourceManager
import typings.tensorflowTfjsConverter.distExecutorTypesMod.FunctionExecutor
import typings.tensorflowTfjsConverter.distOperationsTypesMod.Graph
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExecutorGraphExecutorMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/graph_executor", "GraphExecutor")
  @js.native
  open class GraphExecutor protected ()
    extends StObject
       with FunctionExecutor {
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
    
    /* private */ var SEPARATOR: Any = js.native
    
    /**
      * Executes the inference for given input tensors in Async fashion.
      * @param inputs Tensor map for the model inputs, keyed by the input node
      * names.
      * @param outputs Optional. output node name from the Tensorflow model,
      * if no outputs are specified, the default outputs of the model would be
      * used. You can inspect intermediate nodes of the model by adding them to
      * the outputs array.
      * @param isFunctionExecution Optional. Flag for executing a function.
      * @param tensorArrayMap Optional, global TensorArray map by id. Used for
      * function execution.
      * @param tensorArrayMap Optinal global TensorList map by id. Used for
      * function execution.
      */
    /* private */ var _executeAsync: Any = js.native
    
    /* private */ var _functionExecutorMap: Any = js.native
    
    /* private */ var _functions: Any = js.native
    
    /* private */ var _initNodes: Any = js.native
    
    /* private */ var _inputs: Any = js.native
    
    /* private */ var _outputs: Any = js.native
    
    /* private */ var _resourceManager: Any = js.native
    
    /* private */ var _signature: Any = js.native
    
    /* private */ var _weightIds: Any = js.native
    
    /* private */ var _weightMap: Any = js.native
    
    /* private */ var checkInputShapeAndType: Any = js.native
    
    /* private */ var checkInputs: Any = js.native
    
    /* private */ var checkOutputs: Any = js.native
    
    /* private */ var checkTensorForDisposal: Any = js.native
    
    /* private */ var checkTensorForDisposalWithNodeLiveUntilInfo: Any = js.native
    
    /* private */ var cloneAndKeepTensor: Any = js.native
    
    /* private */ var cloneTensorList: Any = js.native
    
    /* private */ var cloneTensorMap: Any = js.native
    
    /* private */ var clonedTensorsMap: Any = js.native
    
    /**
      * Compiles the inference graph and returns the minimal set of nodes that are
      * required for execution, in the correct execution order.
      * @returns {Object} compilation The compile result.
      * @returns {Node[]} compilation.orderedNodes Nodes in the correct execution
      *     order.
      * @returns {Map<string, Node[]>} compilation.nodeLiveUntilMap A map from node
      *     to disposable nodes after its execution. That is, for a node `x`,
      *     `nodeLiveUntilMap[x]` indicates all nodes whose intermediate
      *     tensors should be disposed after `x` is executed.
      */
    /* private */ var compile: Any = js.native
    
    /* private */ var compiledMap: Any = js.native
    
    /**
      * Releases the memory used by the weight tensors.
      */
    def dispose(): Unit = js.native
    
    def disposeIntermediateTensors(): Unit = js.native
    
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
    
    /* CompleteClass */
    override def executeFunctionAsync(inputs: js.Array[Tensor[Rank]], tensorArrayMap: TensorArrayMap, tensorListMap: TensorListMap): js.Promise[js.Array[Tensor[Rank]]] = js.native
    
    /**
      * When there are control flow nodes in the graph, the graph execution use
      * ExecutionContext to keep track of the frames and loop iterators.
      * @param inputs placeholder tensors for the graph.
      * @param context the execution context object for current execution.
      * @param outputNames Optional. output node name from the Tensorflow model,
      * if no outputs are specified, the default outputs of the model would be
      * used. You can inspect intermediate nodes of the model by adding them to
      * the outputs array.
      * @param isFunctionExecution Flag for executing a function.
      */
    /* private */ var executeWithControlFlow: Any = js.native
    
    def functionExecutorMap: StringDictionary[FunctionExecutor] = js.native
    
    def functions: StringDictionary[ISignatureDef] = js.native
    
    /* private */ var getCompilationKey: Any = js.native
    
    /* private */ var getFrozenTensorIds: Any = js.native
    
    def getIntermediateTensors(): NamedTensorsMap = js.native
    
    /* private */ var graph: Any = js.native
    
    def inputNodes: js.Array[String] = js.native
    
    def inputs: js.Array[TensorInfo] = js.native
    
    /* private */ var keepIntermediateTensors: Any = js.native
    
    /* private */ var mapInputs: Any = js.native
    
    /* private */ var mapOutputs: Any = js.native
    
    def outputNodes: js.Array[String] = js.native
    
    def outputs: js.Array[TensorInfo] = js.native
    
    /* private */ var parent: Any = js.native
    
    /* private */ var parseNodeNameCache: Any = js.native
    
    /* private */ var processChildNodes: Any = js.native
    
    /* private */ var processStack: Any = js.native
    
    /**
      * Set `ResourceManager` shared by executors of a model.
      * @param resourceManager: `ResourceManager` of the `GraphModel`.
      */
    def resourceManager_=(resourceManager: ResourceManager): Unit = js.native
    
    def weightIds: js.Array[Double] = js.native
    
    /* CompleteClass */
    var weightMap: NamedTensorsMap = js.native
    @JSName("weightMap")
    def weightMap_MGraphExecutor: NamedTensorsMap = js.native
  }
}
