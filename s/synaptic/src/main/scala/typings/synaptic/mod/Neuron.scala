package typings.synaptic.mod

import typings.synaptic.anon.Activationsentences
import typings.synaptic.anon.Connection
import typings.synaptic.anon.Connections
import typings.synaptic.mod.Neuron.Connection_
import typings.synaptic.mod.Neuron.SquashingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("synaptic", "Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
class Neuron () extends StObject {
  
  /**
    * When a neuron activates, it computes its state from all its input connections and squashes it using its activation function, and returns the output (activation).
    * @param activation You can provide the activation as a parameter (useful for neurons in the input layer. it has to be a float between 0 and 1).
    */
  def activate(): Double = js.native
  def activate(activation: Double): Double = js.native
  
  /**
    * By default, a neuron uses a random bias.
    * @default random
    */
  var bias: Double = js.native
  
  /**
    * Clears all the traces (the neuron forgets it's context, but the connections remain intact).
    */
  def clear(): Unit = js.native
  
  /**
    * Returns true or false whether the neuron is connected to another neuron (parameter).
    * @param neuron
    */
  def connected(): Connection | Boolean = js.native
  def connected(neuron: js.Any): Connection | Boolean = js.native
  
  /**
    * A neuron can gate a connection between two neurons, or a neuron's self-connection. This allows you to create second order neural network architectures.
    * @param connection
    */
  def gate(connection: Connection_): Unit = js.native
  
  /**
    * Hardcodes the behavior of the neuron into an optimized function.
    */
  def optimize(): Activationsentences = js.native
  def optimize(optimized: js.Any): Activationsentences = js.native
  def optimize(optimized: js.Any, layer: js.Any): Activationsentences = js.native
  def optimize(optimized: Unit, layer: js.Any): Activationsentences = js.native
  
  /**
    * A neuron can project a connection to another neuron. Neurons can also self-connect.
    */
  def project(neuron: Neuron): Connection_ = js.native
  def project(neuron: Neuron, weight: Double): Connection_ = js.native
  
  /**
    * After an activation, you can teach the neuron what should have been the correct output (a.k.a. train). This is done by backpropagating the error.
    * @param learningRate a learning rate
    * @param targetValue a target value (float between 0 and 1)
    */
  def propagate(learningRate: Double, targetValue: Double): Unit = js.native
  
  /**
    * All the connections are randomized and the traces are cleared.
    */
  def reset(): Unit = js.native
  
  /**
    * Returns true or false whether the neuron is self-connected or not.
    */
  def selfconnected(): Boolean = js.native
  
  /**
    * By default, a neuron uses a Logistic Sigmoid as its squashing/activation function.
    * @default LOGISTIC
    */
  def squash(x: Double, derivate: Boolean): Double = js.native
  /**
    * By default, a neuron uses a Logistic Sigmoid as its squashing/activation function.
    * @default LOGISTIC
    */
  @JSName("squash")
  var squash_Original: SquashingFunction = js.native
}
/* static members */
object Neuron {
  
  @JSImport("synaptic", "Neuron")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("synaptic", "Neuron.Connection")
  @js.native
  class Connection_ protected () extends StObject {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
    
    var ID: Double = js.native
    
    var from: Double = js.native
    
    var gain: Double = js.native
    
    var gater: Neuron = js.native
    
    var to: Double = js.native
    
    var weight: Double = js.native
  }
  object Connection_ {
    
    @JSImport("synaptic", "Neuron.Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  /* was `typeof Connection` */
  @JSImport("synaptic", "Neuron.connection")
  @js.native
  class connection protected () extends Connection_ {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
  }
  /* was `typeof Connection` */
  object connection {
    
    @JSImport("synaptic", "Neuron.connection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  inline def quantity(): Connections = ^.asInstanceOf[js.Dynamic].applyDynamic("quantity")().asInstanceOf[Connections]
  
  object squash {
    
    @JSImport("synaptic", "Neuron.squash.HLIM")
    @js.native
    val HLIM: SquashingFunction = js.native
    
    @JSImport("synaptic", "Neuron.squash.IDENTITY")
    @js.native
    val IDENTITY: SquashingFunction = js.native
    
    @JSImport("synaptic", "Neuron.squash.LOGISTIC")
    @js.native
    val LOGISTIC: SquashingFunction = js.native
    
    @JSImport("synaptic", "Neuron.squash.ReLU")
    @js.native
    val ReLU: SquashingFunction = js.native
    
    @JSImport("synaptic", "Neuron.squash.TANH")
    @js.native
    val TANH: SquashingFunction = js.native
  }
  
  inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  
  type SquashingFunction = js.Function2[/* x */ Double, /* derivate */ Boolean, Double]
}
