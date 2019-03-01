package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingDescriptor
  extends Snapshot[js.Any] {
  var state: whenLib.whenLibStrings.pending
}

object PendingDescriptor {
  @scala.inline
  def apply(state: whenLib.whenLibStrings.pending): PendingDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PendingDescriptor]
  }
}

