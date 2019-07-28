package typings.when.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snapshot which describes the status of a promise.
  * state may be one of:
  * "fulfilled" - the promise has resolved
  * "rejected" - the promise has rejected
  * "pending" - the promise is still pending to resolve/reject
  */
/* Rewritten from type alias, can be one of: 
  - typings.when.WhenNs.FulfilledDescriptor[T]
  - typings.when.WhenNs.RejectedDescriptor
  - typings.when.WhenNs.PendingDescriptor
*/
trait Snapshot[T] extends js.Object

