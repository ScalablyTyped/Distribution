package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.decodeString>.
  */
@js.native
trait DecodeStringDict extends js.Object {
  /**
    * Character set to use when encoding this string to bytes.
    */
  var charset: js.UndefOr[java.lang.String] = js.native
  /**
    * Number of bytes to decode.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Index in the `source` buffer of the first byte of data to decode.
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * Buffer to decode.
    */
  var source: Buffer = js.native
}

object DecodeStringDict {
  @scala.inline
  def apply(source: Buffer): DecodeStringDict = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeStringDict]
  }
  @scala.inline
  implicit class DecodeStringDictOps[Self <: DecodeStringDict] (val x: Self) extends AnyVal {
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
    def setSource(value: Buffer): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharset(value: java.lang.String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

