package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableGeneratorOptions> */
trait PartialStylableGeneratorO extends StObject {
  
  var afterTransform: js.UndefOr[js.Any] = js.undefined
  
  var experimentalHMR: js.UndefOr[Boolean] = js.undefined
  
  var includeCSSInJS: js.UndefOr[Boolean] = js.undefined
  
  var runtimeStylesheetId: js.UndefOr[module | namespace] = js.undefined
}
object PartialStylableGeneratorO {
  
  inline def apply(): PartialStylableGeneratorO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStylableGeneratorO]
  }
  
  extension [Self <: PartialStylableGeneratorO](x: Self) {
    
    inline def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
    
    inline def setAfterTransformUndefined: Self = StObject.set(x, "afterTransform", js.undefined)
    
    inline def setExperimentalHMR(value: Boolean): Self = StObject.set(x, "experimentalHMR", value.asInstanceOf[js.Any])
    
    inline def setExperimentalHMRUndefined: Self = StObject.set(x, "experimentalHMR", js.undefined)
    
    inline def setIncludeCSSInJS(value: Boolean): Self = StObject.set(x, "includeCSSInJS", value.asInstanceOf[js.Any])
    
    inline def setIncludeCSSInJSUndefined: Self = StObject.set(x, "includeCSSInJS", js.undefined)
    
    inline def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
  }
}
