package typings.synaptic.synapticMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.synaptic.synapticMod.NeuronNs.Connection
import typings.synaptic.synapticMod.NeuronNs.SquashingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Neuron")
@js.native
object NeuronNs extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
    var ID: Double = js.native
    var from: Double = js.native
    var gain: Double = js.native
    var gater: Neuron = js.native
    var to: Double = js.native
    var weight: Double = js.native
  }
  
  @js.native
  class connection protected () extends Connection {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
  }
  
  /* static members */
  @js.native
  object Connection extends js.Object {
    def uid(): Double = js.native
  }
  
  @js.native
  object connection
    extends Instantiable2[/* from */ Double, /* to */ Double, Connection]
       with Instantiable3[/* from */ Double, /* to */ Double, /* weight */ Double, Connection] {
    def uid(): Double = js.native
  }
  
  @JSName("squash")
  @js.native
  object squashNs extends js.Object {
    val HLIM: SquashingFunction = js.native
    val IDENTITY: SquashingFunction = js.native
    val LOGISTIC: SquashingFunction = js.native
    val ReLU: SquashingFunction = js.native
    val TANH: SquashingFunction = js.native
  }
  
  type SquashingFunction = js.Function2[/* x */ Double, /* derivate */ Boolean, Double]
}

