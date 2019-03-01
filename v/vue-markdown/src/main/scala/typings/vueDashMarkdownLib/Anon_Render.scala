package typings
package vueDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends js.Object {
  var render: js.Any
  var renderAttrs: js.Any
  var renderInline: js.Any
  var renderInlineAsText: js.Any
  var renderToken: js.Any
  var rules: Anon_Codeblock
}

object Anon_Render {
  @scala.inline
  def apply(
    render: js.Any,
    renderAttrs: js.Any,
    renderInline: js.Any,
    renderInlineAsText: js.Any,
    renderToken: js.Any,
    rules: Anon_Codeblock
  ): Anon_Render = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("renderAttrs")(renderAttrs)
    __obj.updateDynamic("renderInline")(renderInline)
    __obj.updateDynamic("renderInlineAsText")(renderInlineAsText)
    __obj.updateDynamic("renderToken")(renderToken)
    __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[Anon_Render]
  }
}

