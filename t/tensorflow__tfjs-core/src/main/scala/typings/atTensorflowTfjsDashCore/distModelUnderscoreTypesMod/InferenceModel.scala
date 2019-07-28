package typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorInfo
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceModel extends js.Object {
  /**
    * Return the array of input tensor info.
    */
  val inputs: js.Array[TensorInfo] = js.native
  /**
    * Return the array of output tensor info.
    */
  val outputs: js.Array[TensorInfo] = js.native
  def execute(inputs: js.Array[Tensor[Rank]], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def execute(inputs: js.Array[Tensor[Rank]], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * Single Execute the inference for the input tensors and return activation
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
  def execute(inputs: Tensor[Rank], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def execute(inputs: Tensor[Rank], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def execute(inputs: NamedTensorMap, outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def execute(inputs: NamedTensorMap, outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def predict(inputs: js.Array[Tensor[Rank]], config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
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
  def predict(inputs: Tensor[Rank], config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
  def predict(inputs: NamedTensorMap, config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
}

