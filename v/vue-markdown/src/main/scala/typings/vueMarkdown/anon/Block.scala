package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends StObject {
  
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
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Parse): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigure(value: js.Any): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCore(value: Process): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable(value: js.Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: js.Any): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpers(value: ParseLinkDestination): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: Ruler): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkify(value: Add): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeLink(value: js.Any): Self = StObject.set(x, "normalizeLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeLinkText(value: js.Any): Self = StObject.set(x, "normalizeLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Breaks): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseInline(value: js.Any): Self = StObject.set(x, "parseInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: js.Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderInline(value: js.Any): Self = StObject.set(x, "renderInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: Render): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse(value: js.Any): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: ArrayReplaceAt): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateLink(value: js.Any): Self = StObject.set(x, "validateLink", value.asInstanceOf[js.Any])
  }
}
