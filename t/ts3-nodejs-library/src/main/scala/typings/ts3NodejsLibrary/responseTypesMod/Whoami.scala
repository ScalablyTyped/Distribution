package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Whoami extends js.Object {
  var client_channel_id: Double
  var client_database_id: Double
  var client_id: Double
  var client_login_name: String
  var client_nickname: String
  var client_origin_server_id: Double
  var client_unique_identifier: String
  var virtualserver_id: Double
  var virtualserver_port: Double
  var virtualserver_status: String
  var virtualserver_unique_identifier: String
}

object Whoami {
  @scala.inline
  def apply(
    client_channel_id: Double,
    client_database_id: Double,
    client_id: Double,
    client_login_name: String,
    client_nickname: String,
    client_origin_server_id: Double,
    client_unique_identifier: String,
    virtualserver_id: Double,
    virtualserver_port: Double,
    virtualserver_status: String,
    virtualserver_unique_identifier: String
  ): Whoami = {
    val __obj = js.Dynamic.literal(client_channel_id = client_channel_id.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_origin_server_id = client_origin_server_id.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], virtualserver_id = virtualserver_id.asInstanceOf[js.Any], virtualserver_port = virtualserver_port.asInstanceOf[js.Any], virtualserver_status = virtualserver_status.asInstanceOf[js.Any], virtualserver_unique_identifier = virtualserver_unique_identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Whoami]
  }
}

