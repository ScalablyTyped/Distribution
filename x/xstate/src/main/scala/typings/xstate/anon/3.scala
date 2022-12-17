package typings.xstate.anon

import typings.xstate.libTypesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends StObject {
  
  var `type`: TEventType
}
object `3` {
  
  inline def apply[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */](`type`: TEventType): `3`[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[TEventType, TEvent]]
  }
  
  extension [Self <: `3`[?, ?], TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */](x: Self & (`3`[TEventType, TEvent])) {
    
    inline def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
