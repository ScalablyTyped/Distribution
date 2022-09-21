package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify options for each generator.
  */
trait GeneratorOptionsByModuleTypeKnown extends StObject {
  
  /**
  	 * Generator options for asset modules.
  	 */
  var asset: js.UndefOr[AssetGeneratorOptions] = js.undefined
  
  /**
  	 * Generator options for asset/inline modules.
  	 */
  @JSName("asset/inline")
  var assetSlashinline: js.UndefOr[AssetInlineGeneratorOptions] = js.undefined
  
  /**
  	 * Generator options for asset/resource modules.
  	 */
  @JSName("asset/resource")
  var assetSlashresource: js.UndefOr[AssetResourceGeneratorOptions] = js.undefined
  
  /**
  	 * No generator options are supported for this module type.
  	 */
  var javascript: js.UndefOr[EmptyGeneratorOptions] = js.undefined
  
  /**
  	 * No generator options are supported for this module type.
  	 */
  @JSName("javascript/auto")
  var javascriptSlashauto: js.UndefOr[EmptyGeneratorOptions] = js.undefined
  
  /**
  	 * No generator options are supported for this module type.
  	 */
  @JSName("javascript/dynamic")
  var javascriptSlashdynamic: js.UndefOr[EmptyGeneratorOptions] = js.undefined
  
  /**
  	 * No generator options are supported for this module type.
  	 */
  @JSName("javascript/esm")
  var javascriptSlashesm: js.UndefOr[EmptyGeneratorOptions] = js.undefined
}
object GeneratorOptionsByModuleTypeKnown {
  
  inline def apply(): GeneratorOptionsByModuleTypeKnown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptionsByModuleTypeKnown]
  }
  
  extension [Self <: GeneratorOptionsByModuleTypeKnown](x: Self) {
    
    inline def setAsset(value: AssetGeneratorOptions): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashinline(value: AssetInlineGeneratorOptions): Self = StObject.set(x, "asset/inline", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashinlineUndefined: Self = StObject.set(x, "asset/inline", js.undefined)
    
    inline def setAssetSlashresource(value: AssetResourceGeneratorOptions): Self = StObject.set(x, "asset/resource", value.asInstanceOf[js.Any])
    
    inline def setAssetSlashresourceUndefined: Self = StObject.set(x, "asset/resource", js.undefined)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setJavascript(value: EmptyGeneratorOptions): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashauto(value: EmptyGeneratorOptions): Self = StObject.set(x, "javascript/auto", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashautoUndefined: Self = StObject.set(x, "javascript/auto", js.undefined)
    
    inline def setJavascriptSlashdynamic(value: EmptyGeneratorOptions): Self = StObject.set(x, "javascript/dynamic", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashdynamicUndefined: Self = StObject.set(x, "javascript/dynamic", js.undefined)
    
    inline def setJavascriptSlashesm(value: EmptyGeneratorOptions): Self = StObject.set(x, "javascript/esm", value.asInstanceOf[js.Any])
    
    inline def setJavascriptSlashesmUndefined: Self = StObject.set(x, "javascript/esm", js.undefined)
    
    inline def setJavascriptUndefined: Self = StObject.set(x, "javascript", js.undefined)
  }
}
