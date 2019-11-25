package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.CodecEncryptionMode
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostBannerMode
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEdit extends js.Object {
  var virtualserver_antiflood_points_needed_command_block: js.UndefOr[Double] = js.undefined
  var virtualserver_antiflood_points_needed_ip_block: js.UndefOr[Double] = js.undefined
  var virtualserver_antiflood_points_needed_plugin_block: js.UndefOr[Double] = js.undefined
  var virtualserver_antiflood_points_tick_reduce: js.UndefOr[Double] = js.undefined
  var virtualserver_autostart: js.UndefOr[Double] = js.undefined
  var virtualserver_codec_encryption_mode: js.UndefOr[CodecEncryptionMode] = js.undefined
  var virtualserver_complain_autoban_count: js.UndefOr[Double] = js.undefined
  var virtualserver_complain_autoban_time: js.UndefOr[Double] = js.undefined
  var virtualserver_complain_remove_time: js.UndefOr[Double] = js.undefined
  var virtualserver_default_channel_admin_group: js.UndefOr[Double] = js.undefined
  var virtualserver_default_channel_group: js.UndefOr[Double] = js.undefined
  var virtualserver_default_server_group: js.UndefOr[Double] = js.undefined
  var virtualserver_download_quota: js.UndefOr[Double] = js.undefined
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
  var virtualserver_name: js.UndefOr[String] = js.undefined
  var virtualserver_name_phonetic: js.UndefOr[String] = js.undefined
  var virtualserver_needed_identity_security_level: js.UndefOr[Double] = js.undefined
  var virtualserver_password: js.UndefOr[String] = js.undefined
  var virtualserver_port: js.UndefOr[Double] = js.undefined
  var virtualserver_priority_speaker_dimm_modificator: js.UndefOr[Double] = js.undefined
  var virtualserver_reserved_slots: js.UndefOr[Double] = js.undefined
  var virtualserver_status: js.UndefOr[String] = js.undefined
  var virtualserver_upload_quota: js.UndefOr[Double] = js.undefined
  var virtualserver_weblist_enabled: js.UndefOr[Double] = js.undefined
  var virtualserver_welcomemessage: js.UndefOr[String] = js.undefined
}

object ServerEdit {
  @scala.inline
  def apply(
    virtualserver_antiflood_points_needed_command_block: Int | Double = null,
    virtualserver_antiflood_points_needed_ip_block: Int | Double = null,
    virtualserver_antiflood_points_needed_plugin_block: Int | Double = null,
    virtualserver_antiflood_points_tick_reduce: Int | Double = null,
    virtualserver_autostart: Int | Double = null,
    virtualserver_codec_encryption_mode: CodecEncryptionMode = null,
    virtualserver_complain_autoban_count: Int | Double = null,
    virtualserver_complain_autoban_time: Int | Double = null,
    virtualserver_complain_remove_time: Int | Double = null,
    virtualserver_default_channel_admin_group: Int | Double = null,
    virtualserver_default_channel_group: Int | Double = null,
    virtualserver_default_server_group: Int | Double = null,
    virtualserver_download_quota: Int | Double = null,
    virtualserver_hostbanner_gfx_interval: Int | Double = null,
    virtualserver_hostbanner_gfx_url: String = null,
    virtualserver_hostbanner_mode: HostBannerMode = null,
    virtualserver_hostbanner_url: String = null,
    virtualserver_hostbutton_gfx_url: String = null,
    virtualserver_hostbutton_tooltip: String = null,
    virtualserver_hostbutton_url: String = null,
    virtualserver_hostmessage: String = null,
    virtualserver_hostmessage_mode: HostMessageMode = null,
    virtualserver_icon_id: Int | Double = null,
    virtualserver_log_channel: Int | Double = null,
    virtualserver_log_client: Int | Double = null,
    virtualserver_log_filetransfer: Int | Double = null,
    virtualserver_log_permissions: Int | Double = null,
    virtualserver_log_query: Int | Double = null,
    virtualserver_log_server: Int | Double = null,
    virtualserver_machine_id: String = null,
    virtualserver_max_download_total_bandwidth: Int | Double = null,
    virtualserver_max_upload_total_bandwidth: Int | Double = null,
    virtualserver_maxclients: Int | Double = null,
    virtualserver_min_android_version: Int | Double = null,
    virtualserver_min_client_version: Int | Double = null,
    virtualserver_min_clients_in_channel_before_forced_silence: Int | Double = null,
    virtualserver_min_ios_version: Int | Double = null,
    virtualserver_name: String = null,
    virtualserver_name_phonetic: String = null,
    virtualserver_needed_identity_security_level: Int | Double = null,
    virtualserver_password: String = null,
    virtualserver_port: Int | Double = null,
    virtualserver_priority_speaker_dimm_modificator: Int | Double = null,
    virtualserver_reserved_slots: Int | Double = null,
    virtualserver_status: String = null,
    virtualserver_upload_quota: Int | Double = null,
    virtualserver_weblist_enabled: Int | Double = null,
    virtualserver_welcomemessage: String = null
  ): ServerEdit = {
    val __obj = js.Dynamic.literal()
    if (virtualserver_antiflood_points_needed_command_block != null) __obj.updateDynamic("virtualserver_antiflood_points_needed_command_block")(virtualserver_antiflood_points_needed_command_block.asInstanceOf[js.Any])
    if (virtualserver_antiflood_points_needed_ip_block != null) __obj.updateDynamic("virtualserver_antiflood_points_needed_ip_block")(virtualserver_antiflood_points_needed_ip_block.asInstanceOf[js.Any])
    if (virtualserver_antiflood_points_needed_plugin_block != null) __obj.updateDynamic("virtualserver_antiflood_points_needed_plugin_block")(virtualserver_antiflood_points_needed_plugin_block.asInstanceOf[js.Any])
    if (virtualserver_antiflood_points_tick_reduce != null) __obj.updateDynamic("virtualserver_antiflood_points_tick_reduce")(virtualserver_antiflood_points_tick_reduce.asInstanceOf[js.Any])
    if (virtualserver_autostart != null) __obj.updateDynamic("virtualserver_autostart")(virtualserver_autostart.asInstanceOf[js.Any])
    if (virtualserver_codec_encryption_mode != null) __obj.updateDynamic("virtualserver_codec_encryption_mode")(virtualserver_codec_encryption_mode.asInstanceOf[js.Any])
    if (virtualserver_complain_autoban_count != null) __obj.updateDynamic("virtualserver_complain_autoban_count")(virtualserver_complain_autoban_count.asInstanceOf[js.Any])
    if (virtualserver_complain_autoban_time != null) __obj.updateDynamic("virtualserver_complain_autoban_time")(virtualserver_complain_autoban_time.asInstanceOf[js.Any])
    if (virtualserver_complain_remove_time != null) __obj.updateDynamic("virtualserver_complain_remove_time")(virtualserver_complain_remove_time.asInstanceOf[js.Any])
    if (virtualserver_default_channel_admin_group != null) __obj.updateDynamic("virtualserver_default_channel_admin_group")(virtualserver_default_channel_admin_group.asInstanceOf[js.Any])
    if (virtualserver_default_channel_group != null) __obj.updateDynamic("virtualserver_default_channel_group")(virtualserver_default_channel_group.asInstanceOf[js.Any])
    if (virtualserver_default_server_group != null) __obj.updateDynamic("virtualserver_default_server_group")(virtualserver_default_server_group.asInstanceOf[js.Any])
    if (virtualserver_download_quota != null) __obj.updateDynamic("virtualserver_download_quota")(virtualserver_download_quota.asInstanceOf[js.Any])
    if (virtualserver_hostbanner_gfx_interval != null) __obj.updateDynamic("virtualserver_hostbanner_gfx_interval")(virtualserver_hostbanner_gfx_interval.asInstanceOf[js.Any])
    if (virtualserver_hostbanner_gfx_url != null) __obj.updateDynamic("virtualserver_hostbanner_gfx_url")(virtualserver_hostbanner_gfx_url.asInstanceOf[js.Any])
    if (virtualserver_hostbanner_mode != null) __obj.updateDynamic("virtualserver_hostbanner_mode")(virtualserver_hostbanner_mode.asInstanceOf[js.Any])
    if (virtualserver_hostbanner_url != null) __obj.updateDynamic("virtualserver_hostbanner_url")(virtualserver_hostbanner_url.asInstanceOf[js.Any])
    if (virtualserver_hostbutton_gfx_url != null) __obj.updateDynamic("virtualserver_hostbutton_gfx_url")(virtualserver_hostbutton_gfx_url.asInstanceOf[js.Any])
    if (virtualserver_hostbutton_tooltip != null) __obj.updateDynamic("virtualserver_hostbutton_tooltip")(virtualserver_hostbutton_tooltip.asInstanceOf[js.Any])
    if (virtualserver_hostbutton_url != null) __obj.updateDynamic("virtualserver_hostbutton_url")(virtualserver_hostbutton_url.asInstanceOf[js.Any])
    if (virtualserver_hostmessage != null) __obj.updateDynamic("virtualserver_hostmessage")(virtualserver_hostmessage.asInstanceOf[js.Any])
    if (virtualserver_hostmessage_mode != null) __obj.updateDynamic("virtualserver_hostmessage_mode")(virtualserver_hostmessage_mode.asInstanceOf[js.Any])
    if (virtualserver_icon_id != null) __obj.updateDynamic("virtualserver_icon_id")(virtualserver_icon_id.asInstanceOf[js.Any])
    if (virtualserver_log_channel != null) __obj.updateDynamic("virtualserver_log_channel")(virtualserver_log_channel.asInstanceOf[js.Any])
    if (virtualserver_log_client != null) __obj.updateDynamic("virtualserver_log_client")(virtualserver_log_client.asInstanceOf[js.Any])
    if (virtualserver_log_filetransfer != null) __obj.updateDynamic("virtualserver_log_filetransfer")(virtualserver_log_filetransfer.asInstanceOf[js.Any])
    if (virtualserver_log_permissions != null) __obj.updateDynamic("virtualserver_log_permissions")(virtualserver_log_permissions.asInstanceOf[js.Any])
    if (virtualserver_log_query != null) __obj.updateDynamic("virtualserver_log_query")(virtualserver_log_query.asInstanceOf[js.Any])
    if (virtualserver_log_server != null) __obj.updateDynamic("virtualserver_log_server")(virtualserver_log_server.asInstanceOf[js.Any])
    if (virtualserver_machine_id != null) __obj.updateDynamic("virtualserver_machine_id")(virtualserver_machine_id.asInstanceOf[js.Any])
    if (virtualserver_max_download_total_bandwidth != null) __obj.updateDynamic("virtualserver_max_download_total_bandwidth")(virtualserver_max_download_total_bandwidth.asInstanceOf[js.Any])
    if (virtualserver_max_upload_total_bandwidth != null) __obj.updateDynamic("virtualserver_max_upload_total_bandwidth")(virtualserver_max_upload_total_bandwidth.asInstanceOf[js.Any])
    if (virtualserver_maxclients != null) __obj.updateDynamic("virtualserver_maxclients")(virtualserver_maxclients.asInstanceOf[js.Any])
    if (virtualserver_min_android_version != null) __obj.updateDynamic("virtualserver_min_android_version")(virtualserver_min_android_version.asInstanceOf[js.Any])
    if (virtualserver_min_client_version != null) __obj.updateDynamic("virtualserver_min_client_version")(virtualserver_min_client_version.asInstanceOf[js.Any])
    if (virtualserver_min_clients_in_channel_before_forced_silence != null) __obj.updateDynamic("virtualserver_min_clients_in_channel_before_forced_silence")(virtualserver_min_clients_in_channel_before_forced_silence.asInstanceOf[js.Any])
    if (virtualserver_min_ios_version != null) __obj.updateDynamic("virtualserver_min_ios_version")(virtualserver_min_ios_version.asInstanceOf[js.Any])
    if (virtualserver_name != null) __obj.updateDynamic("virtualserver_name")(virtualserver_name.asInstanceOf[js.Any])
    if (virtualserver_name_phonetic != null) __obj.updateDynamic("virtualserver_name_phonetic")(virtualserver_name_phonetic.asInstanceOf[js.Any])
    if (virtualserver_needed_identity_security_level != null) __obj.updateDynamic("virtualserver_needed_identity_security_level")(virtualserver_needed_identity_security_level.asInstanceOf[js.Any])
    if (virtualserver_password != null) __obj.updateDynamic("virtualserver_password")(virtualserver_password.asInstanceOf[js.Any])
    if (virtualserver_port != null) __obj.updateDynamic("virtualserver_port")(virtualserver_port.asInstanceOf[js.Any])
    if (virtualserver_priority_speaker_dimm_modificator != null) __obj.updateDynamic("virtualserver_priority_speaker_dimm_modificator")(virtualserver_priority_speaker_dimm_modificator.asInstanceOf[js.Any])
    if (virtualserver_reserved_slots != null) __obj.updateDynamic("virtualserver_reserved_slots")(virtualserver_reserved_slots.asInstanceOf[js.Any])
    if (virtualserver_status != null) __obj.updateDynamic("virtualserver_status")(virtualserver_status.asInstanceOf[js.Any])
    if (virtualserver_upload_quota != null) __obj.updateDynamic("virtualserver_upload_quota")(virtualserver_upload_quota.asInstanceOf[js.Any])
    if (virtualserver_weblist_enabled != null) __obj.updateDynamic("virtualserver_weblist_enabled")(virtualserver_weblist_enabled.asInstanceOf[js.Any])
    if (virtualserver_welcomemessage != null) __obj.updateDynamic("virtualserver_welcomemessage")(virtualserver_welcomemessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEdit]
  }
}

