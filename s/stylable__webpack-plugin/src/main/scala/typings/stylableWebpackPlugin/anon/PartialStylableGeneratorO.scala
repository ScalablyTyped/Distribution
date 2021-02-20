package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableGeneratorOptions> */
@js.native
trait PartialStylableGeneratorO extends StObject {
  
  var afterTransform: js.UndefOr[js.Any] = js.native
  
  var experimentalHMR: js.UndefOr[Boolean] = js.native
  
  var includeCSSInJS: js.UndefOr[Boolean] = js.native
  
  var runtimeStylesheetId: js.UndefOr[module | namespace] = js.native
}
object PartialStylableGeneratorO {
  
  @scala.inline
  def apply(): PartialStylableGeneratorO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStylableGeneratorO]
  }
  
  @scala.inline
  implicit class PartialStylableGeneratorOMutableBuilder[Self <: PartialStylableGeneratorO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterTransformUndefined: Self = StObject.set(x, "afterTransform", js.undefined)
    
    @scala.inline
    def setExperimentalHMR(value: Boolean): Self = StObject.set(x, "experimentalHMR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalHMRUndefined: Self = StObject.set(x, "experimentalHMR", js.undefined)
    
    @scala.inline
    def setIncludeCSSInJS(value: Boolean): Self = StObject.set(x, "includeCSSInJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCSSInJSUndefined: Self = StObject.set(x, "includeCSSInJS", js.undefined)
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeStylesheetIdUndefined: Self = StObject.set(x, "runtimeStylesheetId", js.undefined)
  }
}
