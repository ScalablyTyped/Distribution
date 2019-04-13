package typings
package synapticLib.synapticMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
class Neuron ()
  extends synapticLib.synapticMod.Neuron

@JSGlobal("Neuron")
@js.native
object Neuron
  extends org.scalablytyped.runtime.Instantiable0[synapticLib.synapticMod.Neuron] {
  var Connection: synapticLib.Anon_From = js.native
  val squashNs: synapticLib.Anon_HLIM = js.native
  def quantity(): synapticLib.Anon_Connections = js.native
  def uid(): scala.Double = js.native
}

