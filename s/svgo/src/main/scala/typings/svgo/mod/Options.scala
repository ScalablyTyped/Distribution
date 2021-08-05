package typings.svgo.mod

import typings.svgo.svgoStrings.base64
import typings.svgo.svgoStrings.enc
import typings.svgo.svgoStrings.unenc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /** Output as Data URI string. */
  var datauri: js.UndefOr[base64 | enc | unenc] = js.undefined
  
  /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
  var floatPrecision: js.UndefOr[Double] = js.undefined
  
  /** Use full set of plugins. */
  var full: js.UndefOr[Boolean] = js.undefined
  
  /** Options for rendering optimized SVG from AST. */
  var js2svg: js.UndefOr[Js2SvgOptions] = js.undefined
  
  /**
    * Individual plugin configurations.
    * For specific options, see plugin source in https://github.com/svg/svgo/tree/master/plugins.
    */
  var plugins: js.UndefOr[js.Array[PluginConfig]] = js.undefined
  
  /** Options for parsing original SVG into AST. */
  var svg2js: js.UndefOr[Svg2JsOptions] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setDatauri(value: base64 | enc | unenc): Self = StObject.set(x, "datauri", value.asInstanceOf[js.Any])
    
    inline def setDatauriUndefined: Self = StObject.set(x, "datauri", js.undefined)
    
    inline def setFloatPrecision(value: Double): Self = StObject.set(x, "floatPrecision", value.asInstanceOf[js.Any])
    
    inline def setFloatPrecisionUndefined: Self = StObject.set(x, "floatPrecision", js.undefined)
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setJs2svg(value: Js2SvgOptions): Self = StObject.set(x, "js2svg", value.asInstanceOf[js.Any])
    
    inline def setJs2svgUndefined: Self = StObject.set(x, "js2svg", js.undefined)
    
    inline def setPlugins(value: js.Array[PluginConfig]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginConfig*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setSvg2js(value: Svg2JsOptions): Self = StObject.set(x, "svg2js", value.asInstanceOf[js.Any])
    
    inline def setSvg2jsUndefined: Self = StObject.set(x, "svg2js", js.undefined)
  }
}
