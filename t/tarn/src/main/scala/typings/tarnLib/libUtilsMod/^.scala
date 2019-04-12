package typings
package tarnLib.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkOptionalTime(): scala.Boolean = js.native
  def checkOptionalTime(time: scala.Double): scala.Boolean = js.native
  def checkRequiredTime(time: scala.Double): scala.Boolean = js.native
  def defer[T](): Deferred[T] = js.native
  def delay(millis: scala.Double): js.Promise[js.Object] = js.native
  def duration(t1: scala.Double, t2: scala.Double): scala.Double = js.native
  def now(): scala.Double = js.native
  def reflect[T](promise: js.Promise[T]): js.Promise[
    tarnLib.libPromiseInspectionMod.PromiseInspection[T] | tarnLib.libPromiseInspectionMod.PromiseInspection[js.Object]
  ] = js.native
  def tryPromise[T](cb: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
}

