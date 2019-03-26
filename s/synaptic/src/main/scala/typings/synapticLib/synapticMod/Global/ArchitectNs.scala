package typings
package synapticLib.synapticMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Architect")
@js.native
object ArchitectNs extends js.Object {
  /**
    * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
    */
  @js.native
  class Hopfield protected ()
    extends synapticLib.synapticMod.ArchitectNs.Hopfield {
    /**
      * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
      * @param patternSize Pattern size in bits.
      */
    def this(patternSize: scala.Double) = this()
  }
  
  /**
    * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
    */
  @js.native
  class LSTM protected ()
    extends synapticLib.synapticMod.ArchitectNs.LSTM {
    /**
      * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
      * @param numberOfNeurons To use this architecture you have to set at least one input layer, one memory block assembly (consisting of four layers: input gate, memory cell, forget gate and output gate), and an output layer. Also you can set many layers of memory blocks.
      */
    def this(numberOfNeurons: scala.Double*) = this()
  }
  
  /**
    * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
    */
  @js.native
  class Liquid protected ()
    extends synapticLib.synapticMod.ArchitectNs.Liquid {
    /**
      * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
      * @param input  The size of the input layer.
      * @param pool The size of the pool.
      * @param output The size of the output layer.
      * @param connections The number of random connections in the pool.
      * @param gates The number of random gates among the connections.
      */
    def this(input: scala.Double, pool: scala.Double, output: scala.Double, connections: scala.Double, gates: scala.Double) = this()
  }
  
  /**
    * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
    */
  @js.native
  class Perceptron protected ()
    extends synapticLib.synapticMod.ArchitectNs.Perceptron {
    /**
      * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
      * @param numberOfNeurons You have to provide a minimum of 3 layers (input, hidden and output), but you can use as many hidden layers as you wish.
      */
    def this(numberOfNeurons: scala.Double*) = this()
  }
  
}

