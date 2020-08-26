package typings.webpackLivereloadPlugin.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveReloadPlugin extends Plugin {
  val isRunning: Boolean = js.native
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Unit = js.native
  def applyCompilation(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): Unit = js.native
  def autoloadJs(): String = js.native
  def done(
    stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats */ js.Any
  ): Unit = js.native
  def failed(): Unit = js.native
  def scriptTag(source: String): String = js.native
  def start(watching: js.Any, cb: js.Function0[Unit]): Unit = js.native
}

