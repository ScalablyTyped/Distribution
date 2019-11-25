package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferDownload extends js.Object {
  /** channel id to upload to */
  var cid: js.UndefOr[Double] = js.undefined
  /** arbitary id to identify the transfer */
  var clientftfid: js.UndefOr[Double] = js.undefined
  /** channel password of the channel which will be uploaded to */
  var cpw: js.UndefOr[String] = js.undefined
  /** destination filename */
  var name: String
  var seekpos: js.UndefOr[Double] = js.undefined
}

object TransferDownload {
  @scala.inline
  def apply(
    name: String,
    cid: Int | Double = null,
    clientftfid: Int | Double = null,
    cpw: String = null,
    seekpos: Int | Double = null
  ): TransferDownload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (clientftfid != null) __obj.updateDynamic("clientftfid")(clientftfid.asInstanceOf[js.Any])
    if (cpw != null) __obj.updateDynamic("cpw")(cpw.asInstanceOf[js.Any])
    if (seekpos != null) __obj.updateDynamic("seekpos")(seekpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDownload]
  }
}

