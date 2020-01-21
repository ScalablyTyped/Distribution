package typings.stripe.mod.ephemeralKeys

import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.ephemeral_key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEphemeralKey extends IResourceObject {
  var associated_objects: js.Array[IAssociatedObject]
  var created: Double
  var expires: Double
  var livemode: Boolean
  @JSName("object")
  var object_IEphemeralKey: ephemeral_key
  var secret: String
}

object IEphemeralKey {
  @scala.inline
  def apply(
    associated_objects: js.Array[IAssociatedObject],
    created: Double,
    expires: Double,
    id: String,
    livemode: Boolean,
    `object`: ephemeral_key,
    secret: String
  ): IEphemeralKey = {
    val __obj = js.Dynamic.literal(associated_objects = associated_objects.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEphemeralKey]
  }
}

