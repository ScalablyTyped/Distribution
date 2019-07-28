package typings.webpack.webpackMod

import typings.std.Map
import typings.tapable.tapableMod.SyncBailHook
import typings.tapable.tapableMod.Tapable
import typings.webpack.webpackMod.ICompilerNs.Handler
import typings.webpack.webpackMod.compilationNs.Compilation
import typings.webpack.webpackMod.compilationNs.CompilerHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Compiler")
@js.native
class Compiler ()
  extends Tapable
     with ICompiler {
  @JSName("_pluginCompat")
  var _pluginCompat_Compiler: SyncBailHook[Compilation, _, _, _] = js.native
  var context: String = js.native
  var contextTimestamps: Map[String, Double] = js.native
  var fileTimestamps: Map[String, Double] = js.native
  var hooks: CompilerHooks = js.native
  var inputFileSystem: InputFileSystem = js.native
  var name: String = js.native
  var options: Configuration = js.native
  var outputFileSystem: OutputFileSystem = js.native
  var outputPath: String = js.native
  def isChild(): Boolean = js.native
  /* CompleteClass */
  override def run(handler: Handler): Unit = js.native
  /* CompleteClass */
  override def watch(watchOptions: typings.webpack.webpackMod.ICompilerNs.WatchOptions, handler: Handler): Watching = js.native
}

