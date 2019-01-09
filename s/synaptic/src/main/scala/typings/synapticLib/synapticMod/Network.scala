package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Network")
@js.native
/**
  * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
  */
class Network () extends js.Object {
  def this(options: synapticLib.synapticMod.NetworkNs.Options) = this()
  var layers: synapticLib.synapticMod.NetworkNs.Options = js.native
  var optimized: synapticLib.synapticMod.NetworkNs.Optimized = js.native
  /**
    * When a network is activated, an input must be provided to activate the input layer, then all the hidden layers are activated in order, and finally the output layer is activated and its activation is returned.
    * @param activation
    */
  def activate(activation: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
    * Clear all elegibility traces and extended elegibility traces (the network forgets its context, but not what was trained).
    */
  def clear(): scala.Unit = js.native
  /**
    * A Network can gate a connection between two other Networks or Layers, or a Layers's self-connection.
    * @param layerConnection
    * @param gateType
    */
  def gate(
    layerConnection: synapticLib.synapticMod.LayerNs.LayerConnection,
    gateType: synapticLib.synapticMod.LayerNs.gateType
  ): scala.Unit = js.native
  /**
    * Returns number of inputs of the network.
    */
  def inputs(): scala.Double = js.native
  /**
    * Return an array with all the neurons in the network, in activation order.
    */
  def neurons(): js.Array[scala.Double] = js.native
  /**
    * Hardcodes the behaviour of the whole network into a single optimized function.
    */
  def optimize(): scala.Unit = js.native
  /**
    * Returns number of outputs of hte network.
    */
  def outputs(): scala.Double = js.native
  def project(otherNetwork: Layer): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: synapticLib.synapticMod.LayerNs.connectionType): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  def project(
    otherNetwork: Layer,
    connectionType: synapticLib.synapticMod.LayerNs.connectionType,
    weights: js.Any
  ): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
    * A network can project a connection to another, or gate a connection between two others networks in the same way Layers do.
    * @param [connectionType=Layer.connectionType.ALL_TO_ALL]
    */
  def project(otherNetwork: Network): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: synapticLib.synapticMod.LayerNs.connectionType): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  def project(
    otherNetwork: Network,
    connectionType: synapticLib.synapticMod.LayerNs.connectionType,
    weights: js.Any
  ): synapticLib.synapticMod.LayerNs.LayerConnection = js.native
  /**
    * You can provide a target value and a learning rate to a network and backpropagate the error from the output layer to all the hidden layers in reverse order until reaching the input layer.
    * @param learningRate
    * @param targetValue
    */
  def propagate(learningRate: scala.Double, targetValue: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Reset all weights and clear all traces (ends up like a new network).
    */
  def reset(): scala.Unit = js.native
  /**
    * Restores all the values from the optimized network the their respective objects in order to manipulate the network.
    */
  def restore(): js.Any | scala.Unit = js.native
  /**
    * The method set(layers) receives an object with layers in the same format as the constructor of Network and sets them as the layers of the Network, this is useful when you are extending the Network class to create your own architectures.
    */
  def set(options: synapticLib.synapticMod.NetworkNs.Options): scala.Unit = js.native
  def setOptimize(optimize: js.Any): scala.Unit = js.native
  /**
    * The network can be exported to a single javascript Function. This can be useful when your network is already trained and you just need to use it, since the standalone functions is just one javascript function with an array and operations within, with no dependencies on Synaptic or any other library.
    * @returns Returns a function that works as the activation of the network and can be used without depending on the library.
    */
  def standalone(): js.Function1[/* inputs */ js.Array[scala.Double], js.Array[scala.Double]] = js.native
  /**
    * Export the topology into dot language which can be visualized as graphs using dot.
    * @param edgeConnection
    */
  def toDot(): synapticLib.Anon_Code = js.native
  def toDot(edgeConnection: js.Any): synapticLib.Anon_Code = js.native
  /**
    * Networks can be stored as JSON's.
    */
  def toJSON(): js.Any = js.native
  /**
    * The network can be converted into a WebWorker. This feature doesn't work in node.js, and it's not supported on every browser (it must support Blob).
    * @returns Return a HTML5 WebWorker specialized on training the network stored in `memory`. Train based on the given dataSet and options. The worker returns the updated `memory` when done.
    */
  def worker(): stdLib.Worker = js.native
  def worker(memory: js.Any): stdLib.Worker = js.native
  def worker(memory: js.Any, set: js.Any): stdLib.Worker = js.native
  def worker(memory: js.Any, set: js.Any, options: js.Any): stdLib.Worker = js.native
}

@JSImport("synaptic", "Network")
@js.native
object Network extends js.Object {
  /**
    * Rebuild a network that has been stored in a json using the method toJSON().
    */
  def fromJSON(exported: js.Any): synapticLib.synapticMod.Network = js.native
  /**
    * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
    * @returns Source code that can train a network inside a worker.
    */
  def getWorkerSharedFunctions(): java.lang.String = js.native
}

