package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.whatwgUrl.anon.BaseURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("whatwg-url", "URL")
  @js.native
  open class URL protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    def this(url: String, base: URL) = this()
    
    def hash: String = js.native
    def hash_=(V: String): Unit = js.native
    
    def host: String = js.native
    def host_=(V: String): Unit = js.native
    
    def hostname: String = js.native
    def hostname_=(V: String): Unit = js.native
    
    def href: String = js.native
    def href_=(V: String): Unit = js.native
    
    def origin: String = js.native
    
    def password: String = js.native
    def password_=(V: String): Unit = js.native
    
    def pathname: String = js.native
    def pathname_=(V: String): Unit = js.native
    
    def port: String = js.native
    def port_=(V: String): Unit = js.native
    
    def protocol: String = js.native
    def protocol_=(V: String): Unit = js.native
    
    def search: String = js.native
    
    def searchParams: URLSearchParams = js.native
    
    def search_=(V: String): Unit = js.native
    
    def toJSON(): String = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: typings.whatwgUrl.whatwgUrlStrings.URL = js.native
    
    def username: String = js.native
    def username_=(V: String): Unit = js.native
  }
  
  @JSImport("whatwg-url", "URLSearchParams")
  @js.native
  open class URLSearchParams () extends StObject {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[/* name */ String, /* value */ String]]) = this()
    def this(init: js.Iterable[js.Tuple2[/* name */ String, /* value */ String]]) = this()
    def this(init: StringDictionary[String]) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[/* name */ String, /* value */ String]] = js.native
    
    def forEach[THIS_ARG](
      callback: js.ThisFunction3[
          /* this */ THIS_ARG, 
          /* value */ String, 
          /* name */ String, 
          /* searchParams */ this.type, 
          Unit
        ]
    ): Unit = js.native
    def forEach[THIS_ARG](
      callback: js.ThisFunction3[
          /* this */ THIS_ARG, 
          /* value */ String, 
          /* name */ String, 
          /* searchParams */ this.type, 
          Unit
        ],
      thisArg: THIS_ARG
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[/* name */ String, /* value */ String]]] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: typings.whatwgUrl.whatwgUrlStrings.URLSearchParams = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  inline def basicURLParse(input: String): URLRecord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("basicURLParse")(input.asInstanceOf[js.Any]).asInstanceOf[URLRecord | Null]
  inline def basicURLParse(input: String, options: typings.whatwgUrl.anon.StateOverride): URLRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("basicURLParse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URLRecord | Null]
  
  inline def cannotHaveAUsernamePasswordPort(urlRecord: URLRecord): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotHaveAUsernamePasswordPort")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasAnOpaquePath(urlRecord: URLRecord): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnOpaquePath")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseURL(input: String): URLRecord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(input.asInstanceOf[js.Any]).asInstanceOf[URLRecord | Null]
  inline def parseURL(input: String, options: BaseURL): URLRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URLRecord | Null]
  
  inline def percentDecodeBytes(buffer: TypedArray): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("percentDecodeBytes")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def percentDecodeString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("percentDecodeString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def serializeHost(host: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHost")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeHost(host: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHost")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeHost(host: IPv6Address): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHost")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeInteger(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInteger")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializePath(urlRecord: URLRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializePath")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeURL(urlRecord: URLRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeURL")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeURL(urlRecord: URLRecord, excludeFragment: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeURL")(urlRecord.asInstanceOf[js.Any], excludeFragment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeURLOrigin(urlRecord: URLRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeURLOrigin")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setThePassword(urlRecord: URLRecord, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setThePassword")(urlRecord.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTheUsername(urlRecord: URLRecord, username: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTheUsername")(urlRecord.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    - typings.whatwgUrl.whatwgUrlStrings.`opaque path`
    - typings.whatwgUrl.whatwgUrlStrings.query
    - typings.whatwgUrl.whatwgUrlStrings.fragment
  */
  trait StateOverride extends StObject
  object StateOverride {
    
    inline def authority: typings.whatwgUrl.whatwgUrlStrings.authority = "authority".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.authority]
    
    inline def file: typings.whatwgUrl.whatwgUrlStrings.file = "file".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.file]
    
    inline def `file host`: typings.whatwgUrl.whatwgUrlStrings.`file host` = ("file host").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`file host`]
    
    inline def `file slash`: typings.whatwgUrl.whatwgUrlStrings.`file slash` = ("file slash").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`file slash`]
    
    inline def fragment: typings.whatwgUrl.whatwgUrlStrings.fragment = "fragment".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.fragment]
    
    inline def host: typings.whatwgUrl.whatwgUrlStrings.host = "host".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.host]
    
    inline def hostname: typings.whatwgUrl.whatwgUrlStrings.hostname = "hostname".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.hostname]
    
    inline def `no scheme`: typings.whatwgUrl.whatwgUrlStrings.`no scheme` = ("no scheme").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`no scheme`]
    
    inline def `opaque path`: typings.whatwgUrl.whatwgUrlStrings.`opaque path` = ("opaque path").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`opaque path`]
    
    inline def path: typings.whatwgUrl.whatwgUrlStrings.path = "path".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.path]
    
    inline def `path or authority`: typings.whatwgUrl.whatwgUrlStrings.`path or authority` = ("path or authority").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`path or authority`]
    
    inline def `path start`: typings.whatwgUrl.whatwgUrlStrings.`path start` = ("path start").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`path start`]
    
    inline def port: typings.whatwgUrl.whatwgUrlStrings.port = "port".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.port]
    
    inline def query: typings.whatwgUrl.whatwgUrlStrings.query = "query".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.query]
    
    inline def relative: typings.whatwgUrl.whatwgUrlStrings.relative = "relative".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.relative]
    
    inline def `relative slash`: typings.whatwgUrl.whatwgUrlStrings.`relative slash` = ("relative slash").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`relative slash`]
    
    inline def scheme: typings.whatwgUrl.whatwgUrlStrings.scheme = "scheme".asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.scheme]
    
    inline def `scheme start`: typings.whatwgUrl.whatwgUrlStrings.`scheme start` = ("scheme start").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`scheme start`]
    
    inline def `special authority ignore slashes`: typings.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes` = ("special authority ignore slashes").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`]
    
    inline def `special authority slashes`: typings.whatwgUrl.whatwgUrlStrings.`special authority slashes` = ("special authority slashes").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`special authority slashes`]
    
    inline def `special relative or authority`: typings.whatwgUrl.whatwgUrlStrings.`special relative or authority` = ("special relative or authority").asInstanceOf[typings.whatwgUrl.whatwgUrlStrings.`special relative or authority`]
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  trait URLRecord extends StObject {
    
    var fragment: String | Null
    
    var host: String | Double | IPv6Address | Null
    
    var password: String
    
    var path: String | js.Array[String]
    
    var port: Double | Null
    
    var query: String | Null
    
    var scheme: String
    
    var username: String
  }
  object URLRecord {
    
    inline def apply(password: String, path: String | js.Array[String], scheme: String, username: String): URLRecord = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], fragment = null, host = null, port = null, query = null)
      __obj.asInstanceOf[URLRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLRecord] (val x: Self) extends AnyVal {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      inline def setHost(value: String | Double | IPv6Address): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
