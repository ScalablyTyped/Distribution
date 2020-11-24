package typings.synaptic.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.TopLevel
import typings.synaptic.anon.Connections
import typings.synaptic.anon.TypeofConnection
import typings.synaptic.anon.TypeofLayer
import typings.synaptic.anon.TypeofTrainer
import typings.synaptic.anon.Typeofsquash
import typings.synaptic.mod.Network.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var Layer: (Instantiable1[/* numberOfNeurons */ Double, typings.synaptic.mod.Layer]) with TypeofLayer = js.native
  
  var Trainer: (Instantiable1[/* network */ typings.synaptic.mod.Network, typings.synaptic.mod.Trainer]) with TypeofTrainer = js.native
  
  @js.native
  object Architect extends js.Object {
    
    /**
      * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
      */
    @js.native
    class Hopfield protected ()
      extends typings.synaptic.mod.Architect.Hopfield {
      /**
        * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
        * @param patternSize Pattern size in bits.
        */
      def this(patternSize: Double) = this()
    }
    /**
      * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
      */
    @js.native
    object Hopfield
      extends TopLevel[Instantiable1[/* patternSize */ Double, typings.synaptic.mod.Architect.Hopfield]]
    
    /**
      * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
      */
    @js.native
    class LSTM protected ()
      extends typings.synaptic.mod.Architect.LSTM {
      /**
        * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
        * @param numberOfNeurons To use this architecture you have to set at least one input layer, one memory block assembly (consisting of four layers: input gate, memory cell, forget gate and output gate), and an output layer. Also you can set many layers of memory blocks.
        */
      def this(numberOfNeurons: Double*) = this()
    }
    /**
      * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
      */
    @js.native
    object LSTM
      extends TopLevel[
              Instantiable1[/* numberOfNeurons (repeated) */ Double, typings.synaptic.mod.Architect.LSTM]
            ]
    
    /**
      * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
      */
    @js.native
    class Liquid protected ()
      extends typings.synaptic.mod.Architect.Liquid {
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
      * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
      */
    @js.native
    object Liquid
      extends TopLevel[
              Instantiable5[
                /* input */ Double, 
                /* pool */ Double, 
                /* output */ Double, 
                /* connections */ Double, 
                /* gates */ Double, 
                typings.synaptic.mod.Architect.Liquid
              ]
            ]
    
    /**
      * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
      */
    @js.native
    class Perceptron protected ()
      extends typings.synaptic.mod.Architect.Perceptron {
      /**
        * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
        * @param numberOfNeurons You have to provide a minimum of 3 layers (input, hidden and output), but you can use as many hidden layers as you wish.
        */
      def this(numberOfNeurons: Double*) = this()
    }
    /**
      * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
      */
    @js.native
    object Perceptron
      extends TopLevel[
              Instantiable1[/* numberOfNeurons (repeated) */ Double, typings.synaptic.mod.Architect.Perceptron]
            ]
  }
  
  @js.native
  /**
    * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
    */
  class Network ()
    extends typings.synaptic.mod.Network {
    def this(options: Options) = this()
  }
  @js.native
  object Network
    extends Instantiable0[typings.synaptic.mod.Network]
       with Instantiable1[/* options */ Options, typings.synaptic.mod.Network] {
    
    /**
      * Rebuild a network that has been stored in a json using the method toJSON().
      */
    def fromJSON(exported: js.Any): typings.synaptic.mod.Network = js.native
    
    /**
      * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
      * @returns Source code that can train a network inside a worker.
      */
    def getWorkerSharedFunctions(): String = js.native
  }
  
  @js.native
  /**
    * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
    */
  class Neuron ()
    extends typings.synaptic.mod.Neuron
  @js.native
  object Neuron
    extends Instantiable0[typings.synaptic.mod.Neuron] {
    
    var Connection: TypeofConnection = js.native
    
    def quantity(): Connections = js.native
    
    val squash: Typeofsquash = js.native
    
    def uid(): Double = js.native
  }
}
