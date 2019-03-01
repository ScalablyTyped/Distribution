package typings
package titaniumLib

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
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Index in the `source` buffer of the first byte of data to decode.
  	 */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Buffer to decode.
  	 */
  var source: titaniumLib.TitaniumNs.Buffer
}

object DecodeStringDict {
  @scala.inline
  def apply(
    source: titaniumLib.TitaniumNs.Buffer,
    charset: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null
  ): DecodeStringDict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeStringDict]
  }
}

