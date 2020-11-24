package typings.stylableCore.stylableMod

import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.anon.PartialTransformerOptions
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableCoreStrings.development
import typings.stylableCore.stylableCoreStrings.production
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.StylableResolver
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable", "Stylable")
@js.native
class Stylable protected () extends js.Object {
  def this(
    projectRoot: String,
    fileSystem: MinimalFS,
    requireModule: js.Function1[/* path */ String, _],
    delimiter: js.UndefOr[String],
    onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]],
    diagnostics: js.UndefOr[Diagnostics],
    hooks: js.UndefOr[TransformHooks],
    resolveOptions: js.UndefOr[js.Any],
    optimizer: js.UndefOr[IStylableOptimizer],
    mode: js.UndefOr[production | development],
    resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]],
    timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea],
    resolveModule: js.UndefOr[ModuleResolver],
    cssParser: js.UndefOr[CssParser]
  ) = this()
  
  def createTransformer(): StylableTransformer = js.native
  def createTransformer(options: PartialTransformerOptions): StylableTransformer = js.native
  
  /* protected */ def cssParser(css: String): Root_ = js.native
  /* protected */ def cssParser(css: String, options: ProcessOptions): Root_ = js.native
  @JSName("cssParser")
  var cssParser_Original: CssParser = js.native
  
  var delimiter: String = js.native
  
  var diagnostics: Diagnostics = js.native
  
  var fileProcessor: FileProcessor[StylableMeta] = js.native
  
  var fileSystem: MinimalFS = js.native
  
  var hooks: TransformHooks = js.native
  
  var mode: production | development = js.native
  
  var onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]] = js.native
  
  var optimizer: js.UndefOr[IStylableOptimizer] = js.native
  
  def process(fullpath: String): StylableMeta = js.native
  def process(fullpath: String, context: js.UndefOr[scala.Nothing], ignoreCache: Boolean): StylableMeta = js.native
  def process(fullpath: String, context: String): StylableMeta = js.native
  def process(fullpath: String, context: String, ignoreCache: Boolean): StylableMeta = js.native
  
  var projectRoot: String = js.native
  
  /* protected */ def requireModule(path: String): js.Any = js.native
  
  var resolveModule: js.UndefOr[ModuleResolver] = js.native
  
  var resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]] = js.native
  
  var resolveOptions: js.Any = js.native
  
  def resolvePath(ctx: js.UndefOr[scala.Nothing], path: String): String = js.native
  def resolvePath(ctx: String, path: String): String = js.native
  
  var resolver: StylableResolver = js.native
  
  var timedCacheOptions: OmitTimedCacheOptionscrea = js.native
  
  def transform(meta: StylableMeta): StylableResults = js.native
  def transform(source: String, resourcePath: String): StylableResults = js.native
}
/* static members */
@JSImport("@stylable/core/cjs/stylable", "Stylable")
@js.native
object Stylable extends js.Object {
  
  def create(config: StylableConfig): Stylable = js.native
}
