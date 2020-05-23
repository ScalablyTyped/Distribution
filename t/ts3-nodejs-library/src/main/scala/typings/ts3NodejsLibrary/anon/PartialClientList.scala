package typings.ts3NodejsLibrary.anon

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
    cid: js.UndefOr[Double] = js.undefined,
    clid: js.UndefOr[Double] = js.undefined,
    client_away: js.UndefOr[Double] = js.undefined,
    client_away_message: String = null,
    client_badges: String = null,
    client_channel_group_id: js.UndefOr[Double] = js.undefined,
    client_channel_group_inherited_channel_id: js.UndefOr[Double] = js.undefined,
    client_country: String = null,
    client_created: js.UndefOr[Double] = js.undefined,
    client_database_id: js.UndefOr[Double] = js.undefined,
    client_flag_talking: js.UndefOr[Double] = js.undefined,
    client_idle_time: js.UndefOr[Double] = js.undefined,
    client_input_hardware: js.UndefOr[Double] = js.undefined,
    client_input_muted: js.UndefOr[Double] = js.undefined,
    client_is_channel_commander: js.UndefOr[Double] = js.undefined,
    client_is_priority_speaker: js.UndefOr[Double] = js.undefined,
    client_is_recording: js.UndefOr[Double] = js.undefined,
    client_is_talker: js.UndefOr[Double] = js.undefined,
    client_lastconnected: js.UndefOr[Double] = js.undefined,
    client_nickname: String = null,
    client_output_hardware: js.UndefOr[Double] = js.undefined,
    client_output_muted: js.UndefOr[Double] = js.undefined,
    client_platform: String = null,
    client_servergroups: js.Array[Double] = null,
    client_talk_power: js.UndefOr[Double] = js.undefined,
    client_type: js.UndefOr[Double] = js.undefined,
    client_unique_identifier: String = null,
    client_version: String = null,
    connection_client_ip: String = null
  ): PartialClientList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clid)) __obj.updateDynamic("clid")(clid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_away)) __obj.updateDynamic("client_away")(client_away.get.asInstanceOf[js.Any])
    if (client_away_message != null) __obj.updateDynamic("client_away_message")(client_away_message.asInstanceOf[js.Any])
    if (client_badges != null) __obj.updateDynamic("client_badges")(client_badges.asInstanceOf[js.Any])
    if (!js.isUndefined(client_channel_group_id)) __obj.updateDynamic("client_channel_group_id")(client_channel_group_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_channel_group_inherited_channel_id)) __obj.updateDynamic("client_channel_group_inherited_channel_id")(client_channel_group_inherited_channel_id.get.asInstanceOf[js.Any])
    if (client_country != null) __obj.updateDynamic("client_country")(client_country.asInstanceOf[js.Any])
    if (!js.isUndefined(client_created)) __obj.updateDynamic("client_created")(client_created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_database_id)) __obj.updateDynamic("client_database_id")(client_database_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_flag_talking)) __obj.updateDynamic("client_flag_talking")(client_flag_talking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_idle_time)) __obj.updateDynamic("client_idle_time")(client_idle_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_input_hardware)) __obj.updateDynamic("client_input_hardware")(client_input_hardware.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_input_muted)) __obj.updateDynamic("client_input_muted")(client_input_muted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_channel_commander)) __obj.updateDynamic("client_is_channel_commander")(client_is_channel_commander.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_priority_speaker)) __obj.updateDynamic("client_is_priority_speaker")(client_is_priority_speaker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_recording)) __obj.updateDynamic("client_is_recording")(client_is_recording.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_is_talker)) __obj.updateDynamic("client_is_talker")(client_is_talker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_lastconnected)) __obj.updateDynamic("client_lastconnected")(client_lastconnected.get.asInstanceOf[js.Any])
    if (client_nickname != null) __obj.updateDynamic("client_nickname")(client_nickname.asInstanceOf[js.Any])
    if (!js.isUndefined(client_output_hardware)) __obj.updateDynamic("client_output_hardware")(client_output_hardware.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_output_muted)) __obj.updateDynamic("client_output_muted")(client_output_muted.get.asInstanceOf[js.Any])
    if (client_platform != null) __obj.updateDynamic("client_platform")(client_platform.asInstanceOf[js.Any])
    if (client_servergroups != null) __obj.updateDynamic("client_servergroups")(client_servergroups.asInstanceOf[js.Any])
    if (!js.isUndefined(client_talk_power)) __obj.updateDynamic("client_talk_power")(client_talk_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(client_type)) __obj.updateDynamic("client_type")(client_type.get.asInstanceOf[js.Any])
    if (client_unique_identifier != null) __obj.updateDynamic("client_unique_identifier")(client_unique_identifier.asInstanceOf[js.Any])
    if (client_version != null) __obj.updateDynamic("client_version")(client_version.asInstanceOf[js.Any])
    if (connection_client_ip != null) __obj.updateDynamic("connection_client_ip")(connection_client_ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientList]
  }
}

