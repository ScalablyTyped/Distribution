package typings.xmlrpc

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.node.tlsMod.TlsOptions
import typings.xmlrpc.anon.Expires
import typings.xmlrpc.anon.Pass
import typings.xmlrpc.anon.Processors
import typings.xmlrpc.xmlrpcStrings.NotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmlrpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmlrpc", "CustomType")
  @js.native
  open class CustomType protected () extends StObject {
    def this(raw: String) = this()
    
    var raw: String = js.native
    
    def serialize(xml: Any): Any = js.native
    
    var tagName: String = js.native
  }
  
  inline def createClient(options: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def createClient(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def createSecureClient(options: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def createSecureClient(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  inline def createSecureServer(options: String): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createSecureServer(options: String, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def createSecureServer(options: TlsOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createSecureServer(options: TlsOptions, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  inline def createServer(options: String): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(options: String, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(options: ServerOptions, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  object dateFormatter {
    
    @JSImport("xmlrpc", "dateFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeIso8601(time: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeIso8601")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def encodeIso8601(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIso8601")(date.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def setOpts(opts: DateFormatterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait Client extends StObject {
    
    var cookies: js.UndefOr[Cookies] = js.undefined
    
    def getCookie(name: String): String
    
    var headersProcessors: Processors
    
    var isSecure: Boolean
    
    def methodCall(
      method: String,
      params: js.Array[Any],
      callback: js.Function2[/* error */ js.Object, /* value */ Any, Unit]
    ): Unit
    
    var options: ClientOptions
    
    def setCookie(name: String, value: String): this.type
  }
  object Client {
    
    inline def apply(
      getCookie: String => String,
      headersProcessors: Processors,
      isSecure: Boolean,
      methodCall: (String, js.Array[Any], js.Function2[/* error */ js.Object, /* value */ Any, Unit]) => Unit,
      options: ClientOptions,
      setCookie: (String, String) => Client
    ): Client = {
      val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], methodCall = js.Any.fromFunction3(methodCall), options = options.asInstanceOf[js.Any], setCookie = js.Any.fromFunction2(setCookie))
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setGetCookie(value: String => String): Self = StObject.set(x, "getCookie", js.Any.fromFunction1(value))
      
      inline def setHeadersProcessors(value: Processors): Self = StObject.set(x, "headersProcessors", value.asInstanceOf[js.Any])
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setMethodCall(value: (String, js.Array[Any], js.Function2[/* error */ js.Object, /* value */ Any, Unit]) => Unit): Self = StObject.set(x, "methodCall", js.Any.fromFunction3(value))
      
      inline def setOptions(value: ClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSetCookie(value: (String, String) => Client): Self = StObject.set(x, "setCookie", js.Any.fromFunction2(value))
    }
  }
  
  trait ClientOptions extends StObject {
    
    var basic_auth: js.UndefOr[Pass] = js.undefined
    
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setBasic_auth(value: Pass): Self = StObject.set(x, "basic_auth", value.asInstanceOf[js.Any])
      
      inline def setBasic_authUndefined: Self = StObject.set(x, "basic_auth", js.undefined)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Cookies extends StObject {
    
    def get(name: String): String = js.native
    
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: String, options: Expires): Unit = js.native
  }
  
  trait DateFormatterOptions extends StObject {
    
    var colons: js.UndefOr[Boolean] = js.undefined
    
    var hyphens: js.UndefOr[Boolean] = js.undefined
    
    var local: js.UndefOr[Boolean] = js.undefined
    
    var ms: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Boolean] = js.undefined
  }
  object DateFormatterOptions {
    
    inline def apply(): DateFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFormatterOptions]
    }
    
    extension [Self <: DateFormatterOptions](x: Self) {
      
      inline def setColons(value: Boolean): Self = StObject.set(x, "colons", value.asInstanceOf[js.Any])
      
      inline def setColonsUndefined: Self = StObject.set(x, "colons", js.undefined)
      
      inline def setHyphens(value: Boolean): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
      
      inline def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setMs(value: Boolean): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait HeadersProcessor extends StObject {
    
    def composeRequest(headers: Headers): Unit
    
    def parseResponse(headers: Headers): Unit
  }
  object HeadersProcessor {
    
    inline def apply(composeRequest: Headers => Unit, parseResponse: Headers => Unit): HeadersProcessor = {
      val __obj = js.Dynamic.literal(composeRequest = js.Any.fromFunction1(composeRequest), parseResponse = js.Any.fromFunction1(parseResponse))
      __obj.asInstanceOf[HeadersProcessor]
    }
    
    extension [Self <: HeadersProcessor](x: Self) {
      
      inline def setComposeRequest(value: Headers => Unit): Self = StObject.set(x, "composeRequest", js.Any.fromFunction1(value))
      
      inline def setParseResponse(value: Headers => Unit): Self = StObject.set(x, "parseResponse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Server extends EventEmitter {
    
    var httpServer: (typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]) | (typings.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
        ]
      ]) = js.native
    
    def on(eventName: String, callback: ServerFunction): this.type = js.native
    @JSName("on")
    def on_NotFound(eventName: NotFound, callback: ServerNotFoundFunction): this.type = js.native
  }
  
  type ServerFunction = js.Function3[
    /* error */ Any, 
    /* params */ Any, 
    /* callback */ js.Function2[/* error */ Any, /* value */ Any, Unit], 
    Unit
  ]
  
  type ServerNotFoundFunction = js.Function2[/* methodName */ String, /* params */ js.Array[Any], Unit]
  
  trait ServerOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
