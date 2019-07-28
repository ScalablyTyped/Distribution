package typings.when.WhenNs

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
  - typings.when.WhenNs.FulfilledDescriptor[T]
  - typings.when.WhenNs.RejectedDescriptor
*/
trait Descriptor[T] extends js.Object

