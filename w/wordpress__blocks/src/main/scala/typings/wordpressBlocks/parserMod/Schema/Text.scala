package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends Source[js.Any] {
  var selector: js.UndefOr[String] = js.undefined
  var source: text
}

object Text {
  @scala.inline
  def apply(source: text, selector: String = null): Text = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

