package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Neuron")
@js.native
object NeuronNs extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(from: scala.Double, to: scala.Double) = this()
    def this(from: scala.Double, to: scala.Double, weight: scala.Double) = this()
    var ID: scala.Double = js.native
    var from: scala.Double = js.native
    var gain: scala.Double = js.native
    var gater: synapticLib.synapticMod.Neuron = js.native
    var to: scala.Double = js.native
    var weight: scala.Double = js.native
  }
  
  @js.native
  class connection protected () extends Connection {
    def this(from: scala.Double, to: scala.Double) = this()
    def this(from: scala.Double, to: scala.Double, weight: scala.Double) = this()
  }
  
  var connection: synapticLib.Anon_From = js.native
  /* static members */
  @js.native
  object Connection extends js.Object {
    def uid(): scala.Double = js.native
  }
  
  @JSName("squash")
  @js.native
  object squashNs extends js.Object {
    val HLIM: synapticLib.synapticMod.NeuronNs.SquashingFunction = js.native
    val IDENTITY: synapticLib.synapticMod.NeuronNs.SquashingFunction = js.native
    val LOGISTIC: synapticLib.synapticMod.NeuronNs.SquashingFunction = js.native
    val ReLU: synapticLib.synapticMod.NeuronNs.SquashingFunction = js.native
    val TANH: synapticLib.synapticMod.NeuronNs.SquashingFunction = js.native
  }
  
  type SquashingFunction = js.Function2[/* x */ scala.Double, /* derivate */ scala.Boolean, scala.Double]
}

