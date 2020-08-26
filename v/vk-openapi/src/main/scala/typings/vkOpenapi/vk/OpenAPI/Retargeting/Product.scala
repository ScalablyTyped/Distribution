package typings.vkOpenapi.vk.OpenAPI.Retargeting

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  var group_id: js.UndefOr[String] = js.native
  var id: String = js.native
  var price: js.UndefOr[Double] = js.native
  var price_from: js.UndefOr[NumericBoolean] = js.native
  var price_old: js.UndefOr[Double] = js.native
  var recommended_ids: js.UndefOr[String] = js.native
}

object Product {
  @scala.inline
  def apply(id: String): Product = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup_id(value: String): Self = this.set("group_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup_id: Self = this.set("group_id", js.undefined)
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setPrice_from(value: NumericBoolean): Self = this.set("price_from", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice_from: Self = this.set("price_from", js.undefined)
    @scala.inline
    def setPrice_old(value: Double): Self = this.set("price_old", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice_old: Self = this.set("price_old", js.undefined)
    @scala.inline
    def setRecommended_ids(value: String): Self = this.set("recommended_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommended_ids: Self = this.set("recommended_ids", js.undefined)
  }
  
}

