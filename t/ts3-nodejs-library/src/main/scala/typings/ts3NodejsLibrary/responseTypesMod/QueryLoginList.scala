package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLoginList extends js.Object {
  var cldbid: Double
  var client_login_name: String
  var sid: Double
}

object QueryLoginList {
  @scala.inline
  def apply(cldbid: Double, client_login_name: String, sid: Double): QueryLoginList = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginList]
  }
}

