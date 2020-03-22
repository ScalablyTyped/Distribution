package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.resolveModuleNameFromCache")
@js.native
object resolveModuleNameFromCache extends js.Object {
  def apply(moduleName: String, containingFile: String, cache: ModuleResolutionCache): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
}

