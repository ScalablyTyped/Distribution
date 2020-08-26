package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchExtBitsProduct extends js.Object {
  /**
    * Cost object.
    */
  var cost: TwitchExtBitsProductCost = js.native
  /**
    * Registered display name for the SKU.
    */
  var displayName: String = js.native
  /**
    * This field is returned only for extension versions that are not in the Released state.
    */
  var inDevelopment: js.UndefOr[Boolean] = js.native
  /**
    * Unique ID for the product.
    */
  var sku: String = js.native
}

object TwitchExtBitsProduct {
  @scala.inline
  def apply(cost: TwitchExtBitsProductCost, displayName: String, sku: String): TwitchExtBitsProduct = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtBitsProduct]
  }
  @scala.inline
  implicit class TwitchExtBitsProductOps[Self <: TwitchExtBitsProduct] (val x: Self) extends AnyVal {
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
    def setCost(value: TwitchExtBitsProductCost): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def setInDevelopment(value: Boolean): Self = this.set("inDevelopment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInDevelopment: Self = this.set("inDevelopment", js.undefined)
  }
  
}

