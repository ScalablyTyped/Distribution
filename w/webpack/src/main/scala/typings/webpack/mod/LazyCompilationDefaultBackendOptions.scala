package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerOptions
import typings.node.httpMod.ServerResponse
import typings.node.netMod.ListenOptions
import typings.node.netMod.Server
import typings.node.nodeColonnetMod.Socket
import typings.webpack.webpackStrings.http
import typings.webpack.webpackStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the default backend.
  */
trait LazyCompilationDefaultBackendOptions extends StObject {
  
  /**
  	 * A custom client.
  	 */
  var client: js.UndefOr[String] = js.undefined
  
  /**
  	 * Specifies where to listen to from the server.
  	 */
  var listen: js.UndefOr[
    Double | ListenOptions | (js.Function1[/* server */ Instantiable0[Server], Unit])
  ] = js.undefined
  
  /**
  	 * Specifies the protocol the client should use to connect to the server.
  	 */
  var protocol: js.UndefOr[http | https] = js.undefined
  
  /**
  	 * Specifies how to create the server handling the EventSource requests.
  	 */
  var server: js.UndefOr[
    (ServerOptions[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | ServerOptionsHttps | js.Function0[Instantiable0[Server]]
  ] = js.undefined
}
object LazyCompilationDefaultBackendOptions {
  
  inline def apply(): LazyCompilationDefaultBackendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyCompilationDefaultBackendOptions]
  }
  
  extension [Self <: LazyCompilationDefaultBackendOptions](x: Self) {
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setListen(value: Double | ListenOptions | (js.Function1[/* server */ Instantiable0[Server], Unit])): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setListenFunction1(value: /* server */ Instantiable0[Server] => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    
    inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
    
    inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setServer(
      value: (ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) | ServerOptionsHttps | js.Function0[Instantiable0[Server]]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerFunction0(value: () => Instantiable0[Server]): Self = StObject.set(x, "server", js.Any.fromFunction0(value))
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
