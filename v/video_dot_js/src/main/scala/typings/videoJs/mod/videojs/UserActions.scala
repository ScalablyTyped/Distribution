package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserActions extends StObject {
  
  var click: js.UndefOr[Boolean | (js.Function1[/* event */ Event, Unit])] = js.undefined
  
  var doubleClick: js.UndefOr[Boolean | (js.Function1[/* event */ Event, Unit])] = js.undefined
  
  var hotkeys: js.UndefOr[Boolean | (js.Function1[/* event */ KeyboardEvent, Unit]) | UserActionHotkeys] = js.undefined
}
object UserActions {
  
  inline def apply(): UserActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserActions] (val x: Self) extends AnyVal {
    
    inline def setClick(value: Boolean | (js.Function1[/* event */ Event, Unit])): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickFunction1(value: /* event */ Event => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDoubleClick(value: Boolean | (js.Function1[/* event */ Event, Unit])): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickFunction1(value: /* event */ Event => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
    
    inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
    
    inline def setHotkeys(value: Boolean | (js.Function1[/* event */ KeyboardEvent, Unit]) | UserActionHotkeys): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
    
    inline def setHotkeysFunction1(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "hotkeys", js.Any.fromFunction1(value))
    
    inline def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
  }
}
