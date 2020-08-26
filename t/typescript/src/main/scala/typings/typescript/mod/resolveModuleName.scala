package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "resolveModuleName")
@js.native
object resolveModuleName extends js.Object {
  def apply(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: js.UndefOr[scala.Nothing],
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
}

