package typings
package tarnLib.libPromiseInspectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/PromiseInspection", "PromiseInspection")
@js.native
class PromiseInspection[T] protected () extends js.Object {
  def this(args: PromiseInspectionArgs[T]) = this()
  var _error: stdLib.Error | scala.Unit = js.native
  var _value: T | scala.Unit = js.native
  def isFulfilled(): scala.Boolean = js.native
  def isRejected(): scala.Boolean = js.native
  def reason(): scala.Unit | stdLib.Error = js.native
  def value(): scala.Unit | T = js.native
}

