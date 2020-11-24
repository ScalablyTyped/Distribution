package typings.stylableCore.mod

import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.createInfraStructureMod.StylableInfrastructure
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.typesMod.ModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "createInfrastructure")
@js.native
object createInfrastructure extends js.Object {
  
  def apply(
    projectRoot: String,
    fileSystem: MinimalFS,
    onProcess: js.UndefOr[
      js.Function2[
        /* meta */ typings.stylableCore.stylableProcessorMod.StylableMeta, 
        /* path */ String, 
        typings.stylableCore.stylableProcessorMod.StylableMeta
      ]
    ],
    resolveOptions: js.UndefOr[js.Any],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    cssParser: js.UndefOr[CssParser],
    createDiagnostics: js.UndefOr[js.Function1[/* from */ String, typings.stylableCore.diagnosticsMod.Diagnostics]]
  ): StylableInfrastructure = js.native
}
