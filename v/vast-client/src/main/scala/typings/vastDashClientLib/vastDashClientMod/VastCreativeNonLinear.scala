package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCreativeNonLinear extends VastCreative {
  var variations: js.Array[VastNonLinearAd]
}

object VastCreativeNonLinear {
  @scala.inline
  def apply(
    trackingEvents: VastTrackingEvents,
    `type`: java.lang.String,
    variations: js.Array[VastNonLinearAd],
    adId: java.lang.String = null,
    apiFramework: java.lang.String = null,
    id: java.lang.String = null,
    sequence: java.lang.String | scala.Double = null
  ): VastCreativeNonLinear = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("trackingEvents")(trackingEvents)
    __obj.updateDynamic("variations")(variations)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeNonLinear]
  }
}

