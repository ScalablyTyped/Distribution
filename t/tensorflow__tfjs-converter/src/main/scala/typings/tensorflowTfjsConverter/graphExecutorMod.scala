package typings.tensorflowTfjsConverter

import typings.tensorflowTfjsConverter.operationsTypesMod.Graph
import typings.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typings.tensorflowTfjsConverter.typesMod.TensorInfo
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/executor/graph_executor", JSImport.Namespace)
@js.native
object graphExecutorMod extends js.Object {
  @js.native
  class GraphExecutor protected () extends js.Object {
    def this(graph: Graph) = this()
    var SEPERATOR: js.Any = js.native
    var _inputs: js.Any = js.native
    var _outputs: js.Any = js.native
    var _signature: js.Any = js.native
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
      * When there are control flow nodes in the graph, the graph execution use
      * ExecutionContext to keep track of the frames and loop iterators.
      * @param inputs placeholder tensors for the graph.
      * @param context the execution context object for current execution.
      */
    var executeWithControlFlow: js.Any = js.native
    var getCompilationKey: js.Any = js.native
    var getFrozenTensorIds: js.Any = js.native
    var graph: js.Any = js.native
    val inputNodes: js.Array[String] = js.native
    val inputs: js.Array[TensorInfo] = js.native
    var mapInputs: js.Any = js.native
    var mapOutputs: js.Any = js.native
    val outputNodes: js.Array[String] = js.native
    val outputs: js.Array[TensorInfo] = js.native
    var processChildNodes: js.Any = js.native
    var processStack: js.Any = js.native
    var weightIds: js.Any = js.native
    var weightMap: NamedTensorsMap = js.native
    /**
      * Releases the memory used by the weight tensors.
      */
    def dispose(): Unit = js.native
    /**
      * Executes the inference for given input tensors.
      * @param inputs Tensor map for the model inputs, keyed by the input node
      * names.
      * @param outputs output node name from the Tensorflow model, if no outputs
      * are specified, the default outputs of the model would be used. You can
      * inspect intermediate nodes of the model by adding them to the outputs
      * array.
      */
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
    def executeAsync(inputs: NamedTensorMap, outputs: js.Array[String]): js.Promise[js.Array[Tensor[Rank]]] = js.native
  }
  
}

