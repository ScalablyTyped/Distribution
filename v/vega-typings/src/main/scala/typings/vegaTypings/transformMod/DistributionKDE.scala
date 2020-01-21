package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionKDE extends Distribution {
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  var field: String | TransformField
  var from: js.UndefOr[DataName] = js.undefined
  var function: kde
}

object DistributionKDE {
  @scala.inline
  def apply(
    field: String | TransformField,
    function: kde,
    bandwidth: Double | SignalRef = null,
    from: DataName = null
  ): DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionKDE]
  }
}

