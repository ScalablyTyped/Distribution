package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var allowP2P: js.UndefOr[Boolean] = js.undefined
  var minPow: js.UndefOr[Double] = js.undefined
  var privateKeyID: js.UndefOr[String] = js.undefined
  var sig: js.UndefOr[String] = js.undefined
  var symKeyID: js.UndefOr[String] = js.undefined
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    allowP2P: js.UndefOr[Boolean] = js.undefined,
    minPow: js.UndefOr[Double] = js.undefined,
    privateKeyID: String = null,
    sig: String = null,
    symKeyID: String = null,
    topics: js.Array[String] = null,
    ttl: js.UndefOr[Double] = js.undefined
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowP2P)) __obj.updateDynamic("allowP2P")(allowP2P.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPow)) __obj.updateDynamic("minPow")(minPow.get.asInstanceOf[js.Any])
    if (privateKeyID != null) __obj.updateDynamic("privateKeyID")(privateKeyID.asInstanceOf[js.Any])
    if (sig != null) __obj.updateDynamic("sig")(sig.asInstanceOf[js.Any])
    if (symKeyID != null) __obj.updateDynamic("symKeyID")(symKeyID.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

