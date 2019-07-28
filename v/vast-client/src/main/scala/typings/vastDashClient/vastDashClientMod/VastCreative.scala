package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCreative extends js.Object {
  var adId: String | Null
  var apiFramework: String | Null
  var id: String | Null
  var sequence: String | Double | Null
  var trackingEvents: VastTrackingEvents
  var `type`: String
}

object VastCreative {
  @scala.inline
  def apply(
    trackingEvents: VastTrackingEvents,
    `type`: String,
    adId: String = null,
    apiFramework: String = null,
    id: String = null,
    sequence: String | Double = null
  ): VastCreative = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents)
    __obj.updateDynamic("type")(`type`)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreative]
  }
}

