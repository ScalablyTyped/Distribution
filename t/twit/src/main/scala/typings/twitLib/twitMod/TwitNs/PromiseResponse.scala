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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("resp")(resp)
    __obj.asInstanceOf[PromiseResponse]
  }
}

