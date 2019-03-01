package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectedDescriptor
  extends Descriptor[js.Any]
     with Snapshot[js.Any] {
  var reason: js.Any
  var state: whenLib.whenLibStrings.rejected
}

object RejectedDescriptor {
  @scala.inline
  def apply(reason: js.Any, state: whenLib.whenLibStrings.rejected): RejectedDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[RejectedDescriptor]
  }
}

