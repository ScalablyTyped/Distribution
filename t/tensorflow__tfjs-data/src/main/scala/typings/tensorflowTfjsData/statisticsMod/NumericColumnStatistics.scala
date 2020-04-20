package typings.tensorflowTfjsData.statisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericColumnStatistics extends js.Object {
  var length: Double
  var max: Double
  var mean: Double
  var min: Double
  var stddev: Double
  var variance: Double
}

object NumericColumnStatistics {
  @scala.inline
  def apply(length: Double, max: Double, mean: Double, min: Double, stddev: Double, variance: Double): NumericColumnStatistics = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericColumnStatistics]
  }
}

