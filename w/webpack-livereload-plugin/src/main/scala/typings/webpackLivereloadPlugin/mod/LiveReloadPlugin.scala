package typings.webpackLivereloadPlugin.mod

import typings.webpack.mod.Plugin
import typings.webpack.mod.Stats
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveReloadPlugin extends Plugin {
  val isRunning: Boolean = js.native
  def applyCompilation(compilation: Compilation): Unit = js.native
  def autoloadJs(): String = js.native
  def done(stats: Stats): Unit = js.native
  def failed(): Unit = js.native
  def scriptTag(source: String): String = js.native
  def start(watching: js.Any, cb: js.Function0[Unit]): Unit = js.native
}

