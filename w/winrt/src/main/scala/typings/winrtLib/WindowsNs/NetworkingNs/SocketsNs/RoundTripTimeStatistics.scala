package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundTripTimeStatistics extends js.Object {
  var max: scala.Double
  var min: scala.Double
  var sum: scala.Double
  var variance: scala.Double
}

object RoundTripTimeStatistics {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double, sum: scala.Double, variance: scala.Double): RoundTripTimeStatistics = {
    val __obj = js.Dynamic.literal(max = max, min = min, sum = sum, variance = variance)
  
    __obj.asInstanceOf[RoundTripTimeStatistics]
  }
}

