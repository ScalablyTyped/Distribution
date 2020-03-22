package typings.strtok3.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReadChunkOptions extends js.Object {
  /**
    * Number of bytes to read.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * If set, will not throw an EOF error if not all of the requested data could be read
    */
  var mayBeLess: js.UndefOr[Boolean] = js.undefined
  /**
    * The offset in the buffer to start writing at; default is 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Position where to begin reading from the file.
    * Default it is `tokenizer.position`.
    * Position may not be less then `tokenizer.position`.
    */
  var position: js.UndefOr[Double] = js.undefined
}

object IReadChunkOptions {
  @scala.inline
  def apply(
    length: Int | Double = null,
    mayBeLess: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    position: Int | Double = null
  ): IReadChunkOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(mayBeLess)) __obj.updateDynamic("mayBeLess")(mayBeLess.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReadChunkOptions]
  }
}

