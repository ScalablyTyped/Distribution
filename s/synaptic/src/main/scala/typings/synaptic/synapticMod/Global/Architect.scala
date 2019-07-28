package typings.synaptic.synapticMod.Global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in ArchitectNs */
@JSGlobal("Architect")
@js.native
object Architect extends js.Object {
  /**
    * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
    */
  var Hopfield: Instantiable1[/* patternSize */ Double, typings.synaptic.synapticMod.ArchitectNs.Hopfield] = js.native
  /**
    * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
    */
  var LSTM: Instantiable1[
    /* numberOfNeurons (repeated) */ Double, 
    typings.synaptic.synapticMod.ArchitectNs.LSTM
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
    typings.synaptic.synapticMod.ArchitectNs.Liquid
  ] = js.native
  /**
    * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
    */
  var Perceptron: Instantiable1[
    /* numberOfNeurons (repeated) */ Double, 
    typings.synaptic.synapticMod.ArchitectNs.Perceptron
  ] = js.native
}

