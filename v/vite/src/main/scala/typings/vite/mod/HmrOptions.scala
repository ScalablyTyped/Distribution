package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonhttpMod.Server
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmrOptions extends StObject {
  
  var clientPort: js.UndefOr[Double] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var server: js.UndefOr[
    Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object HmrOptions {
  
  inline def apply(): HmrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmrOptions]
  }
  
  extension [Self <: HmrOptions](x: Self) {
    
    inline def setClientPort(value: Double): Self = StObject.set(x, "clientPort", value.asInstanceOf[js.Any])
    
    inline def setClientPortUndefined: Self = StObject.set(x, "clientPort", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
