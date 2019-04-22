package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupClientListResponse extends js.Object {
  var cldbid: scala.Double
  var client_nickname: java.lang.String
  var client_unique_identifier: java.lang.String
}

object ServerGroupClientListResponse {
  @scala.inline
  def apply(
    cldbid: scala.Double,
    client_nickname: java.lang.String,
    client_unique_identifier: java.lang.String
  ): ServerGroupClientListResponse = {
    val __obj = js.Dynamic.literal(cldbid = cldbid, client_nickname = client_nickname, client_unique_identifier = client_unique_identifier)
  
    __obj.asInstanceOf[ServerGroupClientListResponse]
  }
}

