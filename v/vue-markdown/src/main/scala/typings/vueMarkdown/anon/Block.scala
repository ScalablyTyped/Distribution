package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var block: Parse
  var configure: js.Any
  var core: Process
  var disable: js.Any
  var enable: js.Any
  var helpers: ParseLinkDestination
  var `inline`: Ruler
  var linkify: Add
  var normalizeLink: js.Any
  var normalizeLinkText: js.Any
  var options: Breaks
  var parse: js.Any
  var parseInline: js.Any
  var render: js.Any
  var renderInline: js.Any
  var renderer: Render
  var set: js.Any
  var use: js.Any
  var utils: ArrayReplaceAt
  var validateLink: js.Any
}

object Block {
  @scala.inline
  def apply(
    block: Parse,
    configure: js.Any,
    core: Process,
    disable: js.Any,
    enable: js.Any,
    helpers: ParseLinkDestination,
    `inline`: Ruler,
    linkify: Add,
    normalizeLink: js.Any,
    normalizeLinkText: js.Any,
    options: Breaks,
    parse: js.Any,
    parseInline: js.Any,
    render: js.Any,
    renderInline: js.Any,
    renderer: Render,
    set: js.Any,
    use: js.Any,
    utils: ArrayReplaceAt,
    validateLink: js.Any
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], configure = configure.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], normalizeLink = normalizeLink.asInstanceOf[js.Any], normalizeLinkText = normalizeLinkText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], parseInline = parseInline.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], validateLink = validateLink.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

