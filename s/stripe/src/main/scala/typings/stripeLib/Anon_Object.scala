package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Object extends js.Object {
  /**
    * describes the object the event is about. For example, an
    * invoice.created event will have a full invoice object as the value of
    * the object key.
    */
  var `object`: stripeLib.stripeMod.IObject
  var previous_attributes: js.UndefOr[js.Object] = js.undefined
}

object Anon_Object {
  @scala.inline
  def apply(`object`: stripeLib.stripeMod.IObject, previous_attributes: js.Object = null): Anon_Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    if (previous_attributes != null) __obj.updateDynamic("previous_attributes")(previous_attributes)
    __obj.asInstanceOf[Anon_Object]
  }
}

