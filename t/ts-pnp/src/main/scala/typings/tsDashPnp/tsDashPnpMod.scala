package typings.tsDashPnp

import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ModuleResolutionHost
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
      /* moduleResolutionHost */ ModuleResolutionHost, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ts.ResolvedModuleNameWithFallbackLocations */ _
    ]
  ): js.Any = js.native
}

