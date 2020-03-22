package typings.ts3NodejsLibrary

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
    virtualserver_autostart: Int | Double = null,
    virtualserver_clientsonline: Int | Double = null,
    virtualserver_id: Int | Double = null,
    virtualserver_machine_id: String = null,
    virtualserver_maxclients: Int | Double = null,
    virtualserver_name: String = null,
    virtualserver_port: Int | Double = null,
    virtualserver_queryclientsonline: Int | Double = null,
    virtualserver_status: String = null,
    virtualserver_unique_identifier: String = null,
    virtualserver_uptime: Int | Double = null
  ): PartialServerList = {
    val __obj = js.Dynamic.literal()
    if (virtualserver_autostart != null) __obj.updateDynamic("virtualserver_autostart")(virtualserver_autostart.asInstanceOf[js.Any])
    if (virtualserver_clientsonline != null) __obj.updateDynamic("virtualserver_clientsonline")(virtualserver_clientsonline.asInstanceOf[js.Any])
    if (virtualserver_id != null) __obj.updateDynamic("virtualserver_id")(virtualserver_id.asInstanceOf[js.Any])
    if (virtualserver_machine_id != null) __obj.updateDynamic("virtualserver_machine_id")(virtualserver_machine_id.asInstanceOf[js.Any])
    if (virtualserver_maxclients != null) __obj.updateDynamic("virtualserver_maxclients")(virtualserver_maxclients.asInstanceOf[js.Any])
    if (virtualserver_name != null) __obj.updateDynamic("virtualserver_name")(virtualserver_name.asInstanceOf[js.Any])
    if (virtualserver_port != null) __obj.updateDynamic("virtualserver_port")(virtualserver_port.asInstanceOf[js.Any])
    if (virtualserver_queryclientsonline != null) __obj.updateDynamic("virtualserver_queryclientsonline")(virtualserver_queryclientsonline.asInstanceOf[js.Any])
    if (virtualserver_status != null) __obj.updateDynamic("virtualserver_status")(virtualserver_status.asInstanceOf[js.Any])
    if (virtualserver_unique_identifier != null) __obj.updateDynamic("virtualserver_unique_identifier")(virtualserver_unique_identifier.asInstanceOf[js.Any])
    if (virtualserver_uptime != null) __obj.updateDynamic("virtualserver_uptime")(virtualserver_uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialServerList]
  }
}

