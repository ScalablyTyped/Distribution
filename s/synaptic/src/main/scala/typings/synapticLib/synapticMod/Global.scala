package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  var Architect: synapticLib.Anon_LSTM = js.native
  var Layer: ScalablyTyped.runtime.Instantiable1[/* numberOfNeurons */ scala.Double, synapticLib.synapticMod.Layer] = js.native
  var Network: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ synapticLib.synapticMod.NetworkNs.Options], 
    synapticLib.synapticMod.Network
  ] = js.native
  var Neuron: ScalablyTyped.runtime.Instantiable0[synapticLib.synapticMod.Neuron] = js.native
  var Trainer: ScalablyTyped.runtime.Instantiable1[/* network */ synapticLib.synapticMod.Network, synapticLib.synapticMod.Trainer] = js.native
}

