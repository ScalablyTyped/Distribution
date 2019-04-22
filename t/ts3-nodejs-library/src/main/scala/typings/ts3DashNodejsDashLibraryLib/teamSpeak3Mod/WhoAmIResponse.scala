package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhoAmIResponse extends js.Object {
  var cient_login_name: java.lang.String
  var client_channel_id: scala.Double
  var client_database_id: scala.Double
  var client_id: scala.Double
  var client_nickname: java.lang.String
  var client_origin_server_id: scala.Double
  var client_unique_identifier: java.lang.String
  var virtualserver_id: scala.Double
  var virtualserver_port: scala.Double
  var virtualserver_status: java.lang.String
  var virtualserver_unique_identifier: java.lang.String
}

object WhoAmIResponse {
  @scala.inline
  def apply(
    cient_login_name: java.lang.String,
    client_channel_id: scala.Double,
    client_database_id: scala.Double,
    client_id: scala.Double,
    client_nickname: java.lang.String,
    client_origin_server_id: scala.Double,
    client_unique_identifier: java.lang.String,
    virtualserver_id: scala.Double,
    virtualserver_port: scala.Double,
    virtualserver_status: java.lang.String,
    virtualserver_unique_identifier: java.lang.String
  ): WhoAmIResponse = {
    val __obj = js.Dynamic.literal(cient_login_name = cient_login_name, client_channel_id = client_channel_id, client_database_id = client_database_id, client_id = client_id, client_nickname = client_nickname, client_origin_server_id = client_origin_server_id, client_unique_identifier = client_unique_identifier, virtualserver_id = virtualserver_id, virtualserver_port = virtualserver_port, virtualserver_status = virtualserver_status, virtualserver_unique_identifier = virtualserver_unique_identifier)
  
    __obj.asInstanceOf[WhoAmIResponse]
  }
}

