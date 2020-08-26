package typings.xmlcreate.xmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlCharRefOptions extends js.Object {
  /**
    * The character to represent using the reference.
    */
  var char: String = js.native
  /**
    * Whether to use the hexadecimal or decimal representation for the
    * reference. Defaults to false.
    */
  var hex: js.UndefOr[Boolean] = js.native
}

object IXmlCharRefOptions {
  @scala.inline
  def apply(char: String): IXmlCharRefOptions = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlCharRefOptions]
  }
  @scala.inline
  implicit class IXmlCharRefOptionsOps[Self <: IXmlCharRefOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: Boolean): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHex: Self = this.set("hex", js.undefined)
  }
  
}

