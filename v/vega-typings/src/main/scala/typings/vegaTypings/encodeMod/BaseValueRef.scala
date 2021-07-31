package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.signalMod.SignalRef
  - typings.vegaTypings.anon.Value[T]
  - typings.vegaTypings.anon.Field
*/
trait BaseValueRef[T]
  extends StObject
     with ScaledValueRef[T]
object BaseValueRef {
  
  @scala.inline
  def Field(field: typings.vegaTypings.encodeMod.Field): typings.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Field]
  }
  
  @scala.inline
  def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
  }
  
  @scala.inline
  def Value[T](): typings.vegaTypings.anon.Value[T] = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typings.vegaTypings.anon.Value[T]]
  }
}
