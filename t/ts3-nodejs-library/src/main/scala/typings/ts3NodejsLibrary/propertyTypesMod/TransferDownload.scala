package typings.ts3NodejsLibrary.propertyTypesMod

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
    cid: js.UndefOr[Double] = js.undefined,
    clientftfid: js.UndefOr[Double] = js.undefined,
    cpw: String = null,
    seekpos: js.UndefOr[Double] = js.undefined
  ): TransferDownload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientftfid)) __obj.updateDynamic("clientftfid")(clientftfid.get.asInstanceOf[js.Any])
    if (cpw != null) __obj.updateDynamic("cpw")(cpw.asInstanceOf[js.Any])
    if (!js.isUndefined(seekpos)) __obj.updateDynamic("seekpos")(seekpos.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDownload]
  }
}

