package typings
package xmlcreateLib.libNodesXmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCdataOptions extends js.Object {
  /**
    * The character data of the CDATA section.
    */
  var charData: java.lang.String
  /**
    * Whether to replace any invalid characters in the character data of the
    * CDATA section with the Unicode replacement character. By default, this
    * is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlCdataOptions {
  @scala.inline
  def apply(
    charData: java.lang.String,
    replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
  ): IXmlCdataOptions = {
    val __obj = js.Dynamic.literal(charData = charData)
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData)
    __obj.asInstanceOf[IXmlCdataOptions]
  }
}

