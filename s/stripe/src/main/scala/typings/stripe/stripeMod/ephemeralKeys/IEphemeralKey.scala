package typings.stripe.stripeMod.ephemeralKeys

import typings.stripe.stripeMod.IResourceObject
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
    val __obj = js.Dynamic.literal(associated_objects = associated_objects, created = created, expires = expires, id = id, livemode = livemode, secret = secret)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IEphemeralKey]
  }
}

