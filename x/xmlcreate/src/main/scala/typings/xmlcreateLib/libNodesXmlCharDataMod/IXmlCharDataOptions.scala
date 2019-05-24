package typings
package xmlcreateLib.libNodesXmlCharDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCharDataOptions extends js.Object {
  /**
    * The character data.
    */
  var charData: java.lang.String
  /**
    * Whether to replace any invalid characters in the character data with the
    * Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlCharDataOptions {
  @scala.inline
  def apply(
    charData: java.lang.String,
    replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
  ): IXmlCharDataOptions = {
    val __obj = js.Dynamic.literal(charData = charData)
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData)
    __obj.asInstanceOf[IXmlCharDataOptions]
  }
}

