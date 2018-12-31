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

