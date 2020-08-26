package typings.stripe.mod.tokens

import typings.stripe.anon.Personalidnumber
import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPiiTokenCreationOptions extends IDataOptions {
  var pii: Personalidnumber = js.native
}

object IPiiTokenCreationOptions {
  @scala.inline
  def apply(pii: Personalidnumber): IPiiTokenCreationOptions = {
    val __obj = js.Dynamic.literal(pii = pii.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPiiTokenCreationOptions]
  }
  @scala.inline
  implicit class IPiiTokenCreationOptionsOps[Self <: IPiiTokenCreationOptions] (val x: Self) extends AnyVal {
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
    def setPii(value: Personalidnumber): Self = this.set("pii", value.asInstanceOf[js.Any])
  }
  
}

