package typings.webpack.mod

import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.webpack.webpackStrings._empty
import typings.webpack.webpackStrings.`assetSlashraw-data-url`
import typings.webpack.webpackStrings.`consume-shared-module`
import typings.webpack.webpackStrings.`default-only`
import typings.webpack.webpackStrings.`default-with-named`
import typings.webpack.webpackStrings.`fallback-module`
import typings.webpack.webpackStrings.`lazy-compilation-proxy`
import typings.webpack.webpackStrings.`provide-module`
import typings.webpack.webpackStrings.`remote-module`
import typings.webpack.webpackStrings.asset
import typings.webpack.webpackStrings.assetSlashinline
import typings.webpack.webpackStrings.assetSlashresource
import typings.webpack.webpackStrings.assetSlashsource
import typings.webpack.webpackStrings.css
import typings.webpack.webpackStrings.cssSlashglobal
import typings.webpack.webpackStrings.cssSlashmodule
import typings.webpack.webpackStrings.dynamic
import typings.webpack.webpackStrings.javascriptSlashauto
import typings.webpack.webpackStrings.javascriptSlashdynamic
import typings.webpack.webpackStrings.javascriptSlashesm
import typings.webpack.webpackStrings.json
import typings.webpack.webpackStrings.namespace
import typings.webpack.webpackStrings.runtime
import typings.webpack.webpackStrings.webassemblySlashasync
import typings.webpack.webpackStrings.webassemblySlashsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Module")
@js.native
open class Module protected ()
  extends StObject
     with DependenciesBlock {
  def this(`type`: _empty | runtime | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashasync | webassemblySlashsync | css | cssSlashglobal | cssSlashmodule | asset | assetSlashinline | assetSlashresource | assetSlashsource | `assetSlashraw-data-url` | `fallback-module` | `remote-module` | `provide-module` | `consume-shared-module` | `lazy-compilation-proxy`) = this()
  def this(
    `type`: _empty | runtime | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashasync | webassemblySlashsync | css | cssSlashglobal | cssSlashmodule | asset | assetSlashinline | assetSlashresource | assetSlashsource | `assetSlashraw-data-url` | `fallback-module` | `remote-module` | `provide-module` | `consume-shared-module` | `lazy-compilation-proxy`,
    context: String
  ) = this()
  def this(
    `type`: _empty | runtime | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashasync | webassemblySlashsync | css | cssSlashglobal | cssSlashmodule | asset | assetSlashinline | assetSlashresource | assetSlashsource | `assetSlashraw-data-url` | `fallback-module` | `remote-module` | `provide-module` | `consume-shared-module` | `lazy-compilation-proxy`,
    context: String,
    layer: String
  ) = this()
  def this(
    `type`: _empty | runtime | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashasync | webassemblySlashsync | css | cssSlashglobal | cssSlashmodule | asset | assetSlashinline | assetSlashresource | assetSlashsource | `assetSlashraw-data-url` | `fallback-module` | `remote-module` | `provide-module` | `consume-shared-module` | `lazy-compilation-proxy`,
    context: Unit,
    layer: String
  ) = this()
  
  /**
  	 * Adds a DependencyBlock to DependencyBlock relationship.
  	 * This is used for when a Module has a AsyncDependencyBlock tie (for code-splitting)
  	 */
  /* CompleteClass */
  override def addBlock(block: AsyncDependenciesBlock): Unit = js.native
  
  def addCacheDependencies(
    fileDependencies: LazySet[String],
    contextDependencies: LazySet[String],
    missingDependencies: LazySet[String],
    buildDependencies: LazySet[String]
  ): Unit = js.native
  
  def addChunk(): Boolean = js.native
  def addChunk(chunk: Any): Boolean = js.native
  
  def addCodeGenerationDependency(codeGenerationDependency: Dependency): Unit = js.native
  
  /* CompleteClass */
  override def addDependency(dependency: Dependency): Unit = js.native
  
  def addError(error: WebpackError): Unit = js.native
  
  def addPresentationalDependency(presentationalDependency: Dependency): Unit = js.native
  
  def addWarning(warning: WebpackError): Unit = js.native
  
  /* CompleteClass */
  var blocks: js.Array[AsyncDependenciesBlock] = js.native
  
  def build(
    options: WebpackOptionsNormalized,
    compilation: Compilation,
    resolver: ResolverWithOptions,
    fs: InputFileSystem,
    callback: js.Function1[/* arg0 */ js.UndefOr[WebpackError], Unit]
  ): Unit = js.native
  
  var buildInfo: Record[String, Any] = js.native
  
  var buildMeta: BuildMeta = js.native
  
  def chunkCondition(chunk: Chunk, compilation: Compilation): Boolean = js.native
  
  def chunksIterable: js.Iterable[Chunk] = js.native
  
  /**
  	 * Assuming this module is in the cache. Remove internal references to allow freeing some memory.
  	 */
  def cleanupForCache(): Unit = js.native
  
  /**
  	 * Removes all dependencies and blocks
  	 */
  /* CompleteClass */
  override def clearDependenciesAndBlocks(): Unit = js.native
  
  /**
  	 * removes all warnings and errors
  	 */
  def clearWarningsAndErrors(): Unit = js.native
  
  def codeGeneration(context: CodeGenerationContext): CodeGenerationResult = js.native
  
  var codeGenerationDependencies: js.UndefOr[js.Array[Dependency]] = js.native
  
  var context: Null | String = js.native
  
  var debugId: Double = js.native
  
  /* CompleteClass */
  var dependencies: js.Array[Dependency] = js.native
  
  var depth: Double = js.native
  
  /* CompleteClass */
  override def deserialize(__0: ObjectDeserializerContext): Unit = js.native
  
  def errors: Any = js.native
  
  def exportsArgument: String = js.native
  
  var factoryMeta: js.UndefOr[js.Object] = js.native
  
  def getChunks(): js.Array[Chunk] = js.native
  
  def getConcatenationBailoutReason(context: ConcatenationBailoutReasonContext): js.UndefOr[String] = js.native
  
  def getErrors(): js.UndefOr[js.Iterable[WebpackError]] = js.native
  
  def getExportsType(moduleGraph: ModuleGraph, strict: Boolean): namespace | `default-only` | `default-with-named` | dynamic = js.native
  
  def getNumberOfChunks(): Double = js.native
  
  def getNumberOfErrors(): Double = js.native
  
  def getNumberOfWarnings(): Double = js.native
  
  /* CompleteClass */
  override def getRootBlock(): DependenciesBlock = js.native
  
  def getSideEffectsConnectionState(moduleGraph: ModuleGraph): ConnectionState = js.native
  
  def getSourceTypes(): Set[String] = js.native
  
  /**
  	 * Module should be unsafe cached. Get data that's needed for that.
  	 * This data will be passed to restoreFromUnsafeCache later.
  	 */
  def getUnsafeCacheData(): js.Object = js.native
  
  def getWarnings(): js.UndefOr[js.Iterable[WebpackError]] = js.native
  
  def hasChunkCondition(): Boolean = js.native
  
  def hasEqualsChunks: Any = js.native
  
  def hasReasonForChunk(chunk: Chunk, moduleGraph: ModuleGraph, chunkGraph: ChunkGraph): Boolean = js.native
  
  def hasReasons(moduleGraph: ModuleGraph, runtime: RuntimeSpec): Boolean = js.native
  
  def hash: String = js.native
  
  var id: String | Double = js.native
  
  def identifier(): String = js.native
  
  var index: Double = js.native
  
  var index2: Double = js.native
  
  def invalidateBuild(): Unit = js.native
  
  def isAccessibleInChunk(chunkGraph: ChunkGraph, chunk: Chunk): Boolean = js.native
  def isAccessibleInChunk(chunkGraph: ChunkGraph, chunk: Chunk, ignoreChunk: Chunk): Boolean = js.native
  
  def isAccessibleInChunkGroup(chunkGraph: ChunkGraph, chunkGroup: ChunkGroup): Boolean = js.native
  def isAccessibleInChunkGroup(chunkGraph: ChunkGraph, chunkGroup: ChunkGroup, ignoreChunk: Chunk): Boolean = js.native
  
  def isEntryModule(): Boolean = js.native
  
  def isInChunk(): Boolean = js.native
  def isInChunk(chunk: Any): Boolean = js.native
  
  def isOptional(moduleGraph: ModuleGraph): Boolean = js.native
  
  def isProvided(exportName: String): Null | Boolean = js.native
  
  def isUsed: Any = js.native
  
  var issuer: Null | Module = js.native
  
  var layer: Null | String = js.native
  
  def libIdent(options: LibIdentOptions): Null | String = js.native
  
  def moduleArgument: String = js.native
  
  def nameForCondition(): Null | String = js.native
  
  def needBuild(
    context: NeedBuildContext,
    callback: js.Function2[/* arg0 */ js.UndefOr[Null | WebpackError], /* arg1 */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
  
  var needId: Boolean = js.native
  
  def needRebuild(fileTimestamps: Map[String, Null | Double], contextTimestamps: Map[String, Null | Double]): Boolean = js.native
  
  def optimizationBailout: js.Array[String | (js.Function1[/* requestShortener */ RequestShortener, String])] = js.native
  
  def optional: Boolean = js.native
  
  def originalSource(): Null | Source = js.native
  
  /* CompleteClass */
  var parent: DependenciesBlock = js.native
  
  var presentationalDependencies: js.UndefOr[js.Array[Dependency]] = js.native
  
  var profile: Null | ModuleProfile = js.native
  
  def readableIdentifier(requestShortener: RequestShortener): String = js.native
  
  def removeChunk(): Unit = js.native
  def removeChunk(chunk: Any): Unit = js.native
  
  /* CompleteClass */
  override def removeDependency(dependency: Dependency): Unit = js.native
  
  def renderedHash: String = js.native
  
  var resolveOptions: ResolveOptionsWebpackOptions = js.native
  
  /* CompleteClass */
  override def serialize(__0: ObjectSerializerContext): Unit = js.native
  
  def size(): Double = js.native
  def size(`type`: String): Double = js.native
  
  def source(dependencyTemplates: DependencyTemplates, runtimeTemplate: RuntimeTemplate): Source = js.native
  def source(dependencyTemplates: DependencyTemplates, runtimeTemplate: RuntimeTemplate, `type`: String): Source = js.native
  
  var `type`: _empty | runtime | javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashasync | webassemblySlashsync | css | cssSlashglobal | cssSlashmodule | asset | assetSlashinline | assetSlashresource | assetSlashsource | `assetSlashraw-data-url` | `fallback-module` | `remote-module` | `provide-module` | `consume-shared-module` | `lazy-compilation-proxy` = js.native
  
  /**
  	 * Assuming this module is in the cache. Update the (cached) module with
  	 * the fresh module from the factory. Usually updates internal references
  	 * and properties.
  	 */
  def updateCacheModule(module: Module): Unit = js.native
  
  /* CompleteClass */
  override def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit = js.native
  
  var useSimpleSourceMap: Boolean = js.native
  
  var useSourceMap: Boolean = js.native
  
  var used: Any = js.native
  
  def usedExports: Null | Boolean | SortableSet[String] = js.native
  
  def warnings: Any = js.native
}
