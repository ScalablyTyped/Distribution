package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerOptions extends StObject {
  
  var onTrack: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.undefined
  
  var onTrigger: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.undefined
}
object DebuggerOptions {
  
  inline def apply(): DebuggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebuggerOptions]
  }
  
  extension [Self <: DebuggerOptions](x: Self) {
    
    inline def setOnTrack(value: /* event */ DebuggerEvent => Unit): Self = StObject.set(x, "onTrack", js.Any.fromFunction1(value))
    
    inline def setOnTrackUndefined: Self = StObject.set(x, "onTrack", js.undefined)
    
    inline def setOnTrigger(value: /* event */ DebuggerEvent => Unit): Self = StObject.set(x, "onTrigger", js.Any.fromFunction1(value))
    
    inline def setOnTriggerUndefined: Self = StObject.set(x, "onTrigger", js.undefined)
  }
}
