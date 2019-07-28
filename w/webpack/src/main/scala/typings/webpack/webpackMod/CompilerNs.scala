package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Compiler")
@js.native
object CompilerNs extends js.Object {
  @js.native
  class Watching protected () extends js.Object {
    def this(
      compiler: Compiler,
      watchOptions: typings.webpack.webpackMod.CompilerNs.WatchingNs.WatchOptions,
      handler: typings.webpack.webpackMod.CompilerNs.WatchingNs.Handler
    ) = this()
    def close(callback: js.Function0[Unit]): Unit = js.native
    def invalidate(): Unit = js.native
  }
  
  @JSName("Watching")
  @js.native
  object WatchingNs extends js.Object {
    type Handler = typings.webpack.webpackMod.ICompilerNs.Handler
    type WatchOptions = typings.webpack.webpackMod.ICompilerNs.WatchOptions
  }
  
  type Handler = typings.webpack.webpackMod.ICompilerNs.Handler
  type WatchOptions = typings.webpack.webpackMod.ICompilerNs.WatchOptions
}

