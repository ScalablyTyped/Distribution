package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeblock extends js.Object {
  var code_block: js.Any
  var code_inline: js.Any
  var fence: js.Any
  var hardbreak: js.Any
  var html_block: js.Any
  var html_inline: js.Any
  var image: js.Any
  var softbreak: js.Any
  var text: js.Any
}

object AnonCodeblock {
  @scala.inline
  def apply(
    code_block: js.Any,
    code_inline: js.Any,
    fence: js.Any,
    hardbreak: js.Any,
    html_block: js.Any,
    html_inline: js.Any,
    image: js.Any,
    softbreak: js.Any,
    text: js.Any
  ): AnonCodeblock = {
    val __obj = js.Dynamic.literal(code_block = code_block.asInstanceOf[js.Any], code_inline = code_inline.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], hardbreak = hardbreak.asInstanceOf[js.Any], html_block = html_block.asInstanceOf[js.Any], html_inline = html_inline.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], softbreak = softbreak.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeblock]
  }
}

