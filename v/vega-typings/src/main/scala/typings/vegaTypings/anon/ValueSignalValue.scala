package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod._Update
import typings.vegaTypings.signalMod.SignalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSignalValue
  extends StObject
     with _Update {
  
  var value: SignalValue
}
object ValueSignalValue {
  
  @scala.inline
  def apply(value: SignalValue): ValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSignalValue]
  }
  
  @scala.inline
  implicit class ValueSignalValueMutableBuilder[Self <: ValueSignalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
