package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tx extends js.Object {
  var chainId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var gas: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var gasPrice: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var nonce: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Tx {
  @scala.inline
  def apply(
    chainId: java.lang.String | scala.Double = null,
    data: java.lang.String = null,
    from: java.lang.String = null,
    gas: java.lang.String | scala.Double = null,
    gasPrice: java.lang.String | scala.Double = null,
    nonce: java.lang.String | scala.Double = null,
    to: java.lang.String = null,
    value: java.lang.String | scala.Double = null
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

