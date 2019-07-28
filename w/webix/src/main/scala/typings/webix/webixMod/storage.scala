package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait storage extends js.Object {
  var cookie: typings.webix.webixMod.cookie
  var local: typings.webix.webixMod.local
  var session: typings.webix.webixMod.session
}

object storage {
  @scala.inline
  def apply(cookie: cookie, local: local, session: session): storage = {
    val __obj = js.Dynamic.literal(cookie = cookie, local = local, session = session)
  
    __obj.asInstanceOf[storage]
  }
}

