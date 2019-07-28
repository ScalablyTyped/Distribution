package typings.tarn.libPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolOptions[T] extends js.Object {
  var acquireTimeoutMillis: js.UndefOr[Double] = js.native
  var createRetryIntervalMillis: js.UndefOr[Double] = js.native
  var createTimeoutMillis: js.UndefOr[Double] = js.native
  @JSName("create")
  var create_Original: CallbackOrPromise[T] = js.native
  var destroyTimeoutMillis: js.UndefOr[Double] = js.native
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  var log: js.UndefOr[js.Function1[/* msg */ String, _]] = js.native
  var max: Double = js.native
  var min: Double = js.native
  var propagateCreateError: js.UndefOr[Boolean] = js.native
  var reapIntervalMillis: js.UndefOr[Double] = js.native
  var validate: js.UndefOr[js.Function1[/* resource */ T, Boolean]] = js.native
  def create(cb: Callback[T]): js.Any | js.Function0[js.Promise[T]] = js.native
  def destroy(resource: T): js.Any = js.native
}

