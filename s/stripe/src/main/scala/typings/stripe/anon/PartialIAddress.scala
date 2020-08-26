package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stripe.stripe.IAddress> */
@js.native
trait PartialIAddress extends js.Object {
  var city: js.UndefOr[String | Null] = js.native
  var country: js.UndefOr[String | Null] = js.native
  var line1: js.UndefOr[String] = js.native
  var line2: js.UndefOr[String | Null] = js.native
  var postal_code: js.UndefOr[String | Null] = js.native
  var state: js.UndefOr[String | Null] = js.native
}

object PartialIAddress {
  @scala.inline
  def apply(): PartialIAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIAddress]
  }
  @scala.inline
  implicit class PartialIAddressOps[Self <: PartialIAddress] (val x: Self) extends AnyVal {
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCityNull: Self = this.set("city", null)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine1: Self = this.set("line1", js.undefined)
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine2: Self = this.set("line2", js.undefined)
    @scala.inline
    def setLine2Null: Self = this.set("line2", null)
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    @scala.inline
    def setPostal_codeNull: Self = this.set("postal_code", null)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
  
}

