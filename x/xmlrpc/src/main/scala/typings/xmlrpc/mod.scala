package typings.xmlrpc

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.tlsMod.TlsOptions
import typings.std.Date
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
  class CustomType protected () extends StObject {
    def this(raw: String) = this()
    
    var raw: String = js.native
    
    def serialize(xml: js.Any): js.Any = js.native
    
    var tagName: String = js.native
  }
  
  @scala.inline
  def createClient(options: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  @scala.inline
  def createClient(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  @scala.inline
  def createSecureClient(options: String): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  @scala.inline
  def createSecureClient(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  @scala.inline
  def createSecureServer(options: String): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createSecureServer(options: String, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createSecureServer(options: TlsOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createSecureServer(options: TlsOptions, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @scala.inline
  def createServer(options: String): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: String, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: ServerOptions, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  object dateFormatter {
    
    @JSImport("xmlrpc", "dateFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decodeIso8601(time: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeIso8601")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def encodeIso8601(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIso8601")(date.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def setOpts(opts: DateFormatterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait Client extends StObject {
    
    var cookies: js.UndefOr[Cookies] = js.undefined
    
    def getCookie(name: String): String
    
    var headersProcessors: Processors
    
    var isSecure: Boolean
    
    def methodCall(
      method: String,
      params: js.Array[js.Any],
      callback: js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]
    ): Unit
    
    var options: ClientOptions
    
    def setCookie(name: String, value: String): this.type
  }
  object Client {
    
    @scala.inline
    def apply(
      getCookie: String => String,
      headersProcessors: Processors,
      isSecure: Boolean,
      methodCall: (String, js.Array[js.Any], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit,
      options: ClientOptions,
      setCookie: (String, String) => Client
    ): Client = {
      val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], methodCall = js.Any.fromFunction3(methodCall), options = options.asInstanceOf[js.Any], setCookie = js.Any.fromFunction2(setCookie))
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setGetCookie(value: String => String): Self = StObject.set(x, "getCookie", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeadersProcessors(value: Processors): Self = StObject.set(x, "headersProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodCall(
        value: (String, js.Array[js.Any], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "methodCall", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOptions(value: ClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCookie(value: (String, String) => Client): Self = StObject.set(x, "setCookie", js.Any.fromFunction2(value))
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
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasic_auth(value: Pass): Self = StObject.set(x, "basic_auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasic_authUndefined: Self = StObject.set(x, "basic_auth", js.undefined)
      
      @scala.inline
      def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def apply(): DateFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFormatterOptions]
    }
    
    @scala.inline
    implicit class DateFormatterOptionsMutableBuilder[Self <: DateFormatterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColons(value: Boolean): Self = StObject.set(x, "colons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonsUndefined: Self = StObject.set(x, "colons", js.undefined)
      
      @scala.inline
      def setHyphens(value: Boolean): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
      
      @scala.inline
      def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setMs(value: Boolean): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait HeadersProcessor extends StObject {
    
    def composeRequest(headers: Headers): Unit
    
    def parseResponse(headers: Headers): Unit
  }
  object HeadersProcessor {
    
    @scala.inline
    def apply(composeRequest: Headers => Unit, parseResponse: Headers => Unit): HeadersProcessor = {
      val __obj = js.Dynamic.literal(composeRequest = js.Any.fromFunction1(composeRequest), parseResponse = js.Any.fromFunction1(parseResponse))
      __obj.asInstanceOf[HeadersProcessor]
    }
    
    @scala.inline
    implicit class HeadersProcessorMutableBuilder[Self <: HeadersProcessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComposeRequest(value: Headers => Unit): Self = StObject.set(x, "composeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseResponse(value: Headers => Unit): Self = StObject.set(x, "parseResponse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Server extends EventEmitter {
    
    var httpServer: typings.node.httpMod.Server | typings.node.httpsMod.Server = js.native
    
    def on(eventName: String, callback: ServerFunction): this.type = js.native
    @JSName("on")
    def on_NotFound(eventName: NotFound, callback: ServerNotFoundFunction): this.type = js.native
  }
  
  type ServerFunction = js.Function3[
    /* error */ js.Any, 
    /* params */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* value */ js.Any, Unit], 
    Unit
  ]
  
  type ServerNotFoundFunction = js.Function2[/* methodName */ String, /* params */ js.Array[js.Any], Unit]
  
  trait ServerOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
