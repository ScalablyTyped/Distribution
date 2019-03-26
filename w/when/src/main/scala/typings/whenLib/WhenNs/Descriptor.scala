package typings
package whenLib.WhenNs

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
  - FulfilledDescriptor[T]
  - RejectedDescriptor
*/
trait Descriptor[T] extends js.Object

