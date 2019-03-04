package typings
package twitLib.twitMod.TwitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseResponse extends js.Object {
  var data: Response
  var resp: nodeLib.httpMod.IncomingMessage
}

object PromiseResponse {
  @scala.inline
  def apply(data: Response, resp: nodeLib.httpMod.IncomingMessage): PromiseResponse = {
    val __obj = js.Dynamic.literal(data = data, resp = resp)
  
    __obj.asInstanceOf[PromiseResponse]
  }
}

