package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTInitUpload extends js.Object {
  var clientftfid: Double
  /** exists when file is uploadable */
  var ftkey: js.UndefOr[String] = js.undefined
  /** exists when an error occured */
  var msg: js.UndefOr[String] = js.undefined
  /** exists when file is uploadable */
  var port: js.UndefOr[Double] = js.undefined
  /** exists when file is uploadable */
  var proto: js.UndefOr[Double] = js.undefined
  /** exists when file is uploadable */
  var seekpos: js.UndefOr[Double] = js.undefined
  /** exists when file is uploadable */
  var serverftfid: js.UndefOr[Double] = js.undefined
  /** exists when an error occured */
  var size: js.UndefOr[Double] = js.undefined
  /** exists when an error occured */
  var status: js.UndefOr[Double] = js.undefined
}

object FTInitUpload {
  @scala.inline
  def apply(
    clientftfid: Double,
    ftkey: String = null,
    msg: String = null,
    port: js.UndefOr[Double] = js.undefined,
    proto: js.UndefOr[Double] = js.undefined,
    seekpos: js.UndefOr[Double] = js.undefined,
    serverftfid: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    status: js.UndefOr[Double] = js.undefined
  ): FTInitUpload = {
    val __obj = js.Dynamic.literal(clientftfid = clientftfid.asInstanceOf[js.Any])
    if (ftkey != null) __obj.updateDynamic("ftkey")(ftkey.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(proto)) __obj.updateDynamic("proto")(proto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seekpos)) __obj.updateDynamic("seekpos")(seekpos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverftfid)) __obj.updateDynamic("serverftfid")(serverftfid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTInitUpload]
  }
}

