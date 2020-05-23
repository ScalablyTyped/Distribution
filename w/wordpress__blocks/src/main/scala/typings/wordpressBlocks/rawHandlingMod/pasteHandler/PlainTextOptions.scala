package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainTextOptions
  extends BaseOptions
     with Options {
  /**
    * Plain text version.
    */
  var plainText: String
}

object PlainTextOptions {
  @scala.inline
  def apply(
    plainText: String,
    canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined,
    mode: AUTO | INLINE | BLOCKS = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): PlainTextOptions = {
    val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
    if (!js.isUndefined(canUserUseUnfilteredHTML)) __obj.updateDynamic("canUserUseUnfilteredHTML")(canUserUseUnfilteredHTML.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainTextOptions]
  }
}

