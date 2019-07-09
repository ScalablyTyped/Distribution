package typings
package atTensorflowTfjsDashLayersLib.distModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
@js.native
class Sequential ()
  extends atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel {
  def this(args: SequentialArgs) = this()
  var checkShape: js.Any = js.native
  var model: js.Any = js.native
  /**
    * Adds a layer instance on top of the layer stack.
    *
    * ```js
    *  const model = tf.sequential();
    *  model.add(tf.layers.dense({units: 8, inputShape: [1]}));
    *  model.add(tf.layers.dense({units: 4, activation: 'relu6'}));
    *  model.add(tf.layers.dense({units: 1, activation: 'relu6'}));
    *  // Note that the untrained model is random at this point.
    *  model.predict(tf.randomNormal([10, 1])).print();
    * ```
    * @param layer Layer instance.
    *
    * @exception ValueError In case the `layer` argument does not know its
    * input shape.
    * @exception ValueError In case the `layer` argument has multiple output
    *   tensors, or is already connected somewhere else (forbidden in
    *   `Sequential` models).
    */
  /** @doc {heading: 'Models', subheading: 'Classes'} */
  def add(layer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer): scala.Unit = js.native
  def build(): scala.Unit = js.native
  /**
    * Removes the last layer in the model.
    *
    * @exception TypeError if there are no layers in the model.
    */
  def pop(): scala.Unit = js.native
  def predict(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: ModelPredictArgs
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def predict(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: ModelPredictArgs
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/models", "Sequential")
@js.native
object Sequential extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    fastWeightInit: scala.Boolean
  ): T = js.native
}

