package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Raise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaiseAction[TEvent /* <: EventObject */] extends StObject {
  
  var event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  
  var `type`: Raise = js.native
}
object RaiseAction {
  
  @scala.inline
  def apply[TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    `type`: Raise
  ): RaiseAction[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseAction[TEvent]]
  }
  
  @scala.inline
  implicit class RaiseActionMutableBuilder[Self <: RaiseAction[_], TEvent /* <: EventObject */] (val x: Self with RaiseAction[TEvent]) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Raise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
