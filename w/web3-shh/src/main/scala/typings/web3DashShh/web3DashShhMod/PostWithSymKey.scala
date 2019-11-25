package typings.web3DashShh.web3DashShhMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostWithSymKey extends PostBase {
  var symKeyID: String
}

object PostWithSymKey {
  @scala.inline
  def apply(
    payload: String,
    symKeyID: String,
    topic: String,
    ttl: Double,
    padding: Int | Double = null,
    powTarget: Int | Double = null,
    powTime: Int | Double = null,
    sig: String = null,
    targetPeer: Int | Double = null
  ): PostWithSymKey = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], symKeyID = symKeyID.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (powTarget != null) __obj.updateDynamic("powTarget")(powTarget.asInstanceOf[js.Any])
    if (powTime != null) __obj.updateDynamic("powTime")(powTime.asInstanceOf[js.Any])
    if (sig != null) __obj.updateDynamic("sig")(sig.asInstanceOf[js.Any])
    if (targetPeer != null) __obj.updateDynamic("targetPeer")(targetPeer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostWithSymKey]
  }
}

