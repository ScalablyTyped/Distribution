package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLoginAdd extends js.Object {
  var cldbid: Double
  var client_login_name: String
  var client_login_password: String
  var sid: Double
}

object QueryLoginAdd {
  @scala.inline
  def apply(cldbid: Double, client_login_name: String, client_login_password: String, sid: Double): QueryLoginAdd = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_login_password = client_login_password.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginAdd]
  }
}

