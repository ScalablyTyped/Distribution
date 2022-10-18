package typings.sucrase

import typings.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegisterMod {
  
  @JSImport("sucrase/dist/types/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHook(`extension`: String, options: Options): RevertFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(`extension`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RevertFunction]
  inline def addHook(`extension`: String, options: Options, hookOptions: HookOptions): RevertFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(`extension`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hookOptions.asInstanceOf[js.Any])).asInstanceOf[RevertFunction]
  
  inline def registerAll(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAll")().asInstanceOf[RevertFunction]
  inline def registerAll(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAll")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  inline def registerJS(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerJS")().asInstanceOf[RevertFunction]
  inline def registerJS(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerJS")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  inline def registerJSX(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerJSX")().asInstanceOf[RevertFunction]
  inline def registerJSX(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerJSX")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  inline def registerTS(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTS")().asInstanceOf[RevertFunction]
  inline def registerTS(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTS")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  inline def registerTSLegacyModuleInterop(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTSLegacyModuleInterop")().asInstanceOf[RevertFunction]
  inline def registerTSLegacyModuleInterop(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTSLegacyModuleInterop")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  inline def registerTSX(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTSX")().asInstanceOf[RevertFunction]
  inline def registerTSX(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTSX")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  inline def registerTSXLegacyModuleInterop(): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTSXLegacyModuleInterop")().asInstanceOf[RevertFunction]
  inline def registerTSXLegacyModuleInterop(hookOptions: HookOptions): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTSXLegacyModuleInterop")(hookOptions.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  
  trait HookOptions extends StObject {
    
    var ignoreNodeModules: js.UndefOr[Boolean] = js.undefined
    
    var matcher: js.UndefOr[js.Function1[/* code */ String, Boolean]] = js.undefined
  }
  object HookOptions {
    
    inline def apply(): HookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookOptions]
    }
    
    extension [Self <: HookOptions](x: Self) {
      
      inline def setIgnoreNodeModules(value: Boolean): Self = StObject.set(x, "ignoreNodeModules", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNodeModulesUndefined: Self = StObject.set(x, "ignoreNodeModules", js.undefined)
      
      inline def setMatcher(value: /* code */ String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    }
  }
  
  type RevertFunction = js.Function0[Unit]
}
