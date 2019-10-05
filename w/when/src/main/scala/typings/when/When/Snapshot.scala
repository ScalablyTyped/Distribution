package typings.when.When

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
  - typings.when.When.FulfilledDescriptor[T]
  - typings.when.When.RejectedDescriptor
  - typings.when.When.PendingDescriptor
*/
trait Snapshot[T] extends js.Object

