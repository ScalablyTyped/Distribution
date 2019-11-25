package typings.webpackDashServe

import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompilerStatsAny extends js.Object {
  var compiler: Compiler
  var stats: js.Any
}

object Anon_CompilerStatsAny {
  @scala.inline
  def apply(compiler: Compiler, stats: js.Any): Anon_CompilerStatsAny = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CompilerStatsAny]
  }
}

