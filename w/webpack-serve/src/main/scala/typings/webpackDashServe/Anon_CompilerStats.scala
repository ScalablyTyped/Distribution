package typings.webpackDashServe

import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompilerStats extends js.Object {
  var compiler: Compiler
  var stats: Stats
}

object Anon_CompilerStats {
  @scala.inline
  def apply(compiler: Compiler, stats: Stats): Anon_CompilerStats = {
    val __obj = js.Dynamic.literal(compiler = compiler, stats = stats)
  
    __obj.asInstanceOf[Anon_CompilerStats]
  }
}

