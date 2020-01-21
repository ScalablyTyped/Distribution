package typings.tensorflowTfjsNode

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjs.mod.Tensor_
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.modelTypesMod.InferenceModel
import typings.tensorflowTfjsCore.modelTypesMod.MetaGraph
import typings.tensorflowTfjsCore.modelTypesMod.ModelPredictConfig
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsNode.nodejsKernelBackendMod.NodeJSKernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/saved_model", JSImport.Namespace)
@js.native
object savedModelMod extends js.Object {
  @js.native
  class TFSavedModel protected () extends InferenceModel {
    def this(
      sessionId: Double,
      jsid: Double,
      inputNodeNames: StringDictionary[String],
      outputNodeNames: StringDictionary[String],
      backend: NodeJSKernelBackend
    ) = this()
    var backend: js.Any = js.native
    var disposed: js.Any = js.native
    var inputNodeNames: js.Any = js.native
    var jsid: js.Any = js.native
    var outputNodeNames: js.Any = js.native
    var sessionId: js.Any = js.native
    /**
      * Delete the SavedModel from nodeBackend and delete corresponding session in
      * the C++ backend if the session is only used by this TFSavedModel.
      */
    /** @doc {heading: 'Models', subheading: 'SavedModel'} */
    def dispose(): Unit = js.native
    /**
      * Execute the inference for the input tensors and return activation
      * values for specified output node names without batching.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format.
      *
      * @param outputs string|string[]. List of output node names to retrieve
      * activation from.
      *
      * @returns Activation values for the output nodes result tensors. The return
      * type matches specified parameter outputs type. The output would be single
      * Tensor if single output is specified, otherwise Tensor[] for multiple
      * outputs.
      */
    /** @doc {heading: 'Models', subheading: 'SavedModel'} */
    def execute(inputs: Tensor_[Rank], outputs: String): Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
    def execute(inputs: Tensor_[Rank], outputs: js.Array[String]): Tensor_[Rank] | js.Array[Tensor_[Rank]] = js.native
    def predict(inputs: js.Array[Tensor_[Rank]]): Tensor_[Rank] | js.Array[Tensor_[Rank]] | NamedTensorMap = js.native
    /**
      * Execute the inference for the input tensors.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format. The keys in the NamedTensorMap are the
      * name of input tensors in SavedModel signatureDef. It can be found through
      * `tf.node.getMetaGraphsFromSavedModel()`.
      *
      * For batch inference execution, the tensors for each input need to be
      * concatenated together. For example with mobilenet, the required input shape
      * is [1, 244, 244, 3], which represents the [batch, height, width, channel].
      * If we are provide a batched data of 100 images, the input tensor should be
      * in the shape of [100, 244, 244, 3].
      *
      * @param config Prediction configuration for specifying the batch size.
      *
      * @returns Inference result tensors. The output would be single Tensor if
      * model has single output node, otherwise Tensor[] or NamedTensorMap[] will
      * be returned for model with multiple outputs.
      */
    /** @doc {heading: 'Models', subheading: 'SavedModel'} */
    def predict(inputs: Tensor_[Rank]): Tensor_[Rank] | js.Array[Tensor_[Rank]] | NamedTensorMap = js.native
    def predict(inputs: Tensor_[Rank], config: ModelPredictConfig): Tensor_[Rank] | js.Array[Tensor_[Rank]] | NamedTensorMap = js.native
    def predict(inputs: NamedTensorMap): Tensor_[Rank] | js.Array[Tensor_[Rank]] | NamedTensorMap = js.native
  }
  
  def getEnumKeyFromValue(`object`: js.Any, value: Double): String = js.native
  def getInputAndOutputNodeNameFromMetaGraphInfo(savedModelInfo: js.Array[MetaGraph], tags: js.Array[String], signature: String): js.Array[StringDictionary[String]] = js.native
  def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = js.native
  def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
  def readSavedModelProto(path: String): js.Promise[_] = js.native
}

