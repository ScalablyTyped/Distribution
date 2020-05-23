package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostBase extends js.Object {
  var padding: js.UndefOr[Double] = js.undefined
  var payload: String
  var powTarget: js.UndefOr[Double] = js.undefined
  var powTime: js.UndefOr[Double] = js.undefined
  var sig: js.UndefOr[String] = js.undefined
  var targetPeer: js.UndefOr[Double] = js.undefined
  var topic: String
  var ttl: Double
}

object PostBase {
  @scala.inline
  def apply(
    payload: String,
    topic: String,
    ttl: Double,
    padding: js.UndefOr[Double] = js.undefined,
    powTarget: js.UndefOr[Double] = js.undefined,
    powTime: js.UndefOr[Double] = js.undefined,
    sig: String = null,
    targetPeer: js.UndefOr[Double] = js.undefined
  ): PostBase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(powTarget)) __obj.updateDynamic("powTarget")(powTarget.get.asInstanceOf[js.Any])
    if (!js.isUndefined(powTime)) __obj.updateDynamic("powTime")(powTime.get.asInstanceOf[js.Any])
    if (sig != null) __obj.updateDynamic("sig")(sig.asInstanceOf[js.Any])
    if (!js.isUndefined(targetPeer)) __obj.updateDynamic("targetPeer")(targetPeer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBase]
  }
}

