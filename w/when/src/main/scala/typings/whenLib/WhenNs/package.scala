package typings
package whenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WhenNs {
  /**
       * Describes the outcome of a promise.
       * state may be one of:
       * "fulfilled" - the promise has resolved
       * "rejected" - the promise has rejected
       */
  type Descriptor[T] = FulfilledDescriptor[T] | RejectedDescriptor
  /**
       * Snapshot which describes the status of a promise.
       * state may be one of:
       * "fulfilled" - the promise has resolved
       * "rejected" - the promise has rejected
       * "pending" - the promise is still pending to resolve/reject
       */
  type Snapshot[T] = FulfilledDescriptor[T] | RejectedDescriptor | PendingDescriptor
}
