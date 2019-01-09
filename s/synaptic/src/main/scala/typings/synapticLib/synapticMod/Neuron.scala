package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
class Neuron () extends js.Object {
  /**
    * By default, a neuron uses a random bias.
    * @default random
    */
  var bias: scala.Double = js.native
  /**
    * By default, a neuron uses a Logistic Sigmoid as its squashing/activation function.
    * @default LOGISTIC
    */
  @JSName("squash")
  var squash_Original: synapticLib.synapticMod.NeuronNs.SquashingFunction = js.native
  /**
    * When a neuron activates, it computes its state from all its input connections and squashes it using its activation function, and returns the output (activation).
    * @param activation You can provide the activation as a parameter (useful for neurons in the input layer. it has to be a float between 0 and 1).
    */
  def activate(): scala.Double = js.native
  def activate(activation: scala.Double): scala.Double = js.native
  /**
    * Clears all the traces (the neuron forgets it's context, but the connections remain intact).
    */
  def clear(): scala.Unit = js.native
  /**
    * Returns true or false whether the neuron is connected to another neuron (parameter).
    * @param neuron
    */
  def connected(): synapticLib.Anon_ConnectionResult | scala.Boolean = js.native
  def connected(neuron: js.Any): synapticLib.Anon_ConnectionResult | scala.Boolean = js.native
  /**
    * A neuron can gate a connection between two neurons, or a neuron's self-connection. This allows you to create second order neural network architectures.
    * @param connection
    */
  def gate(connection: synapticLib.synapticMod.NeuronNs.Connection): scala.Unit = js.native
  /**
    * Hardcodes the behavior of the neuron into an optimized function.
    */
  def optimize(): synapticLib.Anon_Activationsentences = js.native
  def optimize(optimized: js.Any): synapticLib.Anon_Activationsentences = js.native
  def optimize(optimized: js.Any, layer: js.Any): synapticLib.Anon_Activationsentences = js.native
  /**
    * A neuron can project a connection to another neuron. Neurons can also self-connect.
    */
  def project(neuron: Neuron): synapticLib.synapticMod.NeuronNs.Connection = js.native
  def project(neuron: Neuron, weight: scala.Double): synapticLib.synapticMod.NeuronNs.Connection = js.native
  /**
    * After an activation, you can teach the neuron what should have been the correct output (a.k.a. train). This is done by backpropagating the error.
    * @param learningRate a learning rate
    * @param targetValue a target value (float between 0 and 1)
    */
  def propagate(learningRate: scala.Double, targetValue: scala.Double): scala.Unit = js.native
  /**
    * All the connections are randomized and the traces are cleared.
    */
  def reset(): scala.Unit = js.native
  /**
    * Returns true or false whether the neuron is self-connected or not.
    */
  def selfconnected(): scala.Boolean = js.native
  /**
    * By default, a neuron uses a Logistic Sigmoid as its squashing/activation function.
    * @default LOGISTIC
    */
  def squash(x: scala.Double, derivate: scala.Boolean): scala.Double = js.native
}

@JSImport("synaptic", "Neuron")
@js.native
object Neuron extends js.Object {
  def quantity(): synapticLib.Anon_Connections = js.native
  def uid(): scala.Double = js.native
}

