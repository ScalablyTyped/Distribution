package typings.winstonLogglyBulk

import typings.node.urlMod.Url
import typings.winstonLogglyBulk.anon.Password
import typings.winstonTransport.mod.TransportStreamOptions
import typings.winstonTransport.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-loggly-bulk", "Loggly")
  @js.native
  class Loggly () extends ^ {
    def this(options: LogglyOptions) = this()
    
    def extend(destination: js.Any, source: js.Any): js.Any = js.native
    
    def extractContext(obj: js.Any): js.Any = js.native
    
    def formatQuery(query: js.Any): js.Any = js.native
    
    def formatResults(results: js.Any, _options: js.Any): js.Any = js.native
    
    @JSName("log")
    def log_MLoggly(meta: js.Any, callback: js.Any): js.Any = js.native
    
    def loglify(obj: js.Any): js.Any = js.native
    
    def query(options: js.Any, callback: js.Any): js.Any = js.native
    
    def sanitizeLogs(logs: js.Any): js.Any = js.native
    
    def stream(maybeOptions: js.Any): js.Any = js.native
  }
  
  @JSImport("winston-loggly-bulk", "flushLogsAndExit")
  @js.native
  def flushLogsAndExit(): Unit = js.native
  
  @js.native
  trait BufferOptions extends StObject {
    
    var retriesInMilliseconds: Double = js.native
    
    var size: Double = js.native
  }
  object BufferOptions {
    
    @scala.inline
    def apply(retriesInMilliseconds: Double, size: Double): BufferOptions = {
      val __obj = js.Dynamic.literal(retriesInMilliseconds = retriesInMilliseconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferOptions]
    }
    
    @scala.inline
    implicit class BufferOptionsMutableBuilder[Self <: BufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetriesInMilliseconds(value: Double): Self = StObject.set(x, "retriesInMilliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogglyOptions extends TransportStreamOptions {
    
    var auth: js.UndefOr[Password | Null] = js.native
    
    var bufferOptions: js.UndefOr[BufferOptions] = js.native
    
    var isBulk: js.UndefOr[Boolean] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var networkErrorOnConsole: js.UndefOr[Boolean] = js.native
    
    var proxy: js.UndefOr[Null | String | Url] = js.native
    
    var stripColors: js.UndefOr[Boolean] = js.native
    
    var subdomain: String = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var timestamp: js.UndefOr[Boolean] = js.native
    
    var token: String = js.native
  }
  object LogglyOptions {
    
    @scala.inline
    def apply(subdomain: String, token: String): LogglyOptions = {
      val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogglyOptions]
    }
    
    @scala.inline
    implicit class LogglyOptionsMutableBuilder[Self <: LogglyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBufferOptions(value: BufferOptions): Self = StObject.set(x, "bufferOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferOptionsUndefined: Self = StObject.set(x, "bufferOptions", js.undefined)
      
      @scala.inline
      def setIsBulk(value: Boolean): Self = StObject.set(x, "isBulk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBulkUndefined: Self = StObject.set(x, "isBulk", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setNetworkErrorOnConsole(value: Boolean): Self = StObject.set(x, "networkErrorOnConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkErrorOnConsoleUndefined: Self = StObject.set(x, "networkErrorOnConsole", js.undefined)
      
      @scala.inline
      def setProxy(value: String | Url): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyNull: Self = StObject.set(x, "proxy", null)
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setStripColors(value: Boolean): Self = StObject.set(x, "stripColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripColorsUndefined: Self = StObject.set(x, "stripColors", js.undefined)
      
      @scala.inline
      def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
