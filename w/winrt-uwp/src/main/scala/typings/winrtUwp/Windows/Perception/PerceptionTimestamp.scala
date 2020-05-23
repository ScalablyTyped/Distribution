package typings.winrtUwp.Windows.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerceptionTimestamp extends js.Object {
  var predictionAmount: js.Any
   /* unmapped type */ var targetTime: js.Any
}

object PerceptionTimestamp {
  @scala.inline
  def apply(predictionAmount: js.Any, targetTime: js.Any): PerceptionTimestamp = {
    val __obj = js.Dynamic.literal(predictionAmount = predictionAmount.asInstanceOf[js.Any], targetTime = targetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionTimestamp]
  }
}

