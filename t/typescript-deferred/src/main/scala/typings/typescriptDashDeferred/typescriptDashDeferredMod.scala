package typings.typescriptDashDeferred

import typings.typescriptDashDeferred.typescriptDashDeferredMod.DeferredErrorCB
import typings.typescriptDashDeferred.typescriptDashDeferredMod.DeferredInterface
import typings.typescriptDashDeferred.typescriptDashDeferredMod.DeferredSuccessCB
import typings.typescriptDashDeferred.typescriptDashDeferredMod.ImmediateErrorCB
import typings.typescriptDashDeferred.typescriptDashDeferredMod.ImmediateSuccessCB
import typings.typescriptDashDeferred.typescriptDashDeferredMod.PromiseInterface
import typings.typescriptDashDeferred.typescriptDashDeferredMod.ThenableInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-deferred", JSImport.Namespace)
@js.native
object typescriptDashDeferredMod extends js.Object {
  @js.native
  trait DeferredInterface[T] extends js.Object {
    var promise: PromiseInterface[T] = js.native
    def reject(): DeferredInterface[T] = js.native
    def reject(error: js.Any): DeferredInterface[T] = js.native
    def resolve(): DeferredInterface[T] = js.native
    def resolve(value: T): DeferredInterface[T] = js.native
    def resolve(value: ThenableInterface[T]): DeferredInterface[T] = js.native
  }
  
  @js.native
  trait PromiseInterface[T] extends ThenableInterface[T] {
    def always[TP](): PromiseInterface[TP] = js.native
    def always[TP](errorCB: DeferredErrorCB[TP] | ImmediateErrorCB[TP]): PromiseInterface[TP] = js.native
    def otherwise(): PromiseInterface[T] = js.native
    def otherwise(errorCB: DeferredErrorCB[T] | ImmediateErrorCB[T]): PromiseInterface[T] = js.native
  }
  
  @js.native
  trait ThenableInterface[T] extends js.Object {
    def `then`[TP](): ThenableInterface[TP] = js.native
    def `then`[TP](successCB: (DeferredSuccessCB[T, TP]) | (ImmediateSuccessCB[T, TP])): ThenableInterface[TP] = js.native
    def `then`[TP](
      successCB: (DeferredSuccessCB[T, TP]) | (ImmediateSuccessCB[T, TP]),
      errorCB: DeferredErrorCB[TP] | ImmediateErrorCB[TP]
    ): ThenableInterface[TP] = js.native
  }
  
  def create[T](): DeferredInterface[T] = js.native
  def when[T](): PromiseInterface[T] = js.native
  def when[T](value: T): PromiseInterface[T] = js.native
  def when[T](value: ThenableInterface[T]): PromiseInterface[T] = js.native
  type DeferredErrorCB[TP] = js.Function1[/* error */ js.Any, ThenableInterface[TP]]
  type DeferredSuccessCB[T, TP] = js.Function1[/* value */ T, ThenableInterface[TP]]
  type ImmediateErrorCB[TP] = js.Function1[/* err */ js.Any, TP]
  type ImmediateSuccessCB[T, TP] = js.Function1[/* value */ T, TP]
}

