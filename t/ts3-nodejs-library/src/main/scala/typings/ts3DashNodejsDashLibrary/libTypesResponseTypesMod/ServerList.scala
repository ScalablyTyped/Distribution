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
    val __obj = js.Dynamic.literal(virtualserver_autostart = virtualserver_autostart, virtualserver_clientsonline = virtualserver_clientsonline, virtualserver_id = virtualserver_id, virtualserver_machine_id = virtualserver_machine_id, virtualserver_maxclients = virtualserver_maxclients, virtualserver_name = virtualserver_name, virtualserver_port = virtualserver_port, virtualserver_queryclientsonline = virtualserver_queryclientsonline, virtualserver_status = virtualserver_status, virtualserver_unique_identifier = virtualserver_unique_identifier, virtualserver_uptime = virtualserver_uptime)
  
    __obj.asInstanceOf[ServerList]
  }
}

