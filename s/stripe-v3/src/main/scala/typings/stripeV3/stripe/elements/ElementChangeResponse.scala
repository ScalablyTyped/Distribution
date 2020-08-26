package typings.stripeV3.stripe.elements

import typings.stripeV3.anon.PostalCode
import typings.stripeV3.stripe.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementChangeResponse extends js.Object {
  var bankName: js.UndefOr[String] = js.native
  var brand: String = js.native
  var complete: Boolean = js.native
  var country: js.UndefOr[String] = js.native
  var elementType: String = js.native
  var empty: Boolean = js.native
  var error: js.UndefOr[Error] = js.native
  var value: js.UndefOr[PostalCode | String] = js.native
}

object ElementChangeResponse {
  @scala.inline
  def apply(brand: String, complete: Boolean, elementType: String, empty: Boolean): ElementChangeResponse = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChangeResponse]
  }
  @scala.inline
  implicit class ElementChangeResponseOps[Self <: ElementChangeResponse] (val x: Self) extends AnyVal {
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
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setBankName(value: String): Self = this.set("bankName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBankName: Self = this.set("bankName", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setValue(value: PostalCode | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

