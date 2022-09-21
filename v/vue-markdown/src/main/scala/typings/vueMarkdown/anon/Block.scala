package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var block: Parse
  
  var configure: scala.Any
  
  var core: Process
  
  var disable: scala.Any
  
  var enable: scala.Any
  
  var helpers: ParseLinkDestination
  
  var `inline`: Ruler
  
  var linkify: Add
  
  var normalizeLink: scala.Any
  
  var normalizeLinkText: scala.Any
  
  var options: Breaks
  
  var parse: scala.Any
  
  var parseInline: scala.Any
  
  var render: scala.Any
  
  var renderInline: scala.Any
  
  var renderer: Render
  
  var set: scala.Any
  
  var use: scala.Any
  
  var utils: ArrayReplaceAt
  
  var validateLink: scala.Any
}
object Block {
  
  inline def apply(
    block: Parse,
    configure: scala.Any,
    core: Process,
    disable: scala.Any,
    enable: scala.Any,
    helpers: ParseLinkDestination,
    `inline`: Ruler,
    linkify: Add,
    normalizeLink: scala.Any,
    normalizeLinkText: scala.Any,
    options: Breaks,
    parse: scala.Any,
    parseInline: scala.Any,
    render: scala.Any,
    renderInline: scala.Any,
    renderer: Render,
    set: scala.Any,
    use: scala.Any,
    utils: ArrayReplaceAt,
    validateLink: scala.Any
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], configure = configure.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], normalizeLink = normalizeLink.asInstanceOf[js.Any], normalizeLinkText = normalizeLinkText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], parseInline = parseInline.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], validateLink = validateLink.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBlock(value: Parse): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setConfigure(value: scala.Any): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    inline def setCore(value: Process): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: scala.Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: scala.Any): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setHelpers(value: ParseLinkDestination): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setInline(value: Ruler): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setLinkify(value: Add): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    
    inline def setNormalizeLink(value: scala.Any): Self = StObject.set(x, "normalizeLink", value.asInstanceOf[js.Any])
    
    inline def setNormalizeLinkText(value: scala.Any): Self = StObject.set(x, "normalizeLinkText", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Breaks): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setParse(value: scala.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseInline(value: scala.Any): Self = StObject.set(x, "parseInline", value.asInstanceOf[js.Any])
    
    inline def setRender(value: scala.Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderInline(value: scala.Any): Self = StObject.set(x, "renderInline", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Render): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSet(value: scala.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setUse(value: scala.Any): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUtils(value: ArrayReplaceAt): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    
    inline def setValidateLink(value: scala.Any): Self = StObject.set(x, "validateLink", value.asInstanceOf[js.Any])
  }
}
