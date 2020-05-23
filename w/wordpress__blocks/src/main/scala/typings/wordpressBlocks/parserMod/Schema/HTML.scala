package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML
  extends Source[js.Any] {
  var multiline: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var source: html
}

object HTML {
  @scala.inline
  def apply(
    source: html,
    multiline: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null,
    selector: String = null
  ): HTML = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
}

