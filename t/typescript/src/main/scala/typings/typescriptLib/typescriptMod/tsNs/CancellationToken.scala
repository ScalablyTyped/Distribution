package typings
package typescriptLib.typescriptMod.tsNs

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
  def apply(
    isCancellationRequested: js.Function0[scala.Boolean],
    throwIfCancellationRequested: js.Function0[scala.Unit]
  ): CancellationToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCancellationRequested")(isCancellationRequested)
    __obj.updateDynamic("throwIfCancellationRequested")(throwIfCancellationRequested)
    __obj.asInstanceOf[CancellationToken]
  }
}

