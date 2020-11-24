package typings.stylableCore.mod

import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableCoreStrings.development
import typings.stylableCore.stylableCoreStrings.production
import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "Stylable")
@js.native
class Stylable protected ()
  extends typings.stylableCore.stylableMod.Stylable {
  def this(
    projectRoot: String,
    fileSystem: MinimalFS,
    requireModule: js.Function1[/* path */ String, _],
    delimiter: js.UndefOr[String],
    onProcess: js.UndefOr[
        js.Function2[
          /* meta */ typings.stylableCore.stylableProcessorMod.StylableMeta, 
          /* path */ String, 
          typings.stylableCore.stylableProcessorMod.StylableMeta
        ]
      ],
    diagnostics: js.UndefOr[typings.stylableCore.diagnosticsMod.Diagnostics],
    hooks: js.UndefOr[TransformHooks],
    resolveOptions: js.UndefOr[js.Any],
    optimizer: js.UndefOr[IStylableOptimizer],
    mode: js.UndefOr[production | development],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    cssParser: js.UndefOr[CssParser]
  ) = this()
}
/* static members */
@JSImport("@stylable/core", "Stylable")
@js.native
object Stylable extends js.Object {
  
  def create(config: StylableConfig): typings.stylableCore.stylableMod.Stylable = js.native
}
