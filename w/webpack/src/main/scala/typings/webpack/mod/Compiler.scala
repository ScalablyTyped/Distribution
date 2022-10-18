package typings.webpack.mod

import typings.std.Cache
import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import typings.webpack.anon.BuildInfo
import typings.webpack.anon.ReadonlyinitializeSyncHoo
import typings.webpack.webpackStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Compiler")
@js.native
open class Compiler protected () extends StObject {
  def this(context: String) = this()
  def this(context: String, options: WebpackOptionsNormalized) = this()
  
  var cache: Cache = js.native
  
  def close(callback: CallbackFunction[Unit]): Unit = js.native
  
  def compile(callback: CallbackFunction[Compilation]): Unit = js.native
  
  var compilerPath: String = js.native
  
  var context: String = js.native
  
  var contextTimestamps: ReadonlyMap[String, Null | FileSystemInfoEntry | ignore] = js.native
  
  def createChildCompiler(compilation: Compilation, compilerName: String, compilerIndex: Double): Compiler = js.native
  def createChildCompiler(
    compilation: Compilation,
    compilerName: String,
    compilerIndex: Double,
    outputOptions: Unit,
    plugins: js.Array[WebpackPluginInstance]
  ): Compiler = js.native
  def createChildCompiler(
    compilation: Compilation,
    compilerName: String,
    compilerIndex: Double,
    outputOptions: OutputNormalized
  ): Compiler = js.native
  def createChildCompiler(
    compilation: Compilation,
    compilerName: String,
    compilerIndex: Double,
    outputOptions: OutputNormalized,
    plugins: js.Array[WebpackPluginInstance]
  ): Compiler = js.native
  
  def createCompilation(): Compilation = js.native
  def createCompilation(params: Any): Compilation = js.native
  
  def createContextModuleFactory(): ContextModuleFactory = js.native
  
  def createNormalModuleFactory(): NormalModuleFactory = js.native
  
  def emitAssets(compilation: Compilation, callback: CallbackFunction[Unit]): Unit = js.native
  
  def emitRecords(callback: CallbackFunction[Unit]): Unit = js.native
  
  var fileTimestamps: ReadonlyMap[String, Null | FileSystemInfoEntry | ignore] = js.native
  
  var fsStartTime: Double = js.native
  
  def getCache(name: String): CacheFacade = js.native
  
  def getInfrastructureLogger(name: String): WebpackLogger = js.native
  def getInfrastructureLogger(name: js.Function0[String]): WebpackLogger = js.native
  
  var hooks: ReadonlyinitializeSyncHoo = js.native
  
  var idle: Boolean = js.native
  
  var immutablePaths: Set[String | js.RegExp] = js.native
  
  var infrastructureLogger: Any = js.native
  
  var inputFileSystem: InputFileSystem = js.native
  
  var intermediateFileSystem: IntermediateFileSystem = js.native
  
  def isChild(): Boolean = js.native
  
  var managedPaths: Set[String | js.RegExp] = js.native
  
  var modifiedFiles: ReadonlySet[String] = js.native
  
  var moduleMemCaches: js.UndefOr[Map[Module, BuildInfo]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def newCompilation(params: CompilationParams): Compilation = js.native
  
  def newCompilationParams(): typings.webpack.anon.ContextModuleFactory = js.native
  
  var options: WebpackOptionsNormalized = js.native
  
  var outputFileSystem: OutputFileSystem = js.native
  
  var outputPath: String = js.native
  
  var parentCompilation: js.UndefOr[Compilation] = js.native
  
  def purgeInputFileSystem(): Unit = js.native
  
  def readRecords(callback: CallbackFunction[Unit]): Unit = js.native
  
  var records: js.Object = js.native
  
  var recordsInputPath: Null | String = js.native
  
  var recordsOutputPath: Null | String = js.native
  
  var removedFiles: ReadonlySet[String] = js.native
  
  var requestShortener: RequestShortener = js.native
  
  var resolverFactory: ResolverFactory = js.native
  
  var root: Compiler = js.native
  
  def run(callback: CallbackFunction[Stats]): Unit = js.native
  
  def runAsChild(
    callback: js.Function3[
      /* err */ js.UndefOr[Null | js.Error], 
      /* entries */ js.UndefOr[js.Array[Chunk]], 
      /* compilation */ js.UndefOr[Compilation], 
      Any
    ]
  ): Unit = js.native
  
  var running: Boolean = js.native
  
  def watch(watchOptions: WatchOptions, handler: CallbackFunction[Stats]): Watching = js.native
  
  var watchFileSystem: WatchFileSystem = js.native
  
  var watchMode: Boolean = js.native
  
  var watching: Watching = js.native
  
  def webpack(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = js.native
  def webpack(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = js.native
  @JSName("webpack")
  var webpack_Original: js.Function2[
    /* options */ js.Array[Configuration] & MultiCompilerOptions, 
    /* callback */ js.UndefOr[CallbackWebpack[MultiStats]], 
    MultiCompiler
  ] = js.native
}
