package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.puppeteer.mod.EventEmitter
import typings.puppeteer.mod.EventType
import typings.puppeteer.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<puppeteer.puppeteer.CDPSession> */
trait CDPSession extends StObject {
  
  var addListener: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var detach: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var emit: js.UndefOr[js.Function1[/* event */ EventType, Boolean]] = js.undefined
  
  var listenerCount: js.UndefOr[js.Function1[/* event */ String, Double]] = js.undefined
  
  var off: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var on: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var once: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var removeAllListeners: js.UndefOr[js.Function0[EventEmitter]] = js.undefined
  
  var removeListener: js.UndefOr[js.Function2[/* event */ EventType, /* handler */ Handler[js.Any], EventEmitter]] = js.undefined
  
  var send: js.UndefOr[js.Function1[/* method */ String, js.Promise[js.Object]]] = js.undefined
}
object CDPSession {
  
  inline def apply(): CDPSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CDPSession]
  }
  
  extension [Self <: CDPSession](x: Self) {
    
    inline def setAddListener(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setDetach(value: () => js.Promise[Unit]): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    inline def setEmit(value: /* event */ EventType => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
    
    inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
    
    inline def setListenerCount(value: /* event */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
    
    inline def setListenerCountUndefined: Self = StObject.set(x, "listenerCount", js.undefined)
    
    inline def setOff(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
    
    inline def setOn(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOnce(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setRemoveAllListeners(value: () => EventEmitter): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
    
    inline def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
    
    inline def setRemoveListener(value: (/* event */ EventType, /* handler */ Handler[js.Any]) => EventEmitter): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    inline def setSend(value: /* method */ String => js.Promise[js.Object]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
  }
}
