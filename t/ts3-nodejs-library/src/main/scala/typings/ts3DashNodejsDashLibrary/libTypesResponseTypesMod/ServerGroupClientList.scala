package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupClientList extends js.Object {
  var cldbid: Double
  var client_nickname: String
  var client_unique_identifier: String
}

object ServerGroupClientList {
  @scala.inline
  def apply(cldbid: Double, client_nickname: String, client_unique_identifier: String): ServerGroupClientList = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerGroupClientList]
  }
}

