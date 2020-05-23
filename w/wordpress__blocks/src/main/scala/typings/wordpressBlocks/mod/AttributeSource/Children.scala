package typings.wordpressBlocks.mod.AttributeSource

import typings.wordpressBlocks.mod._BlockAttribute
import typings.wordpressBlocks.wordpressBlocksStrings.array
import typings.wordpressBlocks.wordpressBlocksStrings.children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children
  extends _BlockAttribute[js.Any] {
  var selector: js.UndefOr[String] = js.undefined
  var source: children
  var `type`: array
}

object Children {
  @scala.inline
  def apply(source: children, `type`: array, selector: String = null): Children = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

