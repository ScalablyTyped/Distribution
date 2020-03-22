package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionParams
  extends /* key */ StringDictionary[js.Any] {
  var p: js.UndefOr[String] = js.undefined
  /**
    * Transaction Affiliation
    *
    * Specifies the affiliation or store name.
    *
    * Max length: 500 Bytes
    *
    * Example value: `Member`
    */
  var ta: js.UndefOr[String] = js.undefined
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
  var ti: js.UndefOr[String] = js.undefined
  /**
    * Transaction Revenue
    *
    * Specifies the total revenue associated with the transaction. This value should include any
    * shipping or tax costs.
    *
    * Example value: `15.47`
    */
  var tr: js.UndefOr[String | Double] = js.undefined
  /**
    * Transaction Shipping
    *
    * Specifies the total shipping cost of the transaction.
    *
    * Example value: `3.50`
    */
  var ts: js.UndefOr[String | Double] = js.undefined
  /**
    * Transaction Tax
    *
    * Specifies the total tax of the transaction.
    *
    * Example value: `11.20`
    */
  var tt: js.UndefOr[String | Double] = js.undefined
}

object TransactionParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    p: String = null,
    ta: String = null,
    ti: String = null,
    tr: String | Double = null,
    ts: String | Double = null,
    tt: String | Double = null
  ): TransactionParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (ta != null) __obj.updateDynamic("ta")(ta.asInstanceOf[js.Any])
    if (ti != null) __obj.updateDynamic("ti")(ti.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (tt != null) __obj.updateDynamic("tt")(tt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionParams]
  }
}

