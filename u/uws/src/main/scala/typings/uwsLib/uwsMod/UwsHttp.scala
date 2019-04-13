package typings
package uwsLib.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UwsHttp extends js.Object {
  def createServer(): nodeLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server = js.native
  // any to avoid express definitions
  def getExpressApp(express: js.Any): js.Any = js.native
  def getRequestPrototype(): nodeLib.httpMod.IncomingMessage = js.native
  def getResponsePrototype(): nodeLib.httpMod.ServerResponse = js.native
}

