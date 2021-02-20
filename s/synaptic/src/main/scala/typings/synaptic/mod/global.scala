package typings.synaptic.mod

import typings.synaptic.anon.Connections
import typings.synaptic.mod.Network.Options
import typings.synaptic.mod.Neuron.SquashingFunction
import typings.synaptic.mod.Trainer.CostFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Need this to refer to Synaptic from within the `declare global`
object global {
  
  /* was `typeof Synaptic.Architect` */
  object Architect {
    
    /**
      * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
      */
    @JSGlobal("Architect.Hopfield")
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
      * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
      */
    @JSGlobal("Architect.LSTM")
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
      * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
      */
    @JSGlobal("Architect.Liquid")
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
      * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
      */
    @JSGlobal("Architect.Perceptron")
    @js.native
    class Perceptron protected ()
      extends typings.synaptic.mod.Architect.Perceptron {
      /**
        * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
        * @param numberOfNeurons You have to provide a minimum of 3 layers (input, hidden and output), but you can use as many hidden layers as you wish.
        */
      def this(numberOfNeurons: Double*) = this()
    }
  }
  
  /* was `typeof Synaptic.Layer` */
  @JSGlobal("Layer")
  @js.native
  class Layer protected ()
    extends typings.synaptic.mod.Layer {
    /**
      * Normally you won't work with single neurons, but use Layers instead. A layer is basically an array of neurons, they can do pretty much the same things as neurons do, but it makes the programming process faster.
      * @param numberOfNeurons the number of neurons in that layer
      */
    def this(numberOfNeurons: Double) = this()
  }
  /* was `typeof Synaptic.Layer` */
  object Layer {
    
    /**
      * Represents a connection from one layer to another, and keeps track of its weight and gain.
      */
    @JSGlobal("Layer.LayerConnection")
    @js.native
    class LayerConnection ()
      extends typings.synaptic.mod.Layer.LayerConnection
    object LayerConnection {
      
      /* static member */
      @JSGlobal("Layer.LayerConnection.uid")
      @js.native
      def uid(): Double = js.native
    }
    
    /**
      * Represents a connection from one layer to another, and keeps track of its weight and gain.
      */
    /* was `typeof LayerConnection` */
    @JSGlobal("Layer.connection")
    @js.native
    class connection () extends LayerConnection
    /* was `typeof LayerConnection` */
    object connection {
      
      /* static member */
      @JSGlobal("Layer.connection.uid")
      @js.native
      def uid(): Double = js.native
    }
    
    /**
      * Types of connections.
      */
    @JSGlobal("Layer.connectionType")
    @js.native
    object connectionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.synaptic.mod.Layer.connectionType with Double] = js.native
      
      /* 0 */ val ALL_TO_ALL: typings.synaptic.mod.Layer.connectionType.ALL_TO_ALL with Double = js.native
      
      /* 2 */ val ALL_TO_ELSE: typings.synaptic.mod.Layer.connectionType.ALL_TO_ELSE with Double = js.native
      
      /* 1 */ val ONE_TO_ONE: typings.synaptic.mod.Layer.connectionType.ONE_TO_ONE with Double = js.native
    }
    
    /**
      * Types of gates.
      */
    @JSGlobal("Layer.gateType")
    @js.native
    object gateType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.synaptic.mod.Layer.gateType with Double] = js.native
      
      /* 0 */ val INPUT: typings.synaptic.mod.Layer.gateType.INPUT with Double = js.native
      
      /* 2 */ val ONE_TO_ONE: typings.synaptic.mod.Layer.gateType.ONE_TO_ONE with Double = js.native
      
      /* 1 */ val OUTPUT: typings.synaptic.mod.Layer.gateType.OUTPUT with Double = js.native
    }
  }
  
  /* was `typeof Synaptic.Network` */
  @JSGlobal("Network")
  @js.native
  /**
    * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
    */
  class Network ()
    extends typings.synaptic.mod.Network {
    def this(options: Options) = this()
  }
  /* static members */
  /* was `typeof Synaptic.Network` */
  object Network {
    
    /**
      * Rebuild a network that has been stored in a json using the method toJSON().
      */
    @JSGlobal("Network.fromJSON")
    @js.native
    def fromJSON(exported: js.Any): typings.synaptic.mod.Network = js.native
    
    /**
      * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
      * @returns Source code that can train a network inside a worker.
      */
    @JSGlobal("Network.getWorkerSharedFunctions")
    @js.native
    def getWorkerSharedFunctions(): String = js.native
  }
  
  /* was `typeof Synaptic.Neuron` */
  @JSGlobal("Neuron")
  @js.native
  /**
    * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
    */
  class Neuron ()
    extends typings.synaptic.mod.Neuron
  /* static members */
  /* was `typeof Synaptic.Neuron` */
  object Neuron {
    
    @JSGlobal("Neuron.Connection")
    @js.native
    class Connection_ protected ()
      extends typings.synaptic.mod.Neuron.Connection_ {
      def this(from: Double, to: Double) = this()
      def this(from: Double, to: Double, weight: Double) = this()
    }
    object Connection_ {
      
      /* static member */
      @JSGlobal("Neuron.Connection.uid")
      @js.native
      def uid(): Double = js.native
    }
    
    /* was `typeof Connection` */
    @JSGlobal("Neuron.connection")
    @js.native
    class connection protected () extends Connection_ {
      def this(from: Double, to: Double) = this()
      def this(from: Double, to: Double, weight: Double) = this()
    }
    /* was `typeof Connection` */
    object connection {
      
      /* static member */
      @JSGlobal("Neuron.connection.uid")
      @js.native
      def uid(): Double = js.native
    }
    
    @JSGlobal("Neuron.quantity")
    @js.native
    def quantity(): Connections = js.native
    
    object squash {
      
      @JSGlobal("Neuron.squash.HLIM")
      @js.native
      val HLIM: SquashingFunction = js.native
      
      @JSGlobal("Neuron.squash.IDENTITY")
      @js.native
      val IDENTITY: SquashingFunction = js.native
      
      @JSGlobal("Neuron.squash.LOGISTIC")
      @js.native
      val LOGISTIC: SquashingFunction = js.native
      
      @JSGlobal("Neuron.squash.ReLU")
      @js.native
      val ReLU: SquashingFunction = js.native
      
      @JSGlobal("Neuron.squash.TANH")
      @js.native
      val TANH: SquashingFunction = js.native
    }
    
    @JSGlobal("Neuron.uid")
    @js.native
    def uid(): Double = js.native
  }
  
  /* was `typeof Synaptic.Trainer` */
  @JSGlobal("Trainer")
  @js.native
  class Trainer protected ()
    extends typings.synaptic.mod.Trainer {
    /**
      * The Trainer makes it easier to train any set to any network, no matter its architecture. The trainer also contains built-in tasks to test the performance of your network.
      * @param network
      */
    def this(network: typings.synaptic.mod.Network) = this()
  }
  /* was `typeof Synaptic.Trainer` */
  object Trainer {
    
    object cost {
      
      @JSGlobal("Trainer.cost.BINARY")
      @js.native
      val BINARY: CostFunction = js.native
      
      @JSGlobal("Trainer.cost.CROSS_ENTROPY")
      @js.native
      val CROSS_ENTROPY: CostFunction = js.native
      
      @JSGlobal("Trainer.cost.MSE")
      @js.native
      val MSE: CostFunction = js.native
    }
  }
}
