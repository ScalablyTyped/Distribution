package typings.xmlcreate.xmlAttributeTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlAttributeTextOptions extends js.Object {
  /**
    * The attribute text.
    */
  var charData: String
  /**
    * Whether to replace any invalid characters in the attribute text with the
    * Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
}

object IXmlAttributeTextOptions {
  @scala.inline
  def apply(charData: String, replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined): IXmlAttributeTextOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlAttributeTextOptions]
  }
}

