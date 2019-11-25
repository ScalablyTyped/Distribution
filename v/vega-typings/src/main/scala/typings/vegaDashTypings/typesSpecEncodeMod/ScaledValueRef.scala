package typings.vegaDashTypings.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.typesSpecEncodeMod.BaseValueRef[T]
  - typings.vegaDashTypings.Anon_Scale
  - typings.vegaDashTypings.Anon_FieldScale
  - typings.vegaDashTypings.Anon_Band
  - typings.vegaDashTypings.Anon_Range
*/
trait ScaledValueRef[T] extends js.Object

object ScaledValueRef {
  @scala.inline
  def Anon_Band[T](band: Boolean | Double, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Anon_Range[T](range: Double | Boolean, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Anon_Scale[T](scale: Field, value: Boolean | Double | String = null): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Anon_Value[T](value: T = null): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Anon_Field[T](field: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def SignalRef[T](signal: String): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Anon_FieldScale[T](field: Field, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
}

