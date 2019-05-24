package typings
package xmlcreateLib.libNodesXmlAttributeTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlAttributeTextOptions extends js.Object {
  /**
    * The attribute text.
    */
  var charData: java.lang.String
  /**
    * Whether to replace any invalid characters in the attribute text with the
    * Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlAttributeTextOptions {
  @scala.inline
  def apply(
    charData: java.lang.String,
    replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
  ): IXmlAttributeTextOptions = {
    val __obj = js.Dynamic.literal(charData = charData)
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData)
    __obj.asInstanceOf[IXmlAttributeTextOptions]
  }
}

