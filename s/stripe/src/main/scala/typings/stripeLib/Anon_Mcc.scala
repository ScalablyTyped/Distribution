package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mcc extends js.Object {
  /**
    * The merchant category code for the account. MCCs are used to classify businesses
    * based on the goods or services they provide.
    */
  var mcc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer-facing business name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Internal-only description of the product sold or service provided by the
    * business. It’s used by Stripe for risk and underwriting purposes.
    */
  var product_description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A publicly available mailing address for sending support issues to.
    */
  var support_address: js.UndefOr[Anon_City] = js.undefined
  /**
    * A publicly available email address for sending support issues to.
    */
  var support_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A publicly available phone number to call with support issues.
    */
  var support_phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A publicly available website for handling support issues.
    */
  var support_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The business’s publicly available website.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Mcc {
  @scala.inline
  def apply(
    mcc: java.lang.String = null,
    name: java.lang.String = null,
    product_description: java.lang.String = null,
    support_address: Anon_City = null,
    support_email: java.lang.String = null,
    support_phone: java.lang.String = null,
    support_url: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_Mcc = {
    val __obj = js.Dynamic.literal()
    if (mcc != null) __obj.updateDynamic("mcc")(mcc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (support_address != null) __obj.updateDynamic("support_address")(support_address)
    if (support_email != null) __obj.updateDynamic("support_email")(support_email)
    if (support_phone != null) __obj.updateDynamic("support_phone")(support_phone)
    if (support_url != null) __obj.updateDynamic("support_url")(support_url)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Mcc]
  }
}

