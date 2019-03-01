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
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("associated_objects")(associated_objects)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[IEphemeralKey]
  }
}

