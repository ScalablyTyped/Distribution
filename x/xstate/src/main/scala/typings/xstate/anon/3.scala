package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3`[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends StObject {
  
  var `type`: TEventType = js.native
}
object `3` {
  
  @scala.inline
  def apply[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */](`type`: TEventType): `3`[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[TEventType, TEvent]]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`[_, _], TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] (val x: Self with (`3`[TEventType, TEvent])) extends AnyVal {
    
    @scala.inline
    def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
