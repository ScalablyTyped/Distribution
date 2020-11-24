package typings.xmlrpc.mod

import typings.node.eventsMod.EventEmitter
import typings.xmlrpc.xmlrpcStrings.NotFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends EventEmitter {
  
  var httpServer: typings.node.httpMod.Server | typings.node.httpsMod.Server = js.native
  
  def on(eventName: String, callback: ServerFunction): this.type = js.native
  @JSName("on")
  def on_NotFound(eventName: NotFound, callback: ServerNotFoundFunction): this.type = js.native
}
