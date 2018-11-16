package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Layer")
@js.native
class Layer protected () extends js.Object {
  /**
       * Normally you won't work with single neurons, but use Layers instead. A layer is basically an array of neurons, they can do pretty much the same things as neurons do, but it makes the programming process faster.
       * @param numberOfNeurons the number of neurons in that layer
       */
  def this(numberOfNeurons: scala.Double) = this()
  var connectedTo: js.Any = js.native
  var label: js.Any = js.native
  var list: js.Array[Neuron] = js.native
  var size: scala.Double = js.native
  /**
       * When a layer activates, it just activates all the neurons in that layer in order, and returns an array with the outputs.
       * @param activation It accepts an array of activations as parameter (for input layers).
       */
  def activate(): js.Array[scala.Double] = js.native
  /**
       * When a layer activates, it just activates all the neurons in that layer in order, and returns an array with the outputs.
       * @param activation It accepts an array of activations as parameter (for input layers).
       */
  def activate(activation: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
       * Adds a neuron to the layer.
       * @param neuron
       */
  def add(neuron: js.Any): scala.Unit = js.native
  /**
       * Clears all the neurons in the layer.
       */
  def clear(): scala.Unit = js.native
  /**
       * True of false whether the layer is connected to another layer (parameter) or not.
       * @param layer
       */
  def connected(layer: js.Any): js.Any = js.native
  /**
       * A layer can gate a connection between two other layers, or a layers's self-connection.
       */
  def gate(
    connection: synapticLib.synapticMod.LayerNs.LayerConnection,
    gateType: synapticLib.synapticMod.LayerNs.gateType
  ): scala.Unit = js.native
  /**
       * Returns an array with all the neurons in the layer, in activation order.
       */
  def neurons(): js.Array[Neuron] = js.native
  /**
       * A layer can project a connection to another layer. Layers can also self-connect.
       * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
       */
  def project(layer: Layer): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
       * A layer can project a connection to another layer. Layers can also self-connect.
       * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
       */
  def project(layer: Layer, connectionType: synapticLib.synapticMod.LayerNs.connectionType): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
       * A layer can project a connection to another layer. Layers can also self-connect.
       * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
       */
  def project(layer: Layer, connectionType: synapticLib.synapticMod.LayerNs.connectionType, weights: js.Any): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
       * A layer can project a connection to another layer. Layers can also self-connect.
       * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
       */
  def project(layer: Network): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
       * A layer can project a connection to another layer. Layers can also self-connect.
       * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
       */
  def project(layer: Network, connectionType: synapticLib.synapticMod.LayerNs.connectionType): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
       * A layer can project a connection to another layer. Layers can also self-connect.
       * @param connectionType If not specified, the connection type is always Layer.connectionType.ALL_TO_ALL when connecting two different layers, and is Layer.connectionType.ONE_TO_ONE when connecting a layer to itself (ie myLayer.project(myLayer)).
       */
  def project(layer: Network, connectionType: synapticLib.synapticMod.LayerNs.connectionType, weights: js.Any): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
       * After an activation, you can teach the layer what should have been the correct output (a.k.a. train). This is done by backpropagating the error.
       * @param learningRate A learning rate.
       * @param targetValue A target value (array of floats between 0 and 1).
       */
  def propagate(learningRate: scala.Double, targetValue: js.Array[scala.Double]): scala.Unit = js.native
  /**
       * Resets all the neurons in the layer.
       */
  def reset(): scala.Unit = js.native
  /**
       * True or false whether the whole layer is self-connected or not.
       */
  def selfconnected(): scala.Boolean = js.native
  /**
       * Set the squashing function and bias of all the neurons in a layer.
       * @param options
       */
  def set(options: synapticLib.synapticMod.LayerNs.Options): this.type = js.native
}

