package typings.undici

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.undici.typesConnectorMod.buildConnector.BuildOptions
import typings.undici.typesConnectorMod.buildConnector.connector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConnectorMod {
  
  object default {
    
    inline def apply(): connector = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[connector]
    inline def apply(options: BuildOptions): connector = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[connector]
    
    @JSImport("undici/types/connector", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object buildConnector {
    
    /* Rewritten from type alias, can be one of: 
      - typings.undici.anon.ConnectionOptionsmaxCache
      - typings.undici.anon.TcpNetConnectOptsmaxCache
      - typings.undici.anon.IpcNetConnectOptsmaxCache
    */
    trait BuildOptions extends StObject
    object BuildOptions {
      
      inline def ConnectionOptionsmaxCache(): typings.undici.anon.ConnectionOptionsmaxCache = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.undici.anon.ConnectionOptionsmaxCache]
      }
      
      inline def IpcNetConnectOptsmaxCache(path: String): typings.undici.anon.IpcNetConnectOptsmaxCache = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.undici.anon.IpcNetConnectOptsmaxCache]
      }
      
      inline def TcpNetConnectOptsmaxCache(port: Double): typings.undici.anon.TcpNetConnectOptsmaxCache = {
        val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.undici.anon.TcpNetConnectOptsmaxCache]
      }
    }
    
    type Callback = js.Function1[/* args */ CallbackArgs, Unit]
    
    type CallbackArgs = js.Tuple2[js.Error | Null, Null | Socket | TLSSocket]
    
    trait Options extends StObject {
      
      var host: js.UndefOr[String] = js.undefined
      
      var hostname: String
      
      var httpSocket: js.UndefOr[Socket] = js.undefined
      
      var localAddress: js.UndefOr[String | Null] = js.undefined
      
      var port: String
      
      var protocol: String
      
      var servername: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(hostname: String, port: String, protocol: String): Options = {
        val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        inline def setHttpSocket(value: Socket): Self = StObject.set(x, "httpSocket", value.asInstanceOf[js.Any])
        
        inline def setHttpSocketUndefined: Self = StObject.set(x, "httpSocket", js.undefined)
        
        inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        inline def setLocalAddressNull: Self = StObject.set(x, "localAddress", null)
        
        inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
        
        inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      }
    }
    
    type connector = js.Function2[/* options */ Options, /* callback */ Callback, Unit]
  }
}
