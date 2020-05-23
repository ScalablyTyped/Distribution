package typings.ts3NodejsLibrary.propertyTypesMod

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
    serverinstance_filetransfer_port: js.UndefOr[Double] = js.undefined,
    serverinstance_max_download_total_bandwidth: js.UndefOr[Double] = js.undefined,
    serverinstance_max_upload_total_bandwidth: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_flood_ban_time: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_flood_commands: js.UndefOr[Double] = js.undefined,
    serverinstance_serverquery_flood_time: js.UndefOr[Double] = js.undefined,
    serverinstance_template_channeladmin_group: js.UndefOr[Double] = js.undefined,
    serverinstance_template_channeldefault_group: js.UndefOr[Double] = js.undefined,
    serverinstance_template_serveradmin_group: js.UndefOr[Double] = js.undefined,
    serverinstance_template_serverdefault_group: js.UndefOr[Double] = js.undefined
  ): InstanceEdit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(serverinstance_filetransfer_port)) __obj.updateDynamic("serverinstance_filetransfer_port")(serverinstance_filetransfer_port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_max_download_total_bandwidth)) __obj.updateDynamic("serverinstance_max_download_total_bandwidth")(serverinstance_max_download_total_bandwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_max_upload_total_bandwidth)) __obj.updateDynamic("serverinstance_max_upload_total_bandwidth")(serverinstance_max_upload_total_bandwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_flood_ban_time)) __obj.updateDynamic("serverinstance_serverquery_flood_ban_time")(serverinstance_serverquery_flood_ban_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_flood_commands)) __obj.updateDynamic("serverinstance_serverquery_flood_commands")(serverinstance_serverquery_flood_commands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_serverquery_flood_time)) __obj.updateDynamic("serverinstance_serverquery_flood_time")(serverinstance_serverquery_flood_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_channeladmin_group)) __obj.updateDynamic("serverinstance_template_channeladmin_group")(serverinstance_template_channeladmin_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_channeldefault_group)) __obj.updateDynamic("serverinstance_template_channeldefault_group")(serverinstance_template_channeldefault_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_serveradmin_group)) __obj.updateDynamic("serverinstance_template_serveradmin_group")(serverinstance_template_serveradmin_group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverinstance_template_serverdefault_group)) __obj.updateDynamic("serverinstance_template_serverdefault_group")(serverinstance_template_serverdefault_group.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEdit]
  }
}

