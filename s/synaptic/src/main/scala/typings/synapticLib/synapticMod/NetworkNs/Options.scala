package typings
package synapticLib.synapticMod.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var hidden: js.Array[synapticLib.synapticMod.Layer]
  var input: synapticLib.synapticMod.Layer
  var output: synapticLib.synapticMod.Layer
}

object Options {
  @scala.inline
  def apply(
    hidden: js.Array[synapticLib.synapticMod.Layer],
    input: synapticLib.synapticMod.Layer,
    output: synapticLib.synapticMod.Layer
  ): Options = {
    val __obj = js.Dynamic.literal(hidden = hidden, input = input, output = output)
  
    __obj.asInstanceOf[Options]
  }
}

