package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  var block: AnonParse
  var configure: js.Any
  var core: AnonProcess
  var disable: js.Any
  var enable: js.Any
  var helpers: AnonParseLinkDestination
  var `inline`: AnonRuler
  var linkify: AnonAdd
  var normalizeLink: js.Any
  var normalizeLinkText: js.Any
  var options: AnonBreaks
  var parse: js.Any
  var parseInline: js.Any
  var render: js.Any
  var renderInline: js.Any
  var renderer: AnonRender
  var set: js.Any
  var use: js.Any
  var utils: AnonArrayReplaceAt
  var validateLink: js.Any
}

object AnonBlock {
  @scala.inline
  def apply(
    block: AnonParse,
    configure: js.Any,
    core: AnonProcess,
    disable: js.Any,
    enable: js.Any,
    helpers: AnonParseLinkDestination,
    `inline`: AnonRuler,
    linkify: AnonAdd,
    normalizeLink: js.Any,
    normalizeLinkText: js.Any,
    options: AnonBreaks,
    parse: js.Any,
    parseInline: js.Any,
    render: js.Any,
    renderInline: js.Any,
    renderer: AnonRender,
    set: js.Any,
    use: js.Any,
    utils: AnonArrayReplaceAt,
    validateLink: js.Any
  ): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], configure = configure.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], normalizeLink = normalizeLink.asInstanceOf[js.Any], normalizeLinkText = normalizeLinkText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], parseInline = parseInline.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], validateLink = validateLink.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
}

