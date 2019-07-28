package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedFilter extends BaseSubscriptionFilter

object UnsupportedFilter {
  @scala.inline
  def apply(eventType: String, `type`: String): UnsupportedFilter = {
    val __obj = js.Dynamic.literal(eventType = eventType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnsupportedFilter]
  }
}

