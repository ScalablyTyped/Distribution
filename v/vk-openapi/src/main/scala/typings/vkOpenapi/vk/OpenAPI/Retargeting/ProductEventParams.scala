package typings.vkOpenapi.vk.OpenAPI.Retargeting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductEventParams extends js.Object {
  var business_value: js.UndefOr[Double] = js.undefined
  var category_ids: js.UndefOr[String] = js.undefined
  var currency_code: js.UndefOr[String] = js.undefined
  var products: js.UndefOr[js.Array[Product]] = js.undefined
  var products_recommended_ids: js.UndefOr[String] = js.undefined
  var search_string: js.UndefOr[String] = js.undefined
  var total_price: js.UndefOr[Double] = js.undefined
}

object ProductEventParams {
  @scala.inline
  def apply(
    business_value: Int | Double = null,
    category_ids: String = null,
    currency_code: String = null,
    products: js.Array[Product] = null,
    products_recommended_ids: String = null,
    search_string: String = null,
    total_price: Int | Double = null
  ): ProductEventParams = {
    val __obj = js.Dynamic.literal()
    if (business_value != null) __obj.updateDynamic("business_value")(business_value.asInstanceOf[js.Any])
    if (category_ids != null) __obj.updateDynamic("category_ids")(category_ids.asInstanceOf[js.Any])
    if (currency_code != null) __obj.updateDynamic("currency_code")(currency_code.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (products_recommended_ids != null) __obj.updateDynamic("products_recommended_ids")(products_recommended_ids.asInstanceOf[js.Any])
    if (search_string != null) __obj.updateDynamic("search_string")(search_string.asInstanceOf[js.Any])
    if (total_price != null) __obj.updateDynamic("total_price")(total_price.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductEventParams]
  }
}

