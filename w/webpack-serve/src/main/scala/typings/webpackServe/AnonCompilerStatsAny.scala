package typings.webpackServe

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompilerStatsAny extends js.Object {
  var compiler: Compiler_
  var stats: js.Any
}

object AnonCompilerStatsAny {
  @scala.inline
  def apply(compiler: Compiler_, stats: js.Any): AnonCompilerStatsAny = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompilerStatsAny]
  }
}

