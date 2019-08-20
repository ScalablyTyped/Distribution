package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelList extends js.Object {
  var channel_codec: Double
  var channel_codec_quality: Double
  var channel_flag_default: Double
  var channel_flag_password: Double
  var channel_flag_permanent: Double
  var channel_flag_semi_permanent: Double
  var channel_icon_id: Double
  var channel_maxclients: Double
  var channel_maxfamilyclients: Double
  var channel_name: String
  var channel_needed_subscribe_power: Double
  var channel_needed_talk_power: Double
  var channel_order: Double
  var channel_topic: String
  var cid: Double
  var pid: Double
  var seconds_empty: Double
  var total_clients: Double
  var total_clients_family: Double
}

object ChannelList {
  @scala.inline
  def apply(
    channel_codec: Double,
    channel_codec_quality: Double,
    channel_flag_default: Double,
    channel_flag_password: Double,
    channel_flag_permanent: Double,
    channel_flag_semi_permanent: Double,
    channel_icon_id: Double,
    channel_maxclients: Double,
    channel_maxfamilyclients: Double,
    channel_name: String,
    channel_needed_subscribe_power: Double,
    channel_needed_talk_power: Double,
    channel_order: Double,
    channel_topic: String,
    cid: Double,
    pid: Double,
    seconds_empty: Double,
    total_clients: Double,
    total_clients_family: Double
  ): ChannelList = {
    val __obj = js.Dynamic.literal(channel_codec = channel_codec, channel_codec_quality = channel_codec_quality, channel_flag_default = channel_flag_default, channel_flag_password = channel_flag_password, channel_flag_permanent = channel_flag_permanent, channel_flag_semi_permanent = channel_flag_semi_permanent, channel_icon_id = channel_icon_id, channel_maxclients = channel_maxclients, channel_maxfamilyclients = channel_maxfamilyclients, channel_name = channel_name, channel_needed_subscribe_power = channel_needed_subscribe_power, channel_needed_talk_power = channel_needed_talk_power, channel_order = channel_order, channel_topic = channel_topic, cid = cid, pid = pid, seconds_empty = seconds_empty, total_clients = total_clients, total_clients_family = total_clients_family)
  
    __obj.asInstanceOf[ChannelList]
  }
}

