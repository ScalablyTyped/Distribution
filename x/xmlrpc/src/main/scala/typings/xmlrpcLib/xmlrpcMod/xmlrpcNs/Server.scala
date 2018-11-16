package typings
package xmlrpcLib.xmlrpcMod.xmlrpcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.eventsMod.EventEmitter {
  var httpServer: nodeLib.httpMod.Server | nodeLib.httpsMod.Server = js.native
  def on(eventName: java.lang.String, callback: ServerFunction): this.type = js.native
  @JSName("on")
  def on_NotFound(eventName: xmlrpcLib.xmlrpcLibStrings.NotFound, callback: ServerNotFoundFunction): this.type = js.native
}

