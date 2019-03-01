package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments to be passed to createBuffer
  */
trait CreateBufferArgs extends js.Object {
  /**
  	 * The byte order of this buffer.
  	 */
  var byteOrder: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The length of the buffer.
  	 */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The type of data encoding to use with `value`.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An initial value which will be encoded and placed in the buffer. If value is a Number, type must also be set. (this is simply a convenient way of calling <Titanium.Codec.encodeString> or <Titanium.Codec.encodeNumber> and placing the encoded value in the returned buffer.)
  	 */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object CreateBufferArgs {
  @scala.inline
  def apply(
    byteOrder: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    value: java.lang.String | scala.Double = null
  ): CreateBufferArgs = {
    val __obj = js.Dynamic.literal()
    if (byteOrder != null) __obj.updateDynamic("byteOrder")(byteOrder.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBufferArgs]
  }
}

