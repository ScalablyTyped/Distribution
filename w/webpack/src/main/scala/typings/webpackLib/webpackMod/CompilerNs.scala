package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Compiler")
@js.native
object CompilerNs extends js.Object {
  @js.native
  class Watching protected () extends js.Object {
    def this(compiler: webpackLib.webpackMod.Compiler, watchOptions: webpackLib.webpackMod.CompilerNs.WatchingNs.WatchOptions, handler: webpackLib.webpackMod.CompilerNs.WatchingNs.Handler) = this()
    def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def invalidate(): scala.Unit = js.native
  }
  
  @JSName("Watching")
  @js.native
  object WatchingNs extends js.Object {
    type Handler = webpackLib.webpackMod.ICompilerNs.Handler
    type WatchOptions = webpackLib.webpackMod.ICompilerNs.WatchOptions
  }
  
  type Handler = webpackLib.webpackMod.ICompilerNs.Handler
  type WatchOptions = webpackLib.webpackMod.ICompilerNs.WatchOptions
}

