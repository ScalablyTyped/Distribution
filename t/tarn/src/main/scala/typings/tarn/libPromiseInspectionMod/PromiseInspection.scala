package typings.tarn.libPromiseInspectionMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/PromiseInspection", "PromiseInspection")
@js.native
class PromiseInspection[T] protected () extends js.Object {
  def this(args: PromiseInspectionArgs[T]) = this()
  var _error: Error | Unit = js.native
  var _value: T | Unit = js.native
  def isFulfilled(): Boolean = js.native
  def isRejected(): Boolean = js.native
  def reason(): Unit | Error = js.native
  def value(): Unit | T = js.native
}

