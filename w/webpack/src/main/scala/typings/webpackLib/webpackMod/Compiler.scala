package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Compiler")
@js.native
class Compiler ()
  extends webpackLib.webpackMod.webpackNs.Compiler {
  /* CompleteClass */
  override def run(handler: webpackLib.webpackMod.webpackNs.ICompilerNs.Handler): scala.Unit = js.native
  /* CompleteClass */
  override def watch(
    watchOptions: webpackLib.webpackMod.webpackNs.ICompilerNs.WatchOptions,
    handler: webpackLib.webpackMod.webpackNs.ICompilerNs.Handler
  ): webpackLib.webpackMod.webpackNs.Watching = js.native
}

