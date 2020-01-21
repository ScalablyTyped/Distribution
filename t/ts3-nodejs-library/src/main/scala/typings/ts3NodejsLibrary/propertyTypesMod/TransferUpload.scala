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
    cid: Int | Double = null,
    clientftfid: Int | Double = null,
    cpw: String = null,
    overwrite: Int | Double = null,
    resume: Int | Double = null
  ): TransferUpload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (clientftfid != null) __obj.updateDynamic("clientftfid")(clientftfid.asInstanceOf[js.Any])
    if (cpw != null) __obj.updateDynamic("cpw")(cpw.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferUpload]
  }
}

