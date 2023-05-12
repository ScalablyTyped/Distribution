package typings.tsLoader.distInterfacesMod

import typings.std.Map
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleResolutionCache
  extends StObject
     with typings.typescript.mod.ModuleResolutionCache {
  
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  var directoryToModuleNameMap: CacheWithRedirects[Map[String, ResolvedModuleWithFailedLookupLocations]] = js.native
  
  var moduleNameToDirectoryMap: CacheWithRedirects[PerModuleNameCache] = js.native
  
  /**
    *  Updates with the current compilerOptions the cache will operate with.
    *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def update(options: CompilerOptions): Unit = js.native
}
