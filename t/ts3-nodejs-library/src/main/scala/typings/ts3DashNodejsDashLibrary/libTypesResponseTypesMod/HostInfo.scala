package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostInfo extends js.Object {
  var connection_bandwidth_received_last_minute_total: Double
  var connection_bandwidth_received_last_second_total: Double
  var connection_bandwidth_sent_last_minute_total: Double
  var connection_bandwidth_sent_last_second_total: Double
  var connection_bytes_received_total: Double
  var connection_bytes_sent_total: Double
  var connection_filetransfer_bandwidth_received: Double
  var connection_filetransfer_bandwidth_sent: Double
  var connection_filetransfer_bytes_received_total: Double
  var connection_filetransfer_bytes_sent_total: Double
  var connection_packets_received_total: Double
  var connection_packets_sent_total: Double
  var host_timestamp_utc: Double
  var instance_uptime: Double
  var virtualservers_running_total: Double
  var virtualservers_total_channels_online: Double
  var virtualservers_total_clients_online: Double
  var virtualservers_total_maxclients: Double
}

object HostInfo {
  @scala.inline
  def apply(
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_total: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_filetransfer_bytes_received_total: Double,
    connection_filetransfer_bytes_sent_total: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_total: Double,
    host_timestamp_utc: Double,
    instance_uptime: Double,
    virtualservers_running_total: Double,
    virtualservers_total_channels_online: Double,
    virtualservers_total_clients_online: Double,
    virtualservers_total_maxclients: Double
  ): HostInfo = {
    val __obj = js.Dynamic.literal(connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total, connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total, connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total, connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total, connection_bytes_received_total = connection_bytes_received_total, connection_bytes_sent_total = connection_bytes_sent_total, connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received, connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent, connection_filetransfer_bytes_received_total = connection_filetransfer_bytes_received_total, connection_filetransfer_bytes_sent_total = connection_filetransfer_bytes_sent_total, connection_packets_received_total = connection_packets_received_total, connection_packets_sent_total = connection_packets_sent_total, host_timestamp_utc = host_timestamp_utc, instance_uptime = instance_uptime, virtualservers_running_total = virtualservers_running_total, virtualservers_total_channels_online = virtualservers_total_channels_online, virtualservers_total_clients_online = virtualservers_total_clients_online, virtualservers_total_maxclients = virtualservers_total_maxclients)
  
    __obj.asInstanceOf[HostInfo]
  }
}

