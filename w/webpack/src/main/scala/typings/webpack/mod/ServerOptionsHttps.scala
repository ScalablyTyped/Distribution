package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.httpMod.ServerOptions because var conflicts: keepAlive, keepAliveInitialDelay, noDelay. Inlined IncomingMessage, ServerResponse, maxHeaderSize, insecureHTTPParser */ trait ServerOptionsHttps
  extends StObject
     with TlsOptions {
  
  var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]] = js.undefined
  
  var ServerResponse: js.UndefOr[
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.httpMod.ServerResponse[IncomingMessage]
    ]
  ] = js.undefined
  
  /**
    * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
    * Using the insecure parser should be avoided.
    * See --insecure-http-parser for more information.
    * @default false
    */
  var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optionally overrides the value of
    * `--max-http-header-size` for requests received by this server, i.e.
    * the maximum length of request headers in bytes.
    * @default 8192
    */
  var maxHeaderSize: js.UndefOr[Double] = js.undefined
}
object ServerOptionsHttps {
  
  inline def apply(): ServerOptionsHttps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptionsHttps]
  }
  
  extension [Self <: ServerOptionsHttps](x: Self) {
    
    inline def setIncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
    
    inline def setIncomingMessageUndefined: Self = StObject.set(x, "IncomingMessage", js.undefined)
    
    inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
    
    inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
    
    inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
    
    inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
    
    inline def setServerResponse(
      value: Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
    ): Self = StObject.set(x, "ServerResponse", value.asInstanceOf[js.Any])
    
    inline def setServerResponseUndefined: Self = StObject.set(x, "ServerResponse", js.undefined)
  }
}
