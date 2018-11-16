package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler
  extends tapableLib.tapableMod.Tapable
     with ICompiler {
  @JSName("_pluginCompat")
  var _pluginCompat_Compiler: tapableLib.tapableMod.SyncBailHook[webpackLib.webpackMod.webpackNs.compilationNs.Compilation, _, _, _] = js.native
  var contextTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
  var fileTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
  var hooks: webpackLib.webpackMod.webpackNs.compilationNs.CompilerHooks = js.native
  var inputFileSystem: InputFileSystem = js.native
  var name: java.lang.String = js.native
  var options: Configuration = js.native
  var outputFileSystem: OutputFileSystem = js.native
}

