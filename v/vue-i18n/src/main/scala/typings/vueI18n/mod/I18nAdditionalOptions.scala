package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nAdditionalOptions extends StObject {
  
  /**
    * Whether to allow the Composition API to be used in Legacy API mode.
    *
    * @remarks
    * If this option is enabled, you can use {@link useI18n} in Legacy API mode. This option is supported to support the migration from Legacy API mode to Composition API mode.
    *
    * @VueI18nWarning Note that the Composition API made available with this option doesn't work on SSR.
    * @VueI18nSee [Composition API](../guide/advanced/composition)
    *
    * @defaultValue `false`
    */
  var allowComposition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to inject global properties & functions into for each component.
    *
    * @remarks
    * If set to `true`, then properties and methods prefixed with `$` are injected into Vue Component.
    *
    * @VueI18nSee [Implicit with injected properties and functions](../guide/advanced/composition#implicit-with-injected-properties-and-functions)
    * @VueI18nSee [ComponentCustomProperties](injection#componentcustomproperties)
    *
    * @defaultValue `true`
    */
  var globalInjection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether vue-i18n Legacy API mode use on your Vue App
    *
    * @remarks
    * The default is to use the Legacy API mode. If you want to use the Composition API mode, you need to set it to `false`.
    *
    * @VueI18nSee [Composition API](../guide/advanced/composition)
    *
    * @defaultValue `true`
    */
  var legacy: js.UndefOr[Boolean] = js.undefined
}
object I18nAdditionalOptions {
  
  inline def apply(): I18nAdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nAdditionalOptions]
  }
  
  extension [Self <: I18nAdditionalOptions](x: Self) {
    
    inline def setAllowComposition(value: Boolean): Self = StObject.set(x, "allowComposition", value.asInstanceOf[js.Any])
    
    inline def setAllowCompositionUndefined: Self = StObject.set(x, "allowComposition", js.undefined)
    
    inline def setGlobalInjection(value: Boolean): Self = StObject.set(x, "globalInjection", value.asInstanceOf[js.Any])
    
    inline def setGlobalInjectionUndefined: Self = StObject.set(x, "globalInjection", js.undefined)
    
    inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
  }
}
