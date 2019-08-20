package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEdit extends js.Object {
  var channel_codec: js.UndefOr[Codec] = js.undefined
  var channel_codec_is_unencrypted: js.UndefOr[Double] = js.undefined
  var channel_codec_quality: js.UndefOr[Double] = js.undefined
  var channel_cpid: js.UndefOr[Double] = js.undefined
  var channel_description: js.UndefOr[String] = js.undefined
  var channel_flag_default: js.UndefOr[Double] = js.undefined
  var channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.undefined
  var channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.undefined
  var channel_flag_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_temporary: js.UndefOr[Double] = js.undefined
  var channel_maxclients: js.UndefOr[Double] = js.undefined
  var channel_maxfamilyclients: js.UndefOr[Double] = js.undefined
  var channel_name: js.UndefOr[String] = js.undefined
  var channel_name_phonetic: js.UndefOr[String] = js.undefined
  var channel_needed_talk_power: js.UndefOr[Double] = js.undefined
  var channel_order: js.UndefOr[Double] = js.undefined
  var channel_topic: js.UndefOr[String] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
}

object ChannelEdit {
  @scala.inline
  def apply(
    channel_codec: Codec = null,
    channel_codec_is_unencrypted: Int | Double = null,
    channel_codec_quality: Int | Double = null,
    channel_cpid: Int | Double = null,
    channel_description: String = null,
    channel_flag_default: Int | Double = null,
    channel_flag_maxclients_unlimited: Int | Double = null,
    channel_flag_maxfamilyclients_inherited: Int | Double = null,
    channel_flag_permanent: Int | Double = null,
    channel_flag_semi_permanent: Int | Double = null,
    channel_flag_temporary: Int | Double = null,
    channel_maxclients: Int | Double = null,
    channel_maxfamilyclients: Int | Double = null,
    channel_name: String = null,
    channel_name_phonetic: String = null,
    channel_needed_talk_power: Int | Double = null,
    channel_order: Int | Double = null,
    channel_topic: String = null,
    cid: Int | Double = null
  ): ChannelEdit = {
    val __obj = js.Dynamic.literal()
    if (channel_codec != null) __obj.updateDynamic("channel_codec")(channel_codec)
    if (channel_codec_is_unencrypted != null) __obj.updateDynamic("channel_codec_is_unencrypted")(channel_codec_is_unencrypted.asInstanceOf[js.Any])
    if (channel_codec_quality != null) __obj.updateDynamic("channel_codec_quality")(channel_codec_quality.asInstanceOf[js.Any])
    if (channel_cpid != null) __obj.updateDynamic("channel_cpid")(channel_cpid.asInstanceOf[js.Any])
    if (channel_description != null) __obj.updateDynamic("channel_description")(channel_description)
    if (channel_flag_default != null) __obj.updateDynamic("channel_flag_default")(channel_flag_default.asInstanceOf[js.Any])
    if (channel_flag_maxclients_unlimited != null) __obj.updateDynamic("channel_flag_maxclients_unlimited")(channel_flag_maxclients_unlimited.asInstanceOf[js.Any])
    if (channel_flag_maxfamilyclients_inherited != null) __obj.updateDynamic("channel_flag_maxfamilyclients_inherited")(channel_flag_maxfamilyclients_inherited.asInstanceOf[js.Any])
    if (channel_flag_permanent != null) __obj.updateDynamic("channel_flag_permanent")(channel_flag_permanent.asInstanceOf[js.Any])
    if (channel_flag_semi_permanent != null) __obj.updateDynamic("channel_flag_semi_permanent")(channel_flag_semi_permanent.asInstanceOf[js.Any])
    if (channel_flag_temporary != null) __obj.updateDynamic("channel_flag_temporary")(channel_flag_temporary.asInstanceOf[js.Any])
    if (channel_maxclients != null) __obj.updateDynamic("channel_maxclients")(channel_maxclients.asInstanceOf[js.Any])
    if (channel_maxfamilyclients != null) __obj.updateDynamic("channel_maxfamilyclients")(channel_maxfamilyclients.asInstanceOf[js.Any])
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name)
    if (channel_name_phonetic != null) __obj.updateDynamic("channel_name_phonetic")(channel_name_phonetic)
    if (channel_needed_talk_power != null) __obj.updateDynamic("channel_needed_talk_power")(channel_needed_talk_power.asInstanceOf[js.Any])
    if (channel_order != null) __obj.updateDynamic("channel_order")(channel_order.asInstanceOf[js.Any])
    if (channel_topic != null) __obj.updateDynamic("channel_topic")(channel_topic)
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEdit]
  }
}

