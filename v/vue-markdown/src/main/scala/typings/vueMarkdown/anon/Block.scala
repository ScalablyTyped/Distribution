package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var block: Parse = js.native
  var configure: js.Any = js.native
  var core: Process = js.native
  var disable: js.Any = js.native
  var enable: js.Any = js.native
  var helpers: ParseLinkDestination = js.native
  var `inline`: Ruler = js.native
  var linkify: Add = js.native
  var normalizeLink: js.Any = js.native
  var normalizeLinkText: js.Any = js.native
  var options: Breaks = js.native
  var parse: js.Any = js.native
  var parseInline: js.Any = js.native
  var render: js.Any = js.native
  var renderInline: js.Any = js.native
  var renderer: Render = js.native
  var set: js.Any = js.native
  var use: js.Any = js.native
  var utils: ArrayReplaceAt = js.native
  var validateLink: js.Any = js.native
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
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlock(value: Parse): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigure(value: js.Any): Self = this.set("configure", value.asInstanceOf[js.Any])
    @scala.inline
    def setCore(value: Process): Self = this.set("core", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable(value: js.Any): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable(value: js.Any): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpers(value: ParseLinkDestination): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def setInline(value: Ruler): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkify(value: Add): Self = this.set("linkify", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizeLink(value: js.Any): Self = this.set("normalizeLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizeLinkText(value: js.Any): Self = this.set("normalizeLinkText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Breaks): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setParse(value: js.Any): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseInline(value: js.Any): Self = this.set("parseInline", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: js.Any): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderInline(value: js.Any): Self = this.set("renderInline", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: Render): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: js.Any): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse(value: js.Any): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtils(value: ArrayReplaceAt): Self = this.set("utils", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateLink(value: js.Any): Self = this.set("validateLink", value.asInstanceOf[js.Any])
  }
  
}

