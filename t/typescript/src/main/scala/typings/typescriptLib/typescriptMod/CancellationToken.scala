package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationToken extends js.Object {
  def isCancellationRequested(): scala.Boolean
  /** @throws OperationCanceledException if isCancellationRequested is true */
  def throwIfCancellationRequested(): scala.Unit
}

object CancellationToken {
  @scala.inline
  def apply(isCancellationRequested: () => scala.Boolean, throwIfCancellationRequested: () => scala.Unit): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested), throwIfCancellationRequested = js.Any.fromFunction0(throwIfCancellationRequested))
  
    __obj.asInstanceOf[CancellationToken]
  }
}

