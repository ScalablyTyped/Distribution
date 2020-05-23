package typings.ts3NodejsLibrary.anon

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.enumMod.ClientType
import typings.ts3NodejsLibrary.enumMod.Codec
import typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode
import typings.ts3NodejsLibrary.enumMod.HostBannerMode
import typings.ts3NodejsLibrary.enumMod.HostMessageMode
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode
import typings.ts3NodejsLibrary.enumMod.TokenType
import typings.ts3NodejsLibrary.responseTypesMod.TokenCustomSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/QueryResponse.QueryResponseTypes> */
trait PartialQueryResponseTypes extends js.Object {
  var apikey: js.UndefOr[String] = js.undefined
  var average_speed: js.UndefOr[Double] = js.undefined
  var banid: js.UndefOr[Double] = js.undefined
  var build: js.UndefOr[Double] = js.undefined
  var cfid: js.UndefOr[Double] = js.undefined
  var cgid: js.UndefOr[Double] = js.undefined
  var channel_banner_gfx_url: js.UndefOr[String] = js.undefined
  var channel_banner_mode: js.UndefOr[Double] = js.undefined
  var channel_codec: js.UndefOr[Codec] = js.undefined
  var channel_codec_is_unencrypted: js.UndefOr[Double] = js.undefined
  var channel_codec_latency_factor: js.UndefOr[Double] = js.undefined
  var channel_codec_quality: js.UndefOr[Double] = js.undefined
  var channel_delete_delay: js.UndefOr[Double] = js.undefined
  var channel_description: js.UndefOr[String] = js.undefined
  var channel_filepath: js.UndefOr[String] = js.undefined
  var channel_flag_default: js.UndefOr[Double] = js.undefined
  var channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.undefined
  var channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.undefined
  var channel_flag_maxfamilyclients_unlimited: js.UndefOr[Double] = js.undefined
  var channel_flag_password: js.UndefOr[Double] = js.undefined
  var channel_flag_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_private: js.UndefOr[Double] = js.undefined
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_temporary: js.UndefOr[Double] = js.undefined
  var channel_forced_silence: js.UndefOr[Double] = js.undefined
  var channel_icon_id: js.UndefOr[Double] = js.undefined
  var channel_maxclients: js.UndefOr[Double] = js.undefined
  var channel_maxfamilyclients: js.UndefOr[Double] = js.undefined
  var channel_name: js.UndefOr[String] = js.undefined
  var channel_name_phonetic: js.UndefOr[String] = js.undefined
  var channel_needed_subscribe_power: js.UndefOr[Double] = js.undefined
  var channel_needed_talk_power: js.UndefOr[Double] = js.undefined
  var channel_order: js.UndefOr[Double] = js.undefined
  var channel_password: js.UndefOr[String] = js.undefined
  var channel_security_salt: js.UndefOr[String] = js.undefined
  var channel_topic: js.UndefOr[String] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
  var cldbid: js.UndefOr[Double] = js.undefined
  var clid: js.UndefOr[Double] = js.undefined
  var client_away: js.UndefOr[Double] = js.undefined
  var client_away_message: js.UndefOr[String] = js.undefined
  var client_badges: js.UndefOr[String] = js.undefined
  var client_base64HashClientUID: js.UndefOr[String] = js.undefined
  var client_channel_group_id: js.UndefOr[Double] = js.undefined
  var client_channel_group_inherited_channel_id: js.UndefOr[Double] = js.undefined
  var client_channel_id: js.UndefOr[Double] = js.undefined
  var client_country: js.UndefOr[String] = js.undefined
  var client_created: js.UndefOr[Double] = js.undefined
  var client_database_id: js.UndefOr[Double] = js.undefined
  var client_default_channel: js.UndefOr[Double] = js.undefined
  var client_default_token: js.UndefOr[String] = js.undefined
  var client_description: js.UndefOr[String] = js.undefined
  var client_flag_avatar: js.UndefOr[String] = js.undefined
  var client_flag_talking: js.UndefOr[Double] = js.undefined
  var client_icon_id: js.UndefOr[Double] = js.undefined
  var client_id: js.UndefOr[Double] = js.undefined
  var client_idle_time: js.UndefOr[Double] = js.undefined
  var client_input_hardware: js.UndefOr[Double] = js.undefined
  var client_input_muted: js.UndefOr[Double] = js.undefined
  var client_integrations: js.UndefOr[String] = js.undefined
  var client_is_channel_commander: js.UndefOr[Double] = js.undefined
  var client_is_priority_speaker: js.UndefOr[Double] = js.undefined
  var client_is_recording: js.UndefOr[Double] = js.undefined
  var client_is_talker: js.UndefOr[Double] = js.undefined
  var client_lastconnected: js.UndefOr[Double] = js.undefined
  var client_lastip: js.UndefOr[String] = js.undefined
  var client_login_name: js.UndefOr[String] = js.undefined
  var client_login_password: js.UndefOr[String] = js.undefined
  var client_meta_data: js.UndefOr[String] = js.undefined
  var client_month_bytes_downloaded: js.UndefOr[Double] = js.undefined
  var client_month_bytes_uploaded: js.UndefOr[Double] = js.undefined
  var client_myteamspeak_avatar: js.UndefOr[String] = js.undefined
  var client_myteamspeak_id: js.UndefOr[String] = js.undefined
  var client_needed_serverquery_view_power: js.UndefOr[Double] = js.undefined
  var client_nickname: js.UndefOr[String] = js.undefined
  var client_nickname_phonetic: js.UndefOr[String] = js.undefined
  var client_origin_server_id: js.UndefOr[Double] = js.undefined
  var client_output_hardware: js.UndefOr[Double] = js.undefined
  var client_output_muted: js.UndefOr[Double] = js.undefined
  var client_outputonly_muted: js.UndefOr[Double] = js.undefined
  var client_platform: js.UndefOr[String] = js.undefined
  var client_security_hash: js.UndefOr[String] = js.undefined
  var client_servergroups: js.UndefOr[js.Array[Double]] = js.undefined
  var client_signed_badges: js.UndefOr[String] = js.undefined
  var client_talk_power: js.UndefOr[Double] = js.undefined
  var client_talk_request: js.UndefOr[Double] = js.undefined
  var client_talk_request_msg: js.UndefOr[String] = js.undefined
  var client_total_bytes_downloaded: js.UndefOr[Double] = js.undefined
  var client_total_bytes_uploaded: js.UndefOr[Double] = js.undefined
  var client_totalconnections: js.UndefOr[Double] = js.undefined
  var client_type: js.UndefOr[ClientType] = js.undefined
  var client_unique_identifier: js.UndefOr[String] = js.undefined
  var client_version: js.UndefOr[String] = js.undefined
  var client_version_sign: js.UndefOr[String] = js.undefined
  var clientftfid: js.UndefOr[Double] = js.undefined
  var cluid: js.UndefOr[String] = js.undefined
  var connection_bandwidth_received_last_minute_total: js.UndefOr[Double] = js.undefined
  var connection_bandwidth_received_last_second_total: js.UndefOr[Double] = js.undefined
  var connection_bandwidth_sent_last_minute_total: js.UndefOr[Double] = js.undefined
  var connection_bandwidth_sent_last_second_total: js.UndefOr[Double] = js.undefined
  var connection_bytes_received_control: js.UndefOr[Double] = js.undefined
  var connection_bytes_received_keepalive: js.UndefOr[Double] = js.undefined
  var connection_bytes_received_speech: js.UndefOr[Double] = js.undefined
  var connection_bytes_received_total: js.UndefOr[Double] = js.undefined
  var connection_bytes_sent_control: js.UndefOr[Double] = js.undefined
  var connection_bytes_sent_keepalive: js.UndefOr[Double] = js.undefined
  var connection_bytes_sent_speech: js.UndefOr[Double] = js.undefined
  var connection_bytes_sent_total: js.UndefOr[Double] = js.undefined
  var connection_client_ip: js.UndefOr[String] = js.undefined
  var connection_connected_time: js.UndefOr[Double] = js.undefined
  var connection_filetransfer_bandwidth_received: js.UndefOr[Double] = js.undefined
  var connection_filetransfer_bandwidth_sent: js.UndefOr[Double] = js.undefined
  var connection_filetransfer_bytes_received_total: js.UndefOr[Double] = js.undefined
  var connection_filetransfer_bytes_sent_total: js.UndefOr[Double] = js.undefined
  var connection_packetloss_total: js.UndefOr[Double] = js.undefined
  var connection_packets_received_control: js.UndefOr[Double] = js.undefined
  var connection_packets_received_keepalive: js.UndefOr[Double] = js.undefined
  var connection_packets_received_speech: js.UndefOr[Double] = js.undefined
  var connection_packets_received_total: js.UndefOr[Double] = js.undefined
  var connection_packets_sent_control: js.UndefOr[Double] = js.undefined
  var connection_packets_sent_keepalive: js.UndefOr[Double] = js.undefined
  var connection_packets_sent_speech: js.UndefOr[Double] = js.undefined
  var connection_packets_sent_total: js.UndefOr[Double] = js.undefined
  var connection_ping: js.UndefOr[Double] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var cpid: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var created_at: js.UndefOr[Double] = js.undefined
  var ctid: js.UndefOr[Double] = js.undefined
  var current_speed: js.UndefOr[Double] = js.undefined
  var datetime: js.UndefOr[Double] = js.undefined
  var desc: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var enforcements: js.UndefOr[Double] = js.undefined
  var expires_at: js.UndefOr[Double] = js.undefined
  var extra_msg: js.UndefOr[String] = js.undefined
  var failed_permid: js.UndefOr[Double] = js.undefined
  var fcldbid: js.UndefOr[Double] = js.undefined
  var file_size: js.UndefOr[Double] = js.undefined
  var flag_read: js.UndefOr[Double] = js.undefined
  var fname: js.UndefOr[String] = js.undefined
  var ftkey: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var host_timestamp_utc: js.UndefOr[Double] = js.undefined
  var iconid: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var id1: js.UndefOr[Double] = js.undefined
  var id2: js.UndefOr[Double] = js.undefined
  var ident: js.UndefOr[String] = js.undefined
  var instance_uptime: js.UndefOr[Double] = js.undefined
  var invokercldbid: js.UndefOr[Double] = js.undefined
  var invokerid: js.UndefOr[Double] = js.undefined
  var invokername: js.UndefOr[String] = js.undefined
  var invokeruid: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var l: js.UndefOr[String] = js.undefined
  var last_pos: js.UndefOr[Double] = js.undefined
  var lastnickname: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var msg: js.UndefOr[String] = js.undefined
  var msgid: js.UndefOr[Double] = js.undefined
  var mytsid: js.UndefOr[String] = js.undefined
  var n: js.UndefOr[Double] = js.undefined
  var n_member_addp: js.UndefOr[Double] = js.undefined
  var n_member_removep: js.UndefOr[Double] = js.undefined
  var n_modifyp: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namemode: js.UndefOr[Double] = js.undefined
  var nickname: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var permdesc: js.UndefOr[String] = js.undefined
  var permid: js.UndefOr[Double] = js.undefined
  var permname: js.UndefOr[String] = js.undefined
  var permnegated: js.UndefOr[Double] = js.undefined
  var permsid: js.UndefOr[String] = js.undefined
  var permskip: js.UndefOr[Double] = js.undefined
  var permvalue: js.UndefOr[Double] = js.undefined
  var pid: js.UndefOr[Double] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var proto: js.UndefOr[Double] = js.undefined
  var pw_clear: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var reasonid: js.UndefOr[Double] = js.undefined
  var reasonmsg: js.UndefOr[String] = js.undefined
  var runtime: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[Double] = js.undefined
  var salt: js.UndefOr[String] = js.undefined
  var savedb: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[ApiKeyScope] = js.undefined
  var seconds_empty: js.UndefOr[Double] = js.undefined
  var sender: js.UndefOr[Double] = js.undefined
  var server_id: js.UndefOr[Double] = js.undefined
  var serverftfid: js.UndefOr[Double] = js.undefined
  var serverinstance_database_version: js.UndefOr[Double] = js.undefined
  var serverinstance_filetransfer_port: js.UndefOr[Double] = js.undefined
  var serverinstance_guest_serverquery_group: js.UndefOr[Double] = js.undefined
  var serverinstance_max_download_total_bandwidth: js.UndefOr[Double] = js.undefined
  var serverinstance_max_upload_total_bandwidth: js.UndefOr[Double] = js.undefined
  var serverinstance_pending_connections_per_ip: js.UndefOr[Double] = js.undefined
  var serverinstance_permissions_version: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_flood_ban_time: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_flood_commands: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_flood_time: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_max_connections_per_ip: js.UndefOr[Double] = js.undefined
  var serverinstance_template_channeladmin_group: js.UndefOr[Double] = js.undefined
  var serverinstance_template_channeldefault_group: js.UndefOr[Double] = js.undefined
  var serverinstance_template_serveradmin_group: js.UndefOr[Double] = js.undefined
  var serverinstance_template_serverdefault_group: js.UndefOr[Double] = js.undefined
  var sgid: js.UndefOr[Double] = js.undefined
  var sid: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizedone: js.UndefOr[Double] = js.undefined
  var snapshot: js.UndefOr[String] = js.undefined
  var sortid: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var t: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[Double] = js.undefined
  var targetmode: js.UndefOr[TextMessageTargetMode] = js.undefined
  var tcid: js.UndefOr[Double] = js.undefined
  var tcldbid: js.UndefOr[Double] = js.undefined
  var time_left: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var tname: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var token1: js.UndefOr[String] = js.undefined
  var token2: js.UndefOr[String] = js.undefined
  var token_created: js.UndefOr[Double] = js.undefined
  var token_customset: js.UndefOr[js.Array[TokenCustomSet]] = js.undefined
  var token_description: js.UndefOr[String] = js.undefined
  var token_id1: js.UndefOr[Double] = js.undefined
  var token_id2: js.UndefOr[Double] = js.undefined
  var token_type: js.UndefOr[TokenType] = js.undefined
  var tokencustomset: js.UndefOr[js.Array[TokenCustomSet]] = js.undefined
  var total_clients: js.UndefOr[Double] = js.undefined
  var total_clients_family: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var v: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var virtualserver_antiflood_points_needed_command_block: js.UndefOr[Double] = js.undefined
  var virtualserver_antiflood_points_needed_ip_block: js.UndefOr[Double] = js.undefined
  var virtualserver_antiflood_points_needed_plugin_block: js.UndefOr[Double] = js.undefined
  var virtualserver_antiflood_points_tick_reduce: js.UndefOr[Double] = js.undefined
  var virtualserver_ask_for_privilegekey: js.UndefOr[Double] = js.undefined
  var virtualserver_autostart: js.UndefOr[Double] = js.undefined
  var virtualserver_channel_temp_delete_delay_default: js.UndefOr[Double] = js.undefined
  var virtualserver_channelsonline: js.UndefOr[Double] = js.undefined
  var virtualserver_client_connections: js.UndefOr[Double] = js.undefined
  var virtualserver_clientsonline: js.UndefOr[Double] = js.undefined
  var virtualserver_codec_encryption_mode: js.UndefOr[CodecEncryptionMode] = js.undefined
  var virtualserver_complain_autoban_count: js.UndefOr[Double] = js.undefined
  var virtualserver_complain_autoban_time: js.UndefOr[Double] = js.undefined
  var virtualserver_complain_remove_time: js.UndefOr[Double] = js.undefined
  var virtualserver_created: js.UndefOr[Double] = js.undefined
  var virtualserver_default_channel_admin_group: js.UndefOr[Double] = js.undefined
  var virtualserver_default_channel_group: js.UndefOr[Double] = js.undefined
  var virtualserver_default_server_group: js.UndefOr[Double] = js.undefined
  var virtualserver_download_quota: js.UndefOr[Double] = js.undefined
  var virtualserver_filebase: js.UndefOr[String] = js.undefined
  var virtualserver_flag_password: js.UndefOr[Double] = js.undefined
  var virtualserver_hostbanner_gfx_interval: js.UndefOr[Double] = js.undefined
  var virtualserver_hostbanner_gfx_url: js.UndefOr[String] = js.undefined
  var virtualserver_hostbanner_mode: js.UndefOr[HostBannerMode] = js.undefined
  var virtualserver_hostbanner_url: js.UndefOr[String] = js.undefined
  var virtualserver_hostbutton_gfx_url: js.UndefOr[String] = js.undefined
  var virtualserver_hostbutton_tooltip: js.UndefOr[String] = js.undefined
  var virtualserver_hostbutton_url: js.UndefOr[String] = js.undefined
  var virtualserver_hostmessage: js.UndefOr[String] = js.undefined
  var virtualserver_hostmessage_mode: js.UndefOr[HostMessageMode] = js.undefined
  var virtualserver_icon_id: js.UndefOr[Double] = js.undefined
  var virtualserver_id: js.UndefOr[Double] = js.undefined
  var virtualserver_ip: js.UndefOr[js.Array[String]] = js.undefined
  var virtualserver_log_channel: js.UndefOr[Double] = js.undefined
  var virtualserver_log_client: js.UndefOr[Double] = js.undefined
  var virtualserver_log_filetransfer: js.UndefOr[Double] = js.undefined
  var virtualserver_log_permissions: js.UndefOr[Double] = js.undefined
  var virtualserver_log_query: js.UndefOr[Double] = js.undefined
  var virtualserver_log_server: js.UndefOr[Double] = js.undefined
  var virtualserver_machine_id: js.UndefOr[String] = js.undefined
  var virtualserver_max_download_total_bandwidth: js.UndefOr[Double] = js.undefined
  var virtualserver_max_upload_total_bandwidth: js.UndefOr[Double] = js.undefined
  var virtualserver_maxclients: js.UndefOr[Double] = js.undefined
  var virtualserver_min_android_version: js.UndefOr[Double] = js.undefined
  var virtualserver_min_client_version: js.UndefOr[Double] = js.undefined
  var virtualserver_min_clients_in_channel_before_forced_silence: js.UndefOr[Double] = js.undefined
  var virtualserver_min_ios_version: js.UndefOr[Double] = js.undefined
  var virtualserver_month_bytes_downloaded: js.UndefOr[Double] = js.undefined
  var virtualserver_month_bytes_uploaded: js.UndefOr[Double] = js.undefined
  var virtualserver_name: js.UndefOr[String] = js.undefined
  var virtualserver_name_phonetic: js.UndefOr[String] = js.undefined
  var virtualserver_needed_identity_security_level: js.UndefOr[Double] = js.undefined
  var virtualserver_nickname: js.UndefOr[String] = js.undefined
  var virtualserver_password: js.UndefOr[String] = js.undefined
  var virtualserver_platform: js.UndefOr[String] = js.undefined
  var virtualserver_port: js.UndefOr[Double] = js.undefined
  var virtualserver_priority_speaker_dimm_modificator: js.UndefOr[Double] = js.undefined
  var virtualserver_query_client_connections: js.UndefOr[Double] = js.undefined
  var virtualserver_queryclientsonline: js.UndefOr[Double] = js.undefined
  var virtualserver_reserved_slots: js.UndefOr[Double] = js.undefined
  var virtualserver_status: js.UndefOr[String] = js.undefined
  var virtualserver_total_bytes_downloaded: js.UndefOr[Double] = js.undefined
  var virtualserver_total_bytes_uploaded: js.UndefOr[Double] = js.undefined
  var virtualserver_total_packetloss_control: js.UndefOr[Double] = js.undefined
  var virtualserver_total_packetloss_keepalive: js.UndefOr[Double] = js.undefined
  var virtualserver_total_packetloss_speech: js.UndefOr[Double] = js.undefined
  var virtualserver_total_packetloss_total: js.UndefOr[Double] = js.undefined
  var virtualserver_total_ping: js.UndefOr[Double] = js.undefined
  var virtualserver_unique_identifier: js.UndefOr[String] = js.undefined
  var virtualserver_upload_quota: js.UndefOr[Double] = js.undefined
  var virtualserver_uptime: js.UndefOr[Double] = js.undefined
  var virtualserver_version: js.UndefOr[String] = js.undefined
  var virtualserver_weblist_enabled: js.UndefOr[Double] = js.undefined
  var virtualserver_welcomemessage: js.UndefOr[String] = js.undefined
  var virtualservers_running_total: js.UndefOr[Double] = js.undefined
  var virtualservers_total_channels_online: js.UndefOr[Double] = js.undefined
  var virtualservers_total_clients_online: js.UndefOr[Double] = js.undefined
  var virtualservers_total_maxclients: js.UndefOr[Double] = js.undefined
}

object PartialQueryResponseTypes {
  @scala.inline
  def apply(
    apikey: String = null,
    average_speed: js.UndefOr[Double] = js.undefined,
    banid: js.UndefOr[Double] = js.undefined,
    build: js.UndefOr[Double] = js.undefined,
    cfid: js.UndefOr[Double] = js.undefined,
    cgid: js.UndefOr[Double] = js.undefined,
    channel_banner_gfx_url: String = null,
    channel_banner_mode: js.UndefOr[Double] = js.undefined,
    channel_codec: Codec = null,
    channel_codec_is_unencrypted: js.UndefOr[Double] = js.undefined,
    channel_codec_latency_factor: js.UndefOr[Double] = js.undefined,
    channel_codec_quality: js.UndefOr[Double] = js.undefined,
    channel_delete_delay: js.UndefOr[Double] = js.undefined,
    channel_description: String = null,
    channel_filepath: String = null,
    channel_flag_default: js.UndefOr[Double] = js.undefined,
    channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.undefined,
    channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.undefined,
    channel_flag_maxfamilyclients_unlimited: js.UndefOr[Double] = js.undefined,
    channel_flag_password: js.UndefOr[Double] = js.undefined,
    channel_flag_permanent: js.UndefOr[Double] = js.undefined,
    channel_flag_private: js.UndefOr[Double] = js.undefined,
    channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined,
    channel_flag_temporary: js.UndefOr[Double] = js.undefined,
    channel_forced_silence: js.UndefOr[Double] = js.undefined,
    channel_icon_id: js.UndefOr[Double] = js.undefined,
    channel_maxclients: js.UndefOr[Double] = js.undefined,
    channel_maxfamilyclients: js.UndefOr[Double] = js.undefined,
    channel_name: String = null,
    channel_name_phonetic: String = null,
    channel_needed_subscribe_power: js.UndefOr[Double] = js.undefined,
    channel_needed_talk_power: js.UndefOr[Double] = js.undefined,
    channel_order: js.UndefOr[Double] = js.undefined,
    channel_password: String = null,
    channel_security_salt: String = null,
    channel_topic: String = null,
    cid: js.UndefOr[Double] = js.undefined,
    cldbid: js.UndefOr[Double] = js.undefined,
    clid: js.UndefOr[Double] = js.undefined,
    client_away: js.UndefOr[Double] = js.undefined,
    client_away_message: String = null,
    client_badges: String = null,
    client_base64HashClientUID: String = null,
    client_channel_group_id: js.UndefOr[Double] = js.undefined,
    client_channel_group_inherited_channel_id: js.UndefOr[Double] = js.undefined,
    client_channel_id: js.UndefOr[Double] = js.undefined,
    client_country: String = null,
    client_created: js.UndefOr[Double] = js.undefined,
    client_database_id: js.UndefOr[Double] = js.undefined,
    client_default_channel: js.UndefOr[Double] = js.undefined,
    client_default_token: String = null,
    client_description: String = null,
    client_flag_avatar: String = null,
    client_flag_talking: js.UndefOr[Double] = js.undefined,
    client_icon_id: js.UndefOr[Double] = js.undefined,
    client_id: js.UndefOr[Double] = js.undefined,
    client_idle_time: js.UndefOr[Double] = js.undefined,
    client_input_hardware: js.UndefOr[Double] = js.undefined,
    client_input_muted: js.UndefOr[Double] = js.undefined,
    client_integrations: String = null,
    client_is_channel_commander: js.UndefOr[Double] = js.undefined,
    client_is_priority_speaker: js.UndefOr[Double] = js.undefined,
    client_is_recording: js.UndefOr[Double] = js.undefined,
    client_is_talker: js.UndefOr[Double] = js.undefined,
    client_lastconnected: js.UndefOr[Double] = js.undefined,
    client_lastip: String = null,
    client_login_name: String = null,
    client_login_password: String = null,
    client_meta_data: String = null,
    client_month_bytes_downloaded: js.UndefOr[Double] = js.undefined,
    client_month_bytes_uploaded: js.UndefOr[Double] = js.undefined,
    client_myteamspeak_avatar: String = null,
    client_myteamspeak_id: String = null,
    client_needed_serverquery_view_power: js.UndefOr[Double] = js.undefined,
    client_nickname: String = null,
    client_nickname_phonetic: String = null,
    client_origin_server_id: js.UndefOr[Double] = js.undefined,
    client_output_hardware: js.UndefOr[Double] = js.undefined,
    client_output_muted: js.UndefOr[Double] = js.undefined,
    client_outputonly_muted: js.UndefOr[Double] = js.undefined,
    client_platform: String = null,
    client_security_hash: String = null,
    client_servergroups: js.Array[Double] = null,
    client_signed_badges: String = null,
    client_talk_power: js.UndefOr[Double] = js.undefined,
    client_talk_request: js.UndefOr[Double] = js.undefined,
    client_talk_request_msg: String = null,
    client_total_bytes_downloaded: js.UndefOr[Double] = js.undefined,
    client_total_bytes_uploaded: js.UndefOr[Double] = js.undefined,
    client_totalconnections: js.UndefOr[Double] = js.undefined,
    client_type: ClientType = null,
    client_unique_identifier: String = null,
    client_version: String = null,
    client_version_sign: String = null,
    clientftfid: js.UndefOr[Double] = js.undefined,
    cluid: String = null,
    connection_bandwidth_received_last_minute_total: js.UndefOr[Double] = js.undefined,
    connection_bandwidth_received_last_second_total: js.UndefOr[Double] = js.undefined,
    connection_bandwidth_sent_last_minute_total: js.UndefOr[Double] = js.undefined,
    connection_bandwidth_sent_last_second_total: js.UndefOr[Double] = js.undefined,
    connection_bytes_received_control: js.UndefOr[Double] = js.undefined,
    connection_bytes_received_keepalive: js.UndefOr[Double] = js.undefined,
    connection_bytes_received_speech: js.UndefOr[Double] = js.undefined,
    connection_bytes_received_total: js.UndefOr[Double] = js.undefined,
    connection_bytes_sent_control: js.UndefOr[Double] = js.undefined,
    connection_bytes_sent_keepalive: js.UndefOr[Double] = js.undefined,
    connection_bytes_sent_speech: js.UndefOr[Double] = js.undefined,
    connection_bytes_sent_total: js.UndefOr[Double] = js.undefined,
    connection_client_ip: String = null,
    connection_connected_time: js.UndefOr[Double] = js.undefined,
    connection_filetransfer_bandwidth_received: js.UndefOr[Double] = js.undefined,
    connection_filetransfer_bandwidth_sent: js.UndefOr[Double] = js.undefined,
    connection_filetransfer_bytes_received_total: js.UndefOr[Double] = js.undefined,
    connection_filetransfer_bytes_sent_total: js.UndefOr[Double] = js.undefined,
    connection_packetloss_total: js.UndefOr[Double] = js.undefined,
    connection_packets_received_control: js.UndefOr[Double] = js.undefined,
    connection_packets_received_keepalive: js.UndefOr[Double] = js.undefined,
    connection_packets_received_speech: js.UndefOr[Double] = js.undefined,
    connection_packets_received_total: js.UndefOr[Double] = js.undefined,
    connection_packets_sent_control: js.UndefOr[Double] = js.undefined,
    connection_packets_sent_keepalive: js.UndefOr[Double] = js.undefined,
    connection_packets_sent_speech: js.UndefOr[Double] = js.undefined,
    connection_packets_sent_total: js.UndefOr[Double] = js.undefined,
    connection_ping: js.UndefOr[Double] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    cpid: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Double] = js.undefined,
    created_at: js.UndefOr[Double] = js.undefined,
    ctid: js.UndefOr[Double] = js.undefined,
    current_speed: js.UndefOr[Double] = js.undefined,
    datetime: js.UndefOr[Double] = js.undefined,
    desc: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    enforcements: js.UndefOr[Double] = js.undefined,
    expires_at: js.UndefOr[Double] = js.undefined,
    extra_msg: String = null,
    failed_permid: js.UndefOr[Double] = js.undefined,
    fcldbid: js.UndefOr[Double] = js.undefined,
    file_size: js.UndefOr[Double] = js.undefined,
    flag_read: js.UndefOr[Double] = js.undefined,
    fname: String = null,
    ftkey: String = null,
    hash: String = null,
    host_timestamp_utc: js.UndefOr[Double] = js.undefined,
    iconid: js.UndefOr[Double] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    id1: js.UndefOr[Double] = js.undefined,
    id2: js.UndefOr[Double] = js.undefined,
    ident: String = null,
    instance_uptime: js.UndefOr[Double] = js.undefined,
    invokercldbid: js.UndefOr[Double] = js.undefined,
    invokerid: js.UndefOr[Double] = js.undefined,
    invokername: String = null,
    invokeruid: String = null,
    ip: String = null,
    l: String = null,
    last_pos: js.UndefOr[Double] = js.undefined,
    lastnickname: String = null,
    message: String = null,
    msg: String = null,
    msgid: js.UndefOr[Double] = js.undefined,
    mytsid: String = null,
    n: js.UndefOr[Double] = js.undefined,
    n_member_addp: js.UndefOr[Double] = js.undefined,
    n_member_removep: js.UndefOr[Double] = js.undefined,
    n_modifyp: js.UndefOr[Double] = js.undefined,
    name: String = null,
    namemode: js.UndefOr[Double] = js.undefined,
    nickname: String = null,
    order: js.UndefOr[Double] = js.undefined,
    p: js.UndefOr[Double] = js.undefined,
    path: String = null,
    permdesc: String = null,
    permid: js.UndefOr[Double] = js.undefined,
    permname: String = null,
    permnegated: js.UndefOr[Double] = js.undefined,
    permsid: String = null,
    permskip: js.UndefOr[Double] = js.undefined,
    permvalue: js.UndefOr[Double] = js.undefined,
    pid: js.UndefOr[Double] = js.undefined,
    platform: String = null,
    port: js.UndefOr[Double] = js.undefined,
    proto: js.UndefOr[Double] = js.undefined,
    pw_clear: String = null,
    reason: String = null,
    reasonid: js.UndefOr[Double] = js.undefined,
    reasonmsg: String = null,
    runtime: js.UndefOr[Double] = js.undefined,
    s: js.UndefOr[Double] = js.undefined,
    salt: String = null,
    savedb: js.UndefOr[Double] = js.undefined,
    scope: ApiKeyScope = null,
    seconds_empty: js.UndefOr[Double] = js.undefined,
    sender: js.UndefOr[Double] = js.undefined,
    server_id: js.UndefOr[Double] = js.undefined,
    serverftfid: js.UndefOr[Double] = js.undefined,
    serverinstance_database_version: js.UndefOr[Double] = js.undefined,
    serverinstance_filetransfer_port: js.UndefOr[Double] = js.undefined,
    serverinstance_guest_serverquery_group: js.UndefOr[Double] = js.undefined,
    serverinstance_max_download_total_bandwidth: js.UndefOr[Double] = js.undefined,
    serverinstance_max_upload_total_bandwidth: js.UndefOr[Double] = js.undefined,
    serverinstance_pending_connections_per_ip: js.UndefOr[Double] = js.undefined,
    serverinstance_permissions_version: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_flood_ban_time: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_flood_commands: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_flood_time: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_max_connections_per_ip: js.UndefOr[Double] = js.undefined,
    serverinstance_template_channeladmin_group: js.UndefOr[Double] = js.undefined,
    serverinstance_template_channeldefault_group: js.UndefOr[Double] = js.undefined,
    serverinstance_template_serveradmin_group: js.UndefOr[Double] = js.undefined,
    serverinstance_template_serverdefault_group: js.UndefOr[Double] = js.undefined,
    sgid: js.UndefOr[Double] = js.undefined,
    sid: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    sizedone: js.UndefOr[Double] = js.undefined,
    snapshot: String = null,
    sortid: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    status: js.UndefOr[Double] = js.undefined,
    subject: String = null,
    t: js.UndefOr[Double] = js.undefined,
    target: js.UndefOr[Double] = js.undefined,
    targetmode: TextMessageTargetMode = null,
    tcid: js.UndefOr[Double] = js.undefined,
    tcldbid: js.UndefOr[Double] = js.undefined,
    time_left: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Double] = js.undefined,
    tname: String = null,
    token: String = null,
    token1: String = null,
    token2: String = null,
    token_created: js.UndefOr[Double] = js.undefined,
    token_customset: js.Array[TokenCustomSet] = null,
    token_description: String = null,
    token_id1: js.UndefOr[Double] = js.undefined,
    token_id2: js.UndefOr[Double] = js.undefined,
    token_type: TokenType = null,
    tokencustomset: js.Array[TokenCustomSet] = null,
    total_clients: js.UndefOr[Double] = js.undefined,
    total_clients_family: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined,
    uid: String = null,
    v: js.UndefOr[Double] = js.undefined,
    value: String = null,
    version: String = null,
    virtualserver_antiflood_points_needed_command_block: js.UndefOr[Double] = js.undefined,
    virtualserver_antiflood_points_needed_ip_block: js.UndefOr[Double] = js.undefined,
    virtualserver_antiflood_points_needed_plugin_block: js.UndefOr[Double] = js.undefined,
    virtualserver_antiflood_points_tick_reduce: js.UndefOr[Double] = js.undefined,
    virtualserver_ask_for_privilegekey: js.UndefOr[Double] = js.undefined,
    virtualserver_autostart: js.UndefOr[Double] = js.undefined,
    virtualserver_channel_temp_delete_delay_default: js.UndefOr[Double] = js.undefined,
    virtualserver_channelsonline: js.UndefOr[Double] = js.undefined
  ): PartialQueryResponseTypes = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey.asInstanceOf[js.Any])
    if (!js.isUndefined(average_speed)) __obj.updateDynamic("average_speed")(average_speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(banid)) __obj.updateDynamic("banid")(banid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(build)) __obj.updateDynamic("build")(build.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cfid)) __obj.updateDynamic("cfid")(cfid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cgid)) __obj.updateDynamic("cgid")(cgid.get.asInstanceOf[js.Any])
    if (channel_banner_gfx_url != null) __obj.updateDynamic("channel_banner_gfx_url")(channel_banner_gfx_url.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_banner_mode)) __obj.updateDynamic("channel_banner_mode")(channel_banner_mode.get.asInstanceOf[js.Any])
    if (channel_codec != null) __obj.updateDynamic("channel_codec")(channel_codec.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec_is_unencrypted)) __obj.updateDynamic("channel_codec_is_unencrypted")(channel_codec_is_unencrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec_latency_factor)) __obj.updateDynamic("channel_codec_latency_factor")(channel_codec_latency_factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec_quality)) __obj.updateDynamic("channel_codec_quality")(channel_codec_quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_delete_delay)) __obj.updateDynamic("channel_delete_delay")(channel_delete_delay.get.asInstanceOf[js.Any])
    if (channel_description != null) __obj.updateDynamic("channel_description")(channel_description.asInstanceOf[js.Any])
    if (channel_filepath != null) __obj.updateDynamic("channel_filepath")(channel_filepath.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_default)) __obj.updateDynamic("channel_flag_default")(channel_flag_default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_maxclients_unlimited)) __obj.updateDynamic("channel_flag_maxclients_unlimited")(channel_flag_maxclients_unlimited.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_maxfamilyclients_inherited)) __obj.updateDynamic("channel_flag_maxfamilyclients_inherited")(channel_flag_maxfamilyclients_inherited.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_maxfamilyclients_unlimited)) __obj.updateDynamic("channel_flag_maxfamilyclients_unlimited")(channel_flag_maxfamilyclients_unlimited.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_password)) __obj.updateDynamic("channel_flag_password")(channel_flag_password.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_permanent)) __obj.updateDynamic("channel_flag_permanent")(channel_flag_permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_private)) __obj.updateDynamic("channel_flag_private")(channel_flag_private.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_semi_permanent)) __obj.updateDynamic("channel_flag_semi_permanent")(channel_flag_semi_permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_temporary)) __obj.updateDynamic("channel_flag_temporary")(channel_flag_temporary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_forced_silence)) __obj.updateDynamic("channel_forced_silence")(channel_forced_silence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_icon_id)) __obj.updateDynamic("channel_icon_id")(channel_icon_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_maxclients)) __obj.updateDynamic("channel_maxclients")(channel_maxclients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_maxfamilyclients)) __obj.updateDynamic("channel_maxfamilyclients")(channel_maxfamilyclients.get.asInstanceOf[js.Any])
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name.asInstanceOf[js.Any])
    if (channel_name_phonetic != null) __obj.updateDynamic("channel_name_phonetic")(channel_name_phonetic.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_needed_subscribe_power)) __obj.updateDynamic("channel_needed_subscribe_power")(channel_needed_subscribe_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_needed_talk_power)) __obj.updateDynamic("channel_needed_talk_power")(channel_needed_talk_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_order)) __obj.updateDynamic("channel_order")(channel_order.get.asInstanceOf[js.Any])
    if (channel_password != null) __obj.updateDynamic("channel_password")(channel_password.asInstanceOf[js.Any])
    if (channel_security_salt != null) __obj.updateDynamic("channel_security_salt")(channel_security_salt.asInstanceOf[js.Any])
    if (channel_topic != null) __obj.updateDynamic("channel_topic")(channel_topic.asInstanceOf[js.Any])
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cldbid)) __obj.updateDynamic("cldbid")(cldbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clid)) __obj.updateDynamic("clid")(clid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_away)) __obj.updateDynamic("client_away")(client_away.get.asInstanceOf[js.Any])
    if (client_away_message != null) __obj.updateDynamic("client_away_message")(client_away_message.asInstanceOf[js.Any])
    if (client_badges != null) __obj.updateDynamic("client_badges")(client_badges.asInstanceOf[js.Any])
    if (client_base64HashClientUID != null) __obj.updateDynamic("client_base64HashClientUID")(client_base64HashClientUID.asInstanceOf[js.Any])
    if (!js.isUndefined(client_channel_group_id)) __obj.updateDynamic("client_channel_group_id")(client_channel_group_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_channel_group_inherited_channel_id)) __obj.updateDynamic("client_channel_group_inherited_channel_id")(client_channel_group_inherited_channel_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_channel_id)) __obj.updateDynamic("client_channel_id")(client_channel_id.get.asInstanceOf[js.Any])
    if (client_country != null) __obj.updateDynamic("client_country")(client_country.asInstanceOf[js.Any])
    if (!js.isUndefined(client_created)) __obj.updateDynamic("client_created")(client_created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_database_id)) __obj.updateDynamic("client_database_id")(client_database_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_default_channel)) __obj.updateDynamic("client_default_channel")(client_default_channel.get.asInstanceOf[js.Any])
    if (client_default_token != null) __obj.updateDynamic("client_default_token")(client_default_token.asInstanceOf[js.Any])
    if (client_description != null) __obj.updateDynamic("client_description")(client_description.asInstanceOf[js.Any])
    if (client_flag_avatar != null) __obj.updateDynamic("client_flag_avatar")(client_flag_avatar.asInstanceOf[js.Any])
    if (!js.isUndefined(client_flag_talking)) __obj.updateDynamic("client_flag_talking")(client_flag_talking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_icon_id)) __obj.updateDynamic("client_icon_id")(client_icon_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_id)) __obj.updateDynamic("client_id")(client_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_idle_time)) __obj.updateDynamic("client_idle_time")(client_idle_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_input_hardware)) __obj.updateDynamic("client_input_hardware")(client_input_hardware.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_input_muted)) __obj.updateDynamic("client_input_muted")(client_input_muted.get.asInstanceOf[js.Any])
    if (client_integrations != null) __obj.updateDynamic("client_integrations")(client_integrations.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_channel_commander)) __obj.updateDynamic("client_is_channel_commander")(client_is_channel_commander.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_priority_speaker)) __obj.updateDynamic("client_is_priority_speaker")(client_is_priority_speaker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_recording)) __obj.updateDynamic("client_is_recording")(client_is_recording.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_talker)) __obj.updateDynamic("client_is_talker")(client_is_talker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_lastconnected)) __obj.updateDynamic("client_lastconnected")(client_lastconnected.get.asInstanceOf[js.Any])
    if (client_lastip != null) __obj.updateDynamic("client_lastip")(client_lastip.asInstanceOf[js.Any])
    if (client_login_name != null) __obj.updateDynamic("client_login_name")(client_login_name.asInstanceOf[js.Any])
    if (client_login_password != null) __obj.updateDynamic("client_login_password")(client_login_password.asInstanceOf[js.Any])
    if (client_meta_data != null) __obj.updateDynamic("client_meta_data")(client_meta_data.asInstanceOf[js.Any])
    if (!js.isUndefined(client_month_bytes_downloaded)) __obj.updateDynamic("client_month_bytes_downloaded")(client_month_bytes_downloaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_month_bytes_uploaded)) __obj.updateDynamic("client_month_bytes_uploaded")(client_month_bytes_uploaded.get.asInstanceOf[js.Any])
    if (client_myteamspeak_avatar != null) __obj.updateDynamic("client_myteamspeak_avatar")(client_myteamspeak_avatar.asInstanceOf[js.Any])
    if (client_myteamspeak_id != null) __obj.updateDynamic("client_myteamspeak_id")(client_myteamspeak_id.asInstanceOf[js.Any])
    if (!js.isUndefined(client_needed_serverquery_view_power)) __obj.updateDynamic("client_needed_serverquery_view_power")(client_needed_serverquery_view_power.get.asInstanceOf[js.Any])
    if (client_nickname != null) __obj.updateDynamic("client_nickname")(client_nickname.asInstanceOf[js.Any])
    if (client_nickname_phonetic != null) __obj.updateDynamic("client_nickname_phonetic")(client_nickname_phonetic.asInstanceOf[js.Any])
    if (!js.isUndefined(client_origin_server_id)) __obj.updateDynamic("client_origin_server_id")(client_origin_server_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_output_hardware)) __obj.updateDynamic("client_output_hardware")(client_output_hardware.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_output_muted)) __obj.updateDynamic("client_output_muted")(client_output_muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_outputonly_muted)) __obj.updateDynamic("client_outputonly_muted")(client_outputonly_muted.get.asInstanceOf[js.Any])
    if (client_platform != null) __obj.updateDynamic("client_platform")(client_platform.asInstanceOf[js.Any])
    if (client_security_hash != null) __obj.updateDynamic("client_security_hash")(client_security_hash.asInstanceOf[js.Any])
    if (client_servergroups != null) __obj.updateDynamic("client_servergroups")(client_servergroups.asInstanceOf[js.Any])
    if (client_signed_badges != null) __obj.updateDynamic("client_signed_badges")(client_signed_badges.asInstanceOf[js.Any])
    if (!js.isUndefined(client_talk_power)) __obj.updateDynamic("client_talk_power")(client_talk_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_talk_request)) __obj.updateDynamic("client_talk_request")(client_talk_request.get.asInstanceOf[js.Any])
    if (client_talk_request_msg != null) __obj.updateDynamic("client_talk_request_msg")(client_talk_request_msg.asInstanceOf[js.Any])
    if (!js.isUndefined(client_total_bytes_downloaded)) __obj.updateDynamic("client_total_bytes_downloaded")(client_total_bytes_downloaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_total_bytes_uploaded)) __obj.updateDynamic("client_total_bytes_uploaded")(client_total_bytes_uploaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_totalconnections)) __obj.updateDynamic("client_totalconnections")(client_totalconnections.get.asInstanceOf[js.Any])
    if (client_type != null) __obj.updateDynamic("client_type")(client_type.asInstanceOf[js.Any])
    if (client_unique_identifier != null) __obj.updateDynamic("client_unique_identifier")(client_unique_identifier.asInstanceOf[js.Any])
    if (client_version != null) __obj.updateDynamic("client_version")(client_version.asInstanceOf[js.Any])
    if (client_version_sign != null) __obj.updateDynamic("client_version_sign")(client_version_sign.asInstanceOf[js.Any])
    if (!js.isUndefined(clientftfid)) __obj.updateDynamic("clientftfid")(clientftfid.get.asInstanceOf[js.Any])
    if (cluid != null) __obj.updateDynamic("cluid")(cluid.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bandwidth_received_last_minute_total)) __obj.updateDynamic("connection_bandwidth_received_last_minute_total")(connection_bandwidth_received_last_minute_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bandwidth_received_last_second_total)) __obj.updateDynamic("connection_bandwidth_received_last_second_total")(connection_bandwidth_received_last_second_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bandwidth_sent_last_minute_total)) __obj.updateDynamic("connection_bandwidth_sent_last_minute_total")(connection_bandwidth_sent_last_minute_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bandwidth_sent_last_second_total)) __obj.updateDynamic("connection_bandwidth_sent_last_second_total")(connection_bandwidth_sent_last_second_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_received_control)) __obj.updateDynamic("connection_bytes_received_control")(connection_bytes_received_control.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_received_keepalive)) __obj.updateDynamic("connection_bytes_received_keepalive")(connection_bytes_received_keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_received_speech)) __obj.updateDynamic("connection_bytes_received_speech")(connection_bytes_received_speech.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_received_total)) __obj.updateDynamic("connection_bytes_received_total")(connection_bytes_received_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_sent_control)) __obj.updateDynamic("connection_bytes_sent_control")(connection_bytes_sent_control.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_sent_keepalive)) __obj.updateDynamic("connection_bytes_sent_keepalive")(connection_bytes_sent_keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_sent_speech)) __obj.updateDynamic("connection_bytes_sent_speech")(connection_bytes_sent_speech.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_bytes_sent_total)) __obj.updateDynamic("connection_bytes_sent_total")(connection_bytes_sent_total.get.asInstanceOf[js.Any])
    if (connection_client_ip != null) __obj.updateDynamic("connection_client_ip")(connection_client_ip.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_connected_time)) __obj.updateDynamic("connection_connected_time")(connection_connected_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_filetransfer_bandwidth_received)) __obj.updateDynamic("connection_filetransfer_bandwidth_received")(connection_filetransfer_bandwidth_received.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_filetransfer_bandwidth_sent)) __obj.updateDynamic("connection_filetransfer_bandwidth_sent")(connection_filetransfer_bandwidth_sent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_filetransfer_bytes_received_total)) __obj.updateDynamic("connection_filetransfer_bytes_received_total")(connection_filetransfer_bytes_received_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_filetransfer_bytes_sent_total)) __obj.updateDynamic("connection_filetransfer_bytes_sent_total")(connection_filetransfer_bytes_sent_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packetloss_total)) __obj.updateDynamic("connection_packetloss_total")(connection_packetloss_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_received_control)) __obj.updateDynamic("connection_packets_received_control")(connection_packets_received_control.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_received_keepalive)) __obj.updateDynamic("connection_packets_received_keepalive")(connection_packets_received_keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_received_speech)) __obj.updateDynamic("connection_packets_received_speech")(connection_packets_received_speech.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_received_total)) __obj.updateDynamic("connection_packets_received_total")(connection_packets_received_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_sent_control)) __obj.updateDynamic("connection_packets_sent_control")(connection_packets_sent_control.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_sent_keepalive)) __obj.updateDynamic("connection_packets_sent_keepalive")(connection_packets_sent_keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_sent_speech)) __obj.updateDynamic("connection_packets_sent_speech")(connection_packets_sent_speech.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_packets_sent_total)) __obj.updateDynamic("connection_packets_sent_total")(connection_packets_sent_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_ping)) __obj.updateDynamic("connection_ping")(connection_ping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpid)) __obj.updateDynamic("cpid")(cpid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created_at)) __obj.updateDynamic("created_at")(created_at.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ctid)) __obj.updateDynamic("ctid")(ctid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(current_speed)) __obj.updateDynamic("current_speed")(current_speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(datetime)) __obj.updateDynamic("datetime")(datetime.get.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enforcements)) __obj.updateDynamic("enforcements")(enforcements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires_at)) __obj.updateDynamic("expires_at")(expires_at.get.asInstanceOf[js.Any])
    if (extra_msg != null) __obj.updateDynamic("extra_msg")(extra_msg.asInstanceOf[js.Any])
    if (!js.isUndefined(failed_permid)) __obj.updateDynamic("failed_permid")(failed_permid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fcldbid)) __obj.updateDynamic("fcldbid")(fcldbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(file_size)) __obj.updateDynamic("file_size")(file_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flag_read)) __obj.updateDynamic("flag_read")(flag_read.get.asInstanceOf[js.Any])
    if (fname != null) __obj.updateDynamic("fname")(fname.asInstanceOf[js.Any])
    if (ftkey != null) __obj.updateDynamic("ftkey")(ftkey.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(host_timestamp_utc)) __obj.updateDynamic("host_timestamp_utc")(host_timestamp_utc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconid)) __obj.updateDynamic("iconid")(iconid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id1)) __obj.updateDynamic("id1")(id1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id2)) __obj.updateDynamic("id2")(id2.get.asInstanceOf[js.Any])
    if (ident != null) __obj.updateDynamic("ident")(ident.asInstanceOf[js.Any])
    if (!js.isUndefined(instance_uptime)) __obj.updateDynamic("instance_uptime")(instance_uptime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invokercldbid)) __obj.updateDynamic("invokercldbid")(invokercldbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invokerid)) __obj.updateDynamic("invokerid")(invokerid.get.asInstanceOf[js.Any])
    if (invokername != null) __obj.updateDynamic("invokername")(invokername.asInstanceOf[js.Any])
    if (invokeruid != null) __obj.updateDynamic("invokeruid")(invokeruid.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (!js.isUndefined(last_pos)) __obj.updateDynamic("last_pos")(last_pos.get.asInstanceOf[js.Any])
    if (lastnickname != null) __obj.updateDynamic("lastnickname")(lastnickname.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (!js.isUndefined(msgid)) __obj.updateDynamic("msgid")(msgid.get.asInstanceOf[js.Any])
    if (mytsid != null) __obj.updateDynamic("mytsid")(mytsid.asInstanceOf[js.Any])
    if (!js.isUndefined(n)) __obj.updateDynamic("n")(n.get.asInstanceOf[js.Any])
    if (!js.isUndefined(n_member_addp)) __obj.updateDynamic("n_member_addp")(n_member_addp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(n_member_removep)) __obj.updateDynamic("n_member_removep")(n_member_removep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(n_modifyp)) __obj.updateDynamic("n_modifyp")(n_modifyp.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(namemode)) __obj.updateDynamic("namemode")(namemode.get.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (permdesc != null) __obj.updateDynamic("permdesc")(permdesc.asInstanceOf[js.Any])
    if (!js.isUndefined(permid)) __obj.updateDynamic("permid")(permid.get.asInstanceOf[js.Any])
    if (permname != null) __obj.updateDynamic("permname")(permname.asInstanceOf[js.Any])
    if (!js.isUndefined(permnegated)) __obj.updateDynamic("permnegated")(permnegated.get.asInstanceOf[js.Any])
    if (permsid != null) __obj.updateDynamic("permsid")(permsid.asInstanceOf[js.Any])
    if (!js.isUndefined(permskip)) __obj.updateDynamic("permskip")(permskip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(permvalue)) __obj.updateDynamic("permvalue")(permvalue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pid)) __obj.updateDynamic("pid")(pid.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(proto)) __obj.updateDynamic("proto")(proto.get.asInstanceOf[js.Any])
    if (pw_clear != null) __obj.updateDynamic("pw_clear")(pw_clear.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(reasonid)) __obj.updateDynamic("reasonid")(reasonid.get.asInstanceOf[js.Any])
    if (reasonmsg != null) __obj.updateDynamic("reasonmsg")(reasonmsg.asInstanceOf[js.Any])
    if (!js.isUndefined(runtime)) __obj.updateDynamic("runtime")(runtime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s)) __obj.updateDynamic("s")(s.get.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (!js.isUndefined(savedb)) __obj.updateDynamic("savedb")(savedb.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds_empty)) __obj.updateDynamic("seconds_empty")(seconds_empty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sender)) __obj.updateDynamic("sender")(sender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(server_id)) __obj.updateDynamic("server_id")(server_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverftfid)) __obj.updateDynamic("serverftfid")(serverftfid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_database_version)) __obj.updateDynamic("serverinstance_database_version")(serverinstance_database_version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_filetransfer_port)) __obj.updateDynamic("serverinstance_filetransfer_port")(serverinstance_filetransfer_port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_guest_serverquery_group)) __obj.updateDynamic("serverinstance_guest_serverquery_group")(serverinstance_guest_serverquery_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_max_download_total_bandwidth)) __obj.updateDynamic("serverinstance_max_download_total_bandwidth")(serverinstance_max_download_total_bandwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_max_upload_total_bandwidth)) __obj.updateDynamic("serverinstance_max_upload_total_bandwidth")(serverinstance_max_upload_total_bandwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_pending_connections_per_ip)) __obj.updateDynamic("serverinstance_pending_connections_per_ip")(serverinstance_pending_connections_per_ip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_permissions_version)) __obj.updateDynamic("serverinstance_permissions_version")(serverinstance_permissions_version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_flood_ban_time)) __obj.updateDynamic("serverinstance_serverquery_flood_ban_time")(serverinstance_serverquery_flood_ban_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_flood_commands)) __obj.updateDynamic("serverinstance_serverquery_flood_commands")(serverinstance_serverquery_flood_commands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_flood_time)) __obj.updateDynamic("serverinstance_serverquery_flood_time")(serverinstance_serverquery_flood_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_max_connections_per_ip)) __obj.updateDynamic("serverinstance_serverquery_max_connections_per_ip")(serverinstance_serverquery_max_connections_per_ip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_channeladmin_group)) __obj.updateDynamic("serverinstance_template_channeladmin_group")(serverinstance_template_channeladmin_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_channeldefault_group)) __obj.updateDynamic("serverinstance_template_channeldefault_group")(serverinstance_template_channeldefault_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_serveradmin_group)) __obj.updateDynamic("serverinstance_template_serveradmin_group")(serverinstance_template_serveradmin_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_serverdefault_group)) __obj.updateDynamic("serverinstance_template_serverdefault_group")(serverinstance_template_serverdefault_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sgid)) __obj.updateDynamic("sgid")(sgid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sid)) __obj.updateDynamic("sid")(sid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizedone)) __obj.updateDynamic("sizedone")(sizedone.get.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(sortid)) __obj.updateDynamic("sortid")(sortid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (!js.isUndefined(t)) __obj.updateDynamic("t")(t.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.get.asInstanceOf[js.Any])
    if (targetmode != null) __obj.updateDynamic("targetmode")(targetmode.asInstanceOf[js.Any])
    if (!js.isUndefined(tcid)) __obj.updateDynamic("tcid")(tcid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tcldbid)) __obj.updateDynamic("tcldbid")(tcldbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time_left)) __obj.updateDynamic("time_left")(time_left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (tname != null) __obj.updateDynamic("tname")(tname.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (token1 != null) __obj.updateDynamic("token1")(token1.asInstanceOf[js.Any])
    if (token2 != null) __obj.updateDynamic("token2")(token2.asInstanceOf[js.Any])
    if (!js.isUndefined(token_created)) __obj.updateDynamic("token_created")(token_created.get.asInstanceOf[js.Any])
    if (token_customset != null) __obj.updateDynamic("token_customset")(token_customset.asInstanceOf[js.Any])
    if (token_description != null) __obj.updateDynamic("token_description")(token_description.asInstanceOf[js.Any])
    if (!js.isUndefined(token_id1)) __obj.updateDynamic("token_id1")(token_id1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token_id2)) __obj.updateDynamic("token_id2")(token_id2.get.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    if (tokencustomset != null) __obj.updateDynamic("tokencustomset")(tokencustomset.asInstanceOf[js.Any])
    if (!js.isUndefined(total_clients)) __obj.updateDynamic("total_clients")(total_clients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_clients_family)) __obj.updateDynamic("total_clients_family")(total_clients_family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_antiflood_points_needed_command_block)) __obj.updateDynamic("virtualserver_antiflood_points_needed_command_block")(virtualserver_antiflood_points_needed_command_block.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_antiflood_points_needed_ip_block)) __obj.updateDynamic("virtualserver_antiflood_points_needed_ip_block")(virtualserver_antiflood_points_needed_ip_block.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_antiflood_points_needed_plugin_block)) __obj.updateDynamic("virtualserver_antiflood_points_needed_plugin_block")(virtualserver_antiflood_points_needed_plugin_block.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_antiflood_points_tick_reduce)) __obj.updateDynamic("virtualserver_antiflood_points_tick_reduce")(virtualserver_antiflood_points_tick_reduce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_ask_for_privilegekey)) __obj.updateDynamic("virtualserver_ask_for_privilegekey")(virtualserver_ask_for_privilegekey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_autostart)) __obj.updateDynamic("virtualserver_autostart")(virtualserver_autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_channel_temp_delete_delay_default)) __obj.updateDynamic("virtualserver_channel_temp_delete_delay_default")(virtualserver_channel_temp_delete_delay_default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_channelsonline)) __obj.updateDynamic("virtualserver_channelsonline")(virtualserver_channelsonline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialQueryResponseTypes]
  }
}

