package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRequestConnectionInfo extends js.Object {
  var connection_bandwidth_received_last_minute_total: Double
  var connection_bandwidth_received_last_second_total: Double
  var connection_bandwidth_sent_last_minute_total: Double
  var connection_bandwidth_sent_last_second_total: Double
  var connection_bytes_received_total: Double
  var connection_bytes_sent_total: Double
  var connection_connected_time: Double
  var connection_filetransfer_bandwidth_received: Double
  var connection_filetransfer_bandwidth_sent: Double
  var connection_filetransfer_bytes_received_total: Double
  var connection_filetransfer_bytes_sent_total: Double
  var connection_packetloss_total: Double
  var connection_packets_received_total: Double
  var connection_packets_sent_total: Double
  var connection_ping: Double
}

object ServerRequestConnectionInfo {
  @scala.inline
  def apply(
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_total: Double,
    connection_connected_time: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_filetransfer_bytes_received_total: Double,
    connection_filetransfer_bytes_sent_total: Double,
    connection_packetloss_total: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_total: Double,
    connection_ping: Double
  ): ServerRequestConnectionInfo = {
    val __obj = js.Dynamic.literal(connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total.asInstanceOf[js.Any], connection_bytes_received_total = connection_bytes_received_total.asInstanceOf[js.Any], connection_bytes_sent_total = connection_bytes_sent_total.asInstanceOf[js.Any], connection_connected_time = connection_connected_time.asInstanceOf[js.Any], connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received.asInstanceOf[js.Any], connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent.asInstanceOf[js.Any], connection_filetransfer_bytes_received_total = connection_filetransfer_bytes_received_total.asInstanceOf[js.Any], connection_filetransfer_bytes_sent_total = connection_filetransfer_bytes_sent_total.asInstanceOf[js.Any], connection_packetloss_total = connection_packetloss_total.asInstanceOf[js.Any], connection_packets_received_total = connection_packets_received_total.asInstanceOf[js.Any], connection_packets_sent_total = connection_packets_sent_total.asInstanceOf[js.Any], connection_ping = connection_ping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRequestConnectionInfo]
  }
}

