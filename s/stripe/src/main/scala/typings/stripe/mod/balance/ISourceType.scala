package typings.stripe.mod.balance

import typings.stripe.anon.Alipayaccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceType extends js.Object {
  var amount: Double = js.native
  var currency: String = js.native
  var source_types: Alipayaccount = js.native
}

object ISourceType {
  @scala.inline
  def apply(amount: Double, currency: String, source_types: Alipayaccount): ISourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], source_types = source_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceType]
  }
  @scala.inline
  implicit class ISourceTypeOps[Self <: ISourceType] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_types(value: Alipayaccount): Self = this.set("source_types", value.asInstanceOf[js.Any])
  }
  
}

