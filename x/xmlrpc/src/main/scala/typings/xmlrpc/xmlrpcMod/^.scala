package typings.xmlrpc.xmlrpcMod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlrpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(options: String): Client = js.native
  def createClient(options: ClientOptions): Client = js.native
  def createSecureClient(options: String): Client = js.native
  def createSecureClient(options: ClientOptions): Client = js.native
  def createSecureServer(options: String, callback: js.Function0[Unit]): Server = js.native
  def createSecureServer(options: TlsOptions, callback: js.Function0[Unit]): Server = js.native
  def createServer(options: String, callback: js.Function0[Unit]): Server = js.native
  def createServer(options: ServerOptions, callback: js.Function0[Unit]): Server = js.native
}

