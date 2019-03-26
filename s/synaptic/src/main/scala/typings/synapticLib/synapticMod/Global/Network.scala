package typings
package synapticLib.synapticMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Network")
@js.native
/**
  * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
  */
class Network ()
  extends synapticLib.synapticMod.Network {
  def this(options: synapticLib.synapticMod.NetworkNs.Options) = this()
}

