package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationTriggerFactory extends js.Object {
  def create(applicationId: java.lang.String): PushNotificationTrigger
}

object IPushNotificationTriggerFactory {
  @scala.inline
  def apply(create: java.lang.String => PushNotificationTrigger): IPushNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[IPushNotificationTriggerFactory]
  }
}

