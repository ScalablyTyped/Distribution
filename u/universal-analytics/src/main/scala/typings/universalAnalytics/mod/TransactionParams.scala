package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionParams
  extends /* key */ StringDictionary[js.Any] {
  var p: js.UndefOr[String] = js.native
  /**
    * Transaction Affiliation
    *
    * Specifies the affiliation or store name.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Member`
    */
  var ta: js.UndefOr[String] = js.native
  /**
    * Transaction ID
    *
    * **Required for transaction hit type.**
    *
    *
    * A unique identifier for the transaction. This value should be the same for both the Transaction
    * hit and Items hits associated to the particular transaction.
    *
    * Max length: 500 Bytes
    *
    * Example value: `OD564`
    */
  var ti: js.UndefOr[String] = js.native
  /**
    * Transaction Revenue
    *
    * Specifies the total revenue associated with the transaction. This value should include any
    * shipping or tax costs.
    *
    * Example value: `15.47`
    */
  var tr: js.UndefOr[String | Double] = js.native
  /**
    * Transaction Shipping
    *
    * Specifies the total shipping cost of the transaction.
    *
    * Example value: `3.50`
    */
  var ts: js.UndefOr[String | Double] = js.native
  /**
    * Transaction Tax
    *
    * Specifies the total tax of the transaction.
    *
    * Example value: `11.20`
    */
  var tt: js.UndefOr[String | Double] = js.native
}

object TransactionParams {
  @scala.inline
  def apply(): TransactionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionParams]
  }
  @scala.inline
  implicit class TransactionParamsOps[Self <: TransactionParams] (val x: Self) extends AnyVal {
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
    def setP(value: String): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setTa(value: String): Self = this.set("ta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTa: Self = this.set("ta", js.undefined)
    @scala.inline
    def setTi(value: String): Self = this.set("ti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTi: Self = this.set("ti", js.undefined)
    @scala.inline
    def setTr(value: String | Double): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
    @scala.inline
    def setTs(value: String | Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
    @scala.inline
    def setTt(value: String | Double): Self = this.set("tt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTt: Self = this.set("tt", js.undefined)
  }
  
}

