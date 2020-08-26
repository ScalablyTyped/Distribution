package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments to be passed to createBuffer
  */
@js.native
trait CreateBufferArgs extends js.Object {
  /**
    * The byte order of this buffer.
    */
  var byteOrder: js.UndefOr[Double] = js.native
  /**
    * The length of the buffer.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The type of data encoding to use with `value`.
    */
  var `type`: js.UndefOr[java.lang.String] = js.native
  /**
    * An initial value which will be encoded and placed in the buffer. If value is a Number, type must also be set. (this is simply a convenient way of calling <Titanium.Codec.encodeString> or <Titanium.Codec.encodeNumber> and placing the encoded value in the returned buffer.)
    */
  var value: js.UndefOr[java.lang.String | Double] = js.native
}

object CreateBufferArgs {
  @scala.inline
  def apply(): CreateBufferArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBufferArgs]
  }
  @scala.inline
  implicit class CreateBufferArgsOps[Self <: CreateBufferArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setByteOrder(value: Double): Self = this.set("byteOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteOrder: Self = this.set("byteOrder", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: java.lang.String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

