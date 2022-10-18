package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecSignalMod.SignalRef
  - typings.vegaTypings.anon.Value[T]
  - typings.vegaTypings.anon.Field
*/
trait BaseValueRef[T]
  extends StObject
     with ScaledValueRef[T]
object BaseValueRef {
  
  inline def Field(field: typings.vegaTypings.typesSpecEncodeMod.Field): typings.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Field]
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
