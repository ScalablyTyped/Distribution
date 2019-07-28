package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionEvaluationSettings extends js.Object {
  /**
    * Indicates whether subscription evaluation before saving is enabled or not
    */
  var enabled: Boolean
  /**
    * Time interval to check on subscription evaluation job in seconds
    */
  var interval: Double
  /**
    * Threshold on the number of notifications for considering a subscription too noisy
    */
  var threshold: Double
  /**
    * Time out for the subscription evaluation check in seconds
    */
  var timeOut: Double
}

object SubscriptionEvaluationSettings {
  @scala.inline
  def apply(enabled: Boolean, interval: Double, threshold: Double, timeOut: Double): SubscriptionEvaluationSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled, interval = interval, threshold = threshold, timeOut = timeOut)
  
    __obj.asInstanceOf[SubscriptionEvaluationSettings]
  }
}

