package typings.when.When

import typings.when.whenStrings.fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FulfilledDescriptor[T]
  extends Descriptor[T]
     with Snapshot[T] {
  var state: fulfilled
  var value: T
}

object FulfilledDescriptor {
  @scala.inline
  def apply[T](state: fulfilled, value: T): FulfilledDescriptor[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FulfilledDescriptor[T]]
  }
}

