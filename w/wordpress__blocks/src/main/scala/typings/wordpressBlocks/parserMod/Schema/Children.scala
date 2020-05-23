package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children
  extends Source[js.Any] {
  var selector: js.UndefOr[String] = js.undefined
  var source: children
}

object Children {
  @scala.inline
  def apply(source: children, selector: String = null): Children = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

