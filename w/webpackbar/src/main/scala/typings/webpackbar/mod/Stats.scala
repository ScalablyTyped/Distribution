package typings.webpackbar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var count: Double
  var time: js.Tuple2[Double, Double]
}

object Stats {
  @scala.inline
  def apply(count: Double, time: js.Tuple2[Double, Double]): Stats = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stats]
  }
}

