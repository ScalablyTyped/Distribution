package typings.webpack.mod

import typings.std.Record
import typings.std.WeakMap
import typings.webpack.anon.ReadonlydoneSyncHookMulti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "MultiCompiler")
@js.native
open class MultiCompiler protected () extends StObject {
  def this(compilers: js.Array[Compiler], options: MultiCompilerOptions) = this()
  def this(compilers: Record[String, Compiler], options: MultiCompilerOptions) = this()
  
  def close(callback: CallbackFunction[Unit]): Unit = js.native
  
  var compilers: js.Array[Compiler] = js.native
  
  var dependencies: WeakMap[Compiler, js.Array[String]] = js.native
  
  def getInfrastructureLogger(): WebpackLogger = js.native
  def getInfrastructureLogger(name: Any): WebpackLogger = js.native
  
  var hooks: ReadonlydoneSyncHookMulti = js.native
  
  var inputFileSystem: InputFileSystem = js.native
  
  var intermediateFileSystem: IntermediateFileSystem = js.native
  
  val options: js.Array[WebpackOptionsNormalized] & MultiCompilerOptions = js.native
  
  var outputFileSystem: OutputFileSystem = js.native
  
  val outputPath: String = js.native
  
  def purgeInputFileSystem(): Unit = js.native
  
  def run(callback: CallbackFunction[MultiStats]): Unit = js.native
  
  def runWithDependencies(
    compilers: js.Array[Compiler],
    fn: js.Function2[/* compiler */ Compiler, /* callback */ CallbackFunction[MultiStats], Any],
    callback: CallbackFunction[MultiStats]
  ): Unit = js.native
  
  var running: Boolean = js.native
  
  def setDependencies(compiler: Compiler, dependencies: js.Array[String]): Unit = js.native
  
  def validateDependencies(callback: CallbackFunction[MultiStats]): Boolean = js.native
  
  def watch(watchOptions: js.Array[WatchOptions], handler: CallbackFunction[MultiStats]): MultiWatching = js.native
  def watch(watchOptions: WatchOptions, handler: CallbackFunction[MultiStats]): MultiWatching = js.native
  
  var watchFileSystem: WatchFileSystem = js.native
}
