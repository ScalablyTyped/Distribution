package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Origin extends js.Object {
  var origin: java.lang.String
  var req: nodeLib.httpMod.IncomingMessage
  var secure: scala.Boolean
}

object Anon_Origin {
  @scala.inline
  def apply(origin: java.lang.String, req: nodeLib.httpMod.IncomingMessage, secure: scala.Boolean): Anon_Origin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Anon_Origin]
  }
}

