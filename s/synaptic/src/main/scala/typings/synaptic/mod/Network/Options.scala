package typings.synaptic.mod.Network

import typings.synaptic.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var hidden: js.Array[Layer] = js.native
  var input: Layer = js.native
  var output: Layer = js.native
}

object Options {
  @scala.inline
  def apply(hidden: js.Array[Layer], input: Layer, output: Layer): Options = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHiddenVarargs(value: Layer*): Self = this.set("hidden", js.Array(value :_*))
    @scala.inline
    def setHidden(value: js.Array[Layer]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Layer): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Layer): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

