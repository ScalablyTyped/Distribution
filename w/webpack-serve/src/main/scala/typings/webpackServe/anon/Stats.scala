package typings.webpackServe.anon

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var compiler: Compiler_
  var stats: typings.webpack.mod.Stats
}

object Stats {
  @scala.inline
  def apply(compiler: Compiler_, stats: typings.webpack.mod.Stats): Stats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

