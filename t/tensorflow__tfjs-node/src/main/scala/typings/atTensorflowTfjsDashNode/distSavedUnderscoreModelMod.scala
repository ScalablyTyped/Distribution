package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjs.atTensorflowTfjsMod.Tensor
import typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod.InferenceModel
import typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod.MetaGraphInfo
import typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod.ModelPredictConfig
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashNode.distNodejsUnderscoreKernelUnderscoreBackendMod.NodeJSKernelBackend
import typings.atTensorflowTfjsDashNode.distSavedUnderscoreModelMod.TFSavedModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/saved_model", JSImport.Namespace)
@js.native
object distSavedUnderscoreModelMod extends js.Object {
  @js.native
  class TFSavedModel protected () extends InferenceModel {
    def this(
      sessionId: Double,
      jsid: Double,
      inputNodeNames: js.Array[String],
      outputNodeNames: js.Array[String],
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
    def execute(inputs: Tensor[Rank], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: Tensor[Rank], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def predict(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    /**
      * Execute the inference for the input tensors.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format.
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
    def predict(inputs: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    def predict(inputs: Tensor[Rank], config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    def predict(inputs: NamedTensorMap): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
  }
  
  def getEnumKeyFromValue(`object`: js.Any, value: Double): String = js.native
  def getInputAndOutputNodeNameFromMetaGraphInfo(savedModelInfo: js.Array[MetaGraphInfo], tags: js.Array[String], signature: String): js.Array[js.Array[String]] = js.native
  def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraphInfo]] = js.native
  def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
  def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
  def readSavedModelProto(path: String): js.Promise[_] = js.native
}

