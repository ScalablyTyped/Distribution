package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationToken extends js.Object {
  def isCancellationRequested(): Boolean
  /** @throws OperationCanceledException if isCancellationRequested is true */
  def throwIfCancellationRequested(): Unit
}

object CancellationToken {
  @scala.inline
  def apply(isCancellationRequested: () => Boolean, throwIfCancellationRequested: () => Unit): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested), throwIfCancellationRequested = js.Any.fromFunction0(throwIfCancellationRequested))
  
    __obj.asInstanceOf[CancellationToken]
  }
}

