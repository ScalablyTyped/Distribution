package typings.xmlrpc.xmlrpcMod

import typings.node.eventsMod.EventEmitter
import typings.xmlrpc.xmlrpcStrings.NotFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends EventEmitter {
  var httpServer: typings.node.httpMod.Server | typings.node.httpsMod.Server = js.native
  def on(eventName: String, callback: ServerFunction): this.type = js.native
  @JSName("on")
  def on_NotFound(eventName: NotFound, callback: ServerNotFoundFunction): this.type = js.native
}

