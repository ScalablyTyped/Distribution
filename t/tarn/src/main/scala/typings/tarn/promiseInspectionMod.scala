package typings.tarn

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/PromiseInspection", JSImport.Namespace)
@js.native
object promiseInspectionMod extends js.Object {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.tarn.AnonError[T]
    - typings.tarn.AnonValue[T]
  */
  trait PromiseInspectionArgs[T] extends js.Object
  
}

