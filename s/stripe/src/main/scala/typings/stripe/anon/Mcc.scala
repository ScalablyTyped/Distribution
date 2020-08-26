package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mcc extends js.Object {
  /**
    * The merchant category code for the account. MCCs are used to classify businesses
    * based on the goods or services they provide.
    */
  var mcc: js.UndefOr[String] = js.native
  /**
    * The customer-facing business name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Internal-only description of the product sold or service provided by the
    * business. It’s used by Stripe for risk and underwriting purposes.
    */
  var product_description: js.UndefOr[String] = js.native
  /**
    * A publicly available mailing address for sending support issues to.
    */
  var support_address: js.UndefOr[City] = js.native
  /**
    * A publicly available email address for sending support issues to.
    */
  var support_email: js.UndefOr[String] = js.native
  /**
    * A publicly available phone number to call with support issues.
    */
  var support_phone: js.UndefOr[String] = js.native
  /**
    * A publicly available website for handling support issues.
    */
  var support_url: js.UndefOr[String] = js.native
  /**
    * The business’s publicly available website.
    */
  var url: js.UndefOr[String] = js.native
}

object Mcc {
  @scala.inline
  def apply(): Mcc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mcc]
  }
  @scala.inline
  implicit class MccOps[Self <: Mcc] (val x: Self) extends AnyVal {
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
    def setMcc(value: String): Self = this.set("mcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMcc: Self = this.set("mcc", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProduct_description(value: String): Self = this.set("product_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_description: Self = this.set("product_description", js.undefined)
    @scala.inline
    def setSupport_address(value: City): Self = this.set("support_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupport_address: Self = this.set("support_address", js.undefined)
    @scala.inline
    def setSupport_email(value: String): Self = this.set("support_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupport_email: Self = this.set("support_email", js.undefined)
    @scala.inline
    def setSupport_phone(value: String): Self = this.set("support_phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupport_phone: Self = this.set("support_phone", js.undefined)
    @scala.inline
    def setSupport_url(value: String): Self = this.set("support_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupport_url: Self = this.set("support_url", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

