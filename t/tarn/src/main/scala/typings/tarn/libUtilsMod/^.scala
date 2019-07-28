package typings.tarn.libUtilsMod

import typings.tarn.libPromiseInspectionMod.PromiseInspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkOptionalTime(): Boolean = js.native
  def checkOptionalTime(time: Double): Boolean = js.native
  def checkRequiredTime(time: Double): Boolean = js.native
  def defer[T](): Deferred[T] = js.native
  def delay(millis: Double): js.Promise[js.Object] = js.native
  def duration(t1: Double, t2: Double): Double = js.native
  def now(): Double = js.native
  def reflect[T](promise: js.Promise[T]): js.Promise[PromiseInspection[js.Object | T]] = js.native
  def tryPromise[T](cb: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
}

