package typings.waitDashPromise.waitDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wait-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def after(time: Double): Wait = js.native
  def and(func: js.Function0[Unit]): Wait = js.native
  def before(time: Double): Wait = js.native
  def check(): js.Promise[Unit] = js.native
  def check[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def every(interval: Double): Wait = js.native
  def every(interval: Double, limit: Double): Wait = js.native
  def forward(): js.Promise[Unit] = js.native
  def limit(limit: Double): Wait = js.native
  def sleep(time: Double): js.Promise[Unit] = js.native
  def till[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def until[T](cond: js.Function0[T]): js.Promise[T] = js.native
}

