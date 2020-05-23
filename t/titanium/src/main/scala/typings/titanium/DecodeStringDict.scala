package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.decodeString>.
  */
trait DecodeStringDict extends js.Object {
  /**
    * Character set to use when encoding this string to bytes.
    */
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of bytes to decode.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Index in the `source` buffer of the first byte of data to decode.
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * Buffer to decode.
    */
  var source: Buffer
}

object DecodeStringDict {
  @scala.inline
  def apply(
    source: Buffer,
    charset: java.lang.String = null,
    length: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined
  ): DecodeStringDict = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeStringDict]
  }
}

