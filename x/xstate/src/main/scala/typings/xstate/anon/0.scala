package typings.xstate.anon

import typings.xstate.libTypesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends StObject {
  
  var `type`: TEventType
}
object `0` {
  
  inline def apply[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */](`type`: TEventType): `0`[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TEventType, TEvent]]
  }
  
  extension [Self <: `0`[?, ?], TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */](x: Self & (`0`[TEventType, TEvent])) {
    
    inline def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
