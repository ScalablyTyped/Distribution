package typings.titanium

import typings.titanium.TitaniumNs.Buffer
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
  var byteOrder: js.UndefOr[Double] = js.undefined
  /**
  	 * Destination buffer.
  	 */
  var dest: Buffer
  /**
  	 * Index in the `dest` buffer of the first byte of encoded data.
  	 */
  var position: js.UndefOr[Double] = js.undefined
  /**
  	 * Number to encode.
  	 */
  var source: Double
  /**
  	 * Encoding type to use.
  	 */
  var `type`: String
}

object EncodeNumberDict {
  @scala.inline
  def apply(
    dest: Buffer,
    source: Double,
    `type`: String,
    byteOrder: Int | Double = null,
    position: Int | Double = null
  ): EncodeNumberDict = {
    val __obj = js.Dynamic.literal(dest = dest, source = source)
    __obj.updateDynamic("type")(`type`)
    if (byteOrder != null) __obj.updateDynamic("byteOrder")(byteOrder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeNumberDict]
  }
}

