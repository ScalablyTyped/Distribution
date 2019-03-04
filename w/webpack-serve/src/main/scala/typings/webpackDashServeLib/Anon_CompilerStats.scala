package typings
package webpackDashServeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompilerStats extends js.Object {
  var compiler: webpackLib.webpackMod.Compiler
  var stats: webpackLib.webpackMod.Stats
}

object Anon_CompilerStats {
  @scala.inline
  def apply(compiler: webpackLib.webpackMod.Compiler, stats: webpackLib.webpackMod.Stats): Anon_CompilerStats = {
    val __obj = js.Dynamic.literal(compiler = compiler, stats = stats)
  
    __obj.asInstanceOf[Anon_CompilerStats]
  }
}

