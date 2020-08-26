package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddressKana extends js.Object {
  /**
    * City or ward.
    * This can be unset by updating the value to null and then saving.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * Two-letter country code (ISO 3166-1 alpha-2).
    * This can be unset by updating the value to null and then saving.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Block or building number.
    * This can be unset by updating the value to null and then saving.
    */
  var line1: js.UndefOr[String] = js.native
  /**
    * Building details.
    * This can be unset by updating the value to null and then saving.
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * Postal code.
    * This can be unset by updating the value to null and then saving.
    */
  var postal_code: js.UndefOr[String] = js.native
  /**
    * Prefecture.
    * This can be unset by updating the value to null and then saving.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Town or cho-me.
    * This can be unset by updating the value to null and then saving.
    */
  var town: js.UndefOr[String] = js.native
}

object IAddressKana {
  @scala.inline
  def apply(): IAddressKana = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddressKana]
  }
  @scala.inline
  implicit class IAddressKanaOps[Self <: IAddressKana] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine1: Self = this.set("line1", js.undefined)
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine2: Self = this.set("line2", js.undefined)
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTown(value: String): Self = this.set("town", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTown: Self = this.set("town", js.undefined)
  }
  
}

