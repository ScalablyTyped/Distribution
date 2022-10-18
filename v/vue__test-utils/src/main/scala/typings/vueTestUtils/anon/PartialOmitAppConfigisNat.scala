package typings.vueTestUtils.anon

import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.OptionMergeFunction
import typings.vueRuntimeCore.mod.RuntimeCompilerOptions
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<vue.vue.AppConfig, 'isNativeTag'>> */
trait PartialOmitAppConfigisNat extends StObject {
  
  var compilerOptions: js.UndefOr[RuntimeCompilerOptions] = js.undefined
  
  var errorHandler: js.UndefOr[
    js.Function3[
      /* err */ Any, 
      /* instance */ (ComponentPublicInstance[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        `false`, 
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
      ]) | Null, 
      /* info */ String, 
      Unit
    ]
  ] = js.undefined
  
  var globalProperties: js.UndefOr[Record[String, Any]] = js.undefined
  
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  var optionMergeStrategies: js.UndefOr[Record[String, OptionMergeFunction]] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var unwrapInjectedRef: js.UndefOr[Boolean] = js.undefined
  
  var warnHandler: js.UndefOr[
    js.Function3[
      /* msg */ String, 
      /* instance */ (ComponentPublicInstance[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        `false`, 
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
      ]) | Null, 
      /* trace */ String, 
      Unit
    ]
  ] = js.undefined
}
object PartialOmitAppConfigisNat {
  
  inline def apply(): PartialOmitAppConfigisNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOmitAppConfigisNat]
  }
  
  extension [Self <: PartialOmitAppConfigisNat](x: Self) {
    
    inline def setCompilerOptions(value: RuntimeCompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setErrorHandler(
      value: (/* err */ Any, /* instance */ (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null, /* info */ String) => Unit
    ): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setGlobalProperties(value: Record[String, Any]): Self = StObject.set(x, "globalProperties", value.asInstanceOf[js.Any])
    
    inline def setGlobalPropertiesUndefined: Self = StObject.set(x, "globalProperties", js.undefined)
    
    inline def setIsCustomElement(value: /* tag */ String => Boolean): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    inline def setIsCustomElementUndefined: Self = StObject.set(x, "isCustomElement", js.undefined)
    
    inline def setOptionMergeStrategies(value: Record[String, OptionMergeFunction]): Self = StObject.set(x, "optionMergeStrategies", value.asInstanceOf[js.Any])
    
    inline def setOptionMergeStrategiesUndefined: Self = StObject.set(x, "optionMergeStrategies", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setUnwrapInjectedRef(value: Boolean): Self = StObject.set(x, "unwrapInjectedRef", value.asInstanceOf[js.Any])
    
    inline def setUnwrapInjectedRefUndefined: Self = StObject.set(x, "unwrapInjectedRef", js.undefined)
    
    inline def setWarnHandler(
      value: (/* msg */ String, /* instance */ (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null, /* trace */ String) => Unit
    ): Self = StObject.set(x, "warnHandler", js.Any.fromFunction3(value))
    
    inline def setWarnHandlerUndefined: Self = StObject.set(x, "warnHandler", js.undefined)
  }
}
