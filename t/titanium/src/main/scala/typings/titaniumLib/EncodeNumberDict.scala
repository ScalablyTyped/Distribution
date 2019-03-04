package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeNumber>.
  */
trait EncodeNumberDict extends js.Object {
  /**
  	 * Byte order to encode with.
  	 */
  var byteOrder: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Destination buffer.
  	 */
  var dest: titaniumLib.TitaniumNs.Buffer
  /**
  	 * Index in the `dest` buffer of the first byte of encoded data.
  	 */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Number to encode.
  	 */
  var source: scala.Double
  /**
  	 * Encoding type to use.
  	 */
  var `type`: java.lang.String
}

object EncodeNumberDict {
  @scala.inline
  def apply(
    dest: titaniumLib.TitaniumNs.Buffer,
    source: scala.Double,
    `type`: java.lang.String,
    byteOrder: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null
  ): EncodeNumberDict = {
    val __obj = js.Dynamic.literal(dest = dest, source = source)
    __obj.updateDynamic("type")(`type`)
    if (byteOrder != null) __obj.updateDynamic("byteOrder")(byteOrder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeNumberDict]
  }
}

