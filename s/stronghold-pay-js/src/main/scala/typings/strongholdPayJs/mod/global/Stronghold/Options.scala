package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var onError: js.UndefOr[OnError] = js.undefined
  
  var onEvent: js.UndefOr[OnEvent] = js.undefined
  
  var onExit: js.UndefOr[OnExit] = js.undefined
  
  var onReady: js.UndefOr[OnReady] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOnError(value: /* error */ StrongholdPayError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnEvent(value: /* event */ StrongholdMessageEvent => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
  }
}
