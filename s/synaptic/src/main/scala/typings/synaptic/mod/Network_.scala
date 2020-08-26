package typings.synaptic.mod

import typings.std.Worker
import typings.synaptic.anon.Code
import typings.synaptic.mod.Layer.LayerConnection
import typings.synaptic.mod.Layer.connectionType
import typings.synaptic.mod.Layer.gateType
import typings.synaptic.mod.Network.Optimized
import typings.synaptic.mod.Network.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Network")
@js.native
/**
  * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
  */
class Network_ () extends js.Object {
  def this(options: Options) = this()
  var layers: Options = js.native
  var optimized: Optimized = js.native
  /**
    * When a network is activated, an input must be provided to activate the input layer, then all the hidden layers are activated in order, and finally the output layer is activated and its activation is returned.
    * @param activation
    */
  def activate(activation: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Clear all elegibility traces and extended elegibility traces (the network forgets its context, but not what was trained).
    */
  def clear(): Unit = js.native
  /**
    * A Network can gate a connection between two other Networks or Layers, or a Layers's self-connection.
    * @param layerConnection
    * @param gateType
    */
  def gate(layerConnection: LayerConnection, gateType: gateType): Unit = js.native
  /**
    * Returns number of inputs of the network.
    */
  def inputs(): Double = js.native
  /**
    * Return an array with all the neurons in the network, in activation order.
    */
  def neurons(): js.Array[Double] = js.native
  /**
    * Hardcodes the behaviour of the whole network into a single optimized function.
    */
  def optimize(): Unit = js.native
  /**
    * Returns number of outputs of hte network.
    */
  def outputs(): Double = js.native
  def project(otherNetwork: Layer): LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: js.UndefOr[scala.Nothing], weights: js.Any): LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: connectionType): LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: connectionType, weights: js.Any): LayerConnection = js.native
  /**
    * A network can project a connection to another, or gate a connection between two others networks in the same way Layers do.
    * @param [connectionType=Layer.connectionType.ALL_TO_ALL]
    */
  def project(otherNetwork: Network): LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: js.UndefOr[scala.Nothing], weights: js.Any): LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: connectionType): LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: connectionType, weights: js.Any): LayerConnection = js.native
  /**
    * You can provide a target value and a learning rate to a network and backpropagate the error from the output layer to all the hidden layers in reverse order until reaching the input layer.
    * @param learningRate
    * @param targetValue
    */
  def propagate(learningRate: Double, targetValue: js.Array[Double]): Unit = js.native
  /**
    * Reset all weights and clear all traces (ends up like a new network).
    */
  def reset(): Unit = js.native
  /**
    * Restores all the values from the optimized network the their respective objects in order to manipulate the network.
    */
  def restore(): js.Any | Unit = js.native
  /**
    * The method set(layers) receives an object with layers in the same format as the constructor of Network and sets them as the layers of the Network, this is useful when you are extending the Network class to create your own architectures.
    */
  def set(options: Options): Unit = js.native
  def setOptimize(optimize: js.Any): Unit = js.native
  /**
    * The network can be exported to a single javascript Function. This can be useful when your network is already trained and you just need to use it, since the standalone functions is just one javascript function with an array and operations within, with no dependencies on Synaptic or any other library.
    * @returns Returns a function that works as the activation of the network and can be used without depending on the library.
    */
  def standalone(): js.Function1[/* inputs */ js.Array[Double], js.Array[Double]] = js.native
  /**
    * Export the topology into dot language which can be visualized as graphs using dot.
    * @param edgeConnection
    */
  def toDot(): Code = js.native
  def toDot(edgeConnection: js.Any): Code = js.native
  /**
    * Networks can be stored as JSON's.
    */
  def toJSON(): js.Any = js.native
  /**
    * The network can be converted into a WebWorker. This feature doesn't work in node.js, and it's not supported on every browser (it must support Blob).
    * @returns Return a HTML5 WebWorker specialized on training the network stored in `memory`. Train based on the given dataSet and options. The worker returns the updated `memory` when done.
    */
  def worker(): Worker = js.native
  def worker(memory: js.UndefOr[scala.Nothing], set: js.UndefOr[scala.Nothing], options: js.Any): Worker = js.native
  def worker(memory: js.UndefOr[scala.Nothing], set: js.Any): Worker = js.native
  def worker(memory: js.UndefOr[scala.Nothing], set: js.Any, options: js.Any): Worker = js.native
  def worker(memory: js.Any): Worker = js.native
  def worker(memory: js.Any, set: js.UndefOr[scala.Nothing], options: js.Any): Worker = js.native
  def worker(memory: js.Any, set: js.Any): Worker = js.native
  def worker(memory: js.Any, set: js.Any, options: js.Any): Worker = js.native
}

