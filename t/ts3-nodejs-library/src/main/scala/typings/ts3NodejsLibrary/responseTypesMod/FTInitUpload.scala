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
    port: Int | Double = null,
    proto: Int | Double = null,
    seekpos: Int | Double = null,
    serverftfid: Int | Double = null,
    size: Int | Double = null,
    status: Int | Double = null
  ): FTInitUpload = {
    val __obj = js.Dynamic.literal(clientftfid = clientftfid.asInstanceOf[js.Any])
    if (ftkey != null) __obj.updateDynamic("ftkey")(ftkey.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    if (seekpos != null) __obj.updateDynamic("seekpos")(seekpos.asInstanceOf[js.Any])
    if (serverftfid != null) __obj.updateDynamic("serverftfid")(serverftfid.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTInitUpload]
  }
}

