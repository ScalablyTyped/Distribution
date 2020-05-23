package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Whether or not the user can use unfiltered HTML.
    */
  var canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * Handle content as blocks or inline content.
    *  - `AUTO`: Decide based on the content passed.
    *  - `INLINE`: Always handle as inline content, and return string.
    *  - `BLOCKS`: Always handle as blocks, and return array of blocks.
    */
  var mode: js.UndefOr[AUTO | INLINE | BLOCKS] = js.undefined
  /**
    * The tag into which content will be inserted.
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined,
    mode: AUTO | INLINE | BLOCKS = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canUserUseUnfilteredHTML)) __obj.updateDynamic("canUserUseUnfilteredHTML")(canUserUseUnfilteredHTML.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

