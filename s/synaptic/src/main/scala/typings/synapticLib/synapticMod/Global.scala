package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  var Architect: synapticLib.Anon_LSTM = js.native
  var Layer: (org.scalablytyped.runtime.Instantiable1[/* numberOfNeurons */ scala.Double, synapticLib.synapticMod.Layer]) with synapticLib.Anon_LayerConnection = js.native
  var Network: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ synapticLib.synapticMod.NetworkNs.Options], 
    synapticLib.synapticMod.Network
  ] = js.native
  var Neuron: org.scalablytyped.runtime.Instantiable0[synapticLib.synapticMod.Neuron] with synapticLib.Anon_Connection = js.native
  var Trainer: org.scalablytyped.runtime.Instantiable1[/* network */ synapticLib.synapticMod.Network, synapticLib.synapticMod.Trainer] = js.native
}

