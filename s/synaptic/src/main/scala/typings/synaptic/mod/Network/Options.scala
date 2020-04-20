package typings.synaptic.mod.Network

import typings.synaptic.mod.Layer
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
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

