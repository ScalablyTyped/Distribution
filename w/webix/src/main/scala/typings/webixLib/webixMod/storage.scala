package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait storage extends js.Object {
  var cookie: cookie
  var local: local
  var session: session
}

object storage {
  @scala.inline
  def apply(cookie: cookie, local: local, session: session): storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[storage]
  }
}

