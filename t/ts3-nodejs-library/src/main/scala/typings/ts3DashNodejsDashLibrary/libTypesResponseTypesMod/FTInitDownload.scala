package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTInitDownload extends js.Object {
  var clientftfid: Double
  /** exists when file is downloadable */
  var ftkey: js.UndefOr[String] = js.undefined
  /** exists when an error occured */
  var msg: js.UndefOr[String] = js.undefined
  /** exists when file is downloadable */
  var port: js.UndefOr[Double] = js.undefined
  /** exists when file is downloadable */
  var proto: js.UndefOr[Double] = js.undefined
  /** exists when file is downloadable */
  var serverftfid: js.UndefOr[Double] = js.undefined
  var size: Double
  /** exists when an error occured */
  var status: js.UndefOr[Double] = js.undefined
}

object FTInitDownload {
  @scala.inline
  def apply(
    clientftfid: Double,
    size: Double,
    ftkey: String = null,
    msg: String = null,
    port: Int | Double = null,
    proto: Int | Double = null,
    serverftfid: Int | Double = null,
    status: Int | Double = null
  ): FTInitDownload = {
    val __obj = js.Dynamic.literal(clientftfid = clientftfid, size = size)
    if (ftkey != null) __obj.updateDynamic("ftkey")(ftkey)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    if (serverftfid != null) __obj.updateDynamic("serverftfid")(serverftfid.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTInitDownload]
  }
}

