package typings.stripe.mod.customers

import typings.stripe.mod.IListOptions
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardSourceListOptions extends IListOptions {
  var `object`: card = js.native
}

object ICardSourceListOptions {
  @scala.inline
  def apply(`object`: card): ICardSourceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceListOptions]
  }
  @scala.inline
  implicit class ICardSourceListOptionsOps[Self <: ICardSourceListOptions] (val x: Self) extends AnyVal {
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
    def setObject(value: card): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

