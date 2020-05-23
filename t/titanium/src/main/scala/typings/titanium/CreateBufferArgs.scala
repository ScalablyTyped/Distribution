package typings.titanium

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
  var byteOrder: js.UndefOr[Double] = js.undefined
  /**
    * The length of the buffer.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The type of data encoding to use with `value`.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An initial value which will be encoded and placed in the buffer. If value is a Number, type must also be set. (this is simply a convenient way of calling <Titanium.Codec.encodeString> or <Titanium.Codec.encodeNumber> and placing the encoded value in the returned buffer.)
    */
  var value: js.UndefOr[java.lang.String | Double] = js.undefined
}

object CreateBufferArgs {
  @scala.inline
  def apply(
    byteOrder: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    `type`: java.lang.String = null,
    value: java.lang.String | Double = null
  ): CreateBufferArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byteOrder)) __obj.updateDynamic("byteOrder")(byteOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBufferArgs]
  }
}

