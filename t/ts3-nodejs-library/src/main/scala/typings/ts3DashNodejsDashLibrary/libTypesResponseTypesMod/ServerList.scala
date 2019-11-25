package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerList extends js.Object {
  var virtualserver_autostart: Double
  var virtualserver_clientsonline: Double
  var virtualserver_id: Double
  var virtualserver_machine_id: String
  var virtualserver_maxclients: Double
  var virtualserver_name: String
  var virtualserver_port: Double
  var virtualserver_queryclientsonline: Double
  var virtualserver_status: String
  var virtualserver_unique_identifier: String
  var virtualserver_uptime: Double
}

object ServerList {
  @scala.inline
  def apply(
    virtualserver_autostart: Double,
    virtualserver_clientsonline: Double,
    virtualserver_id: Double,
    virtualserver_machine_id: String,
    virtualserver_maxclients: Double,
    virtualserver_name: String,
    virtualserver_port: Double,
    virtualserver_queryclientsonline: Double,
    virtualserver_status: String,
    virtualserver_unique_identifier: String,
    virtualserver_uptime: Double
  ): ServerList = {
    val __obj = js.Dynamic.literal(virtualserver_autostart = virtualserver_autostart.asInstanceOf[js.Any], virtualserver_clientsonline = virtualserver_clientsonline.asInstanceOf[js.Any], virtualserver_id = virtualserver_id.asInstanceOf[js.Any], virtualserver_machine_id = virtualserver_machine_id.asInstanceOf[js.Any], virtualserver_maxclients = virtualserver_maxclients.asInstanceOf[js.Any], virtualserver_name = virtualserver_name.asInstanceOf[js.Any], virtualserver_port = virtualserver_port.asInstanceOf[js.Any], virtualserver_queryclientsonline = virtualserver_queryclientsonline.asInstanceOf[js.Any], virtualserver_status = virtualserver_status.asInstanceOf[js.Any], virtualserver_unique_identifier = virtualserver_unique_identifier.asInstanceOf[js.Any], virtualserver_uptime = virtualserver_uptime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerList]
  }
}

