package typings
package waitDashPromiseLib.waitDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wait-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def after(time: scala.Double): Wait = js.native
  def and(func: js.Function0[scala.Unit]): Wait = js.native
  def before(time: scala.Double): Wait = js.native
  def check(): js.Promise[scala.Unit] = js.native
  def check[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def every(interval: scala.Double): Wait = js.native
  def every(interval: scala.Double, limit: scala.Double): Wait = js.native
  def forward(): js.Promise[scala.Unit] = js.native
  def limit(limit: scala.Double): Wait = js.native
  def sleep(time: scala.Double): js.Promise[scala.Unit] = js.native
  def till[T](cond: js.Function0[T]): js.Promise[T] = js.native
  def until[T](cond: js.Function0[T]): js.Promise[T] = js.native
}

