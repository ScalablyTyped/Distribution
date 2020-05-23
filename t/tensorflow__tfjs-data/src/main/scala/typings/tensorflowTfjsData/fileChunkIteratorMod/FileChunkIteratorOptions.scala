package typings.tensorflowTfjsData.fileChunkIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChunkIteratorOptions extends js.Object {
  /** The number of bytes to read at a time. Default 1MB. */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /** The byte offset at which to begin reading the File or Blob. Default 0. */
  var offset: js.UndefOr[Double] = js.undefined
}

object FileChunkIteratorOptions {
  @scala.inline
  def apply(chunkSize: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined): FileChunkIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChunkIteratorOptions]
  }
}

