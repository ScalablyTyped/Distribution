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
  var charset: js.UndefOr[String] = js.undefined
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
  def apply(source: Buffer, charset: String = null, length: Int | Double = null, position: Int | Double = null): DecodeStringDict = {
    val __obj = js.Dynamic.literal(source = source)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeStringDict]
  }
}

