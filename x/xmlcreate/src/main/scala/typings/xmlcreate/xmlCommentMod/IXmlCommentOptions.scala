package typings.xmlcreate.xmlCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCommentOptions extends js.Object {
  /**
    * The content of the comment.
    */
  var charData: String
  /**
    * Whether to replace any invalid characters in the content of the comment
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
}

object IXmlCommentOptions {
  @scala.inline
  def apply(charData: String, replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined): IXmlCommentOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceInvalidCharsInCharData)) __obj.updateDynamic("replaceInvalidCharsInCharData")(replaceInvalidCharsInCharData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlCommentOptions]
  }
}

