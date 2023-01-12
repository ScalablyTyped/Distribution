package typings.undici.typesDispatcherMod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchHandlers extends StObject {
  
  /** Invoked when a body chunk is sent to the server. May be invoked multiple times for chunked requests */
  var onBodySent: js.UndefOr[js.Function2[/* chunkSize */ Double, /* totalBytesSent */ Double, Unit]] = js.undefined
  
  /** Invoked when response payload and trailers have been received and the request has completed. */
  var onComplete: js.UndefOr[js.Function1[/* trailers */ js.Array[String] | Null, Unit]] = js.undefined
  
  /** Invoked before request is dispatched on socket. May be invoked multiple times when a request is retried when the request at the head of the pipeline fails. */
  var onConnect: js.UndefOr[js.Function1[/* abort */ js.Function0[Unit], Unit]] = js.undefined
  
  /** Invoked when response payload data is received. */
  var onData: js.UndefOr[js.Function1[/* chunk */ Buffer, Boolean]] = js.undefined
  
  /** Invoked when an error has occurred. */
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  
  /** Invoked when statusCode and headers have been received. May be invoked multiple times due to 1xx informational headers. */
  var onHeaders: js.UndefOr[
    js.Function3[
      /* statusCode */ Double, 
      /* headers */ (js.Array[Buffer | String]) | Null, 
      /* resume */ js.Function0[Unit], 
      Boolean
    ]
  ] = js.undefined
  
  /** Invoked when request is upgraded either due to a `Upgrade` header or `CONNECT` method. */
  var onUpgrade: js.UndefOr[
    js.Function3[
      /* statusCode */ Double, 
      /* headers */ (js.Array[Buffer | String]) | Null, 
      /* socket */ Duplex, 
      Unit
    ]
  ] = js.undefined
}
object DispatchHandlers {
  
  inline def apply(): DispatchHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatchHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DispatchHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnBodySent(value: (/* chunkSize */ Double, /* totalBytesSent */ Double) => Unit): Self = StObject.set(x, "onBodySent", js.Any.fromFunction2(value))
    
    inline def setOnBodySentUndefined: Self = StObject.set(x, "onBodySent", js.undefined)
    
    inline def setOnComplete(value: /* trailers */ js.Array[String] | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnConnect(value: /* abort */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
    
    inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
    
    inline def setOnData(value: /* chunk */ Buffer => Boolean): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    
    inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
    
    inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHeaders(
      value: (/* statusCode */ Double, /* headers */ (js.Array[Buffer | String]) | Null, /* resume */ js.Function0[Unit]) => Boolean
    ): Self = StObject.set(x, "onHeaders", js.Any.fromFunction3(value))
    
    inline def setOnHeadersUndefined: Self = StObject.set(x, "onHeaders", js.undefined)
    
    inline def setOnUpgrade(
      value: (/* statusCode */ Double, /* headers */ (js.Array[Buffer | String]) | Null, /* socket */ Duplex) => Unit
    ): Self = StObject.set(x, "onUpgrade", js.Any.fromFunction3(value))
    
    inline def setOnUpgradeUndefined: Self = StObject.set(x, "onUpgrade", js.undefined)
  }
}
