package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundTripTimeStatistics extends js.Object {
  var max: Double
  var min: Double
  var sum: Double
  var variance: Double
}

object RoundTripTimeStatistics {
  @scala.inline
  def apply(max: Double, min: Double, sum: Double, variance: Double): RoundTripTimeStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoundTripTimeStatistics]
  }
}

