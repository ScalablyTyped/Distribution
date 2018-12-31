package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectPreviousattributes extends js.Object {
  /**
    * describes the object the event is about. For example, an
    * invoice.created event will have a full invoice object as the value of
    * the object key.
    */
  var `object`: stripeLib.stripeMod.StripeNs.IObject
  var previous_attributes: js.UndefOr[js.Object] = js.undefined
}

