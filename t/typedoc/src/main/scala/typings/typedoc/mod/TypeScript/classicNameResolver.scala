package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.NonRelativeModuleNameResolutionCache
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.classicNameResolver")
@js.native
object classicNameResolver extends js.Object {
  
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
    cache: js.UndefOr[scala.Nothing],
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: NonRelativeModuleNameResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def apply(
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: NonRelativeModuleNameResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
}
