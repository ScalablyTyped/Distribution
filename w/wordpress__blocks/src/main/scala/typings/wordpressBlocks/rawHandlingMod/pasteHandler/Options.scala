package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressBlocks.rawHandlingMod.pasteHandler.HTMLOptions
  - typings.wordpressBlocks.rawHandlingMod.pasteHandler.PlainTextOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def HTMLOptions(
    HTML: String,
    canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined,
    mode: AUTO | INLINE | BLOCKS = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    if (!js.isUndefined(canUserUseUnfilteredHTML)) __obj.updateDynamic("canUserUseUnfilteredHTML")(canUserUseUnfilteredHTML.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def PlainTextOptions(
    plainText: String,
    canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined,
    mode: AUTO | INLINE | BLOCKS = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
    if (!js.isUndefined(canUserUseUnfilteredHTML)) __obj.updateDynamic("canUserUseUnfilteredHTML")(canUserUseUnfilteredHTML.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

