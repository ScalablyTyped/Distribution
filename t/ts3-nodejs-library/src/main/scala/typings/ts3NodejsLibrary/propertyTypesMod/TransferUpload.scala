package typings.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferUpload extends js.Object {
  /** channel id to upload to */
  var cid: js.UndefOr[Double] = js.undefined
  /** arbitary id to identify the transfer */
  var clientftfid: js.UndefOr[Double] = js.undefined
  /** channel password of the channel which will be uploaded to */
  var cpw: js.UndefOr[String] = js.undefined
  /** destination filename */
  var name: String
  /** overwrites an existing file */
  var overwrite: js.UndefOr[Double] = js.undefined
  var resume: js.UndefOr[Double] = js.undefined
  /** size of the file */
  var size: Double
}

object TransferUpload {
  @scala.inline
  def apply(
    name: String,
    size: Double,
    cid: js.UndefOr[Double] = js.undefined,
    clientftfid: js.UndefOr[Double] = js.undefined,
    cpw: String = null,
    overwrite: js.UndefOr[Double] = js.undefined,
    resume: js.UndefOr[Double] = js.undefined
  ): TransferUpload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientftfid)) __obj.updateDynamic("clientftfid")(clientftfid.get.asInstanceOf[js.Any])
    if (cpw != null) __obj.updateDynamic("cpw")(cpw.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferUpload]
  }
}

