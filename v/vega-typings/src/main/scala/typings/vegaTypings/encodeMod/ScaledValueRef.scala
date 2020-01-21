package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.encodeMod.BaseValueRef[T]
  - typings.vegaTypings.AnonScale
  - typings.vegaTypings.AnonFieldScale
  - typings.vegaTypings.AnonBand
  - typings.vegaTypings.AnonRange
*/
trait ScaledValueRef[T] extends js.Object

object ScaledValueRef {
  @scala.inline
  def AnonScale[T](scale: Field, value: Boolean | Double | String = null): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def AnonValue[T](value: T = null): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def AnonRange[T](range: Double | Boolean, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def AnonField[T](field: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def AnonFieldScale[T](field: Field, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def SignalRef[T](signal: String): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def AnonBand[T](band: Boolean | Double, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
}

