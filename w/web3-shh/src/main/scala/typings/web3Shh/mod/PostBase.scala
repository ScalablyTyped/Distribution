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
    padding: Int | Double = null,
    powTarget: Int | Double = null,
    powTime: Int | Double = null,
    sig: String = null,
    targetPeer: Int | Double = null
  ): PostBase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (powTarget != null) __obj.updateDynamic("powTarget")(powTarget.asInstanceOf[js.Any])
    if (powTime != null) __obj.updateDynamic("powTime")(powTime.asInstanceOf[js.Any])
    if (sig != null) __obj.updateDynamic("sig")(sig.asInstanceOf[js.Any])
    if (targetPeer != null) __obj.updateDynamic("targetPeer")(targetPeer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBase]
  }
}

