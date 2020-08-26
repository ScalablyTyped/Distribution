package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Item Code
    *
    * Specifies the SKU or item code.
    *
    * Max length: 500 Bytes
    *
    * Example value: `SKU47`
    */
  var ic: js.UndefOr[String] = js.native
  /**
    * Item Name
    *
    * **Required for item hit type.**
    *
    * Specifies the item name.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Shoe`
    */
  var in: js.UndefOr[String] = js.native
  /**
    * Item Price
    *
    * Specifies the price for a single item / unit.
    *
    * Example value: `3.50`
    */
  var ip: js.UndefOr[String | Double] = js.native
  /**
    * Item Quantity
    *
    * Specifies the number of items purchased.
    *
    * Example value: `4`
    */
  var iq: js.UndefOr[String | Double] = js.native
  /**
    * Item Category
    *
    * Specifies the category that the item belongs to.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Blue`
    */
  var iv: js.UndefOr[String] = js.native
  var p: js.UndefOr[String] = js.native
  /**
    * Transaction ID
    *
    * **Required for item hit type.**
    *
    * A unique identifier for the transaction. This value should be the same for both the Transaction
    * hit and Items hits associated to the particular transaction.
    *
    * Max length: 500 Bytes
    *
    * Example value: `OD564`
    */
  var ti: js.UndefOr[String] = js.native
}

object ItemParams {
  @scala.inline
  def apply(): ItemParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemParams]
  }
  @scala.inline
  implicit class ItemParamsOps[Self <: ItemParams] (val x: Self) extends AnyVal {
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
    def setIc(value: String): Self = this.set("ic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIc: Self = this.set("ic", js.undefined)
    @scala.inline
    def setIn(value: String): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setIp(value: String | Double): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setIq(value: String | Double): Self = this.set("iq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIq: Self = this.set("iq", js.undefined)
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    @scala.inline
    def setP(value: String): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setTi(value: String): Self = this.set("ti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTi: Self = this.set("ti", js.undefined)
  }
  
}

