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

