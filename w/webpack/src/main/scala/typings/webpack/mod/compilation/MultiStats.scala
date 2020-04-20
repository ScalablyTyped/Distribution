package typings.webpack.mod.compilation

import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiStats extends js.Object {
  var hash: String
  var stats: js.Array[Stats]
}

object MultiStats {
  @scala.inline
  def apply(hash: String, stats: js.Array[Stats]): MultiStats = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiStats]
  }
}

