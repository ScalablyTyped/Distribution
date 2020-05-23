package typings.xmlcreate.xmlCharDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCharDataOptions extends js.Object {
  /**
    * The character data.
    */
  var charData: String
  /**
    * Whether to replace any invalid characters in the character data with the
    * Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
}

object IXmlCharDataOptions {
  @scala.inline
  def apply(charData: String, replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined): IXmlCharDataOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlCharDataOptions]
  }
}

