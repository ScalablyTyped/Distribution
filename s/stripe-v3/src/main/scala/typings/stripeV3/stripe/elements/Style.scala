package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends StyleOptions {
  @JSName(":-webkit-autofill")
  var `Colon-webkit-autofill`: js.UndefOr[StyleOptions] = js.native
  @JSName("::-ms-clear")
  var `ColonColon-ms-clear`: js.UndefOr[StyleOptions] = js.native
  @JSName("::placeholder")
  var ColonColonplaceholder: js.UndefOr[StyleOptions] = js.native
  @JSName("::selection")
  var ColonColonselection: js.UndefOr[StyleOptions] = js.native
  @JSName(":disabled")
  var Colondisabled: js.UndefOr[StyleOptions] = js.native
  @JSName(":focus")
  var Colonfocus: js.UndefOr[StyleOptions] = js.native
  @JSName(":hover")
  var Colonhover: js.UndefOr[StyleOptions] = js.native
}

object Style {
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def `setColon-webkit-autofill`(value: StyleOptions): Self = this.set(":-webkit-autofill", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColon-webkit-autofill`: Self = this.set(":-webkit-autofill", js.undefined)
    @scala.inline
    def `setColonColon-ms-clear`(value: StyleOptions): Self = this.set("::-ms-clear", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColonColon-ms-clear`: Self = this.set("::-ms-clear", js.undefined)
    @scala.inline
    def setColonColonplaceholder(value: StyleOptions): Self = this.set("::placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColonColonplaceholder: Self = this.set("::placeholder", js.undefined)
    @scala.inline
    def setColonColonselection(value: StyleOptions): Self = this.set("::selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColonColonselection: Self = this.set("::selection", js.undefined)
    @scala.inline
    def setColondisabled(value: StyleOptions): Self = this.set(":disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColondisabled: Self = this.set(":disabled", js.undefined)
    @scala.inline
    def setColonfocus(value: StyleOptions): Self = this.set(":focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColonfocus: Self = this.set(":focus", js.undefined)
    @scala.inline
    def setColonhover(value: StyleOptions): Self = this.set(":hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColonhover: Self = this.set(":hover", js.undefined)
  }
  
}

