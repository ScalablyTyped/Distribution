package typings.vegaDashTypings.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
  - typings.vegaDashTypings.Anon_Value[T]
  - typings.vegaDashTypings.Anon_Field
*/
trait BaseValueRef[T] extends ScaledValueRef[T]

object BaseValueRef {
  @scala.inline
  def SignalRef[T](signal: String): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseValueRef[T]]
  }
  @scala.inline
  def Anon_Value[T](value: T = null): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseValueRef[T]]
  }
  @scala.inline
  def Anon_Field[T](field: Field): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseValueRef[T]]
  }
}

