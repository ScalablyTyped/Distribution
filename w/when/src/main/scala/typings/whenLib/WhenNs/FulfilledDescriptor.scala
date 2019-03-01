package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FulfilledDescriptor[T]
  extends Descriptor[T]
     with Snapshot[T] {
  var state: whenLib.whenLibStrings.fulfilled
  var value: T
}

object FulfilledDescriptor {
  @scala.inline
  def apply[T](state: whenLib.whenLibStrings.fulfilled, value: T): FulfilledDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfilledDescriptor[T]]
  }
}

