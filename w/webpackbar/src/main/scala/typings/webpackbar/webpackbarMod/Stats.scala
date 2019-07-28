package typings.webpackbar.webpackbarMod

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
    val __obj = js.Dynamic.literal(count = count, time = time)
  
    __obj.asInstanceOf[Stats]
  }
}

