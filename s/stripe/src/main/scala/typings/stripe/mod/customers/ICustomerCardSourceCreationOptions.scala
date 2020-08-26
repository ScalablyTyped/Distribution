package typings.stripe.mod.customers

import typings.stripe.mod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerCardSourceCreationOptions extends ICustomerSourceCreationOptions {
  @JSName("source")
  var source_ICustomerCardSourceCreationOptions: ICardSourceCreationOptions = js.native
}

object ICustomerCardSourceCreationOptions {
  @scala.inline
  def apply(source: ICardSourceCreationOptions): ICustomerCardSourceCreationOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerCardSourceCreationOptions]
  }
  @scala.inline
  implicit class ICustomerCardSourceCreationOptionsOps[Self <: ICustomerCardSourceCreationOptions] (val x: Self) extends AnyVal {
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
    def setSource(value: ICardSourceCreationOptions): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

