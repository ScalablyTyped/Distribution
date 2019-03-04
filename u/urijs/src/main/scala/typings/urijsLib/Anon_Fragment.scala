package typings
package urijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fragment extends js.Object {
  var fragment: java.lang.String
  var hostname: java.lang.String
  var password: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var query: java.lang.String
  var username: java.lang.String
}

object Anon_Fragment {
  @scala.inline
  def apply(
    fragment: java.lang.String,
    hostname: java.lang.String,
    password: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    query: java.lang.String,
    username: java.lang.String
  ): Anon_Fragment = {
    val __obj = js.Dynamic.literal(fragment = fragment, hostname = hostname, password = password, path = path, port = port, protocol = protocol, query = query, username = username)
  
    __obj.asInstanceOf[Anon_Fragment]
  }
}

