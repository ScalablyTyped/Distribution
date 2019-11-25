package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mcc extends js.Object {
  /**
    * The merchant category code for the account. MCCs are used to classify businesses
    * based on the goods or services they provide.
    */
  var mcc: js.UndefOr[String] = js.undefined
  /**
    * The customer-facing business name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Internal-only description of the product sold or service provided by the
    * business. It’s used by Stripe for risk and underwriting purposes.
    */
  var product_description: js.UndefOr[String] = js.undefined
  /**
    * A publicly available mailing address for sending support issues to.
    */
  var support_address: js.UndefOr[Anon_City] = js.undefined
  /**
    * A publicly available email address for sending support issues to.
    */
  var support_email: js.UndefOr[String] = js.undefined
  /**
    * A publicly available phone number to call with support issues.
    */
  var support_phone: js.UndefOr[String] = js.undefined
  /**
    * A publicly available website for handling support issues.
    */
  var support_url: js.UndefOr[String] = js.undefined
  /**
    * The business’s publicly available website.
    */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Mcc {
  @scala.inline
  def apply(
    mcc: String = null,
    name: String = null,
    product_description: String = null,
    support_address: Anon_City = null,
    support_email: String = null,
    support_phone: String = null,
    support_url: String = null,
    url: String = null
  ): Anon_Mcc = {
    val __obj = js.Dynamic.literal()
    if (mcc != null) __obj.updateDynamic("mcc")(mcc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (product_description != null) __obj.updateDynamic("product_description")(product_description.asInstanceOf[js.Any])
    if (support_address != null) __obj.updateDynamic("support_address")(support_address.asInstanceOf[js.Any])
    if (support_email != null) __obj.updateDynamic("support_email")(support_email.asInstanceOf[js.Any])
    if (support_phone != null) __obj.updateDynamic("support_phone")(support_phone.asInstanceOf[js.Any])
    if (support_url != null) __obj.updateDynamic("support_url")(support_url.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mcc]
  }
}

