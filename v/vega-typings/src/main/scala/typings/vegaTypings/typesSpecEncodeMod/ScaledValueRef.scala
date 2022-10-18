package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecEncodeMod.BaseValueRef[T]
  - typings.vegaTypings.anon.Scale
  - typings.vegaTypings.anon.FieldScale
  - typings.vegaTypings.anon.Band
  - typings.vegaTypings.anon.Range
*/
trait ScaledValueRef[T] extends StObject
object ScaledValueRef {
  
  inline def Band(band: Boolean | Double, scale: Field): typings.vegaTypings.anon.Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Band]
  }
  
  inline def Field(field: typings.vegaTypings.typesSpecEncodeMod.Field): typings.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Field]
  }
  
  inline def FieldScale(field: Field, scale: Field): typings.vegaTypings.anon.FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.FieldScale]
  }
  
  inline def Range(range: Double | Boolean, scale: Field): typings.vegaTypings.anon.Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Range]
  }
  
  inline def Scale(scale: Field): typings.vegaTypings.anon.Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[typings.vegaTypings.anon.Scale]
  }
  
  inline def SignalRef(signal: String): typings.vegaTypings.typesSpecSignalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.SignalRef]
  }
  
  inline def Value[T](): typings.vegaTypings.anon.Value[T] = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typings.vegaTypings.anon.Value[T]]
  }
}
