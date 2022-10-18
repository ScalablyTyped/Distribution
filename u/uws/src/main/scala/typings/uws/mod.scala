package typings.uws

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.uws.anon.Binary
import typings.uws.anon.BinaryBoolean
import typings.uws.anon.Code
import typings.uws.anon.Data
import typings.uws.anon.Origin
import typings.uws.anon.Reason
import typings.uws.anon.Target
import typings.uws.anon.Type
import typings.uws.anon.`0`
import typings.uws.uwsStrings.close
import typings.uws.uwsStrings.connection
import typings.uws.uwsStrings.error
import typings.uws.uwsStrings.headers
import typings.uws.uwsStrings.message
import typings.uws.uwsStrings.open
import typings.uws.uwsStrings.ping
import typings.uws.uwsStrings.pong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uws", JSImport.Namespace)
  @js.native
  open class ^ protected () extends WebSocket {
    def this(address: String) = this()
    def this(address: String, options: IClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: String, protocols: String, options: IClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: IClientOptions) = this()
    def this(address: String, protocols: Unit, options: IClientOptions) = this()
  }
  @JSImport("uws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("uws", "CLOSED")
  @js.native
  def CLOSED: Double = js.native
  inline def CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uws", "CLOSING")
  @js.native
  def CLOSING: Double = js.native
  inline def CLOSING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uws", "CONNECTING")
  @js.native
  def CONNECTING: Double = js.native
  inline def CONNECTING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uws", "OPEN")
  @js.native
  def OPEN: Double = js.native
  inline def OPEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  @JSImport("uws", "Server")
  @js.native
  open class Server () extends EventEmitter {
    def this(options: IServerOptions) = this()
    def this(options: Unit, callback: js.Function) = this()
    def this(options: IServerOptions, callback: js.Function) = this()
    
    @JSName("addListener")
    def addListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_headers(event: headers, cb: js.Function1[/* headers */ js.Array[String], Unit]): this.type = js.native
    
    var clients: js.Array[WebSocket] = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def handleUpgrade(
      request: IncomingMessage,
      socket: Socket,
      upgradeHead: js.typedarray.ArrayBuffer,
      callback: js.Function1[/* client */ WebSocket, Unit]
    ): Unit = js.native
    
    @JSName("on")
    def on_connection(event: connection, cb: js.ThisFunction1[/* this */ WebSocket, /* client */ WebSocket, Unit]): this.type = js.native
    // Events
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(event: headers, cb: js.Function1[/* headers */ js.Array[String], Unit]): this.type = js.native
    
    var options: IServerOptions = js.native
    
    var path: String = js.native
  }
  
  inline def connect(address: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(address.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def connect(address: String, openListener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(address.asInstanceOf[js.Any], openListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createConnection(address: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(address.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createConnection(address: String, openListener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(address.asInstanceOf[js.Any], openListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  inline def createServer(options: Unit, connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def createServer(options: IServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(options: IServerOptions, connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @JSImport("uws", "http")
  @js.native
  val http: UwsHttp = js.native
  
  trait IClientOptions extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var ca: js.UndefOr[js.Array[Any]] = js.undefined
    
    var cert: js.UndefOr[Any] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Any] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[Any] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var protocolVersion: js.UndefOr[Any] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object IClientOptions {
    
    inline def apply(): IClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientOptions]
    }
    
    extension [Self <: IClientOptions](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCa(value: js.Array[Any]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: Any*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocolVersion(value: Any): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  trait IPerMessageDeflateOptions extends StObject {
    
    var clientMaxWindowBits: js.UndefOr[Double] = js.undefined
    
    var clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined
    
    var memLevel: js.UndefOr[Double] = js.undefined
    
    var serverMaxWindowBits: js.UndefOr[Double] = js.undefined
    
    var serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined
  }
  object IPerMessageDeflateOptions {
    
    inline def apply(): IPerMessageDeflateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPerMessageDeflateOptions]
    }
    
    extension [Self <: IPerMessageDeflateOptions](x: Self) {
      
      inline def setClientMaxWindowBits(value: Double): Self = StObject.set(x, "clientMaxWindowBits", value.asInstanceOf[js.Any])
      
      inline def setClientMaxWindowBitsUndefined: Self = StObject.set(x, "clientMaxWindowBits", js.undefined)
      
      inline def setClientNoContextTakeover(value: Boolean): Self = StObject.set(x, "clientNoContextTakeover", value.asInstanceOf[js.Any])
      
      inline def setClientNoContextTakeoverUndefined: Self = StObject.set(x, "clientNoContextTakeover", js.undefined)
      
      inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      inline def setServerMaxWindowBits(value: Double): Self = StObject.set(x, "serverMaxWindowBits", value.asInstanceOf[js.Any])
      
      inline def setServerMaxWindowBitsUndefined: Self = StObject.set(x, "serverMaxWindowBits", js.undefined)
      
      inline def setServerNoContextTakeover(value: Boolean): Self = StObject.set(x, "serverNoContextTakeover", value.asInstanceOf[js.Any])
      
      inline def setServerNoContextTakeoverUndefined: Self = StObject.set(x, "serverNoContextTakeover", js.undefined)
    }
  }
  
  trait IServerOptions extends StObject {
    
    var clientTracking: js.UndefOr[Boolean] = js.undefined
    
    var disableHixie: js.UndefOr[Boolean] = js.undefined
    
    var handleProtocols: js.UndefOr[Any] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var noServer: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Boolean | IPerMessageDeflateOptions] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var server: js.UndefOr[
        (typings.node.httpMod.Server[
          Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) | (typings.node.httpsMod.Server[
          Instantiable1[
            /* socket */ typings.node.nodeColonnetMod.Socket, 
            typings.node.nodeColonhttpMod.IncomingMessage
          ], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ])
      ] = js.undefined
    
    var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.undefined
  }
  object IServerOptions {
    
    inline def apply(): IServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IServerOptions]
    }
    
    extension [Self <: IServerOptions](x: Self) {
      
      inline def setClientTracking(value: Boolean): Self = StObject.set(x, "clientTracking", value.asInstanceOf[js.Any])
      
      inline def setClientTrackingUndefined: Self = StObject.set(x, "clientTracking", js.undefined)
      
      inline def setDisableHixie(value: Boolean): Self = StObject.set(x, "disableHixie", value.asInstanceOf[js.Any])
      
      inline def setDisableHixieUndefined: Self = StObject.set(x, "disableHixie", js.undefined)
      
      inline def setHandleProtocols(value: Any): Self = StObject.set(x, "handleProtocols", value.asInstanceOf[js.Any])
      
      inline def setHandleProtocolsUndefined: Self = StObject.set(x, "handleProtocols", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setNoServer(value: Boolean): Self = StObject.set(x, "noServer", value.asInstanceOf[js.Any])
      
      inline def setNoServerUndefined: Self = StObject.set(x, "noServer", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Boolean | IPerMessageDeflateOptions): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServer(
        value: (typings.node.httpMod.Server[
              Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typings.node.httpsMod.Server[
              Instantiable1[
                /* socket */ typings.node.nodeColonnetMod.Socket, 
                typings.node.nodeColonhttpMod.IncomingMessage
              ], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ])
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = StObject.set(x, "verifyClient", value.asInstanceOf[js.Any])
      
      inline def setVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "verifyClient", js.Any.fromFunction1(value))
      
      inline def setVerifyClientFunction2(value: (/* info */ Origin, /* callback */ js.Function1[/* res */ Boolean, Unit]) => Unit): Self = StObject.set(x, "verifyClient", js.Any.fromFunction2(value))
      
      inline def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
    }
  }
  
  @js.native
  trait UwsHttp extends StObject {
    
    def createServer(): typings.node.httpMod.Server[
        Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def createServer(
      requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit]
    ): typings.node.httpMod.Server[
        Instantiable1[/* socket */ typings.node.nodeColonnetMod.Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    // any to avoid express definitions
    def getExpressApp(express: Any): Any = js.native
    
    def getRequestPrototype(): IncomingMessage = js.native
    
    def getResponsePrototype(): ServerResponse[IncomingMessage] = js.native
  }
  
  type VerifyClientCallbackAsync = js.Function2[/* info */ Origin, /* callback */ js.Function1[/* res */ Boolean, Unit], Unit]
  
  type VerifyClientCallbackSync = js.Function1[/* info */ Origin, Boolean]
  
  @js.native
  trait WebSocket extends EventEmitter {
    
    var CLOSED: Double = js.native
    
    var CLOSING: Double = js.native
    
    var CONNECTING: Double = js.native
    
    var OPEN: Double = js.native
    
    def addEventListener(method: String): Unit = js.native
    def addEventListener(method: String, listener: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(method: close): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(method: close, cb: js.Function1[/* event */ Reason, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    // HTML5 WebSocket events
    @JSName("addEventListener")
    def addEventListener_message(method: message): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(method: message, cb: js.Function1[/* event */ Type, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(method: open): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(method: open, cb: js.Function1[/* event */ `0`, Unit]): Unit = js.native
    
    @JSName("addListener")
    def addListener_close(event: close, cb: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, cb: js.Function2[/* data */ Any, /* flags */ BinaryBoolean, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_open(event: open, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_ping(event: ping, cb: js.Function2[/* data */ Any, /* flags */ BinaryBoolean, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pong(event: pong, cb: js.Function2[/* data */ Any, /* flags */ BinaryBoolean, Unit]): this.type = js.native
    
    var bytesReceived: Double = js.native
    
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, data: Any): Unit = js.native
    def close(code: Unit, data: Any): Unit = js.native
    
    def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(
      event: close,
      cb: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* message */ String, Unit]
    ): this.type = js.native
    // Events
    @JSName("on")
    def on_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      cb: js.ThisFunction2[/* this */ this.type, /* data */ Any, /* flags */ BinaryBoolean, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_open(event: open, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_ping(
      event: ping,
      cb: js.ThisFunction2[/* this */ this.type, /* data */ Any, /* flags */ BinaryBoolean, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_pong(
      event: pong,
      cb: js.ThisFunction2[/* this */ this.type, /* data */ Any, /* flags */ BinaryBoolean, Unit]
    ): this.type = js.native
    
    def onclose(event: Code): Unit = js.native
    
    def onerror(err: js.Error): Unit = js.native
    
    def onmessage(event: Data): Unit = js.native
    
    def onopen(event: Target): Unit = js.native
    
    def pause(): Unit = js.native
    
    def ping(): Unit = js.native
    def ping(data: Any): Unit = js.native
    def ping(data: Any, options: Unit, dontFail: Boolean): Unit = js.native
    def ping(data: Any, options: Binary): Unit = js.native
    def ping(data: Any, options: Binary, dontFail: Boolean): Unit = js.native
    def ping(data: Unit, options: Unit, dontFail: Boolean): Unit = js.native
    def ping(data: Unit, options: Binary): Unit = js.native
    def ping(data: Unit, options: Binary, dontFail: Boolean): Unit = js.native
    
    def pong(): Unit = js.native
    def pong(data: Any): Unit = js.native
    def pong(data: Any, options: Unit, dontFail: Boolean): Unit = js.native
    def pong(data: Any, options: Binary): Unit = js.native
    def pong(data: Any, options: Binary, dontFail: Boolean): Unit = js.native
    def pong(data: Unit, options: Unit, dontFail: Boolean): Unit = js.native
    def pong(data: Unit, options: Binary): Unit = js.native
    def pong(data: Unit, options: Binary, dontFail: Boolean): Unit = js.native
    
    var protocol: String = js.native
    
    var protocolVersion: String = js.native
    
    var readyState: Double = js.native
    
    def resume(): Unit = js.native
    
    def send(data: Any): Unit = js.native
    def send(data: Any, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def send(data: Any, options: Binary): Unit = js.native
    def send(data: Any, options: Binary, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def stream(): Unit = js.native
    def stream(cb: js.Function2[/* err */ js.Error, /* final */ Boolean, Unit]): Unit = js.native
    def stream(options: Binary): Unit = js.native
    def stream(options: Binary, cb: js.Function2[/* err */ js.Error, /* final */ Boolean, Unit]): Unit = js.native
    
    var supports: Any = js.native
    
    def terminate(): Unit = js.native
    
    var upgradeReq: IncomingMessage = js.native
    
    var url: String = js.native
  }
}
