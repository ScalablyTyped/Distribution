package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Iterable
import typings.std.IterableIterator
import typings.whatwgUrl.anon.BaseURL
import typings.whatwgUrl.anon.EncodingOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-url", "URL")
  @js.native
  class URL protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    def this(url: String, base: URL) = this()
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    val origin: String = js.native
    
    var password: String = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var search: String = js.native
    
    val searchParams: URLSearchParams = js.native
    
    def toJSON(): String = js.native
    
    var username: String = js.native
  }
  
  @JSImport("whatwg-url", "URLSearchParams")
  @js.native
  class URLSearchParams () extends StObject {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[String]) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
  }
  
  @JSImport("whatwg-url", "basicURLParse")
  @js.native
  def basicURLParse(input: String): URLRecord | Null = js.native
  @JSImport("whatwg-url", "basicURLParse")
  @js.native
  def basicURLParse(input: String, options: EncodingOverride): URLRecord | Null = js.native
  
  @JSImport("whatwg-url", "cannotHaveAUsernamePasswordPort")
  @js.native
  def cannotHaveAUsernamePasswordPort(urlRecord: URLRecord): Boolean = js.native
  
  @JSImport("whatwg-url", "parseURL")
  @js.native
  def parseURL(input: String): URLRecord | Null = js.native
  @JSImport("whatwg-url", "parseURL")
  @js.native
  def parseURL(input: String, options: BaseURL): URLRecord | Null = js.native
  
  @JSImport("whatwg-url", "percentDecode")
  @js.native
  def percentDecode(buffer: Buffer): Buffer = js.native
  
  @JSImport("whatwg-url", "serializeHost")
  @js.native
  def serializeHost(host: String): String = js.native
  @JSImport("whatwg-url", "serializeHost")
  @js.native
  def serializeHost(host: Double): String = js.native
  @JSImport("whatwg-url", "serializeHost")
  @js.native
  def serializeHost(host: IPv6Address): String = js.native
  
  @JSImport("whatwg-url", "serializeInteger")
  @js.native
  def serializeInteger(number: Double): String = js.native
  
  @JSImport("whatwg-url", "serializeURL")
  @js.native
  def serializeURL(urlRecord: URLRecord): String = js.native
  @JSImport("whatwg-url", "serializeURL")
  @js.native
  def serializeURL(urlRecord: URLRecord, excludeFragment: Boolean): String = js.native
  
  @JSImport("whatwg-url", "serializeURLOrigin")
  @js.native
  def serializeURLOrigin(urlRecord: URLRecord): String = js.native
  
  @JSImport("whatwg-url", "setThePassword")
  @js.native
  def setThePassword(urlRecord: URLRecord, password: String): Unit = js.native
  
  @JSImport("whatwg-url", "setTheUsername")
  @js.native
  def setTheUsername(urlRecord: URLRecord, username: String): Unit = js.native
  
  type IPv6Address = js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.whatwgUrl.whatwgUrlStrings.`scheme start`
    - typings.whatwgUrl.whatwgUrlStrings.scheme
    - typings.whatwgUrl.whatwgUrlStrings.`no scheme`
    - typings.whatwgUrl.whatwgUrlStrings.`special relative or authority`
    - typings.whatwgUrl.whatwgUrlStrings.`path or authority`
    - typings.whatwgUrl.whatwgUrlStrings.relative
    - typings.whatwgUrl.whatwgUrlStrings.`relative slash`
    - typings.whatwgUrl.whatwgUrlStrings.`special authority slashes`
    - typings.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`
    - typings.whatwgUrl.whatwgUrlStrings.authority
    - typings.whatwgUrl.whatwgUrlStrings.host
    - typings.whatwgUrl.whatwgUrlStrings.hostname
    - typings.whatwgUrl.whatwgUrlStrings.port
    - typings.whatwgUrl.whatwgUrlStrings.file
    - typings.whatwgUrl.whatwgUrlStrings.`file slash`
    - typings.whatwgUrl.whatwgUrlStrings.`file host`
    - typings.whatwgUrl.whatwgUrlStrings.`path start`
    - typings.whatwgUrl.whatwgUrlStrings.path
    - typings.whatwgUrl.whatwgUrlStrings.`cannot-be-a-base-URL path`
    - typings.whatwgUrl.whatwgUrlStrings.query
    - typings.whatwgUrl.whatwgUrlStrings.fragment
  */
  trait StateOverride extends StObject
  object StateOverride {
    
    @scala.inline
    def authority: typings.whatwgUrl.whatwgUrlStrings.authority = "authority".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.authority]
    
    @scala.inline
    def `cannot-be-a-base-URL path`: typings.whatwgUrl.whatwgUrlStrings.`cannot-be-a-base-URL path` = ("cannot-be-a-base-URL path").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`cannot-be-a-base-URL path`]
    
    @scala.inline
    def file: typings.whatwgUrl.whatwgUrlStrings.file = "file".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.file]
    
    @scala.inline
    def `file host`: typings.whatwgUrl.whatwgUrlStrings.`file host` = ("file host").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`file host`]
    
    @scala.inline
    def `file slash`: typings.whatwgUrl.whatwgUrlStrings.`file slash` = ("file slash").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`file slash`]
    
    @scala.inline
    def fragment: typings.whatwgUrl.whatwgUrlStrings.fragment = "fragment".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.fragment]
    
    @scala.inline
    def host: typings.whatwgUrl.whatwgUrlStrings.host = "host".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.host]
    
    @scala.inline
    def hostname: typings.whatwgUrl.whatwgUrlStrings.hostname = "hostname".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.hostname]
    
    @scala.inline
    def `no scheme`: typings.whatwgUrl.whatwgUrlStrings.`no scheme` = ("no scheme").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`no scheme`]
    
    @scala.inline
    def path: typings.whatwgUrl.whatwgUrlStrings.path = "path".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.path]
    
    @scala.inline
    def `path or authority`: typings.whatwgUrl.whatwgUrlStrings.`path or authority` = ("path or authority").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`path or authority`]
    
    @scala.inline
    def `path start`: typings.whatwgUrl.whatwgUrlStrings.`path start` = ("path start").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`path start`]
    
    @scala.inline
    def port: typings.whatwgUrl.whatwgUrlStrings.port = "port".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.port]
    
    @scala.inline
    def query: typings.whatwgUrl.whatwgUrlStrings.query = "query".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.query]
    
    @scala.inline
    def relative: typings.whatwgUrl.whatwgUrlStrings.relative = "relative".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.relative]
    
    @scala.inline
    def `relative slash`: typings.whatwgUrl.whatwgUrlStrings.`relative slash` = ("relative slash").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`relative slash`]
    
    @scala.inline
    def scheme: typings.whatwgUrl.whatwgUrlStrings.scheme = "scheme".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.scheme]
    
    @scala.inline
    def `scheme start`: typings.whatwgUrl.whatwgUrlStrings.`scheme start` = ("scheme start").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`scheme start`]
    
    @scala.inline
    def `special authority ignore slashes`: typings.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes` = ("special authority ignore slashes").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`]
    
    @scala.inline
    def `special authority slashes`: typings.whatwgUrl.whatwgUrlStrings.`special authority slashes` = ("special authority slashes").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`special authority slashes`]
    
    @scala.inline
    def `special relative or authority`: typings.whatwgUrl.whatwgUrlStrings.`special relative or authority` = ("special relative or authority").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`special relative or authority`]
  }
  
  @js.native
  trait URLRecord extends StObject {
    
    var cannotBeABaseURL: js.UndefOr[Boolean] = js.native
    
    var fragment: String | Null = js.native
    
    var host: String | Double | IPv6Address | Null = js.native
    
    var password: String = js.native
    
    var path: js.Array[String] = js.native
    
    var port: Double | Null = js.native
    
    var query: String | Null = js.native
    
    var scheme: String = js.native
    
    var username: String = js.native
  }
  object URLRecord {
    
    @scala.inline
    def apply(password: String, path: js.Array[String], scheme: String, username: String): URLRecord = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLRecord]
    }
    
    @scala.inline
    implicit class URLRecordMutableBuilder[Self <: URLRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCannotBeABaseURL(value: Boolean): Self = StObject.set(x, "cannotBeABaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCannotBeABaseURLUndefined: Self = StObject.set(x, "cannotBeABaseURL", js.undefined)
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      @scala.inline
      def setHost(value: String | Double | IPv6Address): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
