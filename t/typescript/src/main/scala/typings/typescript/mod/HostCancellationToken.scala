package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostCancellationToken extends js.Object {
  def isCancellationRequested(): Boolean
}

object HostCancellationToken {
  @scala.inline
  def apply(isCancellationRequested: () => Boolean): HostCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested))
  
    __obj.asInstanceOf[HostCancellationToken]
  }
}

