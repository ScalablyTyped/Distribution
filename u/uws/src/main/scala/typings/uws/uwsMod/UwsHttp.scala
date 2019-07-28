package typings.uws.uwsMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UwsHttp extends js.Object {
  def createServer(): typings.node.httpMod.Server = js.native
  def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): typings.node.httpMod.Server = js.native
  // any to avoid express definitions
  def getExpressApp(express: js.Any): js.Any = js.native
  def getRequestPrototype(): IncomingMessage = js.native
  def getResponsePrototype(): ServerResponse = js.native
}

