package typings.swToolbox

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sw-toolbox", "cache")
  @js.native
  def cache(url: String, options: Options_): Unit = js.native
  
  @JSImport("sw-toolbox", "cacheFirst")
  @js.native
  val cacheFirst: Handler = js.native
  
  @JSImport("sw-toolbox", "cacheOnly")
  @js.native
  val cacheOnly: Handler = js.native
  
  @JSImport("sw-toolbox", "fastest")
  @js.native
  val fastest: Handler = js.native
  
  @JSImport("sw-toolbox", "networkFirst")
  @js.native
  val networkFirst: Handler = js.native
  
  @JSImport("sw-toolbox", "networkOnly")
  @js.native
  val networkOnly: Handler = js.native
  
  @JSImport("sw-toolbox", "options")
  @js.native
  val options: Options_ = js.native
  
  @JSImport("sw-toolbox", "precache")
  @js.native
  def precache(urls: PrecacheURLs): Unit = js.native
  
  @JSImport("sw-toolbox", "router")
  @js.native
  val router: Router_ = js.native
  
  @JSImport("sw-toolbox", "uncache")
  @js.native
  def uncache(url: String): js.Promise[Unit] = js.native
  
  @js.native
  trait CacheOptions extends StObject {
    
    var maxAgeSeconds: Double = js.native
    
    var maxEntries: Double = js.native
    
    var name: String = js.native
  }
  object CacheOptions {
    
    @scala.inline
    def apply(maxAgeSeconds: Double, maxEntries: Double, name: String): CacheOptions = {
      val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds.asInstanceOf[js.Any], maxEntries = maxEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Handler = js.Function1[/* request */ Request, js.Promise[Response]]
  
  @js.native
  trait Options_ extends StObject {
    
    var cache: CacheOptions = js.native
    
    var debug: Boolean = js.native
    
    var networkTimeoutSeconds: Double = js.native
  }
  object Options_ {
    
    @scala.inline
    def apply(cache: CacheOptions, debug: Boolean, networkTimeoutSeconds: Double): Options_ = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], networkTimeoutSeconds = networkTimeoutSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options_]
    }
    
    @scala.inline
    implicit class Options_MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: CacheOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  type PrecacheURL = Request | String
  
  type PrecacheURLs = js.Promise[js.Array[PrecacheURL]] | js.Array[PrecacheURL]
  
  @js.native
  trait Request extends StObject
  
  @js.native
  trait Response extends StObject
  
  @js.native
  trait Router_ extends StObject {
    
    def default(handler: Handler): Unit = js.native
    def default(handler: Handler, options: Options_): Unit = js.native
    
    def any(urlPattern: URLPattern, handler: Handler): Unit = js.native
    def any(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
    
    def delete(urlPattern: URLPattern, handler: Handler): Unit = js.native
    def delete(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
    
    def get(urlPattern: URLPattern, handler: Handler): Unit = js.native
    def get(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
    
    def head(urlPattern: URLPattern, handler: Handler): Unit = js.native
    def head(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
    
    def post(urlPattern: URLPattern, handler: Handler): Unit = js.native
    def post(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
    
    def put(urlPattern: URLPattern, handler: Handler): Unit = js.native
    def put(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
  }
  
  type URLPattern = String | RegExp
}
