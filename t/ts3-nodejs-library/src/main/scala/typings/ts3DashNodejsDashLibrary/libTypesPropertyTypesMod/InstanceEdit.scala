package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEdit extends js.Object {
  var serverinstance_filetransfer_port: js.UndefOr[Double] = js.undefined
  var serverinstance_max_download_total_bandwidth: js.UndefOr[Double] = js.undefined
  var serverinstance_max_upload_total_bandwidth: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_flood_ban_time: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_flood_commands: js.UndefOr[Double] = js.undefined
  var serverinstance_serverquery_flood_time: js.UndefOr[Double] = js.undefined
  var serverinstance_template_channeladmin_group: js.UndefOr[Double] = js.undefined
  var serverinstance_template_channeldefault_group: js.UndefOr[Double] = js.undefined
  var serverinstance_template_serveradmin_group: js.UndefOr[Double] = js.undefined
  var serverinstance_template_serverdefault_group: js.UndefOr[Double] = js.undefined
}

object InstanceEdit {
  @scala.inline
  def apply(
    serverinstance_filetransfer_port: Int | Double = null,
    serverinstance_max_download_total_bandwidth: Int | Double = null,
    serverinstance_max_upload_total_bandwidth: Int | Double = null,
    serverinstance_serverquery_flood_ban_time: Int | Double = null,
    serverinstance_serverquery_flood_commands: Int | Double = null,
    serverinstance_serverquery_flood_time: Int | Double = null,
    serverinstance_template_channeladmin_group: Int | Double = null,
    serverinstance_template_channeldefault_group: Int | Double = null,
    serverinstance_template_serveradmin_group: Int | Double = null,
    serverinstance_template_serverdefault_group: Int | Double = null
  ): InstanceEdit = {
    val __obj = js.Dynamic.literal()
    if (serverinstance_filetransfer_port != null) __obj.updateDynamic("serverinstance_filetransfer_port")(serverinstance_filetransfer_port.asInstanceOf[js.Any])
    if (serverinstance_max_download_total_bandwidth != null) __obj.updateDynamic("serverinstance_max_download_total_bandwidth")(serverinstance_max_download_total_bandwidth.asInstanceOf[js.Any])
    if (serverinstance_max_upload_total_bandwidth != null) __obj.updateDynamic("serverinstance_max_upload_total_bandwidth")(serverinstance_max_upload_total_bandwidth.asInstanceOf[js.Any])
    if (serverinstance_serverquery_flood_ban_time != null) __obj.updateDynamic("serverinstance_serverquery_flood_ban_time")(serverinstance_serverquery_flood_ban_time.asInstanceOf[js.Any])
    if (serverinstance_serverquery_flood_commands != null) __obj.updateDynamic("serverinstance_serverquery_flood_commands")(serverinstance_serverquery_flood_commands.asInstanceOf[js.Any])
    if (serverinstance_serverquery_flood_time != null) __obj.updateDynamic("serverinstance_serverquery_flood_time")(serverinstance_serverquery_flood_time.asInstanceOf[js.Any])
    if (serverinstance_template_channeladmin_group != null) __obj.updateDynamic("serverinstance_template_channeladmin_group")(serverinstance_template_channeladmin_group.asInstanceOf[js.Any])
    if (serverinstance_template_channeldefault_group != null) __obj.updateDynamic("serverinstance_template_channeldefault_group")(serverinstance_template_channeldefault_group.asInstanceOf[js.Any])
    if (serverinstance_template_serveradmin_group != null) __obj.updateDynamic("serverinstance_template_serveradmin_group")(serverinstance_template_serveradmin_group.asInstanceOf[js.Any])
    if (serverinstance_template_serverdefault_group != null) __obj.updateDynamic("serverinstance_template_serverdefault_group")(serverinstance_template_serverdefault_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEdit]
  }
}

