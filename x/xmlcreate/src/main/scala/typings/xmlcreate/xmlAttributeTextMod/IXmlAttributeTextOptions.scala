package typings.xmlcreate.xmlAttributeTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlAttributeTextOptions extends js.Object {
  /**
    * The attribute text.
    */
  var charData: String = js.native
  /**
    * Whether to replace any invalid characters in the attribute text with the
    * Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
}

object IXmlAttributeTextOptions {
  @scala.inline
  def apply(charData: String): IXmlAttributeTextOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlAttributeTextOptions]
  }
  @scala.inline
  implicit class IXmlAttributeTextOptionsOps[Self <: IXmlAttributeTextOptions] (val x: Self) extends AnyVal {
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
    def setCharData(value: String): Self = this.set("charData", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceInvalidCharsInCharData(value: Boolean): Self = this.set("replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceInvalidCharsInCharData: Self = this.set("replaceInvalidCharsInCharData", js.undefined)
  }
  
}

