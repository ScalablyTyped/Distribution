package typings.webpackServe

import typings.webpack.mod.Compiler_
import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStats extends js.Object {
  var compiler: Compiler_
  var stats: Stats
}

object AnonStats {
  @scala.inline
  def apply(compiler: Compiler_, stats: Stats): AnonStats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStats]
  }
}

