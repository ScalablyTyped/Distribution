package typings.urlParse

import typings.urlParse.mod.URLPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlParseStrings {
  
  @js.native
  sealed trait auth
    extends StObject
       with URLPart
  inline def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait hash
    extends StObject
       with URLPart
  inline def hash: hash = "hash".asInstanceOf[hash]
  
  @js.native
  sealed trait host
    extends StObject
       with URLPart
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait hostname
    extends StObject
       with URLPart
  inline def hostname: hostname = "hostname".asInstanceOf[hostname]
  
  @js.native
  sealed trait href
    extends StObject
       with URLPart
  inline def href: href = "href".asInstanceOf[href]
  
  @js.native
  sealed trait origin
    extends StObject
       with URLPart
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait password
    extends StObject
       with URLPart
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait pathname
    extends StObject
       with URLPart
  inline def pathname: pathname = "pathname".asInstanceOf[pathname]
  
  @js.native
  sealed trait port
    extends StObject
       with URLPart
  inline def port: port = "port".asInstanceOf[port]
  
  @js.native
  sealed trait protocol
    extends StObject
       with URLPart
  inline def protocol: protocol = "protocol".asInstanceOf[protocol]
  
  @js.native
  sealed trait query
    extends StObject
       with URLPart
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait slashes
    extends StObject
       with URLPart
  inline def slashes: slashes = "slashes".asInstanceOf[slashes]
  
  @js.native
  sealed trait username
    extends StObject
       with URLPart
  inline def username: username = "username".asInstanceOf[username]
}
