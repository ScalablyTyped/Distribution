package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Hostname {
  @scala.inline
  def apply(hostname: String = null, password: String = null, port: String = null, username: String = null): Anon_Hostname = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Hostname]
  }
}

