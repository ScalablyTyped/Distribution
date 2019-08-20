package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var cid: Double
  var client_away: Double
  var client_away_message: String
  var client_badges: String
  var client_base64HashClientUID: String
  var client_channel_group_id: Double
  var client_channel_group_inherited_channel_id: Double
  var client_country: String
  var client_created: Double
  var client_database_id: Double
  var client_default_channel: Double
  var client_default_token: String
  var client_description: String
  var client_flag_avatar: String
  var client_icon_id: Double
  var client_idle_time: Double
  var client_input_hardware: Double
  var client_input_muted: Double
  var client_integrations: String
  var client_is_channel_commander: Double
  var client_is_priority_speaker: Double
  var client_is_recording: Double
  var client_is_talker: Double
  var client_lastconnected: Double
  var client_login_name: String
  var client_meta_data: String
  var client_month_bytes_downloaded: Double
  var client_month_bytes_uploaded: Double
  var client_myteamspeak_avatar: String
  var client_myteamspeak_id: String
  var client_needed_serverquery_view_power: Double
  var client_nickname: String
  var client_nickname_phonetic: String
  var client_output_hardware: Double
  var client_output_muted: Double
  var client_outputonly_muted: Double
  var client_platform: String
  var client_security_hash: String
  var client_servergroups: js.Array[Double]
  var client_signed_badges: String
  var client_talk_power: Double
  var client_talk_request: Double
  var client_talk_request_msg: String
  var client_total_bytes_downloaded: Double
  var client_total_bytes_uploaded: Double
  var client_totalconnections: Double
  var client_type: Double
  var client_unique_identifier: String
  var client_version: String
  var client_version_sign: String
  var connection_bandwidth_received_last_minute_total: Double
  var connection_bandwidth_received_last_second_total: Double
  var connection_bandwidth_sent_last_minute_total: Double
  var connection_bandwidth_sent_last_second_total: Double
  var connection_bytes_received_total: Double
  var connection_bytes_sent_total: Double
  var connection_client_ip: String
  var connection_connected_time: Double
  var connection_filetransfer_bandwidth_received: Double
  var connection_filetransfer_bandwidth_sent: Double
  var connection_packets_received_total: Double
  var connection_packets_sent_total: Double
}

object ClientInfo {
  @scala.inline
  def apply(
    cid: Double,
    client_away: Double,
    client_away_message: String,
    client_badges: String,
    client_base64HashClientUID: String,
    client_channel_group_id: Double,
    client_channel_group_inherited_channel_id: Double,
    client_country: String,
    client_created: Double,
    client_database_id: Double,
    client_default_channel: Double,
    client_default_token: String,
    client_description: String,
    client_flag_avatar: String,
    client_icon_id: Double,
    client_idle_time: Double,
    client_input_hardware: Double,
    client_input_muted: Double,
    client_integrations: String,
    client_is_channel_commander: Double,
    client_is_priority_speaker: Double,
    client_is_recording: Double,
    client_is_talker: Double,
    client_lastconnected: Double,
    client_login_name: String,
    client_meta_data: String,
    client_month_bytes_downloaded: Double,
    client_month_bytes_uploaded: Double,
    client_myteamspeak_avatar: String,
    client_myteamspeak_id: String,
    client_needed_serverquery_view_power: Double,
    client_nickname: String,
    client_nickname_phonetic: String,
    client_output_hardware: Double,
    client_output_muted: Double,
    client_outputonly_muted: Double,
    client_platform: String,
    client_security_hash: String,
    client_servergroups: js.Array[Double],
    client_signed_badges: String,
    client_talk_power: Double,
    client_talk_request: Double,
    client_talk_request_msg: String,
    client_total_bytes_downloaded: Double,
    client_total_bytes_uploaded: Double,
    client_totalconnections: Double,
    client_type: Double,
    client_unique_identifier: String,
    client_version: String,
    client_version_sign: String,
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_total: Double,
    connection_client_ip: String,
    connection_connected_time: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_total: Double
  ): ClientInfo = {
    val __obj = js.Dynamic.literal(cid = cid, client_away = client_away, client_away_message = client_away_message, client_badges = client_badges, client_base64HashClientUID = client_base64HashClientUID, client_channel_group_id = client_channel_group_id, client_channel_group_inherited_channel_id = client_channel_group_inherited_channel_id, client_country = client_country, client_created = client_created, client_database_id = client_database_id, client_default_channel = client_default_channel, client_default_token = client_default_token, client_description = client_description, client_flag_avatar = client_flag_avatar, client_icon_id = client_icon_id, client_idle_time = client_idle_time, client_input_hardware = client_input_hardware, client_input_muted = client_input_muted, client_integrations = client_integrations, client_is_channel_commander = client_is_channel_commander, client_is_priority_speaker = client_is_priority_speaker, client_is_recording = client_is_recording, client_is_talker = client_is_talker, client_lastconnected = client_lastconnected, client_login_name = client_login_name, client_meta_data = client_meta_data, client_month_bytes_downloaded = client_month_bytes_downloaded, client_month_bytes_uploaded = client_month_bytes_uploaded, client_myteamspeak_avatar = client_myteamspeak_avatar, client_myteamspeak_id = client_myteamspeak_id, client_needed_serverquery_view_power = client_needed_serverquery_view_power, client_nickname = client_nickname, client_nickname_phonetic = client_nickname_phonetic, client_output_hardware = client_output_hardware, client_output_muted = client_output_muted, client_outputonly_muted = client_outputonly_muted, client_platform = client_platform, client_security_hash = client_security_hash, client_servergroups = client_servergroups, client_signed_badges = client_signed_badges, client_talk_power = client_talk_power, client_talk_request = client_talk_request, client_talk_request_msg = client_talk_request_msg, client_total_bytes_downloaded = client_total_bytes_downloaded, client_total_bytes_uploaded = client_total_bytes_uploaded, client_totalconnections = client_totalconnections, client_type = client_type, client_unique_identifier = client_unique_identifier, client_version = client_version, client_version_sign = client_version_sign, connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total, connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total, connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total, connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total, connection_bytes_received_total = connection_bytes_received_total, connection_bytes_sent_total = connection_bytes_sent_total, connection_client_ip = connection_client_ip, connection_connected_time = connection_connected_time, connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received, connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent, connection_packets_received_total = connection_packets_received_total, connection_packets_sent_total = connection_packets_sent_total)
  
    __obj.asInstanceOf[ClientInfo]
  }
}

