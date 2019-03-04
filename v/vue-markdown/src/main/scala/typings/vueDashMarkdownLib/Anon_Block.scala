package typings
package vueDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var block: Anon_Parse
  var configure: js.Any
  var core: Anon_Process
  var disable: js.Any
  var enable: js.Any
  var helpers: Anon_ParseLinkDestination
  var `inline`: Anon_ParseRuler
  var linkify: Anon_Add
  var normalizeLink: js.Any
  var normalizeLinkText: js.Any
  var options: Anon_Breaks
  var parse: js.Any
  var parseInline: js.Any
  var render: js.Any
  var renderInline: js.Any
  var renderer: Anon_Render
  var set: js.Any
  var use: js.Any
  var utils: Anon_ArrayReplaceAt
  var validateLink: js.Any
}

object Anon_Block {
  @scala.inline
  def apply(
    block: Anon_Parse,
    configure: js.Any,
    core: Anon_Process,
    disable: js.Any,
    enable: js.Any,
    helpers: Anon_ParseLinkDestination,
    `inline`: Anon_ParseRuler,
    linkify: Anon_Add,
    normalizeLink: js.Any,
    normalizeLinkText: js.Any,
    options: Anon_Breaks,
    parse: js.Any,
    parseInline: js.Any,
    render: js.Any,
    renderInline: js.Any,
    renderer: Anon_Render,
    set: js.Any,
    use: js.Any,
    utils: Anon_ArrayReplaceAt,
    validateLink: js.Any
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(block = block, configure = configure, core = core, disable = disable, enable = enable, helpers = helpers, linkify = linkify, normalizeLink = normalizeLink, normalizeLinkText = normalizeLinkText, options = options, parse = parse, parseInline = parseInline, render = render, renderInline = renderInline, renderer = renderer, set = set, use = use, utils = utils, validateLink = validateLink)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_Block]
  }
}

