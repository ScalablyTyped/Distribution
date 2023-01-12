package typings.yWebsocket

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Awareness extends StObject {
    
    var WebSocketPolyfill: js.UndefOr[TypeofWebSocket] = js.undefined
    
    var awareness: js.UndefOr[typings.yProtocols.awarenessMod.Awareness] = js.undefined
    
    var connect: js.UndefOr[Boolean] = js.undefined
    
    var disableBc: js.UndefOr[Boolean] = js.undefined
    
    var maxBackoffTime: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var resyncInterval: js.UndefOr[Double] = js.undefined
  }
  object Awareness {
    
    inline def apply(): Awareness = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Awareness]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Awareness] (val x: Self) extends AnyVal {
      
      inline def setAwareness(value: typings.yProtocols.awarenessMod.Awareness): Self = StObject.set(x, "awareness", value.asInstanceOf[js.Any])
      
      inline def setAwarenessUndefined: Self = StObject.set(x, "awareness", js.undefined)
      
      inline def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDisableBc(value: Boolean): Self = StObject.set(x, "disableBc", value.asInstanceOf[js.Any])
      
      inline def setDisableBcUndefined: Self = StObject.set(x, "disableBc", js.undefined)
      
      inline def setMaxBackoffTime(value: Double): Self = StObject.set(x, "maxBackoffTime", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffTimeUndefined: Self = StObject.set(x, "maxBackoffTime", js.undefined)
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setResyncInterval(value: Double): Self = StObject.set(x, "resyncInterval", value.asInstanceOf[js.Any])
      
      inline def setResyncIntervalUndefined: Self = StObject.set(x, "resyncInterval", js.undefined)
      
      inline def setWebSocketPolyfill(value: TypeofWebSocket): Self = StObject.set(x, "WebSocketPolyfill", value.asInstanceOf[js.Any])
      
      inline def setWebSocketPolyfillUndefined: Self = StObject.set(x, "WebSocketPolyfill", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* url */ String, WebSocket]
       with Instantiable2[
          /* url */ String, 
          (/* protocols */ js.Array[String]) | (/* protocols */ String), 
          WebSocket
        ] {
    
    val CLOSED: Double = js.native
    
    val CLOSING: Double = js.native
    
    val CONNECTING: Double = js.native
    
    val OPEN: Double = js.native
  }
  
  trait TypeofWebSocket extends StObject {
    
    /* standard dom */
    val CLOSED: Double
    
    /* standard dom */
    val CLOSING: Double
    
    /* standard dom */
    val CONNECTING: Double
    
    /* standard dom */
    val OPEN: Double
  }
  object TypeofWebSocket {
    
    inline def apply(CLOSED: Double, CLOSING: Double, CONNECTING: Double, OPEN: Double): TypeofWebSocket = {
      val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofWebSocket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofWebSocket] (val x: Self) extends AnyVal {
      
      inline def setCLOSED(value: Double): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
      
      inline def setCLOSING(value: Double): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      inline def setCONNECTING(value: Double): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
      
      inline def setOPEN(value: Double): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    }
  }
}
