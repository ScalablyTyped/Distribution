package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedFilter extends BaseSubscriptionFilter

object UnsupportedFilter {
  @scala.inline
  def apply(eventType: java.lang.String, `type`: java.lang.String): UnsupportedFilter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("eventType")(eventType)
    __obj.asInstanceOf[UnsupportedFilter]
  }
}

