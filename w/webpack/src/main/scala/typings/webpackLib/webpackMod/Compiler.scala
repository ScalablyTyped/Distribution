package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Compiler")
@js.native
class Compiler ()
  extends tapableLib.tapableMod.Tapable
     with ICompiler {
  @JSName("_pluginCompat")
  var _pluginCompat_Compiler: tapableLib.tapableMod.SyncBailHook[webpackLib.webpackMod.compilationNs.Compilation, _, _, _] = js.native
  var contextTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
  var fileTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
  var hooks: webpackLib.webpackMod.compilationNs.CompilerHooks = js.native
  var inputFileSystem: InputFileSystem = js.native
  var name: java.lang.String = js.native
  var options: Configuration = js.native
  var outputFileSystem: OutputFileSystem = js.native
  /* CompleteClass */
  override def run(handler: webpackLib.webpackMod.ICompilerNs.Handler): scala.Unit = js.native
  /* CompleteClass */
  override def watch(
    watchOptions: webpackLib.webpackMod.ICompilerNs.WatchOptions,
    handler: webpackLib.webpackMod.ICompilerNs.Handler
  ): Watching = js.native
}

