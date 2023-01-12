package typings.vueRuntimeCore.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyConfig extends StObject {
  
  /**
    * @deprecated use __VUE_PROD_DEVTOOLS__ compile-time feature flag instead
    * https://github.com/vuejs/core/tree/main/packages/vue#bundler-build-feature-flags
    */
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated use `config.isCustomElement` instead
    * https://v3-migration.vuejs.org/breaking-changes/global-api.html#config-ignoredelements-is-now-config-iscustomelement
    */
  var ignoredElements: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  /**
    * @deprecated
    * https://v3-migration.vuejs.org/breaking-changes/keycode-modifiers.html
    */
  var keyCodes: js.UndefOr[Record[String, Double | js.Array[Double]]] = js.undefined
  
  /**
    * @deprecated
    * https://v3-migration.vuejs.org/breaking-changes/global-api.html#config-productiontip-removed
    */
  var productionTip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated `config.silent` option has been removed
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}
object LegacyConfig {
  
  inline def apply(): LegacyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegacyConfig] (val x: Self) extends AnyVal {
    
    inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    inline def setIgnoredElements(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoredElements", value.asInstanceOf[js.Any])
    
    inline def setIgnoredElementsUndefined: Self = StObject.set(x, "ignoredElements", js.undefined)
    
    inline def setIgnoredElementsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoredElements", js.Array(value*))
    
    inline def setKeyCodes(value: Record[String, Double | js.Array[Double]]): Self = StObject.set(x, "keyCodes", value.asInstanceOf[js.Any])
    
    inline def setKeyCodesUndefined: Self = StObject.set(x, "keyCodes", js.undefined)
    
    inline def setProductionTip(value: Boolean): Self = StObject.set(x, "productionTip", value.asInstanceOf[js.Any])
    
    inline def setProductionTipUndefined: Self = StObject.set(x, "productionTip", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
