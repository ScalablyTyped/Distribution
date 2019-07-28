package typings.waitDashPromise.waitDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wait extends js.Object {
  def after(time: Double): this.type = js.native
  def and(func: js.Function0[Unit]): this.type = js.native
  def before(time: Double): this.type = js.native
  def check(): js.Promise[Unit] = js.native
  def check[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def every(interval: Double): this.type = js.native
  def every(interval: Double, limit: Double): this.type = js.native
  // The promise returned by `forward()` never resolves.
  def forward(): js.Promise[Unit] = js.native
  def limit(limit: Double): this.type = js.native
  def till[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def until[T](cond: js.Function0[T]): js.Promise[T] = js.native
}

