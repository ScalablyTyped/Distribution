package typings.vastDashClient.vastDashClientMod

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
    `type`: String,
    variations: js.Array[VastNonLinearAd],
    adId: String = null,
    apiFramework: String = null,
    id: String = null,
    sequence: String | Double = null
  ): VastCreativeNonLinear = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents, variations = variations)
    __obj.updateDynamic("type")(`type`)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeNonLinear]
  }
}

