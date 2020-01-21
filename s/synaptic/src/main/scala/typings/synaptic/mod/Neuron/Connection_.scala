package typings.synaptic.mod.Neuron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Neuron.Connection")
@js.native
class Connection_ protected () extends js.Object {
  def this(from: Double, to: Double) = this()
  def this(from: Double, to: Double, weight: Double) = this()
  var ID: Double = js.native
  var from: Double = js.native
  var gain: Double = js.native
  var gater: typings.synaptic.mod.Neuron = js.native
  var to: Double = js.native
  var weight: Double = js.native
}

/* static members */
@JSImport("synaptic", "Neuron.Connection")
@js.native
object Connection_ extends js.Object {
  def uid(): Double = js.native
}

