package typings
package tarnLib.libPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolOptions[T] extends js.Object {
  var acquireTimeoutMillis: js.UndefOr[scala.Double] = js.native
  var createRetryIntervalMillis: js.UndefOr[scala.Double] = js.native
  var createTimeoutMillis: js.UndefOr[scala.Double] = js.native
  @JSName("create")
  var create_Original: CallbackOrPromise[T] = js.native
  var destroyTimeoutMillis: js.UndefOr[scala.Double] = js.native
  var idleTimeoutMillis: js.UndefOr[scala.Double] = js.native
  var log: js.UndefOr[js.Function1[/* msg */ java.lang.String, _]] = js.native
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var propagateCreateError: js.UndefOr[scala.Boolean] = js.native
  var reapIntervalMillis: js.UndefOr[scala.Double] = js.native
  var validate: js.UndefOr[js.Function1[/* resource */ T, scala.Boolean]] = js.native
  def create(cb: Callback[T]): js.Any | js.Function0[js.Promise[T]] = js.native
  def destroy(resource: T): js.Any = js.native
}

