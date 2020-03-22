package typings.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ClientList> */
trait PartialClientList extends js.Object {
  var cid: js.UndefOr[Double] = js.undefined
  var clid: js.UndefOr[Double] = js.undefined
  var client_away: js.UndefOr[Double] = js.undefined
  var client_away_message: js.UndefOr[String] = js.undefined
  var client_badges: js.UndefOr[String] = js.undefined
  var client_channel_group_id: js.UndefOr[Double] = js.undefined
  var client_channel_group_inherited_channel_id: js.UndefOr[Double] = js.undefined
  var client_country: js.UndefOr[String] = js.undefined
  var client_created: js.UndefOr[Double] = js.undefined
  var client_database_id: js.UndefOr[Double] = js.undefined
  var client_flag_talking: js.UndefOr[Double] = js.undefined
  var client_idle_time: js.UndefOr[Double] = js.undefined
  var client_input_hardware: js.UndefOr[Double] = js.undefined
  var client_input_muted: js.UndefOr[Double] = js.undefined
  var client_is_channel_commander: js.UndefOr[Double] = js.undefined
  var client_is_priority_speaker: js.UndefOr[Double] = js.undefined
  var client_is_recording: js.UndefOr[Double] = js.undefined
  var client_is_talker: js.UndefOr[Double] = js.undefined
  var client_lastconnected: js.UndefOr[Double] = js.undefined
  var client_nickname: js.UndefOr[String] = js.undefined
  var client_output_hardware: js.UndefOr[Double] = js.undefined
  var client_output_muted: js.UndefOr[Double] = js.undefined
  var client_platform: js.UndefOr[String] = js.undefined
  var client_servergroups: js.UndefOr[js.Array[Double]] = js.undefined
  var client_talk_power: js.UndefOr[Double] = js.undefined
  var client_type: js.UndefOr[Double] = js.undefined
  var client_unique_identifier: js.UndefOr[String] = js.undefined
  var client_version: js.UndefOr[String] = js.undefined
  var connection_client_ip: js.UndefOr[String] = js.undefined
}

object PartialClientList {
  @scala.inline
  def apply(
    cid: Int | Double = null,
    clid: Int | Double = null,
    client_away: Int | Double = null,
    client_away_message: String = null,
    client_badges: String = null,
    client_channel_group_id: Int | Double = null,
    client_channel_group_inherited_channel_id: Int | Double = null,
    client_country: String = null,
    client_created: Int | Double = null,
    client_database_id: Int | Double = null,
    client_flag_talking: Int | Double = null,
    client_idle_time: Int | Double = null,
    client_input_hardware: Int | Double = null,
    client_input_muted: Int | Double = null,
    client_is_channel_commander: Int | Double = null,
    client_is_priority_speaker: Int | Double = null,
    client_is_recording: Int | Double = null,
    client_is_talker: Int | Double = null,
    client_lastconnected: Int | Double = null,
    client_nickname: String = null,
    client_output_hardware: Int | Double = null,
    client_output_muted: Int | Double = null,
    client_platform: String = null,
    client_servergroups: js.Array[Double] = null,
    client_talk_power: Int | Double = null,
    client_type: Int | Double = null,
    client_unique_identifier: String = null,
    client_version: String = null,
    connection_client_ip: String = null
  ): PartialClientList = {
    val __obj = js.Dynamic.literal()
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (clid != null) __obj.updateDynamic("clid")(clid.asInstanceOf[js.Any])
    if (client_away != null) __obj.updateDynamic("client_away")(client_away.asInstanceOf[js.Any])
    if (client_away_message != null) __obj.updateDynamic("client_away_message")(client_away_message.asInstanceOf[js.Any])
    if (client_badges != null) __obj.updateDynamic("client_badges")(client_badges.asInstanceOf[js.Any])
    if (client_channel_group_id != null) __obj.updateDynamic("client_channel_group_id")(client_channel_group_id.asInstanceOf[js.Any])
    if (client_channel_group_inherited_channel_id != null) __obj.updateDynamic("client_channel_group_inherited_channel_id")(client_channel_group_inherited_channel_id.asInstanceOf[js.Any])
    if (client_country != null) __obj.updateDynamic("client_country")(client_country.asInstanceOf[js.Any])
    if (client_created != null) __obj.updateDynamic("client_created")(client_created.asInstanceOf[js.Any])
    if (client_database_id != null) __obj.updateDynamic("client_database_id")(client_database_id.asInstanceOf[js.Any])
    if (client_flag_talking != null) __obj.updateDynamic("client_flag_talking")(client_flag_talking.asInstanceOf[js.Any])
    if (client_idle_time != null) __obj.updateDynamic("client_idle_time")(client_idle_time.asInstanceOf[js.Any])
    if (client_input_hardware != null) __obj.updateDynamic("client_input_hardware")(client_input_hardware.asInstanceOf[js.Any])
    if (client_input_muted != null) __obj.updateDynamic("client_input_muted")(client_input_muted.asInstanceOf[js.Any])
    if (client_is_channel_commander != null) __obj.updateDynamic("client_is_channel_commander")(client_is_channel_commander.asInstanceOf[js.Any])
    if (client_is_priority_speaker != null) __obj.updateDynamic("client_is_priority_speaker")(client_is_priority_speaker.asInstanceOf[js.Any])
    if (client_is_recording != null) __obj.updateDynamic("client_is_recording")(client_is_recording.asInstanceOf[js.Any])
    if (client_is_talker != null) __obj.updateDynamic("client_is_talker")(client_is_talker.asInstanceOf[js.Any])
    if (client_lastconnected != null) __obj.updateDynamic("client_lastconnected")(client_lastconnected.asInstanceOf[js.Any])
    if (client_nickname != null) __obj.updateDynamic("client_nickname")(client_nickname.asInstanceOf[js.Any])
    if (client_output_hardware != null) __obj.updateDynamic("client_output_hardware")(client_output_hardware.asInstanceOf[js.Any])
    if (client_output_muted != null) __obj.updateDynamic("client_output_muted")(client_output_muted.asInstanceOf[js.Any])
    if (client_platform != null) __obj.updateDynamic("client_platform")(client_platform.asInstanceOf[js.Any])
    if (client_servergroups != null) __obj.updateDynamic("client_servergroups")(client_servergroups.asInstanceOf[js.Any])
    if (client_talk_power != null) __obj.updateDynamic("client_talk_power")(client_talk_power.asInstanceOf[js.Any])
    if (client_type != null) __obj.updateDynamic("client_type")(client_type.asInstanceOf[js.Any])
    if (client_unique_identifier != null) __obj.updateDynamic("client_unique_identifier")(client_unique_identifier.asInstanceOf[js.Any])
    if (client_version != null) __obj.updateDynamic("client_version")(client_version.asInstanceOf[js.Any])
    if (connection_client_ip != null) __obj.updateDynamic("connection_client_ip")(connection_client_ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientList]
  }
}

