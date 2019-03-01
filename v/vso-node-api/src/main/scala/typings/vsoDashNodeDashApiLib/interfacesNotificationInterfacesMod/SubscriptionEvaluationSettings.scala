package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionEvaluationSettings extends js.Object {
  /**
    * Indicates whether subscription evaluation before saving is enabled or not
    */
  var enabled: scala.Boolean
  /**
    * Time interval to check on subscription evaluation job in seconds
    */
  var interval: scala.Double
  /**
    * Threshold on the number of notifications for considering a subscription too noisy
    */
  var threshold: scala.Double
  /**
    * Time out for the subscription evaluation check in seconds
    */
  var timeOut: scala.Double
}

object SubscriptionEvaluationSettings {
  @scala.inline
  def apply(enabled: scala.Boolean, interval: scala.Double, threshold: scala.Double, timeOut: scala.Double): SubscriptionEvaluationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("threshold")(threshold)
    __obj.updateDynamic("timeOut")(timeOut)
    __obj.asInstanceOf[SubscriptionEvaluationSettings]
  }
}

