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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fragment")(fragment)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Fragment]
  }
}

