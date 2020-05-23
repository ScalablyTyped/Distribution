package typings.xmlcreate.xmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCdataOptions extends js.Object {
  /**
    * The character data of the CDATA section.
    */
  var charData: String
  /**
    * Whether to replace any invalid characters in the character data of the
    * CDATA section with the Unicode replacement character. By default, this
    * is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
}

object IXmlCdataOptions {
  @scala.inline
  def apply(charData: String, replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined): IXmlCdataOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlCdataOptions]
  }
}

