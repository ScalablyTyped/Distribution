package typings.xstate.typesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryValue extends StObject {
  
  var current: js.UndefOr[StateValue] = js.undefined
  
  var states: Record[String, js.UndefOr[HistoryValue]]
}
object HistoryValue {
  
  inline def apply(states: Record[String, js.UndefOr[HistoryValue]]): HistoryValue = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryValue]
  }
  
  extension [Self <: HistoryValue](x: Self) {
    
    inline def setCurrent(value: StateValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setStates(value: Record[String, js.UndefOr[HistoryValue]]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
