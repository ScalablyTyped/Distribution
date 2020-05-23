package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostWithPubKey extends PostBase {
  var pubKey: String
}

object PostWithPubKey {
  @scala.inline
  def apply(
    payload: String,
    pubKey: String,
    topic: String,
    ttl: Double,
    padding: js.UndefOr[Double] = js.undefined,
    powTarget: js.UndefOr[Double] = js.undefined,
    powTime: js.UndefOr[Double] = js.undefined,
    sig: String = null,
    targetPeer: js.UndefOr[Double] = js.undefined
  ): PostWithPubKey = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pubKey = pubKey.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(powTarget)) __obj.updateDynamic("powTarget")(powTarget.get.asInstanceOf[js.Any])
    if (!js.isUndefined(powTime)) __obj.updateDynamic("powTime")(powTime.get.asInstanceOf[js.Any])
    if (sig != null) __obj.updateDynamic("sig")(sig.asInstanceOf[js.Any])
    if (!js.isUndefined(targetPeer)) __obj.updateDynamic("targetPeer")(targetPeer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWithPubKey]
  }
}

