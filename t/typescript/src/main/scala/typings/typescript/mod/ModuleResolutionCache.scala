package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cached module resolutions per containing directory.
  * This assumes that any module id will have the same resolution for sibling files located in the same folder.
  */
@js.native
trait ModuleResolutionCache extends NonRelativeModuleNameResolutionCache {
  
  def getOrCreateCacheForDirectory(directoryName: java.lang.String): Map[ResolvedModuleWithFailedLookupLocations] = js.native
  def getOrCreateCacheForDirectory(directoryName: java.lang.String, redirectedReference: ResolvedProjectReference): Map[ResolvedModuleWithFailedLookupLocations] = js.native
}
