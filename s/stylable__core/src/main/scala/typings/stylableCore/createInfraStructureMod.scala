package typings.stylableCore

import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.typesMod.ModuleResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInfraStructureMod {
  
  @JSImport("@stylable/core/cjs/create-infra-structure", "createInfrastructure")
  @js.native
  def createInfrastructure(
    projectRoot: String,
    fileSystem: MinimalFS,
    onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]],
    resolveOptions: js.UndefOr[js.Any],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    cssParser: js.UndefOr[CssParser],
    createDiagnostics: js.UndefOr[js.Function1[/* from */ String, Diagnostics]]
  ): StylableInfrastructure = js.native
  
  @js.native
  trait StylableInfrastructure extends StObject {
    
    var fileProcessor: FileProcessor[StylableMeta] = js.native
    
    def resolvePath(context: js.UndefOr[scala.Nothing], path: String): String = js.native
    def resolvePath(context: String, path: String): String = js.native
  }
}
