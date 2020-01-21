package typings.urlParse

import typings.urlParse.mod.URLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object urlParseStrings {
  @js.native
  sealed trait auth extends URLPart
  
  @js.native
  sealed trait hash extends URLPart
  
  @js.native
  sealed trait host extends URLPart
  
  @js.native
  sealed trait hostname extends URLPart
  
  @js.native
  sealed trait href extends URLPart
  
  @js.native
  sealed trait origin extends URLPart
  
  @js.native
  sealed trait password extends URLPart
  
  @js.native
  sealed trait pathname extends URLPart
  
  @js.native
  sealed trait port extends URLPart
  
  @js.native
  sealed trait protocol extends URLPart
  
  @js.native
  sealed trait query extends URLPart
  
  @js.native
  sealed trait slashes extends URLPart
  
  @js.native
  sealed trait username extends URLPart
  
  @scala.inline
  def auth: auth = "auth".asInstanceOf[auth]
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  @scala.inline
  def hostname: hostname = "hostname".asInstanceOf[hostname]
  @scala.inline
  def href: href = "href".asInstanceOf[href]
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def pathname: pathname = "pathname".asInstanceOf[pathname]
  @scala.inline
  def port: port = "port".asInstanceOf[port]
  @scala.inline
  def protocol: protocol = "protocol".asInstanceOf[protocol]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def slashes: slashes = "slashes".asInstanceOf[slashes]
  @scala.inline
  def username: username = "username".asInstanceOf[username]
}

