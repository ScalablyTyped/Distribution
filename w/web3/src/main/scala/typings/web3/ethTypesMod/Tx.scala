package typings.web3.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tx extends js.Object {
  var chainId: js.UndefOr[String | Double] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var gas: js.UndefOr[String | Double] = js.undefined
  var gasPrice: js.UndefOr[String | Double] = js.undefined
  var nonce: js.UndefOr[String | Double] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object Tx {
  @scala.inline
  def apply(
    chainId: String | Double = null,
    data: String = null,
    from: String = null,
    gas: String | Double = null,
    gasPrice: String | Double = null,
    nonce: String | Double = null,
    to: String = null,
    value: String | Double = null
  ): Tx = {
    val __obj = js.Dynamic.literal()
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (from != null) __obj.updateDynamic("from")(from)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tx]
  }
}

