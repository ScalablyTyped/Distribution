package typings.tsPnp

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-pnp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def resolveModuleName(
    moduleName: String,
    containingFile: String,
    options: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost,
    realResolveModuleName: js.Function4[
      /* moduleName */ String, 
      /* containingFile */ String, 
      /* options */ CompilerOptions, 
      /* moduleResolutionHost */ ResolvedModuleWithFailedLookupLocations, 
      ResolvedModuleWithFailedLookupLocations
    ]
  ): ResolvedModuleWithFailedLookupLocations = js.native
  @JSName("resolveModuleName")
  def resolveModuleName_ResolvedTypeReferenceDirectiveWithFailedLookupLocations(
    moduleName: String,
    containingFile: String,
    options: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost,
    realResolveModuleName: js.Function4[
      /* moduleName */ String, 
      /* containingFile */ String, 
      /* options */ CompilerOptions, 
      /* moduleResolutionHost */ ModuleResolutionHost, 
      ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    ]
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
}

