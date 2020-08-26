package typings.vegaTypings.bindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputBinding
  extends BaseBinding
     with Binding {
  var autocomplete: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
}

object InputBinding {
  @scala.inline
  def apply(): InputBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBinding]
  }
  @scala.inline
  implicit class InputBindingOps[Self <: InputBinding] (val x: Self) extends AnyVal {
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
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}

