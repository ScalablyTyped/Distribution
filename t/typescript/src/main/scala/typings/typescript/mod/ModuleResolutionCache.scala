package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleResolutionCache
  extends StObject
     with PerDirectoryResolutionCache[ResolvedModuleWithFailedLookupLocations]
     with NonRelativeModuleNameResolutionCache {
  
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  def getPackageJsonInfoCache(): PackageJsonInfoCache = js.native
}
