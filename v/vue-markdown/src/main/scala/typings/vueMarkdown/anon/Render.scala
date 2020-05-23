package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends js.Object {
  var render: js.Any
  var renderAttrs: js.Any
  var renderInline: js.Any
  var renderInlineAsText: js.Any
  var renderToken: js.Any
  var rules: Codeblock
}

object Render {
  @scala.inline
  def apply(
    render: js.Any,
    renderAttrs: js.Any,
    renderInline: js.Any,
    renderInlineAsText: js.Any,
    renderToken: js.Any,
    rules: Codeblock
  ): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderAttrs = renderAttrs.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderInlineAsText = renderInlineAsText.asInstanceOf[js.Any], renderToken = renderToken.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
}

