package typings.webpackServe

import typings.webpack.mod.Compiler_
import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompilerStats extends js.Object {
  var compiler: Compiler_
  var stats: Stats
}

object AnonCompilerStats {
  @scala.inline
  def apply(compiler: Compiler_, stats: Stats): AnonCompilerStats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompilerStats]
  }
}

