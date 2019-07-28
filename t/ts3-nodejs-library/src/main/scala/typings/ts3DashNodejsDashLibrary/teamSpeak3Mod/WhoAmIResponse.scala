package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhoAmIResponse extends js.Object {
  var cient_login_name: String
  var client_channel_id: Double
  var client_database_id: Double
  var client_id: Double
  var client_nickname: String
  var client_origin_server_id: Double
  var client_unique_identifier: String
  var virtualserver_id: Double
  var virtualserver_port: Double
  var virtualserver_status: String
  var virtualserver_unique_identifier: String
}

object WhoAmIResponse {
  @scala.inline
  def apply(
    cient_login_name: String,
    client_channel_id: Double,
    client_database_id: Double,
    client_id: Double,
    client_nickname: String,
    client_origin_server_id: Double,
    client_unique_identifier: String,
    virtualserver_id: Double,
    virtualserver_port: Double,
    virtualserver_status: String,
    virtualserver_unique_identifier: String
  ): WhoAmIResponse = {
    val __obj = js.Dynamic.literal(cient_login_name = cient_login_name, client_channel_id = client_channel_id, client_database_id = client_database_id, client_id = client_id, client_nickname = client_nickname, client_origin_server_id = client_origin_server_id, client_unique_identifier = client_unique_identifier, virtualserver_id = virtualserver_id, virtualserver_port = virtualserver_port, virtualserver_status = virtualserver_status, virtualserver_unique_identifier = virtualserver_unique_identifier)
  
    __obj.asInstanceOf[WhoAmIResponse]
  }
}

