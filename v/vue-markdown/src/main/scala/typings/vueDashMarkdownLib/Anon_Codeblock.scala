package typings
package vueDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codeblock extends js.Object {
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

object Anon_Codeblock {
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
  ): Anon_Codeblock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code_block")(code_block)
    __obj.updateDynamic("code_inline")(code_inline)
    __obj.updateDynamic("fence")(fence)
    __obj.updateDynamic("hardbreak")(hardbreak)
    __obj.updateDynamic("html_block")(html_block)
    __obj.updateDynamic("html_inline")(html_inline)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("softbreak")(softbreak)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Codeblock]
  }
}

