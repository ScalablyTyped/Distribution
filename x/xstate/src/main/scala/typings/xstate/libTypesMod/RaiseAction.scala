package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Raise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaiseAction[TEvent /* <: EventObject */] extends StObject {
  
  var event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
  
  var `type`: Raise
}
object RaiseAction {
  
  inline def apply[TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    `type`: Raise
  ): RaiseAction[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseAction[TEvent]]
  }
  
  extension [Self <: RaiseAction[?], TEvent /* <: EventObject */](x: Self & RaiseAction[TEvent]) {
    
    inline def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: Raise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
