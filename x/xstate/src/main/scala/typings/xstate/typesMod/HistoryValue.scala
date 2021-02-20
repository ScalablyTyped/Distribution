package typings.xstate.typesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryValue extends StObject {
  
  var current: js.UndefOr[StateValue] = js.native
  
  var states: Record[String, js.UndefOr[HistoryValue]] = js.native
}
object HistoryValue {
  
  @scala.inline
  def apply(states: Record[String, js.UndefOr[HistoryValue]]): HistoryValue = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryValue]
  }
  
  @scala.inline
  implicit class HistoryValueMutableBuilder[Self <: HistoryValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: StateValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setStates(value: Record[String, js.UndefOr[HistoryValue]]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
