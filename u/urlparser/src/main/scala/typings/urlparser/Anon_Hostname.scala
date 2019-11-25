package typings.urlparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: String
  var password: String
  var port: String | Double
  var protocol: String
  var username: String
}

object Anon_Hostname {
  @scala.inline
  def apply(hostname: String, password: String, port: String | Double, protocol: String, username: String): Anon_Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hostname]
  }
}

