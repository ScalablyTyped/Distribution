package typings.xmlrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlrpc", "createServer")
@js.native
object createServer extends js.Object {
  
  def apply(options: String): Server = js.native
  def apply(options: String, callback: js.Function0[Unit]): Server = js.native
  def apply(options: ServerOptions): Server = js.native
  def apply(options: ServerOptions, callback: js.Function0[Unit]): Server = js.native
}
