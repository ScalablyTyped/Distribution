package typings
package atTensorflowTfjsDashCoreLib.distModelUnderscoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceModel extends js.Object {
  /**
    * Return the array of input tensor info.
    */
  val inputs: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorInfo] = js.native
  /**
    * Return the array of output tensor info.
    */
  val outputs: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorInfo] = js.native
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
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
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
  def predict(
    inputs: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    config: ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  def predict(
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    config: ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  def predict(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    config: ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
}

