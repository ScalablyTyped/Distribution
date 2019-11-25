package typings.web3DashShh.web3DashShhMod

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
    minPow: Int | Double = null,
    privateKeyID: String = null,
    sig: String = null,
    symKeyID: String = null,
    topics: js.Array[String] = null,
    ttl: Int | Double = null
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowP2P)) __obj.updateDynamic("allowP2P")(allowP2P.asInstanceOf[js.Any])
    if (minPow != null) __obj.updateDynamic("minPow")(minPow.asInstanceOf[js.Any])
    if (privateKeyID != null) __obj.updateDynamic("privateKeyID")(privateKeyID.asInstanceOf[js.Any])
    if (sig != null) __obj.updateDynamic("sig")(sig.asInstanceOf[js.Any])
    if (symKeyID != null) __obj.updateDynamic("symKeyID")(symKeyID.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

