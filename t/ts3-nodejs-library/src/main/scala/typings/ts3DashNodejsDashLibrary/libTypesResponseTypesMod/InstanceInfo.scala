package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceInfo extends js.Object {
  var serverinstance_database_version: Double
  var serverinstance_filetransfer_port: Double
  var serverinstance_guest_serverquery_group: Double
  var serverinstance_max_download_total_bandwidth: Double
  var serverinstance_max_upload_total_bandwidth: Double
  var serverinstance_pending_connections_per_ip: Double
  var serverinstance_permissions_version: Double
  var serverinstance_serverquery_flood_ban_time: Double
  var serverinstance_serverquery_flood_commands: Double
  var serverinstance_serverquery_max_connections_per_ip: Double
  var serverinstance_template_channeladmin_group: Double
  var serverinstance_template_channeldefault_group: Double
  var serverinstance_template_serveradmin_group: Double
  var serverinstance_template_serverdefault_group: Double
}

object InstanceInfo {
  @scala.inline
  def apply(
    serverinstance_database_version: Double,
    serverinstance_filetransfer_port: Double,
    serverinstance_guest_serverquery_group: Double,
    serverinstance_max_download_total_bandwidth: Double,
    serverinstance_max_upload_total_bandwidth: Double,
    serverinstance_pending_connections_per_ip: Double,
    serverinstance_permissions_version: Double,
    serverinstance_serverquery_flood_ban_time: Double,
    serverinstance_serverquery_flood_commands: Double,
    serverinstance_serverquery_max_connections_per_ip: Double,
    serverinstance_template_channeladmin_group: Double,
    serverinstance_template_channeldefault_group: Double,
    serverinstance_template_serveradmin_group: Double,
    serverinstance_template_serverdefault_group: Double
  ): InstanceInfo = {
    val __obj = js.Dynamic.literal(serverinstance_database_version = serverinstance_database_version, serverinstance_filetransfer_port = serverinstance_filetransfer_port, serverinstance_guest_serverquery_group = serverinstance_guest_serverquery_group, serverinstance_max_download_total_bandwidth = serverinstance_max_download_total_bandwidth, serverinstance_max_upload_total_bandwidth = serverinstance_max_upload_total_bandwidth, serverinstance_pending_connections_per_ip = serverinstance_pending_connections_per_ip, serverinstance_permissions_version = serverinstance_permissions_version, serverinstance_serverquery_flood_ban_time = serverinstance_serverquery_flood_ban_time, serverinstance_serverquery_flood_commands = serverinstance_serverquery_flood_commands, serverinstance_serverquery_max_connections_per_ip = serverinstance_serverquery_max_connections_per_ip, serverinstance_template_channeladmin_group = serverinstance_template_channeladmin_group, serverinstance_template_channeldefault_group = serverinstance_template_channeldefault_group, serverinstance_template_serveradmin_group = serverinstance_template_serveradmin_group, serverinstance_template_serverdefault_group = serverinstance_template_serverdefault_group)
  
    __obj.asInstanceOf[InstanceInfo]
  }
}

