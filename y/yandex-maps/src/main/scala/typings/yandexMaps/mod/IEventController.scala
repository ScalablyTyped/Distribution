package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventController extends StObject {
  
  var onStartListening: js.UndefOr[js.Function2[/* events */ IEventManager[js.Object], /* type */ String, Unit]] = js.undefined
  
  var onStopListening: js.UndefOr[js.Function2[/* events */ IEventManager[js.Object], /* type */ String, Unit]] = js.undefined
}
object IEventController {
  
  inline def apply(): IEventController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventController]
  }
  
  extension [Self <: IEventController](x: Self) {
    
    inline def setOnStartListening(value: (/* events */ IEventManager[js.Object], /* type */ String) => Unit): Self = StObject.set(x, "onStartListening", js.Any.fromFunction2(value))
    
    inline def setOnStartListeningUndefined: Self = StObject.set(x, "onStartListening", js.undefined)
    
    inline def setOnStopListening(value: (/* events */ IEventManager[js.Object], /* type */ String) => Unit): Self = StObject.set(x, "onStopListening", js.Any.fromFunction2(value))
    
    inline def setOnStopListeningUndefined: Self = StObject.set(x, "onStopListening", js.undefined)
  }
}
