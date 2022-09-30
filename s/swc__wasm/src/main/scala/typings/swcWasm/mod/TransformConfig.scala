package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformConfig extends StObject {
  
  var constModules: js.UndefOr[ConstModulesConfig] = js.undefined
  
  /**
    * https://swc.rs/docs/configuring-swc.html#jsctransformdecoratormetadata
    */
  var decoratorMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * https://swc.rs/docs/configuring-swc.html#jsctransformlegacydecorator
    */
  var legacyDecorator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to null, which skips optimizer pass.
    */
  var optimizer: js.UndefOr[OptimizerConfig] = js.undefined
  
  /**
    * Effective only if `syntax` supports ƒ.
    */
  var react: js.UndefOr[ReactConfig] = js.undefined
  
  var treatConstEnumAsEnum: js.UndefOr[Boolean] = js.undefined
  
  var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
}
object TransformConfig {
  
  inline def apply(): TransformConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformConfig]
  }
  
  extension [Self <: TransformConfig](x: Self) {
    
    inline def setConstModules(value: ConstModulesConfig): Self = StObject.set(x, "constModules", value.asInstanceOf[js.Any])
    
    inline def setConstModulesUndefined: Self = StObject.set(x, "constModules", js.undefined)
    
    inline def setDecoratorMetadata(value: Boolean): Self = StObject.set(x, "decoratorMetadata", value.asInstanceOf[js.Any])
    
    inline def setDecoratorMetadataUndefined: Self = StObject.set(x, "decoratorMetadata", js.undefined)
    
    inline def setLegacyDecorator(value: Boolean): Self = StObject.set(x, "legacyDecorator", value.asInstanceOf[js.Any])
    
    inline def setLegacyDecoratorUndefined: Self = StObject.set(x, "legacyDecorator", js.undefined)
    
    inline def setOptimizer(value: OptimizerConfig): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
    
    inline def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
    
    inline def setReact(value: ReactConfig): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
    
    inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
    
    inline def setTreatConstEnumAsEnum(value: Boolean): Self = StObject.set(x, "treatConstEnumAsEnum", value.asInstanceOf[js.Any])
    
    inline def setTreatConstEnumAsEnumUndefined: Self = StObject.set(x, "treatConstEnumAsEnum", js.undefined)
    
    inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
    
    inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
  }
}
