package typings.tsDashPnp

import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ModuleResolutionHost
import typings.typescript.typescriptMod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-pnp", JSImport.Namespace)
@js.native
object tsDashPnpMod extends js.Object {
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

