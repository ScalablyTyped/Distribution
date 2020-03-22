package typings.ts3NodejsLibrary.queryResponseMod

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

trait QueryResponseTypes extends js.Object {
  var apikey: String
  var average_speed: Double
  var banid: Double
  var build: Double
  var cfid: Double
  var cgid: Double
  var channel_banner_gfx_url: String
  var channel_banner_mode: Double
  var channel_codec: Codec
  var channel_codec_is_unencrypted: Double
  var channel_codec_latency_factor: Double
  var channel_codec_quality: Double
  var channel_delete_delay: Double
  var channel_description: String
  var channel_filepath: String
  var channel_flag_default: Double
  var channel_flag_maxclients_unlimited: Double
  var channel_flag_maxfamilyclients_inherited: Double
  var channel_flag_maxfamilyclients_unlimited: Double
  var channel_flag_password: Double
  var channel_flag_permanent: Double
  var channel_flag_private: Double
  var channel_flag_semi_permanent: Double
  var channel_flag_temporary: Double
  var channel_forced_silence: Double
  var channel_icon_id: Double
  var channel_maxclients: Double
  var channel_maxfamilyclients: Double
  var channel_name: String
  var channel_name_phonetic: String
  var channel_needed_subscribe_power: Double
  var channel_needed_talk_power: Double
  var channel_order: Double
  var channel_password: String
  var channel_security_salt: String
  var channel_topic: String
  var cid: Double
  var cldbid: Double
  var clid: Double
  var client_away: Double
  var client_away_message: String
  var client_badges: String
  var client_base64HashClientUID: String
  var client_channel_group_id: Double
  var client_channel_group_inherited_channel_id: Double
  var client_channel_id: Double
  var client_country: String
  var client_created: Double
  var client_database_id: Double
  var client_default_channel: Double
  var client_default_token: String
  var client_description: String
  var client_flag_avatar: String
  var client_flag_talking: Double
  var client_icon_id: Double
  var client_id: Double
  var client_idle_time: Double
  var client_input_hardware: Double
  var client_input_muted: Double
  var client_integrations: String
  var client_is_channel_commander: Double
  var client_is_priority_speaker: Double
  var client_is_recording: Double
  var client_is_talker: Double
  var client_lastconnected: Double
  var client_lastip: String
  var client_login_name: String
  var client_login_password: String
  var client_meta_data: String
  var client_month_bytes_downloaded: Double
  var client_month_bytes_uploaded: Double
  var client_myteamspeak_avatar: String
  var client_myteamspeak_id: String
  var client_needed_serverquery_view_power: Double
  var client_nickname: String
  var client_nickname_phonetic: String
  var client_origin_server_id: Double
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
  var client_type: ClientType
  var client_unique_identifier: String
  var client_version: String
  var client_version_sign: String
  var clientftfid: Double
  var cluid: String
  var connection_bandwidth_received_last_minute_total: Double
  var connection_bandwidth_received_last_second_total: Double
  var connection_bandwidth_sent_last_minute_total: Double
  var connection_bandwidth_sent_last_second_total: Double
  var connection_bytes_received_control: Double
  var connection_bytes_received_keepalive: Double
  var connection_bytes_received_speech: Double
  var connection_bytes_received_total: Double
  var connection_bytes_sent_control: Double
  var connection_bytes_sent_keepalive: Double
  var connection_bytes_sent_speech: Double
  var connection_bytes_sent_total: Double
  var connection_client_ip: String
  var connection_connected_time: Double
  var connection_filetransfer_bandwidth_received: Double
  var connection_filetransfer_bandwidth_sent: Double
  var connection_filetransfer_bytes_received_total: Double
  var connection_filetransfer_bytes_sent_total: Double
  var connection_packetloss_total: Double
  var connection_packets_received_control: Double
  var connection_packets_received_keepalive: Double
  var connection_packets_received_speech: Double
  var connection_packets_received_total: Double
  var connection_packets_sent_control: Double
  var connection_packets_sent_keepalive: Double
  var connection_packets_sent_speech: Double
  var connection_packets_sent_total: Double
  var connection_ping: Double
  var count: Double
  var cpid: Double
  var created: Double
  var created_at: Double
  var ctid: Double
  var current_speed: Double
  var datetime: Double
  var desc: String
  var duration: Double
  var end: Double
  var enforcements: Double
  var expires_at: Double
  var extra_msg: String
  var failed_permid: Double
  var fcldbid: Double
  var file_size: Double
  var flag_read: Double
  var fname: String
  var ftkey: String
  var hash: String
  var host_timestamp_utc: Double
  var iconid: Double
  var id: Double
  var id1: Double
  var id2: Double
  var ident: String
  var instance_uptime: Double
  var invokercldbid: Double
  var invokerid: Double
  var invokername: String
  var invokeruid: String
  var ip: String
  var l: String
  var last_pos: Double
  var lastnickname: String
  var message: String
  var msg: String
  var msgid: Double
  var mytsid: String
  var n: Double
  var n_member_addp: Double
  var n_member_removep: Double
  var n_modifyp: Double
  var name: String
  var namemode: Double
  var nickname: String
  var order: Double
  var p: Double
  var path: String
  var permdesc: String
  var permid: Double
  var permname: String
  var permnegated: Double
  var permsid: String
  var permskip: Double
  var permvalue: Double
  var pid: Double
  var platform: String
  var port: Double
  var proto: Double
  var pw_clear: String
  var reason: String
  var reasonid: Double
  var reasonmsg: String
  var runtime: Double
  var s: Double
  var salt: String
  var savedb: Double
  var scope: ApiKeyScope
  var seconds_empty: Double
  var sender: Double
  var server_id: Double
  var serverftfid: Double
  var serverinstance_database_version: Double
  var serverinstance_filetransfer_port: Double
  var serverinstance_guest_serverquery_group: Double
  var serverinstance_max_download_total_bandwidth: Double
  var serverinstance_max_upload_total_bandwidth: Double
  var serverinstance_pending_connections_per_ip: Double
  var serverinstance_permissions_version: Double
  var serverinstance_serverquery_flood_ban_time: Double
  var serverinstance_serverquery_flood_commands: Double
  var serverinstance_serverquery_flood_time: Double
  var serverinstance_serverquery_max_connections_per_ip: Double
  var serverinstance_template_channeladmin_group: Double
  var serverinstance_template_channeldefault_group: Double
  var serverinstance_template_serveradmin_group: Double
  var serverinstance_template_serverdefault_group: Double
  var sgid: Double
  var sid: Double
  var size: Double
  var sizedone: Double
  var snapshot: String
  var sortid: Double
  var start: Double
  var status: Double
  var subject: String
  var t: Double
  var target: Double
  var targetmode: TextMessageTargetMode
  var tcid: Double
  var tcldbid: Double
  var time_left: Double
  var timestamp: Double
  var tname: String
  var token: String
  var token1: String
  var token2: String
  var token_created: Double
  var token_customset: js.Array[TokenCustomSet]
  var token_description: String
  var token_id1: Double
  var token_id2: Double
  var token_type: TokenType
  var tokencustomset: js.Array[TokenCustomSet]
  var total_clients: Double
  var total_clients_family: Double
  var `type`: Double
  var uid: String
  var v: Double
  var value: String
  var version: String
  var virtualserver_antiflood_points_needed_command_block: Double
  var virtualserver_antiflood_points_needed_ip_block: Double
  var virtualserver_antiflood_points_needed_plugin_block: Double
  var virtualserver_antiflood_points_tick_reduce: Double
  var virtualserver_ask_for_privilegekey: Double
  var virtualserver_autostart: Double
  var virtualserver_channel_temp_delete_delay_default: Double
  var virtualserver_channelsonline: Double
  var virtualserver_client_connections: Double
  var virtualserver_clientsonline: Double
  var virtualserver_codec_encryption_mode: CodecEncryptionMode
  var virtualserver_complain_autoban_count: Double
  var virtualserver_complain_autoban_time: Double
  var virtualserver_complain_remove_time: Double
  var virtualserver_created: Double
  var virtualserver_default_channel_admin_group: Double
  var virtualserver_default_channel_group: Double
  var virtualserver_default_server_group: Double
  var virtualserver_download_quota: Double
  var virtualserver_filebase: String
  var virtualserver_flag_password: Double
  var virtualserver_hostbanner_gfx_interval: Double
  var virtualserver_hostbanner_gfx_url: String
  var virtualserver_hostbanner_mode: HostBannerMode
  var virtualserver_hostbanner_url: String
  var virtualserver_hostbutton_gfx_url: String
  var virtualserver_hostbutton_tooltip: String
  var virtualserver_hostbutton_url: String
  var virtualserver_hostmessage: String
  var virtualserver_hostmessage_mode: HostMessageMode
  var virtualserver_icon_id: Double
  var virtualserver_id: Double
  var virtualserver_ip: js.Array[String]
  var virtualserver_log_channel: Double
  var virtualserver_log_client: Double
  var virtualserver_log_filetransfer: Double
  var virtualserver_log_permissions: Double
  var virtualserver_log_query: Double
  var virtualserver_log_server: Double
  var virtualserver_machine_id: String
  var virtualserver_max_download_total_bandwidth: Double
  var virtualserver_max_upload_total_bandwidth: Double
  var virtualserver_maxclients: Double
  var virtualserver_min_android_version: Double
  var virtualserver_min_client_version: Double
  var virtualserver_min_clients_in_channel_before_forced_silence: Double
  var virtualserver_min_ios_version: Double
  var virtualserver_month_bytes_downloaded: Double
  var virtualserver_month_bytes_uploaded: Double
  var virtualserver_name: String
  var virtualserver_name_phonetic: String
  var virtualserver_needed_identity_security_level: Double
  var virtualserver_nickname: String
  var virtualserver_password: String
  var virtualserver_platform: String
  var virtualserver_port: Double
  var virtualserver_priority_speaker_dimm_modificator: Double
  var virtualserver_query_client_connections: Double
  var virtualserver_queryclientsonline: Double
  var virtualserver_reserved_slots: Double
  var virtualserver_status: String
  var virtualserver_total_bytes_downloaded: Double
  var virtualserver_total_bytes_uploaded: Double
  var virtualserver_total_packetloss_control: Double
  var virtualserver_total_packetloss_keepalive: Double
  var virtualserver_total_packetloss_speech: Double
  var virtualserver_total_packetloss_total: Double
  var virtualserver_total_ping: Double
  var virtualserver_unique_identifier: String
  var virtualserver_upload_quota: Double
  var virtualserver_uptime: Double
  var virtualserver_version: String
  var virtualserver_weblist_enabled: Double
  var virtualserver_welcomemessage: String
  var virtualservers_running_total: Double
  var virtualservers_total_channels_online: Double
  var virtualservers_total_clients_online: Double
  var virtualservers_total_maxclients: Double
}

object QueryResponseTypes {
  @scala.inline
  def apply(
    apikey: String,
    average_speed: Double,
    banid: Double,
    build: Double,
    cfid: Double,
    cgid: Double,
    channel_banner_gfx_url: String,
    channel_banner_mode: Double,
    channel_codec: Codec,
    channel_codec_is_unencrypted: Double,
    channel_codec_latency_factor: Double,
    channel_codec_quality: Double,
    channel_delete_delay: Double,
    channel_description: String,
    channel_filepath: String,
    channel_flag_default: Double,
    channel_flag_maxclients_unlimited: Double,
    channel_flag_maxfamilyclients_inherited: Double,
    channel_flag_maxfamilyclients_unlimited: Double,
    channel_flag_password: Double,
    channel_flag_permanent: Double,
    channel_flag_private: Double,
    channel_flag_semi_permanent: Double,
    channel_flag_temporary: Double,
    channel_forced_silence: Double,
    channel_icon_id: Double,
    channel_maxclients: Double,
    channel_maxfamilyclients: Double,
    channel_name: String,
    channel_name_phonetic: String,
    channel_needed_subscribe_power: Double,
    channel_needed_talk_power: Double,
    channel_order: Double,
    channel_password: String,
    channel_security_salt: String,
    channel_topic: String,
    cid: Double,
    cldbid: Double,
    clid: Double,
    client_away: Double,
    client_away_message: String,
    client_badges: String,
    client_base64HashClientUID: String,
    client_channel_group_id: Double,
    client_channel_group_inherited_channel_id: Double,
    client_channel_id: Double,
    client_country: String,
    client_created: Double,
    client_database_id: Double,
    client_default_channel: Double,
    client_default_token: String,
    client_description: String,
    client_flag_avatar: String,
    client_flag_talking: Double,
    client_icon_id: Double,
    client_id: Double,
    client_idle_time: Double,
    client_input_hardware: Double,
    client_input_muted: Double,
    client_integrations: String,
    client_is_channel_commander: Double,
    client_is_priority_speaker: Double,
    client_is_recording: Double,
    client_is_talker: Double,
    client_lastconnected: Double,
    client_lastip: String,
    client_login_name: String,
    client_login_password: String,
    client_meta_data: String,
    client_month_bytes_downloaded: Double,
    client_month_bytes_uploaded: Double,
    client_myteamspeak_avatar: String,
    client_myteamspeak_id: String,
    client_needed_serverquery_view_power: Double,
    client_nickname: String,
    client_nickname_phonetic: String,
    client_origin_server_id: Double,
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
    client_type: ClientType,
    client_unique_identifier: String,
    client_version: String,
    client_version_sign: String,
    clientftfid: Double,
    cluid: String,
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_control: Double,
    connection_bytes_received_keepalive: Double,
    connection_bytes_received_speech: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_control: Double,
    connection_bytes_sent_keepalive: Double,
    connection_bytes_sent_speech: Double,
    connection_bytes_sent_total: Double,
    connection_client_ip: String,
    connection_connected_time: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_filetransfer_bytes_received_total: Double,
    connection_filetransfer_bytes_sent_total: Double,
    connection_packetloss_total: Double,
    connection_packets_received_control: Double,
    connection_packets_received_keepalive: Double,
    connection_packets_received_speech: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_control: Double,
    connection_packets_sent_keepalive: Double,
    connection_packets_sent_speech: Double,
    connection_packets_sent_total: Double,
    connection_ping: Double,
    count: Double,
    cpid: Double,
    created: Double,
    created_at: Double,
    ctid: Double,
    current_speed: Double,
    datetime: Double,
    desc: String,
    duration: Double,
    end: Double,
    enforcements: Double,
    expires_at: Double,
    extra_msg: String,
    failed_permid: Double,
    fcldbid: Double,
    file_size: Double,
    flag_read: Double,
    fname: String,
    ftkey: String,
    hash: String,
    host_timestamp_utc: Double,
    iconid: Double,
    id: Double,
    id1: Double,
    id2: Double,
    ident: String,
    instance_uptime: Double,
    invokercldbid: Double,
    invokerid: Double,
    invokername: String,
    invokeruid: String,
    ip: String,
    l: String,
    last_pos: Double,
    lastnickname: String,
    message: String,
    msg: String,
    msgid: Double,
    mytsid: String,
    n: Double,
    n_member_addp: Double,
    n_member_removep: Double,
    n_modifyp: Double,
    name: String,
    namemode: Double,
    nickname: String,
    order: Double,
    p: Double,
    path: String,
    permdesc: String,
    permid: Double,
    permname: String,
    permnegated: Double,
    permsid: String,
    permskip: Double,
    permvalue: Double,
    pid: Double,
    platform: String,
    port: Double,
    proto: Double,
    pw_clear: String,
    reason: String,
    reasonid: Double,
    reasonmsg: String,
    runtime: Double,
    s: Double,
    salt: String,
    savedb: Double,
    scope: ApiKeyScope,
    seconds_empty: Double,
    sender: Double,
    server_id: Double,
    serverftfid: Double,
    serverinstance_database_version: Double,
    serverinstance_filetransfer_port: Double,
    serverinstance_guest_serverquery_group: Double,
    serverinstance_max_download_total_bandwidth: Double,
    serverinstance_max_upload_total_bandwidth: Double,
    serverinstance_pending_connections_per_ip: Double,
    serverinstance_permissions_version: Double,
    serverinstance_serverquery_flood_ban_time: Double,
    serverinstance_serverquery_flood_commands: Double,
    serverinstance_serverquery_flood_time: Double,
    serverinstance_serverquery_max_connections_per_ip: Double,
    serverinstance_template_channeladmin_group: Double,
    serverinstance_template_channeldefault_group: Double,
    serverinstance_template_serveradmin_group: Double,
    serverinstance_template_serverdefault_group: Double,
    sgid: Double,
    sid: Double,
    size: Double,
    sizedone: Double,
    snapshot: String,
    sortid: Double,
    start: Double,
    status: Double,
    subject: String,
    t: Double,
    target: Double,
    targetmode: TextMessageTargetMode,
    tcid: Double,
    tcldbid: Double,
    time_left: Double,
    timestamp: Double,
    tname: String,
    token: String,
    token1: String,
    token2: String,
    token_created: Double,
    token_customset: js.Array[TokenCustomSet],
    token_description: String,
    token_id1: Double,
    token_id2: Double,
    token_type: TokenType,
    tokencustomset: js.Array[TokenCustomSet],
    total_clients: Double,
    total_clients_family: Double,
    `type`: Double,
    uid: String,
    v: Double,
    value: String,
    version: String,
    virtualserver_antiflood_points_needed_command_block: Double,
    virtualserver_antiflood_points_needed_ip_block: Double,
    virtualserver_antiflood_points_needed_plugin_block: Double,
    virtualserver_antiflood_points_tick_reduce: Double,
    virtualserver_ask_for_privilegekey: Double,
    virtualserver_autostart: Double,
    virtualserver_channel_temp_delete_delay_default: Double,
    virtualserver_channelsonline: Double
  ): QueryResponseTypes = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], average_speed = average_speed.asInstanceOf[js.Any], banid = banid.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], cfid = cfid.asInstanceOf[js.Any], cgid = cgid.asInstanceOf[js.Any], channel_banner_gfx_url = channel_banner_gfx_url.asInstanceOf[js.Any], channel_banner_mode = channel_banner_mode.asInstanceOf[js.Any], channel_codec = channel_codec.asInstanceOf[js.Any], channel_codec_is_unencrypted = channel_codec_is_unencrypted.asInstanceOf[js.Any], channel_codec_latency_factor = channel_codec_latency_factor.asInstanceOf[js.Any], channel_codec_quality = channel_codec_quality.asInstanceOf[js.Any], channel_delete_delay = channel_delete_delay.asInstanceOf[js.Any], channel_description = channel_description.asInstanceOf[js.Any], channel_filepath = channel_filepath.asInstanceOf[js.Any], channel_flag_default = channel_flag_default.asInstanceOf[js.Any], channel_flag_maxclients_unlimited = channel_flag_maxclients_unlimited.asInstanceOf[js.Any], channel_flag_maxfamilyclients_inherited = channel_flag_maxfamilyclients_inherited.asInstanceOf[js.Any], channel_flag_maxfamilyclients_unlimited = channel_flag_maxfamilyclients_unlimited.asInstanceOf[js.Any], channel_flag_password = channel_flag_password.asInstanceOf[js.Any], channel_flag_permanent = channel_flag_permanent.asInstanceOf[js.Any], channel_flag_private = channel_flag_private.asInstanceOf[js.Any], channel_flag_semi_permanent = channel_flag_semi_permanent.asInstanceOf[js.Any], channel_flag_temporary = channel_flag_temporary.asInstanceOf[js.Any], channel_forced_silence = channel_forced_silence.asInstanceOf[js.Any], channel_icon_id = channel_icon_id.asInstanceOf[js.Any], channel_maxclients = channel_maxclients.asInstanceOf[js.Any], channel_maxfamilyclients = channel_maxfamilyclients.asInstanceOf[js.Any], channel_name = channel_name.asInstanceOf[js.Any], channel_name_phonetic = channel_name_phonetic.asInstanceOf[js.Any], channel_needed_subscribe_power = channel_needed_subscribe_power.asInstanceOf[js.Any], channel_needed_talk_power = channel_needed_talk_power.asInstanceOf[js.Any], channel_order = channel_order.asInstanceOf[js.Any], channel_password = channel_password.asInstanceOf[js.Any], channel_security_salt = channel_security_salt.asInstanceOf[js.Any], channel_topic = channel_topic.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], client_away = client_away.asInstanceOf[js.Any], client_away_message = client_away_message.asInstanceOf[js.Any], client_badges = client_badges.asInstanceOf[js.Any], client_base64HashClientUID = client_base64HashClientUID.asInstanceOf[js.Any], client_channel_group_id = client_channel_group_id.asInstanceOf[js.Any], client_channel_group_inherited_channel_id = client_channel_group_inherited_channel_id.asInstanceOf[js.Any], client_channel_id = client_channel_id.asInstanceOf[js.Any], client_country = client_country.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_default_channel = client_default_channel.asInstanceOf[js.Any], client_default_token = client_default_token.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_flag_avatar = client_flag_avatar.asInstanceOf[js.Any], client_flag_talking = client_flag_talking.asInstanceOf[js.Any], client_icon_id = client_icon_id.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_idle_time = client_idle_time.asInstanceOf[js.Any], client_input_hardware = client_input_hardware.asInstanceOf[js.Any], client_input_muted = client_input_muted.asInstanceOf[js.Any], client_integrations = client_integrations.asInstanceOf[js.Any], client_is_channel_commander = client_is_channel_commander.asInstanceOf[js.Any], client_is_priority_speaker = client_is_priority_speaker.asInstanceOf[js.Any], client_is_recording = client_is_recording.asInstanceOf[js.Any], client_is_talker = client_is_talker.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_lastip = client_lastip.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_login_password = client_login_password.asInstanceOf[js.Any], client_meta_data = client_meta_data.asInstanceOf[js.Any], client_month_bytes_downloaded = client_month_bytes_downloaded.asInstanceOf[js.Any], client_month_bytes_uploaded = client_month_bytes_uploaded.asInstanceOf[js.Any], client_myteamspeak_avatar = client_myteamspeak_avatar.asInstanceOf[js.Any], client_myteamspeak_id = client_myteamspeak_id.asInstanceOf[js.Any], client_needed_serverquery_view_power = client_needed_serverquery_view_power.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_nickname_phonetic = client_nickname_phonetic.asInstanceOf[js.Any], client_origin_server_id = client_origin_server_id.asInstanceOf[js.Any], client_output_hardware = client_output_hardware.asInstanceOf[js.Any], client_output_muted = client_output_muted.asInstanceOf[js.Any], client_outputonly_muted = client_outputonly_muted.asInstanceOf[js.Any], client_platform = client_platform.asInstanceOf[js.Any], client_security_hash = client_security_hash.asInstanceOf[js.Any], client_servergroups = client_servergroups.asInstanceOf[js.Any], client_signed_badges = client_signed_badges.asInstanceOf[js.Any], client_talk_power = client_talk_power.asInstanceOf[js.Any], client_talk_request = client_talk_request.asInstanceOf[js.Any], client_talk_request_msg = client_talk_request_msg.asInstanceOf[js.Any], client_total_bytes_downloaded = client_total_bytes_downloaded.asInstanceOf[js.Any], client_total_bytes_uploaded = client_total_bytes_uploaded.asInstanceOf[js.Any], client_totalconnections = client_totalconnections.asInstanceOf[js.Any], client_type = client_type.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], client_version = client_version.asInstanceOf[js.Any], client_version_sign = client_version_sign.asInstanceOf[js.Any], clientftfid = clientftfid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total.asInstanceOf[js.Any], connection_bytes_received_control = connection_bytes_received_control.asInstanceOf[js.Any], connection_bytes_received_keepalive = connection_bytes_received_keepalive.asInstanceOf[js.Any], connection_bytes_received_speech = connection_bytes_received_speech.asInstanceOf[js.Any], connection_bytes_received_total = connection_bytes_received_total.asInstanceOf[js.Any], connection_bytes_sent_control = connection_bytes_sent_control.asInstanceOf[js.Any], connection_bytes_sent_keepalive = connection_bytes_sent_keepalive.asInstanceOf[js.Any], connection_bytes_sent_speech = connection_bytes_sent_speech.asInstanceOf[js.Any], connection_bytes_sent_total = connection_bytes_sent_total.asInstanceOf[js.Any], connection_client_ip = connection_client_ip.asInstanceOf[js.Any], connection_connected_time = connection_connected_time.asInstanceOf[js.Any], connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received.asInstanceOf[js.Any], connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent.asInstanceOf[js.Any], connection_filetransfer_bytes_received_total = connection_filetransfer_bytes_received_total.asInstanceOf[js.Any], connection_filetransfer_bytes_sent_total = connection_filetransfer_bytes_sent_total.asInstanceOf[js.Any], connection_packetloss_total = connection_packetloss_total.asInstanceOf[js.Any], connection_packets_received_control = connection_packets_received_control.asInstanceOf[js.Any], connection_packets_received_keepalive = connection_packets_received_keepalive.asInstanceOf[js.Any], connection_packets_received_speech = connection_packets_received_speech.asInstanceOf[js.Any], connection_packets_received_total = connection_packets_received_total.asInstanceOf[js.Any], connection_packets_sent_control = connection_packets_sent_control.asInstanceOf[js.Any], connection_packets_sent_keepalive = connection_packets_sent_keepalive.asInstanceOf[js.Any], connection_packets_sent_speech = connection_packets_sent_speech.asInstanceOf[js.Any], connection_packets_sent_total = connection_packets_sent_total.asInstanceOf[js.Any], connection_ping = connection_ping.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], ctid = ctid.asInstanceOf[js.Any], current_speed = current_speed.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], enforcements = enforcements.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], extra_msg = extra_msg.asInstanceOf[js.Any], failed_permid = failed_permid.asInstanceOf[js.Any], fcldbid = fcldbid.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], flag_read = flag_read.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], ftkey = ftkey.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host_timestamp_utc = host_timestamp_utc.asInstanceOf[js.Any], iconid = iconid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id1 = id1.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], ident = ident.asInstanceOf[js.Any], instance_uptime = instance_uptime.asInstanceOf[js.Any], invokercldbid = invokercldbid.asInstanceOf[js.Any], invokerid = invokerid.asInstanceOf[js.Any], invokername = invokername.asInstanceOf[js.Any], invokeruid = invokeruid.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], last_pos = last_pos.asInstanceOf[js.Any], lastnickname = lastnickname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], mytsid = mytsid.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], n_member_addp = n_member_addp.asInstanceOf[js.Any], n_member_removep = n_member_removep.asInstanceOf[js.Any], n_modifyp = n_modifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permdesc = permdesc.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permname = permname.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], pw_clear = pw_clear.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any], reasonmsg = reasonmsg.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], seconds_empty = seconds_empty.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], server_id = server_id.asInstanceOf[js.Any], serverftfid = serverftfid.asInstanceOf[js.Any], serverinstance_database_version = serverinstance_database_version.asInstanceOf[js.Any], serverinstance_filetransfer_port = serverinstance_filetransfer_port.asInstanceOf[js.Any], serverinstance_guest_serverquery_group = serverinstance_guest_serverquery_group.asInstanceOf[js.Any], serverinstance_max_download_total_bandwidth = serverinstance_max_download_total_bandwidth.asInstanceOf[js.Any], serverinstance_max_upload_total_bandwidth = serverinstance_max_upload_total_bandwidth.asInstanceOf[js.Any], serverinstance_pending_connections_per_ip = serverinstance_pending_connections_per_ip.asInstanceOf[js.Any], serverinstance_permissions_version = serverinstance_permissions_version.asInstanceOf[js.Any], serverinstance_serverquery_flood_ban_time = serverinstance_serverquery_flood_ban_time.asInstanceOf[js.Any], serverinstance_serverquery_flood_commands = serverinstance_serverquery_flood_commands.asInstanceOf[js.Any], serverinstance_serverquery_flood_time = serverinstance_serverquery_flood_time.asInstanceOf[js.Any], serverinstance_serverquery_max_connections_per_ip = serverinstance_serverquery_max_connections_per_ip.asInstanceOf[js.Any], serverinstance_template_channeladmin_group = serverinstance_template_channeladmin_group.asInstanceOf[js.Any], serverinstance_template_channeldefault_group = serverinstance_template_channeldefault_group.asInstanceOf[js.Any], serverinstance_template_serveradmin_group = serverinstance_template_serveradmin_group.asInstanceOf[js.Any], serverinstance_template_serverdefault_group = serverinstance_template_serverdefault_group.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizedone = sizedone.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetmode = targetmode.asInstanceOf[js.Any], tcid = tcid.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], time_left = time_left.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token1 = token1.asInstanceOf[js.Any], token2 = token2.asInstanceOf[js.Any], token_created = token_created.asInstanceOf[js.Any], token_customset = token_customset.asInstanceOf[js.Any], token_description = token_description.asInstanceOf[js.Any], token_id1 = token_id1.asInstanceOf[js.Any], token_id2 = token_id2.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any], tokencustomset = tokencustomset.asInstanceOf[js.Any], total_clients = total_clients.asInstanceOf[js.Any], total_clients_family = total_clients_family.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], virtualserver_antiflood_points_needed_command_block = virtualserver_antiflood_points_needed_command_block.asInstanceOf[js.Any], virtualserver_antiflood_points_needed_ip_block = virtualserver_antiflood_points_needed_ip_block.asInstanceOf[js.Any], virtualserver_antiflood_points_needed_plugin_block = virtualserver_antiflood_points_needed_plugin_block.asInstanceOf[js.Any], virtualserver_antiflood_points_tick_reduce = virtualserver_antiflood_points_tick_reduce.asInstanceOf[js.Any], virtualserver_ask_for_privilegekey = virtualserver_ask_for_privilegekey.asInstanceOf[js.Any], virtualserver_autostart = virtualserver_autostart.asInstanceOf[js.Any], virtualserver_channel_temp_delete_delay_default = virtualserver_channel_temp_delete_delay_default.asInstanceOf[js.Any], virtualserver_channelsonline = virtualserver_channelsonline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponseTypes]
  }
}

