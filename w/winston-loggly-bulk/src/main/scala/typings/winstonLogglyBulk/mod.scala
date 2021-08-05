package typings.winstonLogglyBulk

import typings.node.urlMod.Url
import typings.winstonLogglyBulk.anon.Password
import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-loggly-bulk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("winston-loggly-bulk", "Loggly")
  @js.native
  class Loggly ()
    extends typings.winstonTransport.mod.^ {
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
  
  inline def flushLogsAndExit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushLogsAndExit")().asInstanceOf[Unit]
  
  trait BufferOptions extends StObject {
    
    var retriesInMilliseconds: Double
    
    var size: Double
  }
  object BufferOptions {
    
    inline def apply(retriesInMilliseconds: Double, size: Double): BufferOptions = {
      val __obj = js.Dynamic.literal(retriesInMilliseconds = retriesInMilliseconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferOptions]
    }
    
    extension [Self <: BufferOptions](x: Self) {
      
      inline def setRetriesInMilliseconds(value: Double): Self = StObject.set(x, "retriesInMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogglyOptions
    extends StObject
       with TransportStreamOptions {
    
    var auth: js.UndefOr[Password | Null] = js.undefined
    
    var bufferOptions: js.UndefOr[BufferOptions] = js.undefined
    
    var isBulk: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var networkErrorOnConsole: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Null | String | Url] = js.undefined
    
    var stripColors: js.UndefOr[Boolean] = js.undefined
    
    var subdomain: String
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var timestamp: js.UndefOr[Boolean] = js.undefined
    
    var token: String
  }
  object LogglyOptions {
    
    inline def apply(subdomain: String, token: String): LogglyOptions = {
      val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogglyOptions]
    }
    
    extension [Self <: LogglyOptions](x: Self) {
      
      inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBufferOptions(value: BufferOptions): Self = StObject.set(x, "bufferOptions", value.asInstanceOf[js.Any])
      
      inline def setBufferOptionsUndefined: Self = StObject.set(x, "bufferOptions", js.undefined)
      
      inline def setIsBulk(value: Boolean): Self = StObject.set(x, "isBulk", value.asInstanceOf[js.Any])
      
      inline def setIsBulkUndefined: Self = StObject.set(x, "isBulk", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setNetworkErrorOnConsole(value: Boolean): Self = StObject.set(x, "networkErrorOnConsole", value.asInstanceOf[js.Any])
      
      inline def setNetworkErrorOnConsoleUndefined: Self = StObject.set(x, "networkErrorOnConsole", js.undefined)
      
      inline def setProxy(value: String | Url): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyNull: Self = StObject.set(x, "proxy", null)
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setStripColors(value: Boolean): Self = StObject.set(x, "stripColors", value.asInstanceOf[js.Any])
      
      inline def setStripColorsUndefined: Self = StObject.set(x, "stripColors", js.undefined)
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
