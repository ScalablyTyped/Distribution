package typings.whatwgUrl

import typings.webidlConversions.mod.Globals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlImplMod {
  
  @JSImport("whatwg-url/lib/URL-impl", "implementation")
  @js.native
  open class implementation protected ()
    extends StObject
       with URLImpl {
    def this(globalObject: Globals, constructorArgs: js.Tuple2[/* url */ String, /* base */ js.UndefOr[String]]) = this()
    
    /* CompleteClass */
    var hash: String = js.native
    
    /* CompleteClass */
    var host: String = js.native
    
    /* CompleteClass */
    var hostname: String = js.native
    
    /* CompleteClass */
    var href: String = js.native
    
    /* CompleteClass */
    override val origin: String = js.native
    
    /* CompleteClass */
    var password: String = js.native
    
    /* CompleteClass */
    var pathname: String = js.native
    
    /* CompleteClass */
    var port: String = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
    
    /* CompleteClass */
    var search: String = js.native
    
    /* CompleteClass */
    override val searchParams: typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = js.native
    
    /* CompleteClass */
    override def toJSON(): String = js.native
    
    /* CompleteClass */
    var username: String = js.native
  }
  
  trait URLImpl extends StObject {
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var href: String
    
    val origin: String
    
    var password: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    var search: String
    
    val searchParams: typings.whatwgUrl.libUrlsearchparamsImplMod.implementation
    
    def toJSON(): String
    
    var username: String
  }
  object URLImpl {
    
    inline def apply(
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      password: String,
      pathname: String,
      port: String,
      protocol: String,
      search: String,
      searchParams: typings.whatwgUrl.libUrlsearchparamsImplMod.implementation,
      toJSON: () => String,
      username: String
    ): URLImpl = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLImpl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLImpl] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchParams(value: typings.whatwgUrl.libUrlsearchparamsImplMod.implementation): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
