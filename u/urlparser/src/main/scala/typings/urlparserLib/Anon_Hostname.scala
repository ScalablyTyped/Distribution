package typings
package urlparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: java.lang.String
  var password: java.lang.String
  var port: java.lang.String | scala.Double
  var protocol: java.lang.String
  var username: java.lang.String
}

object Anon_Hostname {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    password: java.lang.String,
    port: java.lang.String | scala.Double,
    protocol: java.lang.String,
    username: java.lang.String
  ): Anon_Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname, password = password, port = port.asInstanceOf[js.Any], protocol = protocol, username = username)
  
    __obj.asInstanceOf[Anon_Hostname]
  }
}

