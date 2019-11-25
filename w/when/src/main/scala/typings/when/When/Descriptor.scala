package typings.when.When

import typings.when.whenStrings.fulfilled
import typings.when.whenStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the outcome of a promise.
  * state may be one of:
  * "fulfilled" - the promise has resolved
  * "rejected" - the promise has rejected
  */
/* Rewritten from type alias, can be one of: 
  - typings.when.When.FulfilledDescriptor[T]
  - typings.when.When.RejectedDescriptor
*/
trait Descriptor[T] extends js.Object

object Descriptor {
  @scala.inline
  def FulfilledDescriptor[T](state: fulfilled, value: T): Descriptor[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Descriptor[T]]
  }
  @scala.inline
  def RejectedDescriptor[T](reason: js.Any, state: rejected): Descriptor[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Descriptor[T]]
  }
}

