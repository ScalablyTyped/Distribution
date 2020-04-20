package typings.vkOpenapi.vk.OpenAPI.Retargeting

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  var group_id: js.UndefOr[String] = js.undefined
  var id: String
  var price: js.UndefOr[Double] = js.undefined
  var price_from: js.UndefOr[NumericBoolean] = js.undefined
  var price_old: js.UndefOr[Double] = js.undefined
  var recommended_ids: js.UndefOr[String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    id: String,
    group_id: String = null,
    price: Int | Double = null,
    price_from: NumericBoolean = null,
    price_old: Int | Double = null,
    recommended_ids: String = null
  ): Product = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (price_from != null) __obj.updateDynamic("price_from")(price_from.asInstanceOf[js.Any])
    if (price_old != null) __obj.updateDynamic("price_old")(price_old.asInstanceOf[js.Any])
    if (recommended_ids != null) __obj.updateDynamic("recommended_ids")(recommended_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

