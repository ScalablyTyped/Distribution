package typings.vueRuntimeCore.mod

import typings.std.Record
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppConfig extends StObject {
  
  /**
    * Options to pass to `@vue/compiler-dom`.
    * Only supported in runtime compiler build.
    */
  var compilerOptions: RuntimeCompilerOptions
  
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
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
        js.Object
      ]) | Null, 
      /* info */ String, 
      Unit
    ]
  ] = js.undefined
  
  var globalProperties: ComponentCustomProperties & (Record[String, Any])
  
  /**
    * @deprecated use config.compilerOptions.isCustomElement
    */
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  val isNativeTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  var optionMergeStrategies: Record[String, OptionMergeFunction]
  
  var performance: Boolean
  
  /**
    * Temporary config for opt-in to unwrap injected refs.
    * TODO deprecate in 3.3
    */
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
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
        js.Object
      ]) | Null, 
      /* trace */ String, 
      Unit
    ]
  ] = js.undefined
}
object AppConfig {
  
  inline def apply(
    compilerOptions: RuntimeCompilerOptions,
    globalProperties: ComponentCustomProperties & (Record[String, Any]),
    optionMergeStrategies: Record[String, OptionMergeFunction],
    performance: Boolean
  ): AppConfig = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], globalProperties = globalProperties.asInstanceOf[js.Any], optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfig]
  }
  
  extension [Self <: AppConfig](x: Self) {
    
    inline def setCompilerOptions(value: RuntimeCompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
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
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
          js.Object
        ]) | Null, /* info */ String) => Unit
    ): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setGlobalProperties(value: ComponentCustomProperties & (Record[String, Any])): Self = StObject.set(x, "globalProperties", value.asInstanceOf[js.Any])
    
    inline def setIsCustomElement(value: /* tag */ String => Boolean): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    inline def setIsCustomElementUndefined: Self = StObject.set(x, "isCustomElement", js.undefined)
    
    inline def setIsNativeTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isNativeTag", js.Any.fromFunction1(value))
    
    inline def setIsNativeTagUndefined: Self = StObject.set(x, "isNativeTag", js.undefined)
    
    inline def setOptionMergeStrategies(value: Record[String, OptionMergeFunction]): Self = StObject.set(x, "optionMergeStrategies", value.asInstanceOf[js.Any])
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
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
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
          js.Object
        ]) | Null, /* trace */ String) => Unit
    ): Self = StObject.set(x, "warnHandler", js.Any.fromFunction3(value))
    
    inline def setWarnHandlerUndefined: Self = StObject.set(x, "warnHandler", js.undefined)
  }
}
