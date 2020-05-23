package typings.webpackServe.anon

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerStats extends js.Object {
  var compiler: Compiler_
  var stats: js.Any
}

object CompilerStats {
  @scala.inline
  def apply(compiler: Compiler_, stats: js.Any): CompilerStats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerStats]
  }
}

