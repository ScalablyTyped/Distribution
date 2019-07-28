package typings.titanium

import typings.titanium.TitaniumNs.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeString>.
  */
trait EncodeStringDict extends js.Object {
  /**
  	 * Character encoding to use when encoding this string to bytes.
  	 */
  var charset: js.UndefOr[String] = js.undefined
  /**
  	 * Destination buffer.
  	 */
  var dest: Buffer
  /**
  	 * Index in the `dest` buffer of the first byte of the encoded string.
  	 */
  var destPosition: js.UndefOr[Double] = js.undefined
  /**
  	 * Source string to encode.
  	 */
  var source: String
  /**
  	 * Number of characters in `source` to encode.
  	 */
  var sourceLength: js.UndefOr[Double] = js.undefined
  /**
  	 * Position in `source` to start encoding.
  	 */
  var sourcePosition: js.UndefOr[Double] = js.undefined
}

object EncodeStringDict {
  @scala.inline
  def apply(
    dest: Buffer,
    source: String,
    charset: String = null,
    destPosition: Int | Double = null,
    sourceLength: Int | Double = null,
    sourcePosition: Int | Double = null
  ): EncodeStringDict = {
    val __obj = js.Dynamic.literal(dest = dest, source = source)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (destPosition != null) __obj.updateDynamic("destPosition")(destPosition.asInstanceOf[js.Any])
    if (sourceLength != null) __obj.updateDynamic("sourceLength")(sourceLength.asInstanceOf[js.Any])
    if (sourcePosition != null) __obj.updateDynamic("sourcePosition")(sourcePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeStringDict]
  }
}

