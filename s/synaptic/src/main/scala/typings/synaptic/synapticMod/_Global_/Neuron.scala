package typings.synaptic.synapticMod._Global_

import org.scalablytyped.runtime.Instantiable0
import typings.synaptic.Anon_Connections
import typings.synaptic.TypeofClassConnection
import typings.synaptic.Typeofsquash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
class Neuron ()
  extends typings.synaptic.synapticMod.Neuron

@JSGlobal("Neuron")
@js.native
object Neuron
  extends Instantiable0[typings.synaptic.synapticMod.Neuron] {
  var Connection: TypeofClassConnection = js.native
  val squash: Typeofsquash = js.native
  def quantity(): Anon_Connections = js.native
  def uid(): Double = js.native
}

