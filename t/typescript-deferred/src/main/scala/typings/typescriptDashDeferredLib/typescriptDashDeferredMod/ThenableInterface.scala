package typings
package typescriptDashDeferredLib.typescriptDashDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThenableInterface[T] extends js.Object {
  def `then`[TP](): ThenableInterface[TP] = js.native
  def `then`[TP](successCB: (DeferredSuccessCB[T, TP]) | (ImmediateSuccessCB[T, TP])): ThenableInterface[TP] = js.native
  def `then`[TP](
    successCB: (DeferredSuccessCB[T, TP]) | (ImmediateSuccessCB[T, TP]),
    errorCB: DeferredErrorCB[TP] | ImmediateErrorCB[TP]
  ): ThenableInterface[TP] = js.native
}

