package typings.swaggerStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var hostname: String
  var ip: String
  var name: String
  var version: String
}

object AnonHostname {
  @scala.inline
  def apply(hostname: String, ip: String, name: String, version: String): AnonHostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
}

