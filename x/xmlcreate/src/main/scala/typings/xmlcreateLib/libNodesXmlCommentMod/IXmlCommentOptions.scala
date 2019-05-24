package typings
package xmlcreateLib.libNodesXmlCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCommentOptions extends js.Object {
  /**
    * The content of the comment.
    */
  var charData: java.lang.String
  /**
    * Whether to replace any invalid characters in the content of the comment
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlCommentOptions {
  @scala.inline
  def apply(
    charData: java.lang.String,
    replaceInvalidCharsInCharData: js.UndefOr[scala.Boolean] = js.undefined
  ): IXmlCommentOptions = {
    val __obj = js.Dynamic.literal(charData = charData)
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData)
    __obj.asInstanceOf[IXmlCommentOptions]
  }
}

