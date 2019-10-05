package typings.synaptic.synapticMod.Network

import typings.synaptic.synapticMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var hidden: js.Array[Layer]
  var input: Layer
  var output: Layer
}

object Options {
  @scala.inline
  def apply(hidden: js.Array[Layer], input: Layer, output: Layer): Options = {
    val __obj = js.Dynamic.literal(hidden = hidden, input = input, output = output)
  
    __obj.asInstanceOf[Options]
  }
}

