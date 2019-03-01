package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCreative extends js.Object {
  var adId: java.lang.String | scala.Null
  var apiFramework: java.lang.String | scala.Null
  var id: java.lang.String | scala.Null
  var sequence: java.lang.String | scala.Double | scala.Null
  var trackingEvents: VastTrackingEvents
  var `type`: java.lang.String
}

object VastCreative {
  @scala.inline
  def apply(
    trackingEvents: VastTrackingEvents,
    `type`: java.lang.String,
    adId: java.lang.String = null,
    apiFramework: java.lang.String = null,
    id: java.lang.String = null,
    sequence: java.lang.String | scala.Double = null
  ): VastCreative = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("trackingEvents")(trackingEvents)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreative]
  }
}

