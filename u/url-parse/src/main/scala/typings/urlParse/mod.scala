package typings.urlParse

import org.scalablytyped.runtime.StringDictionary
import typings.urlParse.anon.Parse
import typings.urlParse.anon.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.UndefOr[scala.Nothing], parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.UndefOr[scala.Nothing], parser: QueryParser): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: String): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: String, parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: String, parser: QueryParser): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.Object): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.Object, parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, location: js.Object, parser: QueryParser): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, parser: Boolean): URLParse = js.native
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  def apply(address: String, parser: QueryParser): URLParse = js.native
  
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  class Class protected () extends URLParse {
    def this(address: String) = this()
    def this(address: String, location: String) = this()
    def this(address: String, location: js.Object) = this()
    def this(address: String, parser: Boolean) = this()
    def this(address: String, parser: QueryParser) = this()
    def this(address: String, location: js.UndefOr[scala.Nothing], parser: Boolean) = this()
    def this(address: String, location: js.UndefOr[scala.Nothing], parser: QueryParser) = this()
    def this(address: String, location: String, parser: Boolean) = this()
    def this(address: String, location: String, parser: QueryParser) = this()
    def this(address: String, location: js.Object, parser: Boolean) = this()
    def this(address: String, location: js.Object, parser: QueryParser) = this()
  }
  
  @JSImport("url-parse", "extractProtocol")
  @js.native
  def extractProtocol(url: String): Protocol = js.native
  
  @JSImport("url-parse", "location")
  @js.native
  def location(url: String): js.Object = js.native
  
  @JSImport("url-parse", "qs")
  @js.native
  def qs: Parse = js.native
  @scala.inline
  def qs_=(x: Parse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs")(x.asInstanceOf[js.Any])
  
  type QueryParser = js.Function1[/* query */ String, js.Object]
  
  type StringifyQuery = js.Function1[/* query */ js.Object, String]
  
  @js.native
  trait URLParse extends StObject {
    
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
    
    val query: StringDictionary[js.UndefOr[String]] = js.native
    
    def set(part: URLPart): URLParse = js.native
    def set(part: URLPart, value: js.UndefOr[scala.Nothing], fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: js.UndefOr[scala.Nothing], fn: QueryParser): URLParse = js.native
    def set(part: URLPart, value: String): URLParse = js.native
    def set(part: URLPart, value: String, fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: String, fn: QueryParser): URLParse = js.native
    def set(part: URLPart, value: js.Object): URLParse = js.native
    def set(part: URLPart, value: js.Object, fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: js.Object, fn: QueryParser): URLParse = js.native
    def set(part: URLPart, value: Double): URLParse = js.native
    def set(part: URLPart, value: Double, fn: Boolean): URLParse = js.native
    def set(part: URLPart, value: Double, fn: QueryParser): URLParse = js.native
    
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
    
    @scala.inline
    def auth: typings.urlParse.urlParseStrings.auth = "auth".asInstanceOf[typings.urlParse.urlParseStrings.auth]
    
    @scala.inline
    def hash: typings.urlParse.urlParseStrings.hash = "hash".asInstanceOf[typings.urlParse.urlParseStrings.hash]
    
    @scala.inline
    def host: typings.urlParse.urlParseStrings.host = "host".asInstanceOf[typings.urlParse.urlParseStrings.host]
    
    @scala.inline
    def hostname: typings.urlParse.urlParseStrings.hostname = "hostname".asInstanceOf[typings.urlParse.urlParseStrings.hostname]
    
    @scala.inline
    def href: typings.urlParse.urlParseStrings.href = "href".asInstanceOf[typings.urlParse.urlParseStrings.href]
    
    @scala.inline
    def origin: typings.urlParse.urlParseStrings.origin = "origin".asInstanceOf[typings.urlParse.urlParseStrings.origin]
    
    @scala.inline
    def password: typings.urlParse.urlParseStrings.password = "password".asInstanceOf[typings.urlParse.urlParseStrings.password]
    
    @scala.inline
    def pathname: typings.urlParse.urlParseStrings.pathname = "pathname".asInstanceOf[typings.urlParse.urlParseStrings.pathname]
    
    @scala.inline
    def port: typings.urlParse.urlParseStrings.port = "port".asInstanceOf[typings.urlParse.urlParseStrings.port]
    
    @scala.inline
    def protocol: typings.urlParse.urlParseStrings.protocol = "protocol".asInstanceOf[typings.urlParse.urlParseStrings.protocol]
    
    @scala.inline
    def query: typings.urlParse.urlParseStrings.query = "query".asInstanceOf[typings.urlParse.urlParseStrings.query]
    
    @scala.inline
    def slashes: typings.urlParse.urlParseStrings.slashes = "slashes".asInstanceOf[typings.urlParse.urlParseStrings.slashes]
    
    @scala.inline
    def username: typings.urlParse.urlParseStrings.username = "username".asInstanceOf[typings.urlParse.urlParseStrings.username]
  }
}
