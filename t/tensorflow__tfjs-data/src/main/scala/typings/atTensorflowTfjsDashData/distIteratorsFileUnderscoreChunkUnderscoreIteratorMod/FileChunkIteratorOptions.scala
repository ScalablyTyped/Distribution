package typings.atTensorflowTfjsDashData.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod

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
  def apply(chunkSize: Int | Double = null, offset: Int | Double = null): FileChunkIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChunkIteratorOptions]
  }
}

