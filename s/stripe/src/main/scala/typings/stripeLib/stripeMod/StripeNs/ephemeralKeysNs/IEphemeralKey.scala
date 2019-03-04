package typings
package stripeLib.stripeMod.StripeNs.ephemeralKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEphemeralKey
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  var associated_objects: js.Array[IAssociatedObject]
  var created: scala.Double
  var expires: scala.Double
  var livemode: scala.Boolean
  @JSName("object")
  var object_IEphemeralKey: stripeLib.stripeLibStrings.ephemeral_key
  var secret: java.lang.String
}

object IEphemeralKey {
  @scala.inline
  def apply(
    associated_objects: js.Array[IAssociatedObject],
    created: scala.Double,
    expires: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.ephemeral_key,
    secret: java.lang.String
  ): IEphemeralKey = {
    val __obj = js.Dynamic.literal(associated_objects = associated_objects, created = created, expires = expires, id = id, livemode = livemode, secret = secret)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IEphemeralKey]
  }
}

