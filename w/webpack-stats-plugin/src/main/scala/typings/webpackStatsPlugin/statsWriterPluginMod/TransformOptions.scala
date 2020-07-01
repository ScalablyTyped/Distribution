package typings.webpackStatsPlugin.statsWriterPluginMod

import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  /** Current compiler instance */
  var compiler: Compilation
}

object TransformOptions {
  @scala.inline
  def apply(compiler: Compilation): TransformOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

