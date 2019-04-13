package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlrpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(options: java.lang.String): Client = js.native
  def createClient(options: ClientOptions): Client = js.native
  def createSecureClient(options: java.lang.String): Client = js.native
  def createSecureClient(options: ClientOptions): Client = js.native
  def createSecureServer(options: java.lang.String, callback: js.Function0[scala.Unit]): Server = js.native
  def createSecureServer(options: nodeLib.tlsMod.TlsOptions, callback: js.Function0[scala.Unit]): Server = js.native
  def createServer(options: java.lang.String, callback: js.Function0[scala.Unit]): Server = js.native
  def createServer(options: ServerOptions, callback: js.Function0[scala.Unit]): Server = js.native
}

