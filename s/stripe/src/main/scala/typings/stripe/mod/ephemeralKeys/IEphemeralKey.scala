package typings.stripe.mod.ephemeralKeys

import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.ephemeral_key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEphemeralKey extends IResourceObject {
  var associated_objects: js.Array[IAssociatedObject] = js.native
  var created: Double = js.native
  var expires: Double = js.native
  var livemode: Boolean = js.native
  @JSName("object")
  var object_IEphemeralKey: ephemeral_key = js.native
  var secret: String = js.native
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
  @scala.inline
  implicit class IEphemeralKeyOps[Self <: IEphemeralKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociated_objectsVarargs(value: IAssociatedObject*): Self = this.set("associated_objects", js.Array(value :_*))
    @scala.inline
    def setAssociated_objects(value: js.Array[IAssociatedObject]): Self = this.set("associated_objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ephemeral_key): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
  
}

