package typings.xstate.anon

import typings.xstate.libTypesMod.ActionTypes.NullEvent
import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[TEvent /* <: EventObject */] extends StObject {
  
  var event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
}
object `5` {
  
  inline def apply[TEvent /* <: EventObject */](
    event: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
  ): `5`[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`[?], TEvent /* <: EventObject */] (val x: Self & `5`[TEvent]) extends AnyVal {
    
    inline def setEvent(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
