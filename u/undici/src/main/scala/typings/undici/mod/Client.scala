package typings.undici.mod

import typings.node.urlMod.URL_
import typings.undici.typesClientMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A basic HTTP/1.1 client, mapped on top a single TCP/TLS connection. Pipelining is disabled by default. */
@JSImport("undici", "Client")
@js.native
open class Client protected ()
  extends typings.undici.typesClientMod.^ {
  def this(url: String) = this()
  def this(url: URL_) = this()
  def this(url: String, options: Options) = this()
  def this(url: URL_, options: Options) = this()
}
