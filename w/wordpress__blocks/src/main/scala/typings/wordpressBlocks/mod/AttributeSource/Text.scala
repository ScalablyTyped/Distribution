package typings.wordpressBlocks.mod.AttributeSource

import typings.wordpressBlocks.mod._BlockAttribute
import typings.wordpressBlocks.wordpressBlocksStrings.string
import typings.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends _BlockAttribute[js.Any] {
  var default: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var source: text
  var `type`: string
}

object Text {
  @scala.inline
  def apply(source: text, `type`: string, default: String = null, selector: String = null): Text = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

