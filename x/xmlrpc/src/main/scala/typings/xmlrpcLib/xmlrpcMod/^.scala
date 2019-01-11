package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlrpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var dateFormatter: xmlrpcLib.Anon_Date = js.native
  def createClient(options: java.lang.String): xmlrpcLib.xmlrpcMod.xmlrpcNs.Client = js.native
  def createClient(options: xmlrpcLib.xmlrpcMod.ClientOptions): xmlrpcLib.xmlrpcMod.xmlrpcNs.Client = js.native
  def createSecureClient(options: java.lang.String): xmlrpcLib.xmlrpcMod.xmlrpcNs.Client = js.native
  def createSecureClient(options: xmlrpcLib.xmlrpcMod.ClientOptions): xmlrpcLib.xmlrpcMod.xmlrpcNs.Client = js.native
  def createSecureServer(options: java.lang.String, callback: js.Function0[scala.Unit]): xmlrpcLib.xmlrpcMod.xmlrpcNs.Server = js.native
  def createSecureServer(options: nodeLib.tlsMod.TlsOptions, callback: js.Function0[scala.Unit]): xmlrpcLib.xmlrpcMod.xmlrpcNs.Server = js.native
  def createServer(options: java.lang.String, callback: js.Function0[scala.Unit]): xmlrpcLib.xmlrpcMod.xmlrpcNs.Server = js.native
  def createServer(options: xmlrpcLib.xmlrpcMod.ServerOptions, callback: js.Function0[scala.Unit]): xmlrpcLib.xmlrpcMod.xmlrpcNs.Server = js.native
}

