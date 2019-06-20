package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "MultiCompiler")
@js.native
abstract class MultiCompiler ()
  extends tapableLib.tapableMod.Tapable
     with ICompiler {
  var compilers: js.Array[Compiler] = js.native
  var hooks: webpackLib.webpackMod.compilationNs.MultiCompilerHooks = js.native
  /* CompleteClass */
  override def run(handler: webpackLib.webpackMod.ICompilerNs.Handler): scala.Unit = js.native
  /* CompleteClass */
  override def watch(
    watchOptions: webpackLib.webpackMod.ICompilerNs.WatchOptions,
    handler: webpackLib.webpackMod.ICompilerNs.Handler
  ): Watching = js.native
}

