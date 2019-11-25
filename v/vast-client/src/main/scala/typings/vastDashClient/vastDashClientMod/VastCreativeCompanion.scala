package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCreativeCompanion extends VastCreative {
  var variations: js.Array[VastCompanionAd]
}

object VastCreativeCompanion {
  @scala.inline
  def apply(
    trackingEvents: VastTrackingEvents,
    `type`: String,
    variations: js.Array[VastCompanionAd],
    adId: String = null,
    apiFramework: String = null,
    id: String = null,
    sequence: String | Double = null
  ): VastCreativeCompanion = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeCompanion]
  }
}

