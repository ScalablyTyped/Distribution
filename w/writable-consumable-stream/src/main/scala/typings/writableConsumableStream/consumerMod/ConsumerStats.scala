package typings.writableConsumableStream.consumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerStats extends js.Object {
  var backpressure: Double
  var id: Double
  var timeout: js.UndefOr[Double] = js.undefined
}

object ConsumerStats {
  @scala.inline
  def apply(backpressure: Double, id: Double, timeout: Int | Double = null): ConsumerStats = {
    val __obj = js.Dynamic.literal(backpressure = backpressure.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerStats]
  }
}

