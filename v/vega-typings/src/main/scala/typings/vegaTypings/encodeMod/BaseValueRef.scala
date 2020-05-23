package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.signalMod.SignalRef
  - typings.vegaTypings.anon.Value[T]
  - typings.vegaTypings.anon.Field
*/
trait BaseValueRef[T] extends ScaledValueRef[T]

object BaseValueRef {
  @scala.inline
  def SignalRef[T](signal: String): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseValueRef[T]]
  }
  @scala.inline
  def Value[T](value: T = null): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseValueRef[T]]
  }
  @scala.inline
  def Field[T](field: typings.vegaTypings.encodeMod.Field): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseValueRef[T]]
  }
}

