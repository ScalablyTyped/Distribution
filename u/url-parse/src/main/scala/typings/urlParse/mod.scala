package typings.urlParse

import typings.std.Record
import typings.urlParse.anon.Parse
import typings.urlParse.anon.Protocol
import typings.urlParse.urlParseBooleans.`false`
import typings.urlParse.urlParseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(address: String): URLParse[String] = ^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any]).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: String): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: String, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: String, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply(address: String, location: js.Object): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: js.Object, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: js.Object, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply(address: String, location: Unit, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: Unit, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply(address: String, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply[T](address: String, location: String, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  inline def apply[T](address: String, location: js.Object, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  inline def apply[T](address: String, location: Unit, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  inline def apply[T](address: String, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  open class Class[T] protected ()
    extends StObject
       with URLParse[T] {
    def this(address: String) = this()
    def this(address: String, parser: QueryParser[T]) = this()
    def this(address: String, location: String, parser: QueryParser[T]) = this()
    def this(address: String, location: js.Object, parser: QueryParser[T]) = this()
    def this(address: String, location: Unit, parser: QueryParser[T]) = this()
  }
  
  inline def extractProtocol(url: String): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("extractProtocol")(url.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  
  inline def location(url: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(url.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("url-parse", "qs")
  @js.native
  def qs: Parse = js.native
  inline def qs_=(x: Parse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs")(x.asInstanceOf[js.Any])
  
  inline def trimLeft(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimLeft")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type QueryParser[T] = js.Function1[/* query */ String, T]
  
  type StringifyQuery = js.Function1[/* query */ js.Object, String]
  
  @js.native
  trait URLParse[Query] extends StObject {
    
    val auth: String = js.native
    
    val hash: String = js.native
    
    val host: String = js.native
    
    val hostname: String = js.native
    
    val href: String = js.native
    
    val origin: String = js.native
    
    val password: String = js.native
    
    val pathname: String = js.native
    
    val port: String = js.native
    
    val protocol: String = js.native
    
    val query: Query = js.native
    
    def set[Part /* <: URLPart */](part: Part): URLParse[Query] = js.native
    def set[Part /* <: URLPart */](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<Query>[Part] */ js.Any
    ): URLParse[Query] = js.native
    def set[Part /* <: URLPart */, T](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<T>[Part] */ js.Any,
      fn: QueryParser[T]
    ): URLParse[T] = js.native
    def set[Part /* <: URLPart */, T](part: Part, value: Unit, fn: QueryParser[T]): URLParse[T] = js.native
    @JSName("set")
    def set_Part_URLPartT[Part /* <: URLPart */, T](part: Part): URLParse[T] = js.native
    @JSName("set")
    def set_Part_URLPartT[Part /* <: URLPart */, T](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<T>[Part] */ js.Any
    ): URLParse[T] = js.native
    @JSName("set")
    def set_false[Part /* <: URLPart */](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<Query>[Part] */ js.Any,
      fn: `false`
    ): URLParse[Query] = js.native
    @JSName("set")
    def set_false[Part /* <: URLPart */](part: Part, value: Unit, fn: `false`): URLParse[Query] = js.native
    
    val slashes: Boolean = js.native
    
    def toString(stringify: StringifyQuery): String = js.native
    
    val username: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.urlParse.urlParseStrings.auth
    - typings.urlParse.urlParseStrings.hash
    - typings.urlParse.urlParseStrings.host
    - typings.urlParse.urlParseStrings.hostname
    - typings.urlParse.urlParseStrings.href
    - typings.urlParse.urlParseStrings.origin
    - typings.urlParse.urlParseStrings.password
    - typings.urlParse.urlParseStrings.pathname
    - typings.urlParse.urlParseStrings.port
    - typings.urlParse.urlParseStrings.protocol
    - typings.urlParse.urlParseStrings.query
    - typings.urlParse.urlParseStrings.slashes
    - typings.urlParse.urlParseStrings.username
  */
  trait URLPart extends StObject
  object URLPart {
    
    inline def auth: typings.urlParse.urlParseStrings.auth = "auth".asInstanceOf[typings.urlParse.urlParseStrings.auth]
    
    inline def hash: typings.urlParse.urlParseStrings.hash = "hash".asInstanceOf[typings.urlParse.urlParseStrings.hash]
    
    inline def host: typings.urlParse.urlParseStrings.host = "host".asInstanceOf[typings.urlParse.urlParseStrings.host]
    
    inline def hostname: typings.urlParse.urlParseStrings.hostname = "hostname".asInstanceOf[typings.urlParse.urlParseStrings.hostname]
    
    inline def href: typings.urlParse.urlParseStrings.href = "href".asInstanceOf[typings.urlParse.urlParseStrings.href]
    
    inline def origin: typings.urlParse.urlParseStrings.origin = "origin".asInstanceOf[typings.urlParse.urlParseStrings.origin]
    
    inline def password: typings.urlParse.urlParseStrings.password = "password".asInstanceOf[typings.urlParse.urlParseStrings.password]
    
    inline def pathname: typings.urlParse.urlParseStrings.pathname = "pathname".asInstanceOf[typings.urlParse.urlParseStrings.pathname]
    
    inline def port: typings.urlParse.urlParseStrings.port = "port".asInstanceOf[typings.urlParse.urlParseStrings.port]
    
    inline def protocol: typings.urlParse.urlParseStrings.protocol = "protocol".asInstanceOf[typings.urlParse.urlParseStrings.protocol]
    
    inline def query: typings.urlParse.urlParseStrings.query = "query".asInstanceOf[typings.urlParse.urlParseStrings.query]
    
    inline def slashes: typings.urlParse.urlParseStrings.slashes = "slashes".asInstanceOf[typings.urlParse.urlParseStrings.slashes]
    
    inline def username: typings.urlParse.urlParseStrings.username = "username".asInstanceOf[typings.urlParse.urlParseStrings.username]
  }
}
