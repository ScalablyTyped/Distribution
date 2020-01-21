package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostnamePort extends js.Object {
  var hostname: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
}

object AnonHostnamePort {
  @scala.inline
  def apply(hostname: String = null, port: String = null): AnonHostnamePort = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostnamePort]
  }
}

