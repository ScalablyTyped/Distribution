package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.encodeMod.BaseValueRef[T]
  - typings.vegaTypings.anon.Scale
  - typings.vegaTypings.anon.FieldScale
  - typings.vegaTypings.anon.Band
  - typings.vegaTypings.anon.Range
*/
trait ScaledValueRef[T] extends StObject
object ScaledValueRef {
  
  @scala.inline
  def Band(band: Boolean | Double, scale: Field): typings.vegaTypings.anon.Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Band]
  }
  
  @scala.inline
  def Field(field: typings.vegaTypings.encodeMod.Field): typings.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Field]
  }
  
  @scala.inline
  def FieldScale(field: Field, scale: Field): typings.vegaTypings.anon.FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.FieldScale]
  }
  
  @scala.inline
  def Range(range: Double | Boolean, scale: Field): typings.vegaTypings.anon.Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Range]
  }
  
  @scala.inline
  def Scale(scale: Field): typings.vegaTypings.anon.Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Scale]
  }
  
  @scala.inline
  def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
  }
  
  @scala.inline
  def Value[T](): typings.vegaTypings.anon.Value[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaTypings.anon.Value[T]]
  }
}
