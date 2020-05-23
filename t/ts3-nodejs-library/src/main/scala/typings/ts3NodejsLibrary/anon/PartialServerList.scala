package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerList> */
trait PartialServerList extends js.Object {
  var virtualserver_autostart: js.UndefOr[Double] = js.undefined
  var virtualserver_clientsonline: js.UndefOr[Double] = js.undefined
  var virtualserver_id: js.UndefOr[Double] = js.undefined
  var virtualserver_machine_id: js.UndefOr[String] = js.undefined
  var virtualserver_maxclients: js.UndefOr[Double] = js.undefined
  var virtualserver_name: js.UndefOr[String] = js.undefined
  var virtualserver_port: js.UndefOr[Double] = js.undefined
  var virtualserver_queryclientsonline: js.UndefOr[Double] = js.undefined
  var virtualserver_status: js.UndefOr[String] = js.undefined
  var virtualserver_unique_identifier: js.UndefOr[String] = js.undefined
  var virtualserver_uptime: js.UndefOr[Double] = js.undefined
}

object PartialServerList {
  @scala.inline
  def apply(
    virtualserver_autostart: js.UndefOr[Double] = js.undefined,
    virtualserver_clientsonline: js.UndefOr[Double] = js.undefined,
    virtualserver_id: js.UndefOr[Double] = js.undefined,
    virtualserver_machine_id: String = null,
    virtualserver_maxclients: js.UndefOr[Double] = js.undefined,
    virtualserver_name: String = null,
    virtualserver_port: js.UndefOr[Double] = js.undefined,
    virtualserver_queryclientsonline: js.UndefOr[Double] = js.undefined,
    virtualserver_status: String = null,
    virtualserver_unique_identifier: String = null,
    virtualserver_uptime: js.UndefOr[Double] = js.undefined
  ): PartialServerList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(virtualserver_autostart)) __obj.updateDynamic("virtualserver_autostart")(virtualserver_autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_clientsonline)) __obj.updateDynamic("virtualserver_clientsonline")(virtualserver_clientsonline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_id)) __obj.updateDynamic("virtualserver_id")(virtualserver_id.get.asInstanceOf[js.Any])
    if (virtualserver_machine_id != null) __obj.updateDynamic("virtualserver_machine_id")(virtualserver_machine_id.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_maxclients)) __obj.updateDynamic("virtualserver_maxclients")(virtualserver_maxclients.get.asInstanceOf[js.Any])
    if (virtualserver_name != null) __obj.updateDynamic("virtualserver_name")(virtualserver_name.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_port)) __obj.updateDynamic("virtualserver_port")(virtualserver_port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_queryclientsonline)) __obj.updateDynamic("virtualserver_queryclientsonline")(virtualserver_queryclientsonline.get.asInstanceOf[js.Any])
    if (virtualserver_status != null) __obj.updateDynamic("virtualserver_status")(virtualserver_status.asInstanceOf[js.Any])
    if (virtualserver_unique_identifier != null) __obj.updateDynamic("virtualserver_unique_identifier")(virtualserver_unique_identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualserver_uptime)) __obj.updateDynamic("virtualserver_uptime")(virtualserver_uptime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialServerList]
  }
}

