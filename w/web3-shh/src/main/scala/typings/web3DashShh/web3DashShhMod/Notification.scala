package typings.web3DashShh.web3DashShhMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var hash: String
  var padding: Double
  var payload: String
  var pow: Double
  var recipientPublicKey: js.UndefOr[String] = js.undefined
  var sig: js.UndefOr[String] = js.undefined
  var timestamp: String
  var topic: String
  var ttl: Double
}

object Notification {
  @scala.inline
  def apply(
    hash: String,
    padding: Double,
    payload: String,
    pow: Double,
    timestamp: String,
    topic: String,
    ttl: Double,
    recipientPublicKey: String = null,
    sig: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal(hash = hash, padding = padding, payload = payload, pow = pow, timestamp = timestamp, topic = topic, ttl = ttl)
    if (recipientPublicKey != null) __obj.updateDynamic("recipientPublicKey")(recipientPublicKey)
    if (sig != null) __obj.updateDynamic("sig")(sig)
    __obj.asInstanceOf[Notification]
  }
}

