package typings.ws

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Origin extends js.Object {
  var origin: String
  var req: IncomingMessage
  var secure: Boolean
}

object Anon_Origin {
  @scala.inline
  def apply(origin: String, req: IncomingMessage, secure: Boolean): Anon_Origin = {
    val __obj = js.Dynamic.literal(origin = origin, req = req, secure = secure)
  
    __obj.asInstanceOf[Anon_Origin]
  }
}

