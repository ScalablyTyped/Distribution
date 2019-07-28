package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectedClient extends js.Object {
  var cid: Double
  var clid: Double
  var client_away: Double
  var client_away_message: js.UndefOr[String] = js.undefined
  var client_channel_group_id: Double
  var client_channel_group_inherited_channel_id: Double
  var client_country: js.UndefOr[String] = js.undefined
  var client_created: Double
  var client_database_id: Double
  var client_flag_talking: Double
  var client_icon_id: Double
  var client_idle_time: Double
  var client_input_hardware: Double
  var client_input_muted: Double
  var client_is_channel_commander: Double
  var client_is_priority_speaker: Double
  var client_is_recording: Double
  var client_is_talker: Double
  var client_lastconnected: Double
  var client_nickname: String
  var client_output_hardware: Double
  var client_output_muted: Double
  var client_platform: String
  var client_servergroups: js.Array[Double]
  var client_talk_power: Double
  var client_type: ClientType
  var client_unique_identifier: String
  var client_version: String
  var connection_client_ip: String
}

object DisconnectedClient {
  @scala.inline
  def apply(
    cid: Double,
    clid: Double,
    client_away: Double,
    client_channel_group_id: Double,
    client_channel_group_inherited_channel_id: Double,
    client_created: Double,
    client_database_id: Double,
    client_flag_talking: Double,
    client_icon_id: Double,
    client_idle_time: Double,
    client_input_hardware: Double,
    client_input_muted: Double,
    client_is_channel_commander: Double,
    client_is_priority_speaker: Double,
    client_is_recording: Double,
    client_is_talker: Double,
    client_lastconnected: Double,
    client_nickname: String,
    client_output_hardware: Double,
    client_output_muted: Double,
    client_platform: String,
    client_servergroups: js.Array[Double],
    client_talk_power: Double,
    client_type: ClientType,
    client_unique_identifier: String,
    client_version: String,
    connection_client_ip: String,
    client_away_message: String = null,
    client_country: String = null
  ): DisconnectedClient = {
    val __obj = js.Dynamic.literal(cid = cid, clid = clid, client_away = client_away, client_channel_group_id = client_channel_group_id, client_channel_group_inherited_channel_id = client_channel_group_inherited_channel_id, client_created = client_created, client_database_id = client_database_id, client_flag_talking = client_flag_talking, client_icon_id = client_icon_id, client_idle_time = client_idle_time, client_input_hardware = client_input_hardware, client_input_muted = client_input_muted, client_is_channel_commander = client_is_channel_commander, client_is_priority_speaker = client_is_priority_speaker, client_is_recording = client_is_recording, client_is_talker = client_is_talker, client_lastconnected = client_lastconnected, client_nickname = client_nickname, client_output_hardware = client_output_hardware, client_output_muted = client_output_muted, client_platform = client_platform, client_servergroups = client_servergroups, client_talk_power = client_talk_power, client_type = client_type, client_unique_identifier = client_unique_identifier, client_version = client_version, connection_client_ip = connection_client_ip)
    if (client_away_message != null) __obj.updateDynamic("client_away_message")(client_away_message)
    if (client_country != null) __obj.updateDynamic("client_country")(client_country)
    __obj.asInstanceOf[DisconnectedClient]
  }
}

