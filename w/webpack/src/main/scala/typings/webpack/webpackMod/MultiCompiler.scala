package typings.webpack.webpackMod

import typings.tapable.tapableMod.Tapable
import typings.webpack.webpackMod.ICompilerNs.Handler
import typings.webpack.webpackMod.compilationNs.MultiCompilerHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "MultiCompiler")
@js.native
abstract class MultiCompiler ()
  extends Tapable
     with ICompiler {
  var compilers: js.Array[Compiler] = js.native
  var hooks: MultiCompilerHooks = js.native
  /* CompleteClass */
  override def run(handler: Handler): Unit = js.native
  /* CompleteClass */
  override def watch(watchOptions: typings.webpack.webpackMod.ICompilerNs.WatchOptions, handler: Handler): Watching = js.native
}

