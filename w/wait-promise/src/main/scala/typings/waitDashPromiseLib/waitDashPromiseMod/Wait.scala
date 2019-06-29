package typings
package waitDashPromiseLib.waitDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wait extends js.Object {
  def after(time: scala.Double): this.type = js.native
  def and(func: js.Function0[scala.Unit]): this.type = js.native
  def before(time: scala.Double): this.type = js.native
  def check(): js.Promise[scala.Unit] = js.native
  def check[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def every(interval: scala.Double): this.type = js.native
  def every(interval: scala.Double, limit: scala.Double): this.type = js.native
  // The promise returned by `forward()` never resolves.
  def forward(): js.Promise[scala.Unit] = js.native
  def limit(limit: scala.Double): this.type = js.native
  def till[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def until[T](cond: js.Function0[T]): js.Promise[T] = js.native
}

