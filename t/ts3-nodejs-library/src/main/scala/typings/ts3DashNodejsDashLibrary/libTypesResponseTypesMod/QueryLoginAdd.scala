package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    val __obj = js.Dynamic.literal(cldbid = cldbid, client_login_name = client_login_name, client_login_password = client_login_password, sid = sid)
  
    __obj.asInstanceOf[QueryLoginAdd]
  }
}

