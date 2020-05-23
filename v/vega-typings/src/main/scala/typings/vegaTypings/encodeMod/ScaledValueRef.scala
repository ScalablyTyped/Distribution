package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.encodeMod.BaseValueRef[T]
  - typings.vegaTypings.anon.Scale
  - typings.vegaTypings.anon.FieldScale
  - typings.vegaTypings.anon.Band
  - typings.vegaTypings.anon.Range
*/
trait ScaledValueRef[T] extends js.Object

object ScaledValueRef {
  @scala.inline
  def Scale[T](scale: Field, value: Boolean | Double | String = null): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Field[T](field: typings.vegaTypings.encodeMod.Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def FieldScale[T](field: Field, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def SignalRef[T](signal: String): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Range[T](range: Double | Boolean, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Value[T](value: T = null): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  @scala.inline
  def Band[T](band: Boolean | Double, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
}

