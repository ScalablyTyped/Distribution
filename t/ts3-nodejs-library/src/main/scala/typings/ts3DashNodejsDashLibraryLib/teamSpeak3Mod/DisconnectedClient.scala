package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectedClient extends js.Object {
  var cid: scala.Double
  var clid: scala.Double
  var client_away: scala.Double
  var client_away_message: js.UndefOr[java.lang.String] = js.undefined
  var client_channel_group_id: scala.Double
  var client_channel_group_inherited_channel_id: scala.Double
  var client_country: js.UndefOr[java.lang.String] = js.undefined
  var client_created: scala.Double
  var client_database_id: scala.Double
  var client_flag_talking: scala.Double
  var client_icon_id: scala.Double
  var client_idle_time: scala.Double
  var client_input_hardware: scala.Double
  var client_input_muted: scala.Double
  var client_is_channel_commander: scala.Double
  var client_is_priority_speaker: scala.Double
  var client_is_recording: scala.Double
  var client_is_talker: scala.Double
  var client_lastconnected: scala.Double
  var client_nickname: java.lang.String
  var client_output_hardware: scala.Double
  var client_output_muted: scala.Double
  var client_platform: java.lang.String
  var client_servergroups: js.Array[scala.Double]
  var client_talk_power: scala.Double
  var client_type: ClientType
  var client_unique_identifier: java.lang.String
  var client_version: java.lang.String
  var connection_client_ip: java.lang.String
}

object DisconnectedClient {
  @scala.inline
  def apply(
    cid: scala.Double,
    clid: scala.Double,
    client_away: scala.Double,
    client_channel_group_id: scala.Double,
    client_channel_group_inherited_channel_id: scala.Double,
    client_created: scala.Double,
    client_database_id: scala.Double,
    client_flag_talking: scala.Double,
    client_icon_id: scala.Double,
    client_idle_time: scala.Double,
    client_input_hardware: scala.Double,
    client_input_muted: scala.Double,
    client_is_channel_commander: scala.Double,
    client_is_priority_speaker: scala.Double,
    client_is_recording: scala.Double,
    client_is_talker: scala.Double,
    client_lastconnected: scala.Double,
    client_nickname: java.lang.String,
    client_output_hardware: scala.Double,
    client_output_muted: scala.Double,
    client_platform: java.lang.String,
    client_servergroups: js.Array[scala.Double],
    client_talk_power: scala.Double,
    client_type: ClientType,
    client_unique_identifier: java.lang.String,
    client_version: java.lang.String,
    connection_client_ip: java.lang.String,
    client_away_message: java.lang.String = null,
    client_country: java.lang.String = null
  ): DisconnectedClient = {
    val __obj = js.Dynamic.literal(cid = cid, clid = clid, client_away = client_away, client_channel_group_id = client_channel_group_id, client_channel_group_inherited_channel_id = client_channel_group_inherited_channel_id, client_created = client_created, client_database_id = client_database_id, client_flag_talking = client_flag_talking, client_icon_id = client_icon_id, client_idle_time = client_idle_time, client_input_hardware = client_input_hardware, client_input_muted = client_input_muted, client_is_channel_commander = client_is_channel_commander, client_is_priority_speaker = client_is_priority_speaker, client_is_recording = client_is_recording, client_is_talker = client_is_talker, client_lastconnected = client_lastconnected, client_nickname = client_nickname, client_output_hardware = client_output_hardware, client_output_muted = client_output_muted, client_platform = client_platform, client_servergroups = client_servergroups, client_talk_power = client_talk_power, client_type = client_type, client_unique_identifier = client_unique_identifier, client_version = client_version, connection_client_ip = connection_client_ip)
    if (client_away_message != null) __obj.updateDynamic("client_away_message")(client_away_message)
    if (client_country != null) __obj.updateDynamic("client_country")(client_country)
    __obj.asInstanceOf[DisconnectedClient]
  }
}

