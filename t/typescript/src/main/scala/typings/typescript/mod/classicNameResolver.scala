package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "classicNameResolver")
@js.native
object classicNameResolver extends js.Object {
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
    cache: NonRelativeModuleNameResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: NonRelativeModuleNameResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
}

