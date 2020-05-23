package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag
  extends Source[js.Any] {
  var selector: js.UndefOr[String] = js.undefined
  var source: tag
}

object Tag {
  @scala.inline
  def apply(source: tag, selector: String = null): Tag = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

