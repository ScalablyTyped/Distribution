package typings.synaptic.synapticMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import typings.synaptic.Anon_Connections
import typings.synaptic.TypeofClassConnection
import typings.synaptic.TypeofLayer
import typings.synaptic.TypeofTrainer
import typings.synaptic.Typeofsquash
import typings.synaptic.synapticMod.Network.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  /**
    * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
    */
  class Network ()
    extends typings.synaptic.synapticMod.Network {
    def this(options: Options) = this()
  }
  
  @js.native
  /**
    * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
    */
  class Neuron ()
    extends typings.synaptic.synapticMod.Neuron
  
  var Layer: (Instantiable1[/* numberOfNeurons */ Double, typings.synaptic.synapticMod.Layer]) with TypeofLayer = js.native
  var Trainer: (Instantiable1[
    /* network */ typings.synaptic.synapticMod.Network, 
    typings.synaptic.synapticMod.Trainer
  ]) with TypeofTrainer = js.native
  @js.native
  object Architect extends js.Object {
    /**
      * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
      */
    @js.native
    class Hopfield protected ()
      extends typings.synaptic.synapticMod.Architect.Hopfield {
      /**
        * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
        * @param patternSize Pattern size in bits.
        */
      def this(patternSize: Double) = this()
    }
    
    /**
      * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
      */
    @js.native
    class LSTM protected ()
      extends typings.synaptic.synapticMod.Architect.LSTM {
      /**
        * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
        * @param numberOfNeurons To use this architecture you have to set at least one input layer, one memory block assembly (consisting of four layers: input gate, memory cell, forget gate and output gate), and an output layer. Also you can set many layers of memory blocks.
        */
      def this(numberOfNeurons: Double*) = this()
    }
    
    /**
      * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
      */
    @js.native
    class Liquid protected ()
      extends typings.synaptic.synapticMod.Architect.Liquid {
      /**
        * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
        * @param input  The size of the input layer.
        * @param pool The size of the pool.
        * @param output The size of the output layer.
        * @param connections The number of random connections in the pool.
        * @param gates The number of random gates among the connections.
        */
      def this(input: Double, pool: Double, output: Double, connections: Double, gates: Double) = this()
    }
    
    /**
      * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
      */
    @js.native
    class Perceptron protected ()
      extends typings.synaptic.synapticMod.Architect.Perceptron {
      /**
        * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
        * @param numberOfNeurons You have to provide a minimum of 3 layers (input, hidden and output), but you can use as many hidden layers as you wish.
        */
      def this(numberOfNeurons: Double*) = this()
    }
    
    /**
      * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
      */
    var Hopfield: Instantiable1[/* patternSize */ Double, typings.synaptic.synapticMod.Architect.Hopfield] = js.native
    /**
      * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
      */
    var LSTM: Instantiable1[
        /* numberOfNeurons (repeated) */ Double, 
        typings.synaptic.synapticMod.Architect.LSTM
      ] = js.native
    /**
      * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
      */
    var Liquid: Instantiable5[
        /* input */ Double, 
        /* pool */ Double, 
        /* output */ Double, 
        /* connections */ Double, 
        /* gates */ Double, 
        typings.synaptic.synapticMod.Architect.Liquid
      ] = js.native
    /**
      * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
      */
    var Perceptron: Instantiable1[
        /* numberOfNeurons (repeated) */ Double, 
        typings.synaptic.synapticMod.Architect.Perceptron
      ] = js.native
  }
  
  @js.native
  object Network
    extends Instantiable0[typings.synaptic.synapticMod.Network]
       with Instantiable1[/* options */ Options, typings.synaptic.synapticMod.Network] {
    /**
      * Rebuild a network that has been stored in a json using the method toJSON().
      */
    def fromJSON(exported: js.Any): typings.synaptic.synapticMod.Network = js.native
    /**
      * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
      * @returns Source code that can train a network inside a worker.
      */
    def getWorkerSharedFunctions(): String = js.native
  }
  
  @js.native
  object Neuron
    extends Instantiable0[typings.synaptic.synapticMod.Neuron] {
    var Connection: TypeofClassConnection = js.native
    val squash: Typeofsquash = js.native
    def quantity(): Anon_Connections = js.native
    def uid(): Double = js.native
  }
  
}

