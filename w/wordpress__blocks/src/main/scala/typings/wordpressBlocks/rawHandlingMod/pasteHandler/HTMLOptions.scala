package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLOptions
  extends BaseOptions
     with Options {
  /**
    * The HTML to convert.
    */
  var HTML: String
}

object HTMLOptions {
  @scala.inline
  def apply(
    HTML: String,
    canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined,
    mode: AUTO | INLINE | BLOCKS = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): HTMLOptions = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    if (!js.isUndefined(canUserUseUnfilteredHTML)) __obj.updateDynamic("canUserUseUnfilteredHTML")(canUserUseUnfilteredHTML.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOptions]
  }
}

