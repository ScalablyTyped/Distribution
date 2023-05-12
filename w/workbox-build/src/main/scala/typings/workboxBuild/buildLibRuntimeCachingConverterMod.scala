package typings.workboxBuild

import typings.workboxBuild.buildLibModuleRegistryMod.ModuleRegistry
import typings.workboxBuild.buildTypesMod.RuntimeCaching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibRuntimeCachingConverterMod {
  
  @JSImport("workbox-build/build/lib/runtime-caching-converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runtimeCachingConverter(moduleRegistry: ModuleRegistry, runtimeCaching: js.Array[RuntimeCaching]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("runtimeCachingConverter")(moduleRegistry.asInstanceOf[js.Any], runtimeCaching.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
