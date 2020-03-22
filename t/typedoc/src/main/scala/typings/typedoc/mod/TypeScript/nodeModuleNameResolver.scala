package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.nodeModuleNameResolver")
@js.native
object nodeModuleNameResolver extends js.Object {
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
}

