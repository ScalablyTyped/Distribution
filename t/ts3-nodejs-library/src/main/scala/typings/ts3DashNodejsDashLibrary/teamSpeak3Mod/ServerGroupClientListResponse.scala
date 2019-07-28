package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupClientListResponse extends js.Object {
  var cldbid: Double
  var client_nickname: String
  var client_unique_identifier: String
}

object ServerGroupClientListResponse {
  @scala.inline
  def apply(cldbid: Double, client_nickname: String, client_unique_identifier: String): ServerGroupClientListResponse = {
    val __obj = js.Dynamic.literal(cldbid = cldbid, client_nickname = client_nickname, client_unique_identifier = client_unique_identifier)
  
    __obj.asInstanceOf[ServerGroupClientListResponse]
  }
}

