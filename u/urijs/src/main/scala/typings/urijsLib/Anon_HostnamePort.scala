package typings
package urijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePort extends js.Object {
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HostnamePort {
  @scala.inline
  def apply(hostname: java.lang.String = null, port: java.lang.String = null): Anon_HostnamePort = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (port != null) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_HostnamePort]
  }
}

