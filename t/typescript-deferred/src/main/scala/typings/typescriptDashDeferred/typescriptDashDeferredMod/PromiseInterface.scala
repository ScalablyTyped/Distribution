package typings.typescriptDashDeferred.typescriptDashDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseInterface[T] extends ThenableInterface[T] {
  def always[TP](): PromiseInterface[TP] = js.native
  def always[TP](errorCB: DeferredErrorCB[TP] | ImmediateErrorCB[TP]): PromiseInterface[TP] = js.native
  def otherwise(): PromiseInterface[T] = js.native
  def otherwise(errorCB: DeferredErrorCB[T] | ImmediateErrorCB[T]): PromiseInterface[T] = js.native
}

