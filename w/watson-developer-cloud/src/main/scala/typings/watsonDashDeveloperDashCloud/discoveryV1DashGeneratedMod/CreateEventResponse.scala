package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the event being created. */
trait CreateEventResponse extends js.Object {
  /** Query event data object. */
  var data: js.UndefOr[EventData] = js.undefined
  /** The event type that was created. */
  var `type`: js.UndefOr[String] = js.undefined
}

object CreateEventResponse {
  @scala.inline
  def apply(data: EventData = null, `type`: String = null): CreateEventResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventResponse]
  }
}

